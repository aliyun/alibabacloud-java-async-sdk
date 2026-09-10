// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateBatchConsumerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBatchConsumerResponseBody</p>
 */
public class CreateBatchConsumerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private CreateBatchConsumerResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalPages = builder.totalPages;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchConsumerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalPages; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(CreateBatchConsumerResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalPages = model.totalPages;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of consumer objects.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of records per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public CreateBatchConsumerResponseBody build() {
            return new CreateBatchConsumerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateBatchConsumerResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBatchConsumerResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ApiKeyMd5")
        private String apiKeyMd5;

        @com.aliyun.core.annotation.NameInMap("ApiKeyStatus")
        private String apiKeyStatus;

        @com.aliyun.core.annotation.NameInMap("ApiStatus")
        private String apiStatus;

        @com.aliyun.core.annotation.NameInMap("BudgetLimit")
        private Long budgetLimit;

        @com.aliyun.core.annotation.NameInMap("BudgetPolicyId")
        private String budgetPolicyId;

        @com.aliyun.core.annotation.NameInMap("BudgetUsed")
        private Long budgetUsed;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("ConsumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("ConsumerTag")
        private String consumerTag;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.active = builder.active;
            this.apiKey = builder.apiKey;
            this.apiKeyMd5 = builder.apiKeyMd5;
            this.apiKeyStatus = builder.apiKeyStatus;
            this.apiStatus = builder.apiStatus;
            this.budgetLimit = builder.budgetLimit;
            this.budgetPolicyId = builder.budgetPolicyId;
            this.budgetUsed = builder.budgetUsed;
            this.consumerGroupId = builder.consumerGroupId;
            this.consumerId = builder.consumerId;
            this.consumerTag = builder.consumerTag;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.gwClusterId = builder.gwClusterId;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return apiKeyMd5
         */
        public String getApiKeyMd5() {
            return this.apiKeyMd5;
        }

        /**
         * @return apiKeyStatus
         */
        public String getApiKeyStatus() {
            return this.apiKeyStatus;
        }

        /**
         * @return apiStatus
         */
        public String getApiStatus() {
            return this.apiStatus;
        }

        /**
         * @return budgetLimit
         */
        public Long getBudgetLimit() {
            return this.budgetLimit;
        }

        /**
         * @return budgetPolicyId
         */
        public String getBudgetPolicyId() {
            return this.budgetPolicyId;
        }

        /**
         * @return budgetUsed
         */
        public Long getBudgetUsed() {
            return this.budgetUsed;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return consumerTag
         */
        public String getConsumerTag() {
            return this.consumerTag;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gwClusterId
         */
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean active; 
            private String apiKey; 
            private String apiKeyMd5; 
            private String apiKeyStatus; 
            private String apiStatus; 
            private Long budgetLimit; 
            private String budgetPolicyId; 
            private Long budgetUsed; 
            private String consumerGroupId; 
            private String consumerId; 
            private String consumerTag; 
            private String description; 
            private String expireTime; 
            private Boolean expired; 
            private String gmtCreated; 
            private String gmtModified; 
            private String gwClusterId; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.active = model.active;
                this.apiKey = model.apiKey;
                this.apiKeyMd5 = model.apiKeyMd5;
                this.apiKeyStatus = model.apiKeyStatus;
                this.apiStatus = model.apiStatus;
                this.budgetLimit = model.budgetLimit;
                this.budgetPolicyId = model.budgetPolicyId;
                this.budgetUsed = model.budgetUsed;
                this.consumerGroupId = model.consumerGroupId;
                this.consumerId = model.consumerId;
                this.consumerTag = model.consumerTag;
                this.description = model.description;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.gwClusterId = model.gwClusterId;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * <p>Indicates whether the key is active.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The full API key. Returned only in this response.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The MD5 hash of the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>0769a11c2d474f96fbb527f8e273d3de</p>
             */
            public Builder apiKeyMd5(String apiKeyMd5) {
                this.apiKeyMd5 = apiKeyMd5;
                return this;
            }

            /**
             * <p>The status of the API key. Default value: Active.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder apiKeyStatus(String apiKeyStatus) {
                this.apiKeyStatus = apiKeyStatus;
                return this;
            }

            /**
             * <p>The API key status. Default value: Active.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder apiStatus(String apiStatus) {
                this.apiStatus = apiStatus;
                return this;
            }

            /**
             * <p>The budget limit, which equals the number of credits per package.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder budgetLimit(Long budgetLimit) {
                this.budgetLimit = budgetLimit;
                return this;
            }

            /**
             * <p>The budget policy ID. Each key has an independent budget policy.</p>
             * 
             * <strong>example:</strong>
             * <p>023aacc1effc4b56bb154bfbec6ba9**</p>
             */
            public Builder budgetPolicyId(String budgetPolicyId) {
                this.budgetPolicyId = budgetPolicyId;
                return this;
            }

            /**
             * <p>The used quota.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder budgetUsed(Long budgetUsed) {
                this.budgetUsed = budgetUsed;
                return this;
            }

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cg-xxxxxx</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-mqveroemc***</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The consumer tag.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder consumerTag(String consumerTag) {
                this.consumerTag = consumerTag;
                return this;
            }

            /**
             * <p>The application description or remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>myapp</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-25T09:37:10Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the key is expired.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-16 16:46:20</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-04T16:09:29+08:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The gateway instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxxxxxxxx</p>
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The consumer status. Default value: Enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
