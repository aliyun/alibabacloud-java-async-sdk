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
 * {@link CreateImageCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageCacheResponseBody</p>
 */
public class CreateImageCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    @com.aliyun.core.annotation.Validation(required = true)
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private CreateImageCacheResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageCacheResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateImageCacheResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>The result of creating the image cache.</p>
         * <p>This parameter is required.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The request ID, which is used for troubleshooting.</p>
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
         * <p>Indicates whether the request is successful. This does not indicate that the cache creation is complete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateImageCacheResponseBody build() {
            return new CreateImageCacheResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageCacheResponseBody} extends {@link TeaModel}
     *
     * <p>CreateImageCacheResponseBody</p>
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
             * <p>The secure and non-null error code for the current creation failure.</p>
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
             * <p>The secure and non-null display reason for the creation failure, excluding credentials, internal addresses, or stack traces.</p>
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
     * {@link CreateImageCacheResponseBody} extends {@link TeaModel}
     *
     * <p>CreateImageCacheResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder(Data model) {
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
             * <p>The deduplicated number of agents that have useImageCache set to true and are associated with this logical resource in the current workspace. The value is greater than or equal to 0. This set is the same as the set filtered by imageCacheId in ListAllAgents. Agents with the feature disabled are not counted, and this value is independent of the number of occupied instances.</p>
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
             * <p>The actual cache size in bytes. The known value is greater than or equal to 0. If the value is unknown, it is null. The compressed size of the source image cannot be used as a substitute.</p>
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
             * <p>Indicates whether deletion is allowed. The value is true when there are no configuration references with the switch enabled, no valid instances occupying the resource, and the resource is not being deleted in the current workspace. If the reference status is unknown, the query should fail, and deletion cannot be allowed by default.</p>
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
             * <p>The creation time of the logical resource in the current workspace, in RFC3339 format with time zone. The time is not refreshed when the content of the latest tag is updated.</p>
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
             * <p>The reason why deletion is blocked. The value is null when canDelete is true. Otherwise, the value is returned based on the priority of DELETING, AGENT_ENABLED, and INSTANCES_RELEASING. Even if the number of agents is 0, old instances may still occupy the resource.</p>
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
             * <p>The current content digest in the format of sha256: followed by a 64-character lowercase hexadecimal string. It only describes the currently registered content and does not prove that old instances have been switched.</p>
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
             * <p>The reason for the cache failure. This is a non-null object when the status is FAILED, and null for other statuses. It only describes the current content and the current creation round.</p>
             * <p>This parameter is required.</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The logical resource ID manageable by the current workspace, which is not a shared physical cache ID.</p>
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
             * <p>The domain name of the source image, excluding the protocol, path, and credentials.</p>
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
             * <p>The path of the source image repository in the namespace/repository format, which already includes the namespace.</p>
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
             * <p>The status of the image cache. Valid values: PENDING: creating, READY: available, FAILED: abnormal, DELETING: deleting in the current workspace.</p>
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
             * <p>The tag of the source image. Case is preserved. Regular tags cannot be registered with different digests, with the exact lowercase latest tag being the only exception.</p>
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
             * <p>The workspace ID, which is consistent with the requested workspace. Resources with the same content from other workspaces are not returned.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-example</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
