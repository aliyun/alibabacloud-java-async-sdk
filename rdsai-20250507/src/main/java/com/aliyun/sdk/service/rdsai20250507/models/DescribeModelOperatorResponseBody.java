// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeModelOperatorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelOperatorResponseBody</p>
 */
public class DescribeModelOperatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeModelOperatorResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOperatorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeModelOperatorResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeModelOperatorResponseBody build() {
            return new DescribeModelOperatorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelOperatorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelOperatorResponseBody</p>
     */
    public static class DailyUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Long usage;

        private DailyUsage(Builder builder) {
            this.date = builder.date;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyUsage create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return usage
         */
        public Long getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String date; 
            private Long usage; 

            private Builder() {
            } 

            private Builder(DailyUsage model) {
                this.date = model.date;
                this.usage = model.usage;
            } 

            /**
             * <p>The date (accurate to the day).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-31</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The token usage.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder usage(Long usage) {
                this.usage = usage;
                return this;
            }

            public DailyUsage build() {
                return new DailyUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelOperatorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelOperatorResponseBody</p>
     */
    public static class KeyUsageListDailyUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private KeyUsageListDailyUsage(Builder builder) {
            this.date = builder.date;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyUsageListDailyUsage create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String date; 
            private String usage; 

            private Builder() {
            } 

            private Builder(KeyUsageListDailyUsage model) {
                this.date = model.date;
                this.usage = model.usage;
            } 

            /**
             * <p>The date (accurate to the day).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-31</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The number of tokens used.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public KeyUsageListDailyUsage build() {
                return new KeyUsageListDailyUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelOperatorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelOperatorResponseBody</p>
     */
    public static class KeyUsageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("DailyUsage")
        private java.util.List<KeyUsageListDailyUsage> dailyUsage;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("KeyType")
        private String keyType;

        @com.aliyun.core.annotation.NameInMap("KeyUsed")
        private String keyUsed;

        @com.aliyun.core.annotation.NameInMap("UsedQuota")
        private String usedQuota;

        private KeyUsageList(Builder builder) {
            this.apiKey = builder.apiKey;
            this.dailyUsage = builder.dailyUsage;
            this.deleted = builder.deleted;
            this.keyName = builder.keyName;
            this.keyType = builder.keyType;
            this.keyUsed = builder.keyUsed;
            this.usedQuota = builder.usedQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyUsageList create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return dailyUsage
         */
        public java.util.List<KeyUsageListDailyUsage> getDailyUsage() {
            return this.dailyUsage;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        /**
         * @return keyUsed
         */
        public String getKeyUsed() {
            return this.keyUsed;
        }

        /**
         * @return usedQuota
         */
        public String getUsedQuota() {
            return this.usedQuota;
        }

        public static final class Builder {
            private String apiKey; 
            private java.util.List<KeyUsageListDailyUsage> dailyUsage; 
            private Boolean deleted; 
            private String keyName; 
            private String keyType; 
            private String keyUsed; 
            private String usedQuota; 

            private Builder() {
            } 

            private Builder(KeyUsageList model) {
                this.apiKey = model.apiKey;
                this.dailyUsage = model.dailyUsage;
                this.deleted = model.deleted;
                this.keyName = model.keyName;
                this.keyType = model.keyType;
                this.keyUsed = model.keyUsed;
                this.usedQuota = model.usedQuota;
            } 

            /**
             * <p>API Key</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-*****</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The daily usage of the API key.</p>
             */
            public Builder dailyUsage(java.util.List<KeyUsageListDailyUsage> dailyUsage) {
                this.dailyUsage = dailyUsage;
                return this;
            }

            /**
             * <p>Indicates whether the API key is deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>fase</p>
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The API key name.</p>
             * 
             * <strong>example:</strong>
             * <p>api-*****</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>The key type.</p>
             * 
             * <strong>example:</strong>
             * <p>fixed</p>
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * <p>The total token usage.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder keyUsed(String keyUsed) {
                this.keyUsed = keyUsed;
                return this;
            }

            /**
             * <p>The used token quota.</p>
             * 
             * <strong>example:</strong>
             * <p>2000000</p>
             */
            public Builder usedQuota(String usedQuota) {
                this.usedQuota = usedQuota;
                return this;
            }

            public KeyUsageList build() {
                return new KeyUsageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelOperatorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelOperatorResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DailyUsage")
        private java.util.List<DailyUsage> dailyUsage;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KeyUsageList")
        private java.util.List<KeyUsageList> keyUsageList;

        @com.aliyun.core.annotation.NameInMap("PrefixCacheEnabled")
        private Boolean prefixCacheEnabled;

        @com.aliyun.core.annotation.NameInMap("SessionIds")
        private java.util.List<String> sessionIds;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalQuota")
        private Long totalQuota;

        @com.aliyun.core.annotation.NameInMap("UsedQuota")
        private Long usedQuota;

        private Data(Builder builder) {
            this.apiKey = builder.apiKey;
            this.autoRenew = builder.autoRenew;
            this.baseUrl = builder.baseUrl;
            this.chargeType = builder.chargeType;
            this.dailyUsage = builder.dailyUsage;
            this.endTime = builder.endTime;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.keyUsageList = builder.keyUsageList;
            this.prefixCacheEnabled = builder.prefixCacheEnabled;
            this.sessionIds = builder.sessionIds;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalQuota = builder.totalQuota;
            this.usedQuota = builder.usedQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return dailyUsage
         */
        public java.util.List<DailyUsage> getDailyUsage() {
            return this.dailyUsage;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return keyUsageList
         */
        public java.util.List<KeyUsageList> getKeyUsageList() {
            return this.keyUsageList;
        }

        /**
         * @return prefixCacheEnabled
         */
        public Boolean getPrefixCacheEnabled() {
            return this.prefixCacheEnabled;
        }

        /**
         * @return sessionIds
         */
        public java.util.List<String> getSessionIds() {
            return this.sessionIds;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalQuota
         */
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return usedQuota
         */
        public Long getUsedQuota() {
            return this.usedQuota;
        }

        public static final class Builder {
            private String apiKey; 
            private Boolean autoRenew; 
            private String baseUrl; 
            private String chargeType; 
            private java.util.List<DailyUsage> dailyUsage; 
            private Long endTime; 
            private String instanceClass; 
            private String instanceId; 
            private java.util.List<KeyUsageList> keyUsageList; 
            private Boolean prefixCacheEnabled; 
            private java.util.List<String> sessionIds; 
            private Long startTime; 
            private String status; 
            private Long totalQuota; 
            private Long usedQuota; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKey = model.apiKey;
                this.autoRenew = model.autoRenew;
                this.baseUrl = model.baseUrl;
                this.chargeType = model.chargeType;
                this.dailyUsage = model.dailyUsage;
                this.endTime = model.endTime;
                this.instanceClass = model.instanceClass;
                this.instanceId = model.instanceId;
                this.keyUsageList = model.keyUsageList;
                this.prefixCacheEnabled = model.prefixCacheEnabled;
                this.sessionIds = model.sessionIds;
                this.startTime = model.startTime;
                this.status = model.status;
                this.totalQuota = model.totalQuota;
                this.usedQuota = model.usedQuota;
            } 

            /**
             * <p>The system API key.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-xxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong> (default): Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The URL for model invocation.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.yy/v1">http://xxx.yy/v1</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>The billing type.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPAY / POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The daily usage list.</p>
             */
            public Builder dailyUsage(java.util.List<DailyUsage> dailyUsage) {
                this.dailyUsage = dailyUsage;
                return this;
            }

            /**
             * <p>The end time of the instance. Format: Timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1775145600000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>xlarge</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_copilot***_public_cn-*********6</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The usage of each key (including deleted keys).</p>
             */
            public Builder keyUsageList(java.util.List<KeyUsageList> keyUsageList) {
                this.keyUsageList = keyUsageList;
                return this;
            }

            /**
             * <p>Indicates whether the prefix routing persistence feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder prefixCacheEnabled(Boolean prefixCacheEnabled) {
                this.prefixCacheEnabled = prefixCacheEnabled;
                return this;
            }

            /**
             * <p>The list of headers used for routing persistence. The headers consist of lowercase letters, digits, and hyphens (-).</p>
             */
            public Builder sessionIds(java.util.List<String> sessionIds) {
                this.sessionIds = sessionIds;
                return this;
            }

            /**
             * <p>The start time of the instance. Format: Timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1772439028000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The module status.</p>
             * 
             * <strong>example:</strong>
             * <p>active/creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total quota for the current cycle (such as the monthly total).</p>
             * 
             * <strong>example:</strong>
             * <p>200000000</p>
             */
            public Builder totalQuota(Long totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * <p>The used quota for the current cycle (such as the monthly usage).</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder usedQuota(Long usedQuota) {
                this.usedQuota = usedQuota;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
