// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListTextToAvatarProjectResponseBody} extends {@link TeaModel}
 *
 * <p>PopListTextToAvatarProjectResponseBody</p>
 */
public class PopListTextToAvatarProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Current")
    private Integer current;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Pages")
    private Integer pages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Size")
    private Integer size;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private PopListTextToAvatarProjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.current = builder.current;
        this.data = builder.data;
        this.message = builder.message;
        this.pages = builder.pages;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListTextToAvatarProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pages
     */
    public Integer getPages() {
        return this.pages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer current; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pages; 
        private String requestId; 
        private Integer size; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.current = current;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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
         * Pages.
         */
        public Builder pages(Integer pages) {
            this.pages = pages;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public PopListTextToAvatarProjectResponseBody build() {
            return new PopListTextToAvatarProjectResponseBody(this);
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

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("Policy")
        private Policy policy;

        private Dataset(Builder builder) {
            this.buildResultUrl = builder.buildResultUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.modifiedTime = builder.modifiedTime;
            this.ossKey = builder.ossKey;
            this.policy = builder.policy;
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
        public Policy getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private java.util.Map < String, ? > buildResultUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String errorCode; 
            private String errorMessage; 
            private String modifiedTime; 
            private String ossKey; 
            private Policy policy; 

            /**
             * BuildResultUrl.
             */
            public Builder buildResultUrl(java.util.Map < String, ? > buildResultUrl) {
                this.buildResultUrl = buildResultUrl;
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
            public Builder policy(Policy policy) {
                this.policy = policy;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
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

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.autoBuild = builder.autoBuild;
            this.bizUsage = builder.bizUsage;
            this.buildDetail = builder.buildDetail;
            this.checkStatus = builder.checkStatus;
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
            private Boolean autoBuild; 
            private String bizUsage; 
            private BuildDetail buildDetail; 
            private String checkStatus; 
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
            private String status; 
            private String title; 
            private String type; 

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
