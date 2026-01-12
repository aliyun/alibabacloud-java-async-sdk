// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProjectDetailResponseBody</p>
 */
public class QueryProjectDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorName")
    private String errorName;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryProjectDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorName = builder.errorName;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProjectDetailResponseBody create() {
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
     * @return errorName
     */
    public String getErrorName() {
        return this.errorName;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private String errorName; 
        private Integer httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryProjectDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorName = model.errorName;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorName.
         */
        public Builder errorName(String errorName) {
            this.errorName = errorName;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
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
         * RequestId.
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

        public QueryProjectDetailResponseBody build() {
            return new QueryProjectDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProjectDetailResponseBody</p>
     */
    public static class BuildDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedTime")
        private String completedTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EstimatedDuration")
        private Long estimatedDuration;

        @com.aliyun.core.annotation.NameInMap("RunningTime")
        private String runningTime;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        private BuildDetail(Builder builder) {
            this.completedTime = builder.completedTime;
            this.errorMessage = builder.errorMessage;
            this.estimatedDuration = builder.estimatedDuration;
            this.runningTime = builder.runningTime;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildDetail create() {
            return builder().build();
        }

        /**
         * @return completedTime
         */
        public String getCompletedTime() {
            return this.completedTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return estimatedDuration
         */
        public Long getEstimatedDuration() {
            return this.estimatedDuration;
        }

        /**
         * @return runningTime
         */
        public String getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private String completedTime; 
            private String errorMessage; 
            private Long estimatedDuration; 
            private String runningTime; 
            private String submitTime; 

            private Builder() {
            } 

            private Builder(BuildDetail model) {
                this.completedTime = model.completedTime;
                this.errorMessage = model.errorMessage;
                this.estimatedDuration = model.estimatedDuration;
                this.runningTime = model.runningTime;
                this.submitTime = model.submitTime;
            } 

            /**
             * CompletedTime.
             */
            public Builder completedTime(String completedTime) {
                this.completedTime = completedTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * EstimatedDuration.
             */
            public Builder estimatedDuration(Long estimatedDuration) {
                this.estimatedDuration = estimatedDuration;
                return this;
            }

            /**
             * RunningTime.
             */
            public Builder runningTime(String runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public BuildDetail build() {
                return new BuildDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProjectDetailResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("Dir")
        private String dir;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private String expire;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private Policy(Builder builder) {
            this.accessId = builder.accessId;
            this.dir = builder.dir;
            this.expire = builder.expire;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return expire
         */
        public String getExpire() {
            return this.expire;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessId; 
            private String dir; 
            private String expire; 
            private String host; 
            private String policy; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.accessId = model.accessId;
                this.dir = model.dir;
                this.expire = model.expire;
                this.host = model.host;
                this.policy = model.policy;
                this.signature = model.signature;
            } 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * Dir.
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * Expire.
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProjectDetailResponseBody</p>
     */
    public static class Dataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildResultUrl")
        private java.util.Map<String, ?> buildResultUrl;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("GlbModelUrl")
        private String glbModelUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModelUrl")
        private String modelUrl;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OriginResultUrl")
        private String originResultUrl;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private Policy policy;

        @com.aliyun.core.annotation.NameInMap("PoseUrl")
        private String poseUrl;

        @com.aliyun.core.annotation.NameInMap("PreviewUrl")
        private String previewUrl;

        private Dataset(Builder builder) {
            this.buildResultUrl = builder.buildResultUrl;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.glbModelUrl = builder.glbModelUrl;
            this.id = builder.id;
            this.modelUrl = builder.modelUrl;
            this.modifiedTime = builder.modifiedTime;
            this.originResultUrl = builder.originResultUrl;
            this.ossKey = builder.ossKey;
            this.policy = builder.policy;
            this.poseUrl = builder.poseUrl;
            this.previewUrl = builder.previewUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dataset create() {
            return builder().build();
        }

        /**
         * @return buildResultUrl
         */
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return glbModelUrl
         */
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modelUrl
         */
        public String getModelUrl() {
            return this.modelUrl;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return originResultUrl
         */
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return policy
         */
        public Policy getPolicy() {
            return this.policy;
        }

        /**
         * @return poseUrl
         */
        public String getPoseUrl() {
            return this.poseUrl;
        }

        /**
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public static final class Builder {
            private java.util.Map<String, ?> buildResultUrl; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String errorCode; 
            private String errorMessage; 
            private String glbModelUrl; 
            private String id; 
            private String modelUrl; 
            private String modifiedTime; 
            private String originResultUrl; 
            private String ossKey; 
            private Policy policy; 
            private String poseUrl; 
            private String previewUrl; 

            private Builder() {
            } 

            private Builder(Dataset model) {
                this.buildResultUrl = model.buildResultUrl;
                this.coverUrl = model.coverUrl;
                this.createTime = model.createTime;
                this.deleted = model.deleted;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.glbModelUrl = model.glbModelUrl;
                this.id = model.id;
                this.modelUrl = model.modelUrl;
                this.modifiedTime = model.modifiedTime;
                this.originResultUrl = model.originResultUrl;
                this.ossKey = model.ossKey;
                this.policy = model.policy;
                this.poseUrl = model.poseUrl;
                this.previewUrl = model.previewUrl;
            } 

            /**
             * BuildResultUrl.
             */
            public Builder buildResultUrl(java.util.Map<String, ?> buildResultUrl) {
                this.buildResultUrl = buildResultUrl;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
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
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * GlbModelUrl.
             */
            public Builder glbModelUrl(String glbModelUrl) {
                this.glbModelUrl = glbModelUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ModelUrl.
             */
            public Builder modelUrl(String modelUrl) {
                this.modelUrl = modelUrl;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OriginResultUrl.
             */
            public Builder originResultUrl(String originResultUrl) {
                this.originResultUrl = originResultUrl;
                return this;
            }

            /**
             * OssKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(Policy policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PoseUrl.
             */
            public Builder poseUrl(String poseUrl) {
                this.poseUrl = poseUrl;
                return this;
            }

            /**
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProjectDetailResponseBody</p>
     */
    public static class Clothes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Clothes(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.id = builder.id;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clothes create() {
            return builder().build();
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String coverUrl; 
            private String id; 
            private String name; 
            private String ossKey; 
            private String type; 

            private Builder() {
            } 

            private Builder(Clothes model) {
                this.coverUrl = model.coverUrl;
                this.id = model.id;
                this.name = model.name;
                this.ossKey = model.ossKey;
                this.type = model.type;
            } 

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OssKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Clothes build() {
                return new Clothes(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProjectDetailResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Files(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.size = builder.size;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String coverUrl; 
            private String fileName; 
            private String id; 
            private Long size; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.coverUrl = model.coverUrl;
                this.fileName = model.fileName;
                this.id = model.id;
                this.size = model.size;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProjectDetailResponseBody</p>
     */
    public static class SourcePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("Dir")
        private String dir;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private String expire;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private SourcePolicy(Builder builder) {
            this.accessId = builder.accessId;
            this.dir = builder.dir;
            this.expire = builder.expire;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourcePolicy create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return expire
         */
        public String getExpire() {
            return this.expire;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessId; 
            private String dir; 
            private String expire; 
            private String host; 
            private String policy; 
            private String signature; 

            private Builder() {
            } 

            private Builder(SourcePolicy model) {
                this.accessId = model.accessId;
                this.dir = model.dir;
                this.expire = model.expire;
                this.host = model.host;
                this.policy = model.policy;
                this.signature = model.signature;
            } 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * Dir.
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * Expire.
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public SourcePolicy build() {
                return new SourcePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProjectDetailResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clothes")
        private java.util.List<Clothes> clothes;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private SourcePolicy policy;

        private Source(Builder builder) {
            this.clothes = builder.clothes;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.files = builder.files;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.ossKey = builder.ossKey;
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return clothes
         */
        public java.util.List<Clothes> getClothes() {
            return this.clothes;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return policy
         */
        public SourcePolicy getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private java.util.List<Clothes> clothes; 
            private String createTime; 
            private Boolean deleted; 
            private java.util.List<Files> files; 
            private String id; 
            private String modifiedTime; 
            private String ossKey; 
            private SourcePolicy policy; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.clothes = model.clothes;
                this.createTime = model.createTime;
                this.deleted = model.deleted;
                this.files = model.files;
                this.id = model.id;
                this.modifiedTime = model.modifiedTime;
                this.ossKey = model.ossKey;
                this.policy = model.policy;
            } 

            /**
             * Clothes.
             */
            public Builder clothes(java.util.List<Clothes> clothes) {
                this.clothes = clothes;
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
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Files.
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OssKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(SourcePolicy policy) {
                this.policy = policy;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProjectDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUsage")
        private String bizUsage;

        @com.aliyun.core.annotation.NameInMap("BuildDetail")
        private BuildDetail buildDetail;

        @com.aliyun.core.annotation.NameInMap("CreateMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Dataset")
        private Dataset dataset;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("Dependencies")
        private String dependencies;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Intro")
        private String intro;

        @com.aliyun.core.annotation.NameInMap("MaterialCoverUrl")
        private String materialCoverUrl;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.buildDetail = builder.buildDetail;
            this.createMode = builder.createMode;
            this.createTime = builder.createTime;
            this.dataset = builder.dataset;
            this.deleted = builder.deleted;
            this.dependencies = builder.dependencies;
            this.ext = builder.ext;
            this.id = builder.id;
            this.intro = builder.intro;
            this.materialCoverUrl = builder.materialCoverUrl;
            this.modifiedTime = builder.modifiedTime;
            this.source = builder.source;
            this.status = builder.status;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return buildDetail
         */
        public BuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        /**
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataset
         */
        public Dataset getDataset() {
            return this.dataset;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return dependencies
         */
        public String getDependencies() {
            return this.dependencies;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return materialCoverUrl
         */
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bizUsage; 
            private BuildDetail buildDetail; 
            private String createMode; 
            private String createTime; 
            private Dataset dataset; 
            private Boolean deleted; 
            private String dependencies; 
            private String ext; 
            private String id; 
            private String intro; 
            private String materialCoverUrl; 
            private String modifiedTime; 
            private Source source; 
            private String status; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizUsage = model.bizUsage;
                this.buildDetail = model.buildDetail;
                this.createMode = model.createMode;
                this.createTime = model.createTime;
                this.dataset = model.dataset;
                this.deleted = model.deleted;
                this.dependencies = model.dependencies;
                this.ext = model.ext;
                this.id = model.id;
                this.intro = model.intro;
                this.materialCoverUrl = model.materialCoverUrl;
                this.modifiedTime = model.modifiedTime;
                this.source = model.source;
                this.status = model.status;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
                return this;
            }

            /**
             * BuildDetail.
             */
            public Builder buildDetail(BuildDetail buildDetail) {
                this.buildDetail = buildDetail;
                return this;
            }

            /**
             * CreateMode.
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
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
             * Dataset.
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
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
             * Dependencies.
             */
            public Builder dependencies(String dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Intro.
             */
            public Builder intro(String intro) {
                this.intro = intro;
                return this;
            }

            /**
             * MaterialCoverUrl.
             */
            public Builder materialCoverUrl(String materialCoverUrl) {
                this.materialCoverUrl = materialCoverUrl;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(Source source) {
                this.source = source;
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
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
