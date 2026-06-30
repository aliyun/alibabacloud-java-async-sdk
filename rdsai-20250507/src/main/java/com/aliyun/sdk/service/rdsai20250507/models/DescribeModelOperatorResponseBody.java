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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
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
         * Success.
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
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Usage.
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
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Usage.
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
             * DailyUsage.
             */
            public Builder dailyUsage(java.util.List<KeyUsageListDailyUsage> dailyUsage) {
                this.dailyUsage = dailyUsage;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * KeyType.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * KeyUsed.
             */
            public Builder keyUsed(String keyUsed) {
                this.keyUsed = keyUsed;
                return this;
            }

            /**
             * UsedQuota.
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
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * BaseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * DailyUsage.
             */
            public Builder dailyUsage(java.util.List<DailyUsage> dailyUsage) {
                this.dailyUsage = dailyUsage;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * KeyUsageList.
             */
            public Builder keyUsageList(java.util.List<KeyUsageList> keyUsageList) {
                this.keyUsageList = keyUsageList;
                return this;
            }

            /**
             * PrefixCacheEnabled.
             */
            public Builder prefixCacheEnabled(Boolean prefixCacheEnabled) {
                this.prefixCacheEnabled = prefixCacheEnabled;
                return this;
            }

            /**
             * SessionIds.
             */
            public Builder sessionIds(java.util.List<String> sessionIds) {
                this.sessionIds = sessionIds;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalQuota.
             */
            public Builder totalQuota(Long totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * UsedQuota.
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
