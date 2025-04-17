// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link SubmitEnterpriseVocAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitEnterpriseVocAnalysisTaskRequest</p>
 */
public class SubmitEnterpriseVocAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contents")
    private java.util.List<Contents> contents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filterTags")
    private java.util.List<FilterTags> filterTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputFormat")
    private String outputFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDescription")
    private String taskDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private SubmitEnterpriseVocAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.apiKey = builder.apiKey;
        this.contents = builder.contents;
        this.extraInfo = builder.extraInfo;
        this.fileKey = builder.fileKey;
        this.filterTags = builder.filterTags;
        this.modelId = builder.modelId;
        this.outputFormat = builder.outputFormat;
        this.tags = builder.tags;
        this.taskDescription = builder.taskDescription;
        this.url = builder.url;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return contents
     */
    public java.util.List<Contents> getContents() {
        return this.contents;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
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
    public java.util.List<FilterTags> getFilterTags() {
        return this.filterTags;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return outputFormat
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<SubmitEnterpriseVocAnalysisTaskRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String apiKey; 
        private java.util.List<Contents> contents; 
        private String extraInfo; 
        private String fileKey; 
        private java.util.List<FilterTags> filterTags; 
        private String modelId; 
        private String outputFormat; 
        private java.util.List<Tags> tags; 
        private String taskDescription; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(SubmitEnterpriseVocAnalysisTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.apiKey = request.apiKey;
            this.contents = request.contents;
            this.extraInfo = request.extraInfo;
            this.fileKey = request.fileKey;
            this.filterTags = request.filterTags;
            this.modelId = request.modelId;
            this.outputFormat = request.outputFormat;
            this.tags = request.tags;
            this.taskDescription = request.taskDescription;
            this.url = request.url;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("apiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * contents.
         */
        public Builder contents(java.util.List<Contents> contents) {
            String contentsShrink = shrink(contents, "contents", "json");
            this.putBodyParameter("contents", contentsShrink);
            this.contents = contents;
            return this;
        }

        /**
         * extraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putBodyParameter("extraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * fileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("fileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * filterTags.
         */
        public Builder filterTags(java.util.List<FilterTags> filterTags) {
            String filterTagsShrink = shrink(filterTags, "filterTags", "json");
            this.putBodyParameter("filterTags", filterTagsShrink);
            this.filterTags = filterTags;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * outputFormat.
         */
        public Builder outputFormat(String outputFormat) {
            this.putBodyParameter("outputFormat", outputFormat);
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putBodyParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * taskDescription.
         */
        public Builder taskDescription(String taskDescription) {
            this.putBodyParameter("taskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.putBodyParameter("url", url);
            this.url = url;
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
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Contents(Builder builder) {
            this.id = builder.id;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String id; 
            private String text; 

            private Builder() {
            } 

            private Builder(Contents model) {
                this.id = model.id;
                this.text = model.text;
            } 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * text.
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
        @com.aliyun.core.annotation.NameInMap("tagDefinePrompt")
        private String tagDefinePrompt;

        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        private FilterTags(Builder builder) {
            this.tagDefinePrompt = builder.tagDefinePrompt;
            this.tagName = builder.tagName;
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

        public static final class Builder {
            private String tagDefinePrompt; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(FilterTags model) {
                this.tagDefinePrompt = model.tagDefinePrompt;
                this.tagName = model.tagName;
            } 

            /**
             * tagDefinePrompt.
             */
            public Builder tagDefinePrompt(String tagDefinePrompt) {
                this.tagDefinePrompt = tagDefinePrompt;
                return this;
            }

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public FilterTags build() {
                return new FilterTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitEnterpriseVocAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitEnterpriseVocAnalysisTaskRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagDefinePrompt")
        private String tagDefinePrompt;

        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        private Tags(Builder builder) {
            this.tagDefinePrompt = builder.tagDefinePrompt;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

        public static final class Builder {
            private String tagDefinePrompt; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagDefinePrompt = model.tagDefinePrompt;
                this.tagName = model.tagName;
            } 

            /**
             * tagDefinePrompt.
             */
            public Builder tagDefinePrompt(String tagDefinePrompt) {
                this.tagDefinePrompt = tagDefinePrompt;
                return this;
            }

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
