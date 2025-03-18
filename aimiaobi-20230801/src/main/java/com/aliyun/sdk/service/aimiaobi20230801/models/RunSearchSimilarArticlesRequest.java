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
 * {@link RunSearchSimilarArticlesRequest} extends {@link RequestModel}
 *
 * <p>RunSearchSimilarArticlesRequest</p>
 */
public class RunSearchSimilarArticlesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatConfig")
    private ChatConfig chatConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocType")
    private String docType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunSearchSimilarArticlesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chatConfig = builder.chatConfig;
        this.docType = builder.docType;
        this.title = builder.title;
        this.url = builder.url;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSearchSimilarArticlesRequest create() {
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
     * @return chatConfig
     */
    public ChatConfig getChatConfig() {
        return this.chatConfig;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunSearchSimilarArticlesRequest, Builder> {
        private String regionId; 
        private ChatConfig chatConfig; 
        private String docType; 
        private String title; 
        private String url; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunSearchSimilarArticlesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chatConfig = request.chatConfig;
            this.docType = request.docType;
            this.title = request.title;
            this.url = request.url;
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
         * ChatConfig.
         */
        public Builder chatConfig(ChatConfig chatConfig) {
            String chatConfigShrink = shrink(chatConfig, "ChatConfig", "json");
            this.putBodyParameter("ChatConfig", chatConfigShrink);
            this.chatConfig = chatConfig;
            return this;
        }

        /**
         * DocType.
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx/xxx">https://xxx/xxx</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
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
        public RunSearchSimilarArticlesRequest build() {
            return new RunSearchSimilarArticlesRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunSearchSimilarArticlesRequest} extends {@link TeaModel}
     *
     * <p>RunSearchSimilarArticlesRequest</p>
     */
    public static class SearchSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SearchSources(Builder builder) {
            this.code = builder.code;
            this.datasetName = builder.datasetName;
            this.name = builder.name;
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

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String datasetName; 
            private String name; 

            private Builder() {
            } 

            private Builder(SearchSources model) {
                this.code = model.code;
                this.datasetName = model.datasetName;
                this.name = model.name;
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

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SearchSources build() {
                return new SearchSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchSimilarArticlesRequest} extends {@link TeaModel}
     *
     * <p>RunSearchSimilarArticlesRequest</p>
     */
    public static class SearchParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchSources")
        private java.util.List<SearchSources> searchSources;

        private SearchParam(Builder builder) {
            this.searchSources = builder.searchSources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchParam create() {
            return builder().build();
        }

        /**
         * @return searchSources
         */
        public java.util.List<SearchSources> getSearchSources() {
            return this.searchSources;
        }

        public static final class Builder {
            private java.util.List<SearchSources> searchSources; 

            private Builder() {
            } 

            private Builder(SearchParam model) {
                this.searchSources = model.searchSources;
            } 

            /**
             * SearchSources.
             */
            public Builder searchSources(java.util.List<SearchSources> searchSources) {
                this.searchSources = searchSources;
                return this;
            }

            public SearchParam build() {
                return new SearchParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchSimilarArticlesRequest} extends {@link TeaModel}
     *
     * <p>RunSearchSimilarArticlesRequest</p>
     */
    public static class ChatConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchParam")
        private SearchParam searchParam;

        private ChatConfig(Builder builder) {
            this.searchParam = builder.searchParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatConfig create() {
            return builder().build();
        }

        /**
         * @return searchParam
         */
        public SearchParam getSearchParam() {
            return this.searchParam;
        }

        public static final class Builder {
            private SearchParam searchParam; 

            private Builder() {
            } 

            private Builder(ChatConfig model) {
                this.searchParam = model.searchParam;
            } 

            /**
             * SearchParam.
             */
            public Builder searchParam(SearchParam searchParam) {
                this.searchParam = searchParam;
                return this;
            }

            public ChatConfig build() {
                return new ChatConfig(this);
            } 

        } 

    }
}
