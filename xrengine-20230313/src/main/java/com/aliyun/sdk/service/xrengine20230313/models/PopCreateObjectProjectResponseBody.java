// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopCreateObjectProjectResponseBody} extends {@link TeaModel}
 *
 * <p>PopCreateObjectProjectResponseBody</p>
 */
public class PopCreateObjectProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorName")
    private String errorName;

    @NameInMap("HttpCode")
    private Integer httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PopCreateObjectProjectResponseBody(Builder builder) {
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

    public static PopCreateObjectProjectResponseBody create() {
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

        public PopCreateObjectProjectResponseBody build() {
            return new PopCreateObjectProjectResponseBody(this);
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

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RunningTime")
        private String runningTime;

        @NameInMap("SubmitTime")
        private String submitTime;

        private BuildDetail(Builder builder) {
            this.completedTime = builder.completedTime;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.errorMessage = builder.errorMessage;
            this.estimatedDuration = builder.estimatedDuration;
            this.modifiedTime = builder.modifiedTime;
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
            private String modifiedTime; 
            private String runningTime; 
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
    public static class Dataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        private java.util.Map < String, ? > buildResultUrl;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("GlbModelUrl")
        private String glbModelUrl;

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

        @NameInMap("Token")
        private Token token;

        private Dataset(Builder builder) {
            this.buildResultUrl = builder.buildResultUrl;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.errorMessage = builder.errorMessage;
            this.glbModelUrl = builder.glbModelUrl;
            this.modelUrl = builder.modelUrl;
            this.modifiedTime = builder.modifiedTime;
            this.originResultUrl = builder.originResultUrl;
            this.ossKey = builder.ossKey;
            this.policy = builder.policy;
            this.poseUrl = builder.poseUrl;
            this.previewUrl = builder.previewUrl;
            this.token = builder.token;
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

        /**
         * @return token
         */
        public Token getToken() {
            return this.token;
        }

        public static final class Builder {
            private java.util.Map < String, ? > buildResultUrl; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String errorMessage; 
            private String glbModelUrl; 
            private String modelUrl; 
            private String modifiedTime; 
            private String originResultUrl; 
            private String ossKey; 
            private Policy policy; 
            private String poseUrl; 
            private String previewUrl; 
            private Token token; 

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

            /**
             * Token.
             */
            public Builder token(Token token) {
                this.token = token;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
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

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Type")
        private String type;

        private Clothes(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.modifiedTime = builder.modifiedTime;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String modifiedTime; 
            private String name; 
            private String ossKey; 
            private String type; 

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
    public static class Source extends TeaModel {
        @NameInMap("Clothes")
        private java.util.List < Clothes> clothes;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Policy")
        private SourcePolicy policy;

        @NameInMap("SourceFiles")
        private java.util.List < SourceFiles> sourceFiles;

        @NameInMap("Token")
        private SourceToken token;

        private Source(Builder builder) {
            this.clothes = builder.clothes;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
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
        public SourceToken getToken() {
            return this.token;
        }

        public static final class Builder {
            private java.util.List < Clothes> clothes; 
            private String createTime; 
            private Boolean deleted; 
            private String modifiedTime; 
            private String ossKey; 
            private SourcePolicy policy; 
            private java.util.List < SourceFiles> sourceFiles; 
            private SourceToken token; 

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
            public Builder token(SourceToken token) {
                this.token = token;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
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

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RecommendStatus")
        private String recommendStatus;

        @NameInMap("Source")
        private Source source;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
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
            this.modifiedTime = builder.modifiedTime;
            this.recommendStatus = builder.recommendStatus;
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return recommendStatus
         */
        public String getRecommendStatus() {
            return this.recommendStatus;
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
            private String modifiedTime; 
            private String recommendStatus; 
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RecommendStatus.
             */
            public Builder recommendStatus(String recommendStatus) {
                this.recommendStatus = recommendStatus;
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
