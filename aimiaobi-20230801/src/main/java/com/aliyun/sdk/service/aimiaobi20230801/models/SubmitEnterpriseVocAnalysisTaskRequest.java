// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitEnterpriseVocAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitEnterpriseVocAnalysisTaskRequest</p>
 */
public class SubmitEnterpriseVocAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentTags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ContentTags> contentTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Contents")
    private java.util.List < Contents> contents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterTags")
    private java.util.List < FilterTags> filterTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaterialType")
    private String materialType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PositiveSample")
    private String positiveSample;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PositiveSampleFileKey")
    private String positiveSampleFileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitEnterpriseVocAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contentTags = builder.contentTags;
        this.contents = builder.contents;
        this.fileKey = builder.fileKey;
        this.filterTags = builder.filterTags;
        this.materialType = builder.materialType;
        this.modelId = builder.modelId;
        this.positiveSample = builder.positiveSample;
        this.positiveSampleFileKey = builder.positiveSampleFileKey;
        this.taskType = builder.taskType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitEnterpriseVocAnalysisTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contentTags
     */
    public java.util.List < ContentTags> getContentTags() {
        return this.contentTags;
    }

    /**
     * @return contents
     */
    public java.util.List < Contents> getContents() {
        return this.contents;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return filterTags
     */
    public java.util.List < FilterTags> getFilterTags() {
        return this.filterTags;
    }

    /**
     * @return materialType
     */
    public String getMaterialType() {
        return this.materialType;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return positiveSample
     */
    public String getPositiveSample() {
        return this.positiveSample;
    }

    /**
     * @return positiveSampleFileKey
     */
    public String getPositiveSampleFileKey() {
        return this.positiveSampleFileKey;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitEnterpriseVocAnalysisTaskRequest, Builder> {
        private String regionId; 
        private java.util.List < ContentTags> contentTags; 
        private java.util.List < Contents> contents; 
        private String fileKey; 
        private java.util.List < FilterTags> filterTags; 
        private String materialType; 
        private String modelId; 
        private String positiveSample; 
        private String positiveSampleFileKey; 
        private String taskType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitEnterpriseVocAnalysisTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contentTags = request.contentTags;
            this.contents = request.contents;
            this.fileKey = request.fileKey;
            this.filterTags = request.filterTags;
            this.materialType = request.materialType;
            this.modelId = request.modelId;
            this.positiveSample = request.positiveSample;
            this.positiveSampleFileKey = request.positiveSampleFileKey;
            this.taskType = request.taskType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contentTags(java.util.List < ContentTags> contentTags) {
            String contentTagsShrink = shrink(contentTags, "ContentTags", "json");
            this.putBodyParameter("ContentTags", contentTagsShrink);
            this.contentTags = contentTags;
            return this;
        }

        /**
         * Contents.
         */
        public Builder contents(java.util.List < Contents> contents) {
            String contentsShrink = shrink(contents, "Contents", "json");
            this.putBodyParameter("Contents", contentsShrink);
            this.contents = contents;
            return this;
        }

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * FilterTags.
         */
        public Builder filterTags(java.util.List < FilterTags> filterTags) {
            String filterTagsShrink = shrink(filterTags, "FilterTags", "json");
            this.putBodyParameter("FilterTags", filterTagsShrink);
            this.filterTags = filterTags;
            return this;
        }

        /**
         * MaterialType.
         */
        public Builder materialType(String materialType) {
            this.putBodyParameter("MaterialType", materialType);
            this.materialType = materialType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * PositiveSample.
         */
        public Builder positiveSample(String positiveSample) {
            this.putBodyParameter("PositiveSample", positiveSample);
            this.positiveSample = positiveSample;
            return this;
        }

        /**
         * PositiveSampleFileKey.
         */
        public Builder positiveSampleFileKey(String positiveSampleFileKey) {
            this.putBodyParameter("PositiveSampleFileKey", positiveSampleFileKey);
            this.positiveSampleFileKey = positiveSampleFileKey;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitEnterpriseVocAnalysisTaskRequest build() {
            return new SubmitEnterpriseVocAnalysisTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitEnterpriseVocAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitEnterpriseVocAnalysisTaskRequest</p>
     */
    public static class ContentTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagDefinePrompt")
        private String tagDefinePrompt;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("TagTaskType")
        private String tagTaskType;

        @com.aliyun.core.annotation.NameInMap("TagValueDefinePrompt")
        private String tagValueDefinePrompt;

        private ContentTags(Builder builder) {
            this.tagDefinePrompt = builder.tagDefinePrompt;
            this.tagName = builder.tagName;
            this.tagTaskType = builder.tagTaskType;
            this.tagValueDefinePrompt = builder.tagValueDefinePrompt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentTags create() {
            return builder().build();
        }

        /**
         * @return tagDefinePrompt
         */
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tagTaskType
         */
        public String getTagTaskType() {
            return this.tagTaskType;
        }

        /**
         * @return tagValueDefinePrompt
         */
        public String getTagValueDefinePrompt() {
            return this.tagValueDefinePrompt;
        }

        public static final class Builder {
            private String tagDefinePrompt; 
            private String tagName; 
            private String tagTaskType; 
            private String tagValueDefinePrompt; 

            /**
             * TagDefinePrompt.
             */
            public Builder tagDefinePrompt(String tagDefinePrompt) {
                this.tagDefinePrompt = tagDefinePrompt;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * TagTaskType.
             */
            public Builder tagTaskType(String tagTaskType) {
                this.tagTaskType = tagTaskType;
                return this;
            }

            /**
             * TagValueDefinePrompt.
             */
            public Builder tagValueDefinePrompt(String tagValueDefinePrompt) {
                this.tagValueDefinePrompt = tagValueDefinePrompt;
                return this;
            }

            public ContentTags build() {
                return new ContentTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitEnterpriseVocAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitEnterpriseVocAnalysisTaskRequest</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Contents(Builder builder) {
            this.extraInfo = builder.extraInfo;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String extraInfo; 
            private String text; 

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitEnterpriseVocAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitEnterpriseVocAnalysisTaskRequest</p>
     */
    public static class FilterTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagDefinePrompt")
        private String tagDefinePrompt;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("TagType")
        private String tagType;

        @com.aliyun.core.annotation.NameInMap("TagValueDefinePrompt")
        private String tagValueDefinePrompt;

        private FilterTags(Builder builder) {
            this.tagDefinePrompt = builder.tagDefinePrompt;
            this.tagName = builder.tagName;
            this.tagType = builder.tagType;
            this.tagValueDefinePrompt = builder.tagValueDefinePrompt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterTags create() {
            return builder().build();
        }

        /**
         * @return tagDefinePrompt
         */
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tagType
         */
        public String getTagType() {
            return this.tagType;
        }

        /**
         * @return tagValueDefinePrompt
         */
        public String getTagValueDefinePrompt() {
            return this.tagValueDefinePrompt;
        }

        public static final class Builder {
            private String tagDefinePrompt; 
            private String tagName; 
            private String tagType; 
            private String tagValueDefinePrompt; 

            /**
             * TagDefinePrompt.
             */
            public Builder tagDefinePrompt(String tagDefinePrompt) {
                this.tagDefinePrompt = tagDefinePrompt;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * TagType.
             */
            public Builder tagType(String tagType) {
                this.tagType = tagType;
                return this;
            }

            /**
             * TagValueDefinePrompt.
             */
            public Builder tagValueDefinePrompt(String tagValueDefinePrompt) {
                this.tagValueDefinePrompt = tagValueDefinePrompt;
                return this;
            }

            public FilterTags build() {
                return new FilterTags(this);
            } 

        } 

    }
}
