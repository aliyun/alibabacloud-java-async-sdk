// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunQuickWritingRequest} extends {@link RequestModel}
 *
 * <p>RunQuickWritingRequest</p>
 */
public class RunQuickWritingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Articles")
    private java.util.List<Articles> articles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchSources")
    private java.util.List<SearchSources> searchSources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunQuickWritingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.articles = builder.articles;
        this.prompt = builder.prompt;
        this.searchSources = builder.searchSources;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunQuickWritingRequest create() {
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
     * @return articles
     */
    public java.util.List<Articles> getArticles() {
        return this.articles;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return searchSources
     */
    public java.util.List<SearchSources> getSearchSources() {
        return this.searchSources;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunQuickWritingRequest, Builder> {
        private String regionId; 
        private java.util.List<Articles> articles; 
        private String prompt; 
        private java.util.List<SearchSources> searchSources; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunQuickWritingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.articles = request.articles;
            this.prompt = request.prompt;
            this.searchSources = request.searchSources;
            this.taskId = request.taskId;
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
         * Articles.
         */
        public Builder articles(java.util.List<Articles> articles) {
            String articlesShrink = shrink(articles, "Articles", "json");
            this.putBodyParameter("Articles", articlesShrink);
            this.articles = articles;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * SearchSources.
         */
        public Builder searchSources(java.util.List<SearchSources> searchSources) {
            String searchSourcesShrink = shrink(searchSources, "SearchSources", "json");
            this.putBodyParameter("SearchSources", searchSourcesShrink);
            this.searchSources = searchSources;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
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
        public RunQuickWritingRequest build() {
            return new RunQuickWritingRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunQuickWritingRequest} extends {@link TeaModel}
     *
     * <p>RunQuickWritingRequest</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Articles(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Articles create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String content; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Articles model) {
                this.content = model.content;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Articles build() {
                return new Articles(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunQuickWritingRequest} extends {@link TeaModel}
     *
     * <p>RunQuickWritingRequest</p>
     */
    public static class SearchSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        private SearchSources(Builder builder) {
            this.code = builder.code;
            this.datasetName = builder.datasetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSources create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        public static final class Builder {
            private String code; 
            private String datasetName; 

            private Builder() {
            } 

            private Builder(SearchSources model) {
                this.code = model.code;
                this.datasetName = model.datasetName;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            public SearchSources build() {
                return new SearchSources(this);
            } 

        } 

    }
}
