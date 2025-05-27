// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DataProductListLogMapValue} extends {@link TeaModel}
 *
 * <p>DataProductListLogMapValue</p>
 */
public class DataProductListLogMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogCode")
    private String logCode;

    @com.aliyun.core.annotation.NameInMap("LogName")
    private String logName;

    @com.aliyun.core.annotation.NameInMap("LogNameEn")
    private String logNameEn;

    @com.aliyun.core.annotation.NameInMap("LogNameKey")
    private String logNameKey;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    @com.aliyun.core.annotation.NameInMap("CanOperateOrNot")
    private Boolean canOperateOrNot;

    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    @com.aliyun.core.annotation.NameInMap("ExtraParameters")
    private java.util.List<ExtraParameters> extraParameters;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ExtraParameters> getExtraParameters() {
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
        private java.util.List<ExtraParameters> extraParameters; 

        private Builder() {
        } 

        private Builder(DataProductListLogMapValue model) {
            this.logCode = model.logCode;
            this.logName = model.logName;
            this.logNameEn = model.logNameEn;
            this.logNameKey = model.logNameKey;
            this.status = model.status;
            this.canOperateOrNot = model.canOperateOrNot;
            this.topic = model.topic;
            this.extraParameters = model.extraParameters;
        } 

        /**
         * <p>The code of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_config_log</p>
         */
        public Builder logCode(String logCode) {
            this.logCode = logCode;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>audit log</p>
         */
        public Builder logName(String logName) {
            this.logName = logName;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>audit log</p>
         */
        public Builder logNameEn(String logNameEn) {
            this.logNameEn = logNameEn;
            return this;
        }

        /**
         * <p>The language code of the log that is used to indicate the language in which the log is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>${sas.cloudsiem.prod.cloud_siem_aegis_crack_from_beaver}</p>
         */
        public Builder logNameKey(String logNameKey) {
            this.logNameKey = logNameKey;
            return this;
        }

        /**
         * <p>The status of the log delivery. Valid values:</p>
         * <ul>
         * <li>true: The logs are being delivered.</li>
         * <li>false: The log delivery feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the log delivery feature can be enabled or disabled. The feature can be enabled or disabled only by the administrator of the threat analysis feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canOperateOrNot(Boolean canOperateOrNot) {
            this.canOperateOrNot = canOperateOrNot;
            return this;
        }

        /**
         * <p>The topic of the log in the Logstore. The value is an index field in the Logstore that can be used to distinguish different logs.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_login_event</p>
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
         * <p>The extended parameter.</p>
         */
        public Builder extraParameters(java.util.List<ExtraParameters> extraParameters) {
            this.extraParameters = extraParameters;
            return this;
        }

        public DataProductListLogMapValue build() {
            return new DataProductListLogMapValue(this);
        } 

    } 

    /**
     * 
     * {@link DataProductListLogMapValue} extends {@link TeaModel}
     *
     * <p>DataProductListLogMapValue</p>
     */
    public static class ExtraParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(ExtraParameters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The ID of the extended parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>flag</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the extended parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
