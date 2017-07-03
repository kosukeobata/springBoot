package com.demo.dbflute.allcommon;

import org.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of insDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getInsDatetime();

    /**
     * Set the value of insDatetime.
     * @param insDatetime The instance of the property type. (NullAllowed)
     */
    void setInsDatetime(java.time.LocalDateTime insDatetime);

    /**
     * Get the value of insTrace.
     * @return The instance of the property type. (NullAllowed)
     */
    String getInsTrace();

    /**
     * Set the value of insTrace.
     * @param insTrace The instance of the property type. (NullAllowed)
     */
    void setInsTrace(String insTrace);

    /**
     * Get the value of updDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getUpdDatetime();

    /**
     * Set the value of updDatetime.
     * @param updDatetime The instance of the property type. (NullAllowed)
     */
    void setUpdDatetime(java.time.LocalDateTime updDatetime);

    /**
     * Get the value of updTrace.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUpdTrace();

    /**
     * Set the value of updTrace.
     * @param updTrace The instance of the property type. (NullAllowed)
     */
    void setUpdTrace(String updTrace);
}
