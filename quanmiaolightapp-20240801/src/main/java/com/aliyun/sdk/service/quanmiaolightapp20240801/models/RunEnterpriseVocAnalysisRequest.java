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
 * {@link RunEnterpriseVocAnalysisRequest} extends {@link RequestModel}
 *
 * <p>RunEnterpriseVocAnalysisRequest</p>
 */
public class RunEnterpriseVocAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("akProxy")
    private String akProxy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extraInfo")
    private String extraInfo;

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
    @com.aliyun.core.annotation.NameInMap("sourceTrace")
    private Boolean sourceTrace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDescription")
    private String taskDescription;

    private RunEnterpriseVocAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.akProxy = builder.akProxy;
        this.apiKey = builder.apiKey;
        this.content = builder.content;
        this.extraInfo = builder.extraInfo;
        this.filterTags = builder.filterTags;
        this.modelId = builder.modelId;
        this.outputFormat = builder.outputFormat;
        this.sourceTrace = builder.sourceTrace;
        this.tags = builder.tags;
        this.taskDescription = builder.taskDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunEnterpriseVocAnalysisRequest create() {
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
     * @return akProxy
     */
    public String getAkProxy() {
        return this.akProxy;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
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
     * @return sourceTrace
     */
    public Boolean getSourceTrace() {
        return this.sourceTrace;
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

    public static final class Builder extends Request.Builder<RunEnterpriseVocAnalysisRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String akProxy; 
        private String apiKey; 
        private String content; 
        private String extraInfo; 
        private java.util.List<FilterTags> filterTags; 
        private String modelId; 
        private String outputFormat; 
        private Boolean sourceTrace; 
        private java.util.List<Tags> tags; 
        private String taskDescription; 

        private Builder() {
            super();
        } 

        private Builder(RunEnterpriseVocAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.akProxy = request.akProxy;
            this.apiKey = request.apiKey;
            this.content = request.content;
            this.extraInfo = request.extraInfo;
            this.filterTags = request.filterTags;
            this.modelId = request.modelId;
            this.outputFormat = request.outputFormat;
            this.sourceTrace = request.sourceTrace;
            this.tags = request.tags;
            this.taskDescription = request.taskDescription;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * akProxy.
         */
        public Builder akProxy(String akProxy) {
            this.putBodyParameter("akProxy", akProxy);
            this.akProxy = akProxy;
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
         * <p>需要进行VOC分析的文本内容（content、contents、url、fileKey 四选一。优先级从小到大）</p>
         * 
         * <strong>example:</strong>
         * <p>这是一段需要分析的文本内容</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
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
         * <p>过滤标签，用于筛选符合条件的内容。</p>
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
         * <p>指定返回结果的格式，支持json或text</p>
         * 
         * <strong>example:</strong>
         * <p>按照如下格式输出：{&quot;text1&quot;: &quot;xxxx&quot;, &quot;text2&quot;: &quot;xxxx&quot;}</p>
         */
        public Builder outputFormat(String outputFormat) {
            this.putBodyParameter("outputFormat", outputFormat);
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * sourceTrace.
         */
        public Builder sourceTrace(Boolean sourceTrace) {
            this.putBodyParameter("sourceTrace", sourceTrace);
            this.sourceTrace = sourceTrace;
            return this;
        }

        /**
         * <p>业务标签体系，用于对文本内容进行分类和分析。</p>
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

        @Override
        public RunEnterpriseVocAnalysisRequest build() {
            return new RunEnterpriseVocAnalysisRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunEnterpriseVocAnalysisRequest} extends {@link TeaModel}
     *
     * <p>RunEnterpriseVocAnalysisRequest</p>
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
             * <p>标签定义提示词</p>
             * 
             * <strong>example:</strong>
             * <p>标签定义提示词</p>
             */
            public Builder tagDefinePrompt(String tagDefinePrompt) {
                this.tagDefinePrompt = tagDefinePrompt;
                return this;
            }

            /**
             * <p>标签名称</p>
             * 
             * <strong>example:</strong>
             * <p>标签名称</p>
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
     * {@link RunEnterpriseVocAnalysisRequest} extends {@link TeaModel}
     *
     * <p>RunEnterpriseVocAnalysisRequest</p>
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
             * <p>标签定义提示词</p>
             * 
             * <strong>example:</strong>
             * <p>标签定义提示词</p>
             */
            public Builder tagDefinePrompt(String tagDefinePrompt) {
                this.tagDefinePrompt = tagDefinePrompt;
                return this;
            }

            /**
             * <p>标签名称</p>
             * 
             * <strong>example:</strong>
             * <p>标签名称</p>
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
