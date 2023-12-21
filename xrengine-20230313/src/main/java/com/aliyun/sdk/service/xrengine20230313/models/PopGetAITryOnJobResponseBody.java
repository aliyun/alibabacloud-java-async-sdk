// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopGetAITryOnJobResponseBody} extends {@link TeaModel}
 *
 * <p>PopGetAITryOnJobResponseBody</p>
 */
public class PopGetAITryOnJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PopGetAITryOnJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopGetAITryOnJobResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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

        public PopGetAITryOnJobResponseBody build() {
            return new PopGetAITryOnJobResponseBody(this);
        } 

    } 

    public static class BuildDetail extends TeaModel {
        @NameInMap("CompletedTime")
        private String completedTime;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EstimatedDuration")
        private Long estimatedDuration;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RunningTime")
        private String runningTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmitTime")
        private String submitTime;

        private BuildDetail(Builder builder) {
            this.completedTime = builder.completedTime;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.errorMessage = builder.errorMessage;
            this.estimatedDuration = builder.estimatedDuration;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.runningTime = builder.runningTime;
            this.status = builder.status;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return runningTime
         */
        public String getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private String completedTime; 
            private String createTime; 
            private Boolean deleted; 
            private String errorMessage; 
            private Long estimatedDuration; 
            private Long id; 
            private String modifiedTime; 
            private String runningTime; 
            private String status; 
            private String submitTime; 

            /**
             * CompletedTime.
             */
            public Builder completedTime(String completedTime) {
                this.completedTime = completedTime;
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
             * Id.
             */
            public Builder id(Long id) {
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
             * RunningTime.
             */
            public Builder runningTime(String runningTime) {
                this.runningTime = runningTime;
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
    public static class Policy extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("Expire")
        private String expire;

        @NameInMap("Host")
        private String host;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
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
    public static class Dataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        private java.util.Map < String, ? > buildResultUrl;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("GlbModelUrl")
        private String glbModelUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModelUrl")
        private String modelUrl;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OriginResultUrl")
        private String originResultUrl;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Policy")
        private Policy policy;

        @NameInMap("PoseUrl")
        private String poseUrl;

        @NameInMap("PreviewUrl")
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
        public java.util.Map < String, ? > getBuildResultUrl() {
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
        public Long getId() {
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
            private java.util.Map < String, ? > buildResultUrl; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String errorCode; 
            private String errorMessage; 
            private String glbModelUrl; 
            private Long id; 
            private String modelUrl; 
            private String modifiedTime; 
            private String originResultUrl; 
            private String ossKey; 
            private Policy policy; 
            private String poseUrl; 
            private String previewUrl; 

            /**
             * BuildResultUrl.
             */
            public Builder buildResultUrl(java.util.Map < String, ? > buildResultUrl) {
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
            public Builder id(Long id) {
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
    public static class SkuProps extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Options")
        private java.util.List < String > options;

        private SkuProps(Builder builder) {
            this.name = builder.name;
            this.options = builder.options;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuProps create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return options
         */
        public java.util.List < String > getOptions() {
            return this.options;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < String > options; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(java.util.List < String > options) {
                this.options = options;
                return this;
            }

            public SkuProps build() {
                return new SkuProps(this);
            } 

        } 

    }
    public static class Skus extends TeaModel {
        @NameInMap("Color")
        private String color;

        @NameInMap("Cover")
        private String cover;

        @NameInMap("Size")
        private String size;

        @NameInMap("Status")
        private String status;

        private Skus(Builder builder) {
            this.color = builder.color;
            this.cover = builder.cover;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skus create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return cover
         */
        public String getCover() {
            return this.cover;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String color; 
            private String cover; 
            private String size; 
            private String status; 

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Cover.
             */
            public Builder cover(String cover) {
                this.cover = cover;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Skus build() {
                return new Skus(this);
            } 

        } 

    }
    public static class Clothes extends TeaModel {
        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Part")
        private String part;

        @NameInMap("Size")
        private String size;

        @NameInMap("SkuProps")
        private java.util.List < SkuProps> skuProps;

        @NameInMap("Skus")
        private java.util.List < Skus> skus;

        @NameInMap("Status")
        private java.util.Map < String, String > status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Version")
        private Integer version;

        private Clothes(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.part = builder.part;
            this.size = builder.size;
            this.skuProps = builder.skuProps;
            this.skus = builder.skus;
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return part
         */
        public String getPart() {
            return this.part;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return skuProps
         */
        public java.util.List < SkuProps> getSkuProps() {
            return this.skuProps;
        }

        /**
         * @return skus
         */
        public java.util.List < Skus> getSkus() {
            return this.skus;
        }

        /**
         * @return status
         */
        public java.util.Map < String, String > getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private Long id; 
            private String modifiedTime; 
            private String name; 
            private String ossKey; 
            private String part; 
            private String size; 
            private java.util.List < SkuProps> skuProps; 
            private java.util.List < Skus> skus; 
            private java.util.Map < String, String > status; 
            private String type; 
            private Integer version; 

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
             * Id.
             */
            public Builder id(Long id) {
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
             * Part.
             */
            public Builder part(String part) {
                this.part = part;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * SkuProps.
             */
            public Builder skuProps(java.util.List < SkuProps> skuProps) {
                this.skuProps = skuProps;
                return this;
            }

            /**
             * Skus.
             */
            public Builder skus(java.util.List < Skus> skus) {
                this.skus = skus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(java.util.Map < String, String > status) {
                this.status = status;
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
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Clothes build() {
                return new Clothes(this);
            } 

        } 

    }
    public static class SourcePolicy extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("Expire")
        private String expire;

        @NameInMap("Host")
        private String host;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
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
    public static class SourceFiles extends TeaModel {
        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Filesize")
        private Long filesize;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        private SourceFiles(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.fileName = builder.fileName;
            this.filesize = builder.filesize;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.ossKey = builder.ossKey;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceFiles create() {
            return builder().build();
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
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filesize
         */
        public Long getFilesize() {
            return this.filesize;
        }

        /**
         * @return id
         */
        public Long getId() {
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
            private String createTime; 
            private Boolean deleted; 
            private String fileName; 
            private Long filesize; 
            private Long id; 
            private String modifiedTime; 
            private String ossKey; 
            private String type; 
            private String url; 

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
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Filesize.
             */
            public Builder filesize(Long filesize) {
                this.filesize = filesize;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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

            public SourceFiles build() {
                return new SourceFiles(this);
            } 

        } 

    }
    public static class Token extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("Expiration")
        private String expiration;

        @NameInMap("Host")
        private String host;

        @NameInMap("SecurityToken")
        private String securityToken;

        private Token(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.dir = builder.dir;
            this.expiration = builder.expiration;
            this.host = builder.host;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Token create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String dir; 
            private String expiration; 
            private String host; 
            private String securityToken; 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
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
             * Expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
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
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public Token build() {
                return new Token(this);
            } 

        } 

    }
    public static class Source extends TeaModel {
        @NameInMap("Clothes")
        private java.util.List < Clothes> clothes;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Policy")
        private SourcePolicy policy;

        @NameInMap("SourceFiles")
        private java.util.List < SourceFiles> sourceFiles;

        @NameInMap("Token")
        private Token token;

        private Source(Builder builder) {
            this.clothes = builder.clothes;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.ossKey = builder.ossKey;
            this.policy = builder.policy;
            this.sourceFiles = builder.sourceFiles;
            this.token = builder.token;
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
        public java.util.List < Clothes> getClothes() {
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
         * @return id
         */
        public Long getId() {
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

        /**
         * @return sourceFiles
         */
        public java.util.List < SourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

        /**
         * @return token
         */
        public Token getToken() {
            return this.token;
        }

        public static final class Builder {
            private java.util.List < Clothes> clothes; 
            private String createTime; 
            private Boolean deleted; 
            private Long id; 
            private String modifiedTime; 
            private String ossKey; 
            private SourcePolicy policy; 
            private java.util.List < SourceFiles> sourceFiles; 
            private Token token; 

            /**
             * Clothes.
             */
            public Builder clothes(java.util.List < Clothes> clothes) {
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
             * Id.
             */
            public Builder id(Long id) {
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

            /**
             * SourceFiles.
             */
            public Builder sourceFiles(java.util.List < SourceFiles> sourceFiles) {
                this.sourceFiles = sourceFiles;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(Token token) {
                this.token = token;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    public static class DummyProjectInfo extends TeaModel {
        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("AutoBuild")
        private Boolean autoBuild;

        @NameInMap("BizUsage")
        private String bizUsage;

        @NameInMap("BuildDetail")
        private BuildDetail buildDetail;

        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("CreateMode")
        private String createMode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CustomSource")
        private String customSource;

        @NameInMap("Dataset")
        private Dataset dataset;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Dependencies")
        private String dependencies;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("Id")
        private String id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("MaterialCoverUrl")
        private String materialCoverUrl;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Source")
        private Source source;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private String type;

        private DummyProjectInfo(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.autoBuild = builder.autoBuild;
            this.bizUsage = builder.bizUsage;
            this.buildDetail = builder.buildDetail;
            this.checkStatus = builder.checkStatus;
            this.createMode = builder.createMode;
            this.createTime = builder.createTime;
            this.customSource = builder.customSource;
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

        public static DummyProjectInfo create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return autoBuild
         */
        public Boolean getAutoBuild() {
            return this.autoBuild;
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
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
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
         * @return customSource
         */
        public String getCustomSource() {
            return this.customSource;
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
            private String auditStatus; 
            private Boolean autoBuild; 
            private String bizUsage; 
            private BuildDetail buildDetail; 
            private String checkStatus; 
            private String createMode; 
            private String createTime; 
            private String customSource; 
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

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * AutoBuild.
             */
            public Builder autoBuild(Boolean autoBuild) {
                this.autoBuild = autoBuild;
                return this;
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
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
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
             * CustomSource.
             */
            public Builder customSource(String customSource) {
                this.customSource = customSource;
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

            public DummyProjectInfo build() {
                return new DummyProjectInfo(this);
            } 

        } 

    }
    public static class Bottoms extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("Common")
        private Boolean common;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("ListStatus")
        private String listStatus;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("PreviewUrl")
        private String previewUrl;

        @NameInMap("Type")
        private String type;

        private Bottoms(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.common = builder.common;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.ext = builder.ext;
            this.fileUrl = builder.fileUrl;
            this.id = builder.id;
            this.intro = builder.intro;
            this.listStatus = builder.listStatus;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.previewUrl = builder.previewUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bottoms create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return common
         */
        public Boolean getCommon() {
            return this.common;
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
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return listStatus
         */
        public String getListStatus() {
            return this.listStatus;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkStatus; 
            private Boolean common; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String ext; 
            private String fileUrl; 
            private Long id; 
            private String intro; 
            private String listStatus; 
            private String modifiedTime; 
            private String name; 
            private String ossKey; 
            private String previewUrl; 
            private String type; 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * Common.
             */
            public Builder common(Boolean common) {
                this.common = common;
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
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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
             * ListStatus.
             */
            public Builder listStatus(String listStatus) {
                this.listStatus = listStatus;
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
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Bottoms build() {
                return new Bottoms(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("Common")
        private Boolean common;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("ListStatus")
        private String listStatus;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("PreviewUrl")
        private String previewUrl;

        @NameInMap("Type")
        private String type;

        private Model(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.common = builder.common;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.ext = builder.ext;
            this.fileUrl = builder.fileUrl;
            this.id = builder.id;
            this.intro = builder.intro;
            this.listStatus = builder.listStatus;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.previewUrl = builder.previewUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return common
         */
        public Boolean getCommon() {
            return this.common;
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
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return listStatus
         */
        public String getListStatus() {
            return this.listStatus;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkStatus; 
            private Boolean common; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String ext; 
            private String fileUrl; 
            private Long id; 
            private String intro; 
            private String listStatus; 
            private String modifiedTime; 
            private String name; 
            private String ossKey; 
            private String previewUrl; 
            private String type; 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * Common.
             */
            public Builder common(Boolean common) {
                this.common = common;
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
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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
             * ListStatus.
             */
            public Builder listStatus(String listStatus) {
                this.listStatus = listStatus;
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
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    public static class Suit extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("Common")
        private Boolean common;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("ListStatus")
        private String listStatus;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("PreviewUrl")
        private String previewUrl;

        @NameInMap("Type")
        private String type;

        private Suit(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.common = builder.common;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.ext = builder.ext;
            this.fileUrl = builder.fileUrl;
            this.id = builder.id;
            this.intro = builder.intro;
            this.listStatus = builder.listStatus;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.previewUrl = builder.previewUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Suit create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return common
         */
        public Boolean getCommon() {
            return this.common;
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
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return listStatus
         */
        public String getListStatus() {
            return this.listStatus;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkStatus; 
            private Boolean common; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String ext; 
            private String fileUrl; 
            private Long id; 
            private String intro; 
            private String listStatus; 
            private String modifiedTime; 
            private String name; 
            private String ossKey; 
            private String previewUrl; 
            private String type; 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * Common.
             */
            public Builder common(Boolean common) {
                this.common = common;
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
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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
             * ListStatus.
             */
            public Builder listStatus(String listStatus) {
                this.listStatus = listStatus;
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
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Suit build() {
                return new Suit(this);
            } 

        } 

    }
    public static class Tops extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("Common")
        private Boolean common;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("ListStatus")
        private String listStatus;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("PreviewUrl")
        private String previewUrl;

        @NameInMap("Type")
        private String type;

        private Tops(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.common = builder.common;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.ext = builder.ext;
            this.fileUrl = builder.fileUrl;
            this.id = builder.id;
            this.intro = builder.intro;
            this.listStatus = builder.listStatus;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.previewUrl = builder.previewUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tops create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return common
         */
        public Boolean getCommon() {
            return this.common;
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
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return listStatus
         */
        public String getListStatus() {
            return this.listStatus;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkStatus; 
            private Boolean common; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String ext; 
            private String fileUrl; 
            private Long id; 
            private String intro; 
            private String listStatus; 
            private String modifiedTime; 
            private String name; 
            private String ossKey; 
            private String previewUrl; 
            private String type; 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * Common.
             */
            public Builder common(Boolean common) {
                this.common = common;
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
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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
             * ListStatus.
             */
            public Builder listStatus(String listStatus) {
                this.listStatus = listStatus;
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
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tops build() {
                return new Tops(this);
            } 

        } 

    }
    public static class MaterialInfo extends TeaModel {
        @NameInMap("Bottoms")
        private Bottoms bottoms;

        @NameInMap("ClothingType")
        private String clothingType;

        @NameInMap("Model")
        private Model model;

        @NameInMap("ShoeType")
        private String shoeType;

        @NameInMap("Suit")
        private Suit suit;

        @NameInMap("Tops")
        private Tops tops;

        private MaterialInfo(Builder builder) {
            this.bottoms = builder.bottoms;
            this.clothingType = builder.clothingType;
            this.model = builder.model;
            this.shoeType = builder.shoeType;
            this.suit = builder.suit;
            this.tops = builder.tops;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaterialInfo create() {
            return builder().build();
        }

        /**
         * @return bottoms
         */
        public Bottoms getBottoms() {
            return this.bottoms;
        }

        /**
         * @return clothingType
         */
        public String getClothingType() {
            return this.clothingType;
        }

        /**
         * @return model
         */
        public Model getModel() {
            return this.model;
        }

        /**
         * @return shoeType
         */
        public String getShoeType() {
            return this.shoeType;
        }

        /**
         * @return suit
         */
        public Suit getSuit() {
            return this.suit;
        }

        /**
         * @return tops
         */
        public Tops getTops() {
            return this.tops;
        }

        public static final class Builder {
            private Bottoms bottoms; 
            private String clothingType; 
            private Model model; 
            private String shoeType; 
            private Suit suit; 
            private Tops tops; 

            /**
             * Bottoms.
             */
            public Builder bottoms(Bottoms bottoms) {
                this.bottoms = bottoms;
                return this;
            }

            /**
             * ClothingType.
             */
            public Builder clothingType(String clothingType) {
                this.clothingType = clothingType;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * ShoeType.
             */
            public Builder shoeType(String shoeType) {
                this.shoeType = shoeType;
                return this;
            }

            /**
             * Suit.
             */
            public Builder suit(Suit suit) {
                this.suit = suit;
                return this;
            }

            /**
             * Tops.
             */
            public Builder tops(Tops tops) {
                this.tops = tops;
                return this;
            }

            public MaterialInfo build() {
                return new MaterialInfo(this);
            } 

        } 

    }
    public static class Feedback extends TeaModel {
        @NameInMap("DislikeTags")
        private java.util.List < Integer > dislikeTags;

        @NameInMap("OtherReason")
        private String otherReason;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("Rating")
        private Integer rating;

        private Feedback(Builder builder) {
            this.dislikeTags = builder.dislikeTags;
            this.otherReason = builder.otherReason;
            this.projectId = builder.projectId;
            this.rating = builder.rating;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Feedback create() {
            return builder().build();
        }

        /**
         * @return dislikeTags
         */
        public java.util.List < Integer > getDislikeTags() {
            return this.dislikeTags;
        }

        /**
         * @return otherReason
         */
        public String getOtherReason() {
            return this.otherReason;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return rating
         */
        public Integer getRating() {
            return this.rating;
        }

        public static final class Builder {
            private java.util.List < Integer > dislikeTags; 
            private String otherReason; 
            private Long projectId; 
            private Integer rating; 

            /**
             * DislikeTags.
             */
            public Builder dislikeTags(java.util.List < Integer > dislikeTags) {
                this.dislikeTags = dislikeTags;
                return this;
            }

            /**
             * OtherReason.
             */
            public Builder otherReason(String otherReason) {
                this.otherReason = otherReason;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Rating.
             */
            public Builder rating(Integer rating) {
                this.rating = rating;
                return this;
            }

            public Feedback build() {
                return new Feedback(this);
            } 

        } 

    }
    public static class SubProjectInfoBuildDetail extends TeaModel {
        @NameInMap("CompletedTime")
        private String completedTime;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EstimatedDuration")
        private Long estimatedDuration;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RunningTime")
        private String runningTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubmitTime")
        private String submitTime;

        private SubProjectInfoBuildDetail(Builder builder) {
            this.completedTime = builder.completedTime;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.errorMessage = builder.errorMessage;
            this.estimatedDuration = builder.estimatedDuration;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.runningTime = builder.runningTime;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProjectInfoBuildDetail create() {
            return builder().build();
        }

        /**
         * @return completedTime
         */
        public String getCompletedTime() {
            return this.completedTime;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return runningTime
         */
        public String getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private String completedTime; 
            private String createTime; 
            private Boolean deleted; 
            private String errorMessage; 
            private Long estimatedDuration; 
            private Long id; 
            private String modifiedTime; 
            private String runningTime; 
            private String status; 
            private String submitTime; 

            /**
             * CompletedTime.
             */
            public Builder completedTime(String completedTime) {
                this.completedTime = completedTime;
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
             * Id.
             */
            public Builder id(Long id) {
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
             * RunningTime.
             */
            public Builder runningTime(String runningTime) {
                this.runningTime = runningTime;
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
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public SubProjectInfoBuildDetail build() {
                return new SubProjectInfoBuildDetail(this);
            } 

        } 

    }
    public static class DatasetPolicy extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("Expire")
        private String expire;

        @NameInMap("Host")
        private String host;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
        private String signature;

        private DatasetPolicy(Builder builder) {
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

        public static DatasetPolicy create() {
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

            public DatasetPolicy build() {
                return new DatasetPolicy(this);
            } 

        } 

    }
    public static class SubProjectInfoDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        private java.util.Map < String, ? > buildResultUrl;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("GlbModelUrl")
        private String glbModelUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModelUrl")
        private String modelUrl;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OriginResultUrl")
        private String originResultUrl;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Policy")
        private DatasetPolicy policy;

        @NameInMap("PoseUrl")
        private String poseUrl;

        @NameInMap("PreviewUrl")
        private String previewUrl;

        private SubProjectInfoDataset(Builder builder) {
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

        public static SubProjectInfoDataset create() {
            return builder().build();
        }

        /**
         * @return buildResultUrl
         */
        public java.util.Map < String, ? > getBuildResultUrl() {
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
        public Long getId() {
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
        public DatasetPolicy getPolicy() {
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
            private java.util.Map < String, ? > buildResultUrl; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String errorCode; 
            private String errorMessage; 
            private String glbModelUrl; 
            private Long id; 
            private String modelUrl; 
            private String modifiedTime; 
            private String originResultUrl; 
            private String ossKey; 
            private DatasetPolicy policy; 
            private String poseUrl; 
            private String previewUrl; 

            /**
             * BuildResultUrl.
             */
            public Builder buildResultUrl(java.util.Map < String, ? > buildResultUrl) {
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
            public Builder id(Long id) {
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
            public Builder policy(DatasetPolicy policy) {
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

            public SubProjectInfoDataset build() {
                return new SubProjectInfoDataset(this);
            } 

        } 

    }
    public static class ClothesSkuProps extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Options")
        private java.util.List < String > options;

        private ClothesSkuProps(Builder builder) {
            this.name = builder.name;
            this.options = builder.options;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClothesSkuProps create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return options
         */
        public java.util.List < String > getOptions() {
            return this.options;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < String > options; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(java.util.List < String > options) {
                this.options = options;
                return this;
            }

            public ClothesSkuProps build() {
                return new ClothesSkuProps(this);
            } 

        } 

    }
    public static class ClothesSkus extends TeaModel {
        @NameInMap("Color")
        private String color;

        @NameInMap("Cover")
        private String cover;

        @NameInMap("Size")
        private String size;

        @NameInMap("Status")
        private String status;

        private ClothesSkus(Builder builder) {
            this.color = builder.color;
            this.cover = builder.cover;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClothesSkus create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return cover
         */
        public String getCover() {
            return this.cover;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String color; 
            private String cover; 
            private String size; 
            private String status; 

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Cover.
             */
            public Builder cover(String cover) {
                this.cover = cover;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClothesSkus build() {
                return new ClothesSkus(this);
            } 

        } 

    }
    public static class SourceClothes extends TeaModel {
        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Part")
        private String part;

        @NameInMap("Size")
        private String size;

        @NameInMap("SkuProps")
        private java.util.List < ClothesSkuProps> skuProps;

        @NameInMap("Skus")
        private java.util.List < ClothesSkus> skus;

        @NameInMap("Status")
        private java.util.Map < String, String > status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Version")
        private Integer version;

        private SourceClothes(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.part = builder.part;
            this.size = builder.size;
            this.skuProps = builder.skuProps;
            this.skus = builder.skus;
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceClothes create() {
            return builder().build();
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
         * @return part
         */
        public String getPart() {
            return this.part;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return skuProps
         */
        public java.util.List < ClothesSkuProps> getSkuProps() {
            return this.skuProps;
        }

        /**
         * @return skus
         */
        public java.util.List < ClothesSkus> getSkus() {
            return this.skus;
        }

        /**
         * @return status
         */
        public java.util.Map < String, String > getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private Long id; 
            private String modifiedTime; 
            private String name; 
            private String ossKey; 
            private String part; 
            private String size; 
            private java.util.List < ClothesSkuProps> skuProps; 
            private java.util.List < ClothesSkus> skus; 
            private java.util.Map < String, String > status; 
            private String type; 
            private Integer version; 

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
             * Id.
             */
            public Builder id(Long id) {
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
             * Part.
             */
            public Builder part(String part) {
                this.part = part;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * SkuProps.
             */
            public Builder skuProps(java.util.List < ClothesSkuProps> skuProps) {
                this.skuProps = skuProps;
                return this;
            }

            /**
             * Skus.
             */
            public Builder skus(java.util.List < ClothesSkus> skus) {
                this.skus = skus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(java.util.Map < String, String > status) {
                this.status = status;
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
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public SourceClothes build() {
                return new SourceClothes(this);
            } 

        } 

    }
    public static class SubProjectInfoSourcePolicy extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("Expire")
        private String expire;

        @NameInMap("Host")
        private String host;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
        private String signature;

        private SubProjectInfoSourcePolicy(Builder builder) {
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

        public static SubProjectInfoSourcePolicy create() {
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

            public SubProjectInfoSourcePolicy build() {
                return new SubProjectInfoSourcePolicy(this);
            } 

        } 

    }
    public static class SourceSourceFiles extends TeaModel {
        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Filesize")
        private Long filesize;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        private SourceSourceFiles(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.fileName = builder.fileName;
            this.filesize = builder.filesize;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.ossKey = builder.ossKey;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceSourceFiles create() {
            return builder().build();
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
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filesize
         */
        public Long getFilesize() {
            return this.filesize;
        }

        /**
         * @return id
         */
        public Long getId() {
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
            private String createTime; 
            private Boolean deleted; 
            private String fileName; 
            private Long filesize; 
            private Long id; 
            private String modifiedTime; 
            private String ossKey; 
            private String type; 
            private String url; 

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
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Filesize.
             */
            public Builder filesize(Long filesize) {
                this.filesize = filesize;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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

            public SourceSourceFiles build() {
                return new SourceSourceFiles(this);
            } 

        } 

    }
    public static class SourceToken extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("Expiration")
        private String expiration;

        @NameInMap("Host")
        private String host;

        @NameInMap("SecurityToken")
        private String securityToken;

        private SourceToken(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.dir = builder.dir;
            this.expiration = builder.expiration;
            this.host = builder.host;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceToken create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String dir; 
            private String expiration; 
            private String host; 
            private String securityToken; 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
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
             * Expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
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
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public SourceToken build() {
                return new SourceToken(this);
            } 

        } 

    }
    public static class SubProjectInfoSource extends TeaModel {
        @NameInMap("Clothes")
        private java.util.List < SourceClothes> clothes;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Policy")
        private SubProjectInfoSourcePolicy policy;

        @NameInMap("SourceFiles")
        private java.util.List < SourceSourceFiles> sourceFiles;

        @NameInMap("Token")
        private SourceToken token;

        private SubProjectInfoSource(Builder builder) {
            this.clothes = builder.clothes;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.ossKey = builder.ossKey;
            this.policy = builder.policy;
            this.sourceFiles = builder.sourceFiles;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProjectInfoSource create() {
            return builder().build();
        }

        /**
         * @return clothes
         */
        public java.util.List < SourceClothes> getClothes() {
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
         * @return id
         */
        public Long getId() {
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
        public SubProjectInfoSourcePolicy getPolicy() {
            return this.policy;
        }

        /**
         * @return sourceFiles
         */
        public java.util.List < SourceSourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

        /**
         * @return token
         */
        public SourceToken getToken() {
            return this.token;
        }

        public static final class Builder {
            private java.util.List < SourceClothes> clothes; 
            private String createTime; 
            private Boolean deleted; 
            private Long id; 
            private String modifiedTime; 
            private String ossKey; 
            private SubProjectInfoSourcePolicy policy; 
            private java.util.List < SourceSourceFiles> sourceFiles; 
            private SourceToken token; 

            /**
             * Clothes.
             */
            public Builder clothes(java.util.List < SourceClothes> clothes) {
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
             * Id.
             */
            public Builder id(Long id) {
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
            public Builder policy(SubProjectInfoSourcePolicy policy) {
                this.policy = policy;
                return this;
            }

            /**
             * SourceFiles.
             */
            public Builder sourceFiles(java.util.List < SourceSourceFiles> sourceFiles) {
                this.sourceFiles = sourceFiles;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(SourceToken token) {
                this.token = token;
                return this;
            }

            public SubProjectInfoSource build() {
                return new SubProjectInfoSource(this);
            } 

        } 

    }
    public static class SubProjectInfo extends TeaModel {
        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("AutoBuild")
        private Boolean autoBuild;

        @NameInMap("BizUsage")
        private String bizUsage;

        @NameInMap("BuildDetail")
        private SubProjectInfoBuildDetail buildDetail;

        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("CreateMode")
        private String createMode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CustomSource")
        private String customSource;

        @NameInMap("Dataset")
        private SubProjectInfoDataset dataset;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Dependencies")
        private String dependencies;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("Id")
        private String id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("MaterialCoverUrl")
        private String materialCoverUrl;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Source")
        private SubProjectInfoSource source;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private String type;

        private SubProjectInfo(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.autoBuild = builder.autoBuild;
            this.bizUsage = builder.bizUsage;
            this.buildDetail = builder.buildDetail;
            this.checkStatus = builder.checkStatus;
            this.createMode = builder.createMode;
            this.createTime = builder.createTime;
            this.customSource = builder.customSource;
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

        public static SubProjectInfo create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return autoBuild
         */
        public Boolean getAutoBuild() {
            return this.autoBuild;
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
        public SubProjectInfoBuildDetail getBuildDetail() {
            return this.buildDetail;
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
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
         * @return customSource
         */
        public String getCustomSource() {
            return this.customSource;
        }

        /**
         * @return dataset
         */
        public SubProjectInfoDataset getDataset() {
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
        public SubProjectInfoSource getSource() {
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
            private String auditStatus; 
            private Boolean autoBuild; 
            private String bizUsage; 
            private SubProjectInfoBuildDetail buildDetail; 
            private String checkStatus; 
            private String createMode; 
            private String createTime; 
            private String customSource; 
            private SubProjectInfoDataset dataset; 
            private Boolean deleted; 
            private String dependencies; 
            private String ext; 
            private String id; 
            private String intro; 
            private String materialCoverUrl; 
            private String modifiedTime; 
            private SubProjectInfoSource source; 
            private String status; 
            private String title; 
            private String type; 

            /**
             * AuditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * AutoBuild.
             */
            public Builder autoBuild(Boolean autoBuild) {
                this.autoBuild = autoBuild;
                return this;
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
            public Builder buildDetail(SubProjectInfoBuildDetail buildDetail) {
                this.buildDetail = buildDetail;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
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
             * CustomSource.
             */
            public Builder customSource(String customSource) {
                this.customSource = customSource;
                return this;
            }

            /**
             * Dataset.
             */
            public Builder dataset(SubProjectInfoDataset dataset) {
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
            public Builder source(SubProjectInfoSource source) {
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

            public SubProjectInfo build() {
                return new SubProjectInfo(this);
            } 

        } 

    }
    public static class SubTasks extends TeaModel {
        @NameInMap("Feedback")
        private Feedback feedback;

        @NameInMap("SubProjectInfo")
        private SubProjectInfo subProjectInfo;

        private SubTasks(Builder builder) {
            this.feedback = builder.feedback;
            this.subProjectInfo = builder.subProjectInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTasks create() {
            return builder().build();
        }

        /**
         * @return feedback
         */
        public Feedback getFeedback() {
            return this.feedback;
        }

        /**
         * @return subProjectInfo
         */
        public SubProjectInfo getSubProjectInfo() {
            return this.subProjectInfo;
        }

        public static final class Builder {
            private Feedback feedback; 
            private SubProjectInfo subProjectInfo; 

            /**
             * Feedback.
             */
            public Builder feedback(Feedback feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * SubProjectInfo.
             */
            public Builder subProjectInfo(SubProjectInfo subProjectInfo) {
                this.subProjectInfo = subProjectInfo;
                return this;
            }

            public SubTasks build() {
                return new SubTasks(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DummyProjectInfo")
        private DummyProjectInfo dummyProjectInfo;

        @NameInMap("MaterialInfo")
        private MaterialInfo materialInfo;

        @NameInMap("SubTasks")
        private java.util.List < SubTasks> subTasks;

        private Data(Builder builder) {
            this.dummyProjectInfo = builder.dummyProjectInfo;
            this.materialInfo = builder.materialInfo;
            this.subTasks = builder.subTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dummyProjectInfo
         */
        public DummyProjectInfo getDummyProjectInfo() {
            return this.dummyProjectInfo;
        }

        /**
         * @return materialInfo
         */
        public MaterialInfo getMaterialInfo() {
            return this.materialInfo;
        }

        /**
         * @return subTasks
         */
        public java.util.List < SubTasks> getSubTasks() {
            return this.subTasks;
        }

        public static final class Builder {
            private DummyProjectInfo dummyProjectInfo; 
            private MaterialInfo materialInfo; 
            private java.util.List < SubTasks> subTasks; 

            /**
             * DummyProjectInfo.
             */
            public Builder dummyProjectInfo(DummyProjectInfo dummyProjectInfo) {
                this.dummyProjectInfo = dummyProjectInfo;
                return this;
            }

            /**
             * MaterialInfo.
             */
            public Builder materialInfo(MaterialInfo materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

            /**
             * SubTasks.
             */
            public Builder subTasks(java.util.List < SubTasks> subTasks) {
                this.subTasks = subTasks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
