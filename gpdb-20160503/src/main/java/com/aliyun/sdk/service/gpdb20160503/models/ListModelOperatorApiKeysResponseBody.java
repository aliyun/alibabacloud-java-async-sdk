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
         * <p>The list of API keys for which no deletion request has been initiated. After a deletion request is accepted, the key no longer appears in this list.</p>
         */
        public Builder apiKeys(java.util.List<ApiKeys> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApiKeys(Builder builder) {
            this.apiKeyId = builder.apiKeyId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.status = builder.status;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer apiKeyId; 
            private String createTime; 
            private String description; 
            private String endpoint; 
            private String status; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.apiKeyId = model.apiKeyId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.endpoint = model.endpoint;
                this.status = model.status;
            } 

            /**
             * <p>The API key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiKeyId(Integer apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-01T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test-apikey</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The complete HTTP(S) endpoint for calling the model operator service. This field is returned only when Status is Running. This field is not returned for other statuses. The list operation does not return the plaintext API key. To obtain the plaintext API key, call DescribeModelOperatorApiKey.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx">https://xxxx</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The status of the API key. The statuses returned in the list include:</p>
             * <ul>
             * <li>Creating: The API key is being created.</li>
             * <li>Running: The API key is running.</li>
             * <li>Locked: The API key is locked and cannot be used to call the model operator service. This status may also be displayed when the API key is being locked or unlocked.</li>
             * </ul>
             * <p>API keys for which a deletion request has been accepted no longer appear in the list. You can call DescribeModelOperatorApiKey to query the Deleting status. After the cleanup is complete, a detail query returns a resource not found error. The status indicates the processing result on the control plane. A short propagation delay may occur before the status takes effect on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApiKeys build() {
                return new ApiKeys(this);
            } 

        } 

    }
}
