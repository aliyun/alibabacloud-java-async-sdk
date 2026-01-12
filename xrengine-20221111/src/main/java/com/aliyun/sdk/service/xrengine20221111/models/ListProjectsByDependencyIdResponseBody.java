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
 * {@link ListProjectsByDependencyIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsByDependencyIdResponseBody</p>
 */
public class ListProjectsByDependencyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorName")
    private String errorName;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListProjectsByDependencyIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorName = builder.errorName;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsByDependencyIdResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorName
     */
    public String getErrorName() {
        return this.errorName;
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
        private java.util.List<Data> data; 
        private String errorName; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListProjectsByDependencyIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorName = model.errorName;
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
        public Builder data(java.util.List<Data> data) {
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

        public ListProjectsByDependencyIdResponseBody build() {
            return new ListProjectsByDependencyIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsByDependencyIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsByDependencyIdResponseBody</p>
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
     * {@link ListProjectsByDependencyIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsByDependencyIdResponseBody</p>
     */
    public static class Dataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildResultUrl")
        private java.util.Map<String, ?> buildResultUrl;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("GlbModelUrl")
        private String glbModelUrl;

        @com.aliyun.core.annotation.NameInMap("ModelUrl")
        private String modelUrl;

        @com.aliyun.core.annotation.NameInMap("OriginResultUrl")
        private String originResultUrl;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("PoseUrl")
        private String poseUrl;

        @com.aliyun.core.annotation.NameInMap("PreviewUrl")
        private String previewUrl;

        private Dataset(Builder builder) {
            this.buildResultUrl = builder.buildResultUrl;
            this.coverUrl = builder.coverUrl;
            this.glbModelUrl = builder.glbModelUrl;
            this.modelUrl = builder.modelUrl;
            this.originResultUrl = builder.originResultUrl;
            this.ossKey = builder.ossKey;
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
            private String glbModelUrl; 
            private String modelUrl; 
            private String originResultUrl; 
            private String ossKey; 
            private String poseUrl; 
            private String previewUrl; 

            private Builder() {
            } 

            private Builder(Dataset model) {
                this.buildResultUrl = model.buildResultUrl;
                this.coverUrl = model.coverUrl;
                this.glbModelUrl = model.glbModelUrl;
                this.modelUrl = model.modelUrl;
                this.originResultUrl = model.originResultUrl;
                this.ossKey = model.ossKey;
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
     * {@link ListProjectsByDependencyIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsByDependencyIdResponseBody</p>
     */
    public static class SourceFiles extends TeaModel {
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

        private SourceFiles(Builder builder) {
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

            private Builder(SourceFiles model) {
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

            public SourceFiles build() {
                return new SourceFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsByDependencyIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsByDependencyIdResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SourceFiles")
        private java.util.List<SourceFiles> sourceFiles;

        private Source(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.ossKey = builder.ossKey;
            this.projectId = builder.projectId;
            this.sourceFiles = builder.sourceFiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return sourceFiles
         */
        public java.util.List<SourceFiles> getSourceFiles() {
            return this.sourceFiles;
        }

        public static final class Builder {
            private String createTime; 
            private String id; 
            private String modifiedTime; 
            private String ossKey; 
            private Long projectId; 
            private java.util.List<SourceFiles> sourceFiles; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.createTime = model.createTime;
                this.id = model.id;
                this.modifiedTime = model.modifiedTime;
                this.ossKey = model.ossKey;
                this.projectId = model.projectId;
                this.sourceFiles = model.sourceFiles;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SourceFiles.
             */
            public Builder sourceFiles(java.util.List<SourceFiles> sourceFiles) {
                this.sourceFiles = sourceFiles;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsByDependencyIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsByDependencyIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUsage")
        private String bizUsage;

        @com.aliyun.core.annotation.NameInMap("BuildDetail")
        private BuildDetail buildDetail;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Dataset")
        private Dataset dataset;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Intro")
        private String intro;

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
            this.createTime = builder.createTime;
            this.dataset = builder.dataset;
            this.ext = builder.ext;
            this.id = builder.id;
            this.intro = builder.intro;
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
            private String createTime; 
            private Dataset dataset; 
            private String ext; 
            private String id; 
            private String intro; 
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
                this.createTime = model.createTime;
                this.dataset = model.dataset;
                this.ext = model.ext;
                this.id = model.id;
                this.intro = model.intro;
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
