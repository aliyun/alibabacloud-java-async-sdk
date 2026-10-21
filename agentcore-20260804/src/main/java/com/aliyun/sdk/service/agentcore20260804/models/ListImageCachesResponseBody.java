// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListImageCachesResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageCachesResponseBody</p>
 */
public class ListImageCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long totalCount;

    private ListImageCachesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageCachesResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListImageCachesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business response code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The records on the current page. An empty array is returned if no matching items are found.</p>
         * <p>This parameter is required.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The actual page size used for this request. This is not the number of items on the current page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The opaque cursor for the next page. An empty string indicates that no more pages are available.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID used for troubleshooting.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>req-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. A value of true does not indicate that the cache creation is complete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that match the current filter conditions. Do not use this value to determine whether all pages have been returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListImageCachesResponseBody build() {
            return new ListImageCachesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageCachesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageCachesResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        @com.aliyun.core.annotation.Validation(required = true)
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The secure and non-empty error code for the current creation attempt.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ACSCacheBuildFailed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The secure and non-empty description of the failure. It does not contain credentials, internal addresses, or stack traces.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed to create the image cache. Please try again</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListImageCachesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageCachesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acrInstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("agentCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long agentCount;

        @com.aliyun.core.annotation.NameInMap("cacheSizeBytes")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long cacheSizeBytes;

        @com.aliyun.core.annotation.NameInMap("canDelete")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean canDelete;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("deleteBlockReason")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deleteBlockReason;

        @com.aliyun.core.annotation.NameInMap("digest")
        @com.aliyun.core.annotation.Validation(required = true)
        private String digest;

        @com.aliyun.core.annotation.NameInMap("error")
        @com.aliyun.core.annotation.Validation(required = true)
        private Error error;

        @com.aliyun.core.annotation.NameInMap("imageId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("registry")
        @com.aliyun.core.annotation.Validation(required = true)
        private String registry;

        @com.aliyun.core.annotation.NameInMap("repository")
        @com.aliyun.core.annotation.Validation(required = true)
        private String repository;

        @com.aliyun.core.annotation.NameInMap("status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        @com.aliyun.core.annotation.NameInMap("tag")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tag;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String workspaceId;

        private Items(Builder builder) {
            this.acrInstanceId = builder.acrInstanceId;
            this.agentCount = builder.agentCount;
            this.cacheSizeBytes = builder.cacheSizeBytes;
            this.canDelete = builder.canDelete;
            this.createdAt = builder.createdAt;
            this.deleteBlockReason = builder.deleteBlockReason;
            this.digest = builder.digest;
            this.error = builder.error;
            this.imageId = builder.imageId;
            this.registry = builder.registry;
            this.repository = builder.repository;
            this.status = builder.status;
            this.tag = builder.tag;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return acrInstanceId
         */
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        /**
         * @return agentCount
         */
        public Long getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return cacheSizeBytes
         */
        public Long getCacheSizeBytes() {
            return this.cacheSizeBytes;
        }

        /**
         * @return canDelete
         */
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deleteBlockReason
         */
        public String getDeleteBlockReason() {
            return this.deleteBlockReason;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return registry
         */
        public String getRegistry() {
            return this.registry;
        }

        /**
         * @return repository
         */
        public String getRepository() {
            return this.repository;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String acrInstanceId; 
            private Long agentCount; 
            private Long cacheSizeBytes; 
            private Boolean canDelete; 
            private String createdAt; 
            private String deleteBlockReason; 
            private String digest; 
            private Error error; 
            private String imageId; 
            private String registry; 
            private String repository; 
            private String status; 
            private String tag; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.acrInstanceId = model.acrInstanceId;
                this.agentCount = model.agentCount;
                this.cacheSizeBytes = model.cacheSizeBytes;
                this.canDelete = model.canDelete;
                this.createdAt = model.createdAt;
                this.deleteBlockReason = model.deleteBlockReason;
                this.digest = model.digest;
                this.error = model.error;
                this.imageId = model.imageId;
                this.registry = model.registry;
                this.repository = model.repository;
                this.status = model.status;
                this.tag = model.tag;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The ID of the source ACR Enterprise instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-example</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The deduplicated number of agents in the current workspace that have useImageCache set to true and are associated with this logical resource. The value is greater than or equal to 0. This matches the set filtered by imageCacheId in ListAllAgents. Disabled agents are not counted, and this value is independent of the number of occupied instances.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder agentCount(Long agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The actual cache size in bytes. The value is greater than or equal to 0 if known, or null if unknown. The compressed size of the source image cannot be used as a substitute.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1073741824</p>
             */
            public Builder cacheSizeBytes(Long cacheSizeBytes) {
                this.cacheSizeBytes = cacheSizeBytes;
                return this;
            }

            /**
             * <p>Indicates whether the resource can be deleted. The value is true if no configuration references with the switch enabled exist in the current workspace, no valid instances are occupying the resource, and the resource is not being deleted. If the reference status is unknown, the query fails instead of defaulting to true.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * <p>The creation time of the logical resource in the current workspace, in RFC 3339 format with the time zone. Content updates for the latest tag do not refresh this time.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-10T00:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The reason why deletion is blocked. The value is null if canDelete is true. Otherwise, the value is returned based on the priority of DELETING, AGENT_ENABLED, and INSTANCES_RELEASING. Old instances may still occupy the resource even if the agent count is 0.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>INSTANCES_RELEASING</p>
             */
            public Builder deleteBlockReason(String deleteBlockReason) {
                this.deleteBlockReason = deleteBlockReason;
                return this;
            }

            /**
             * <p>The digest in the sha256: format followed by a 64-character lowercase hexadecimal string. It only describes the currently registered content and does not indicate whether old instances have been switched.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The cache failure details. It is a non-null object when the status is FAILED, and null for other statuses. It only describes the current content and the current creation attempt.</p>
             * <p>This parameter is required.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The logical resource ID that can be managed in the current workspace. This is not the shared physical cache ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>img-example</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The domain name of the source image. It does not include the protocol, path, or credentials.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example-registry.cn-hangzhou.cr.aliyuncs.com</p>
             */
            public Builder registry(String registry) {
                this.registry = registry;
                return this;
            }

            /**
             * <p>The path of the source image repository in the namespace/repository format. The namespace is included.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>team/app</p>
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * <p>The status of the image cache. Valid values: PENDING (creating), READY (available), FAILED (abnormal), and DELETING (deleting in the current workspace).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag of the source image. It is case-sensitive. Regular tags cannot be registered with different digests, except for the exact lowercase \&quot;latest\&quot;.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The workspace ID. It must be consistent with the requested workspace. Resources with the same content from other workspaces must not be returned.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-example</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
