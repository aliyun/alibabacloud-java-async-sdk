// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListConsumersResponseBody} extends {@link TeaModel}
 *
 * <p>ListConsumersResponseBody</p>
 */
public class ListConsumersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListConsumersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListConsumersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
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
         * <p>9BDD6A7C-CBA7-504F-B8C5-51B9F16590F7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConsumersResponseBody build() {
            return new ListConsumersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConsumersResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumersResponseBody</p>
     */
    public static class ExpirationSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aboutToExpire")
        private Long aboutToExpire;

        @com.aliyun.core.annotation.NameInMap("expired")
        private Long expired;

        private ExpirationSummary(Builder builder) {
            this.aboutToExpire = builder.aboutToExpire;
            this.expired = builder.expired;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpirationSummary create() {
            return builder().build();
        }

        /**
         * @return aboutToExpire
         */
        public Long getAboutToExpire() {
            return this.aboutToExpire;
        }

        /**
         * @return expired
         */
        public Long getExpired() {
            return this.expired;
        }

        public static final class Builder {
            private Long aboutToExpire; 
            private Long expired; 

            private Builder() {
            } 

            private Builder(ExpirationSummary model) {
                this.aboutToExpire = model.aboutToExpire;
                this.expired = model.expired;
            } 

            /**
             * <p>The number of unexpired consumers with a remaining validity period of seven days or less, including those that are manually disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder aboutToExpire(Long aboutToExpire) {
                this.aboutToExpire = aboutToExpire;
                return this;
            }

            /**
             * <p>The number of expired consumers, including those that are manually disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder expired(Long expired) {
                this.expired = expired;
                return this;
            }

            public ExpirationSummary build() {
                return new ExpirationSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConsumersResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("deployStatus")
        private String deployStatus;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("expireAt")
        private Long expireAt;

        @com.aliyun.core.annotation.NameInMap("expireStatus")
        private String expireStatus;

        @com.aliyun.core.annotation.NameInMap("extInfo")
        private String extInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Items(Builder builder) {
            this.consumerId = builder.consumerId;
            this.createTimestamp = builder.createTimestamp;
            this.deployStatus = builder.deployStatus;
            this.description = builder.description;
            this.enable = builder.enable;
            this.expireAt = builder.expireAt;
            this.expireStatus = builder.expireStatus;
            this.extInfo = builder.extInfo;
            this.name = builder.name;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return expireAt
         */
        public Long getExpireAt() {
            return this.expireAt;
        }

        /**
         * @return expireStatus
         */
        public String getExpireStatus() {
            return this.expireStatus;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String consumerId; 
            private Long createTimestamp; 
            private String deployStatus; 
            private String description; 
            private Boolean enable; 
            private Long expireAt; 
            private String expireStatus; 
            private String extInfo; 
            private String name; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.consumerId = model.consumerId;
                this.createTimestamp = model.createTimestamp;
                this.deployStatus = model.deployStatus;
                this.description = model.description;
                this.enable = model.enable;
                this.expireAt = model.expireAt;
                this.expireStatus = model.expireStatus;
                this.extInfo = model.extInfo;
                this.name = model.name;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * <p>The consumer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-csheiftlhtgmp0j0hp4g</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The creation timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1721097861050</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The publish status of the API in the current environment.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test consumer</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether the consumer is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The expiration time of the consumer, in UTC UNIX seconds. A null value indicates that the consumer is permanently valid.</p>
             * 
             * <strong>example:</strong>
             * <p>1893456000</p>
             */
            public Builder expireAt(Long expireAt) {
                this.expireAt = expireAt;
                return this;
            }

            /**
             * <p>The expiration status. Valid values: Permanent, InEffect, AboutToExpire, and Expired. The status is accurate to the second. A remaining validity period of exactly seven days is classified as AboutToExpire, and an expired status is classified as Expired.</p>
             * 
             * <strong>example:</strong>
             * <p>InEffect</p>
             */
            public Builder expireStatus(String expireStatus) {
                this.expireStatus = expireStatus;
                return this;
            }

            /**
             * <p>The saved extended information of the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>partner-a</p>
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>The consumer name.</p>
             * 
             * <strong>example:</strong>
             * <p>user-service</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The update timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1721123855214</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConsumersResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expirationSummary")
        private ExpirationSummary expirationSummary;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.expirationSummary = builder.expirationSummary;
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expirationSummary
         */
        public ExpirationSummary getExpirationSummary() {
            return this.expirationSummary;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private ExpirationSummary expirationSummary; 
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.expirationSummary = model.expirationSummary;
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The count of expiration reminders for all consumers under the same account and gateway type. This count is not affected by name, status filters, or pagination. This field is returned only when includeExpirationSummary is set to true.</p>
             */
            public Builder expirationSummary(ExpirationSummary expirationSummary) {
                this.expirationSummary = expirationSummary;
                return this;
            }

            /**
             * <p>The list of consumer information.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
