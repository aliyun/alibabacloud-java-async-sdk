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
 * {@link ListApiKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiKeysResponseBody</p>
 */
public class ListApiKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListApiKeysResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiKeysResponseBody create() {
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

        private Builder(ListApiKeysResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The query result.</p>
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
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
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

        public ListApiKeysResponseBody build() {
            return new ListApiKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiKeysResponseBody</p>
     */
    public static class CustomKeyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("DailyTokenQuota")
        private Long dailyTokenQuota;

        @com.aliyun.core.annotation.NameInMap("IsRateLimited")
        private Boolean isRateLimited;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("LimitRate")
        private Float limitRate;

        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
        private Integer thresholdPercent;

        @com.aliyun.core.annotation.NameInMap("TokenQuota")
        private Long tokenQuota;

        private CustomKeyList(Builder builder) {
            this.apiKey = builder.apiKey;
            this.dailyTokenQuota = builder.dailyTokenQuota;
            this.isRateLimited = builder.isRateLimited;
            this.keyName = builder.keyName;
            this.limitRate = builder.limitRate;
            this.limitType = builder.limitType;
            this.roleArn = builder.roleArn;
            this.thresholdPercent = builder.thresholdPercent;
            this.tokenQuota = builder.tokenQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomKeyList create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return dailyTokenQuota
         */
        public Long getDailyTokenQuota() {
            return this.dailyTokenQuota;
        }

        /**
         * @return isRateLimited
         */
        public Boolean getIsRateLimited() {
            return this.isRateLimited;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return limitRate
         */
        public Float getLimitRate() {
            return this.limitRate;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return thresholdPercent
         */
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

        /**
         * @return tokenQuota
         */
        public Long getTokenQuota() {
            return this.tokenQuota;
        }

        public static final class Builder {
            private String apiKey; 
            private Long dailyTokenQuota; 
            private Boolean isRateLimited; 
            private String keyName; 
            private Float limitRate; 
            private String limitType; 
            private String roleArn; 
            private Integer thresholdPercent; 
            private Long tokenQuota; 

            private Builder() {
            } 

            private Builder(CustomKeyList model) {
                this.apiKey = model.apiKey;
                this.dailyTokenQuota = model.dailyTokenQuota;
                this.isRateLimited = model.isRateLimited;
                this.keyName = model.keyName;
                this.limitRate = model.limitRate;
                this.limitType = model.limitType;
                this.roleArn = model.roleArn;
                this.thresholdPercent = model.thresholdPercent;
                this.tokenQuota = model.tokenQuota;
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
             * <p>The daily throttling quota.</p>
             * 
             * <strong>example:</strong>
             * <p>100000000</p>
             */
            public Builder dailyTokenQuota(Long dailyTokenQuota) {
                this.dailyTokenQuota = dailyTokenQuota;
                return this;
            }

            /**
             * <p>Indicates whether the key is throttled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRateLimited(Boolean isRateLimited) {
                this.isRateLimited = isRateLimited;
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
             * <p>The quota limit ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder limitRate(Float limitRate) {
                this.limitRate = limitRate;
                return this;
            }

            /**
             * <p>The quota limit method. Valid values:</p>
             * <ul>
             * <li><strong>fixed</strong>: Fixed value.</li>
             * <li><strong>ratio</strong>: Percentage.</li>
             * <li><strong>auto</strong>: Automatic allocation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fixed</p>
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The alert threshold percentage. For example, 80 indicates that an alert is triggered when the usage reaches 80%. The alert resets when the usage drops below this percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder thresholdPercent(Integer thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            /**
             * <p>The quota limit of the current key.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder tokenQuota(Long tokenQuota) {
                this.tokenQuota = tokenQuota;
                return this;
            }

            public CustomKeyList build() {
                return new CustomKeyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiKeysResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("CustomKeyList")
        private java.util.List<CustomKeyList> customKeyList;

        @com.aliyun.core.annotation.NameInMap("DailyTokenQuota")
        private Long dailyTokenQuota;

        @com.aliyun.core.annotation.NameInMap("IsRateLimited")
        private Boolean isRateLimited;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("SystemApiKey")
        private String systemApiKey;

        @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
        private Integer thresholdPercent;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.customKeyList = builder.customKeyList;
            this.dailyTokenQuota = builder.dailyTokenQuota;
            this.isRateLimited = builder.isRateLimited;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.systemApiKey = builder.systemApiKey;
            this.thresholdPercent = builder.thresholdPercent;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return customKeyList
         */
        public java.util.List<CustomKeyList> getCustomKeyList() {
            return this.customKeyList;
        }

        /**
         * @return dailyTokenQuota
         */
        public Long getDailyTokenQuota() {
            return this.dailyTokenQuota;
        }

        /**
         * @return isRateLimited
         */
        public Boolean getIsRateLimited() {
            return this.isRateLimited;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return systemApiKey
         */
        public String getSystemApiKey() {
            return this.systemApiKey;
        }

        /**
         * @return thresholdPercent
         */
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String baseUrl; 
            private java.util.List<CustomKeyList> customKeyList; 
            private Long dailyTokenQuota; 
            private Boolean isRateLimited; 
            private Integer page; 
            private Integer pageSize; 
            private String systemApiKey; 
            private Integer thresholdPercent; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseUrl = model.baseUrl;
                this.customKeyList = model.customKeyList;
                this.dailyTokenQuota = model.dailyTokenQuota;
                this.isRateLimited = model.isRateLimited;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.systemApiKey = model.systemApiKey;
                this.thresholdPercent = model.thresholdPercent;
                this.total = model.total;
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
             * <p>The list of custom API keys.</p>
             */
            public Builder customKeyList(java.util.List<CustomKeyList> customKeyList) {
                this.customKeyList = customKeyList;
                return this;
            }

            /**
             * <p>The daily throttling quota for the system API key.</p>
             * 
             * <strong>example:</strong>
             * <p>100000000</p>
             */
            public Builder dailyTokenQuota(Long dailyTokenQuota) {
                this.dailyTokenQuota = dailyTokenQuota;
                return this;
            }

            /**
             * <p>Indicates whether the key is throttled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRateLimited(Boolean isRateLimited) {
                this.isRateLimited = isRateLimited;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The system-generated key.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-xxx</p>
             */
            public Builder systemApiKey(String systemApiKey) {
                this.systemApiKey = systemApiKey;
                return this;
            }

            /**
             * <p>The alert threshold percentage for SystemApiKey. For example, 80 indicates that an alert is triggered when the usage reaches 80%. The alert resets when the usage drops below this percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder thresholdPercent(Integer thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>138</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
