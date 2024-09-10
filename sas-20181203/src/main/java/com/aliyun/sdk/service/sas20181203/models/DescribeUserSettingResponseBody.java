// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserSettingResponseBody</p>
 */
public class DescribeUserSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertLevels")
    private java.util.List < String > alertLevels;

    @com.aliyun.core.annotation.NameInMap("InvalidWarningKeepDays")
    private Integer invalidWarningKeepDays;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserSettingResponseBody(Builder builder) {
        this.alertLevels = builder.alertLevels;
        this.invalidWarningKeepDays = builder.invalidWarningKeepDays;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertLevels
     */
    public java.util.List < String > getAlertLevels() {
        return this.alertLevels;
    }

    /**
     * @return invalidWarningKeepDays
     */
    public Integer getInvalidWarningKeepDays() {
        return this.invalidWarningKeepDays;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > alertLevels; 
        private Integer invalidWarningKeepDays; 
        private String requestId; 

        /**
         * The severities of alerts. If this parameter is empty, no custom alerts are generated.
         */
        public Builder alertLevels(java.util.List < String > alertLevels) {
            this.alertLevels = alertLevels;
            return this;
        }

        /**
         * The number of days during which you want to retain invalid alerts.
         */
        public Builder invalidWarningKeepDays(Integer invalidWarningKeepDays) {
            this.invalidWarningKeepDays = invalidWarningKeepDays;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserSettingResponseBody build() {
            return new DescribeUserSettingResponseBody(this);
        } 

    } 

}
