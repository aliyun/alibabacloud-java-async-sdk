// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataProductListLogMapValue} extends {@link TeaModel}
 *
 * <p>DataProductListLogMapValue</p>
 */
public class DataProductListLogMapValue extends TeaModel {
    @NameInMap("LogCode")
    private String logCode;

    @NameInMap("LogName")
    private String logName;

    @NameInMap("LogNameEn")
    private String logNameEn;

    @NameInMap("LogNameKey")
    private String logNameKey;

    @NameInMap("Status")
    private Boolean status;

    @NameInMap("CanOperateOrNot")
    private Boolean canOperateOrNot;

    @NameInMap("Topic")
    private String topic;

    @NameInMap("ExtraParameters")
    private java.util.List < ExtraParameters> extraParameters;

    private DataProductListLogMapValue(Builder builder) {
        this.logCode = builder.logCode;
        this.logName = builder.logName;
        this.logNameEn = builder.logNameEn;
        this.logNameKey = builder.logNameKey;
        this.status = builder.status;
        this.canOperateOrNot = builder.canOperateOrNot;
        this.topic = builder.topic;
        this.extraParameters = builder.extraParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataProductListLogMapValue create() {
        return builder().build();
    }

    /**
     * @return logCode
     */
    public String getLogCode() {
        return this.logCode;
    }

    /**
     * @return logName
     */
    public String getLogName() {
        return this.logName;
    }

    /**
     * @return logNameEn
     */
    public String getLogNameEn() {
        return this.logNameEn;
    }

    /**
     * @return logNameKey
     */
    public String getLogNameKey() {
        return this.logNameKey;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return canOperateOrNot
     */
    public Boolean getCanOperateOrNot() {
        return this.canOperateOrNot;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return extraParameters
     */
    public java.util.List < ExtraParameters> getExtraParameters() {
        return this.extraParameters;
    }

    public static final class Builder {
        private String logCode; 
        private String logName; 
        private String logNameEn; 
        private String logNameKey; 
        private Boolean status; 
        private Boolean canOperateOrNot; 
        private String topic; 
        private java.util.List < ExtraParameters> extraParameters; 

        /**
         * LogCode.
         */
        public Builder logCode(String logCode) {
            this.logCode = logCode;
            return this;
        }

        /**
         * LogName.
         */
        public Builder logName(String logName) {
            this.logName = logName;
            return this;
        }

        /**
         * LogNameEn.
         */
        public Builder logNameEn(String logNameEn) {
            this.logNameEn = logNameEn;
            return this;
        }

        /**
         * LogNameKey.
         */
        public Builder logNameKey(String logNameKey) {
            this.logNameKey = logNameKey;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        /**
         * CanOperateOrNot.
         */
        public Builder canOperateOrNot(Boolean canOperateOrNot) {
            this.canOperateOrNot = canOperateOrNot;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
         * ExtraParameters.
         */
        public Builder extraParameters(java.util.List < ExtraParameters> extraParameters) {
            this.extraParameters = extraParameters;
            return this;
        }

        public DataProductListLogMapValue build() {
            return new DataProductListLogMapValue(this);
        } 

    } 

    public static class ExtraParameters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ExtraParameters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraParameters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExtraParameters build() {
                return new ExtraParameters(this);
            } 

        } 

    }
}
