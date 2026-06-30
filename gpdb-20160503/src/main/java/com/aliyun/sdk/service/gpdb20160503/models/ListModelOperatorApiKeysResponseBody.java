// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListModelOperatorApiKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelOperatorApiKeysResponseBody</p>
 */
public class ListModelOperatorApiKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKeys")
    private java.util.List<ApiKeys> apiKeys;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListModelOperatorApiKeysResponseBody(Builder builder) {
        this.apiKeys = builder.apiKeys;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelOperatorApiKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeys
     */
    public java.util.List<ApiKeys> getApiKeys() {
        return this.apiKeys;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<ApiKeys> apiKeys; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListModelOperatorApiKeysResponseBody model) {
            this.apiKeys = model.apiKeys;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * ApiKeys.
         */
        public Builder apiKeys(java.util.List<ApiKeys> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListModelOperatorApiKeysResponseBody build() {
            return new ListModelOperatorApiKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelOperatorApiKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelOperatorApiKeysResponseBody</p>
     */
    public static class ApiKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKeyId")
        private Integer apiKeyId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        private ApiKeys(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeys create() {
            return builder().build();
        }

        /**
         * @return apiKeyId
         */
        public Integer getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        public static final class Builder {
            private Integer apiKeyId; 
            private String createTime; 
            private String description; 
            private String endpoint; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.apiKeyId = model.apiKeyId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.endpoint = model.endpoint;
            } 

            /**
             * <p>API KEY ID。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiKeyId(Integer apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            public ApiKeys build() {
                return new ApiKeys(this);
            } 

        } 

    }
}
