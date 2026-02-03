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
        @com.aliyun.core.annotation.NameInMap("CategoryUuids")
        private java.util.List<String> categoryUuids;

        @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
        private Long createTimeEnd;

        @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
        private Long createTimeStart;

        @com.aliyun.core.annotation.NameInMap("DocIds")
        private java.util.List<String> docIds;

        @com.aliyun.core.annotation.NameInMap("DocTypes")
        private java.util.List<String> docTypes;

        @com.aliyun.core.annotation.NameInMap("DocUuids")
        private java.util.List<String> docUuids;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Extend1")
        private String extend1;

        @com.aliyun.core.annotation.NameInMap("Extend2")
        private String extend2;

        @com.aliyun.core.annotation.NameInMap("Extend3")
        private String extend3;

        @com.aliyun.core.annotation.NameInMap("SearchSources")
        private java.util.List<SearchSources> searchSources;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        private SearchParam(Builder builder) {
            this.categoryUuids = builder.categoryUuids;
            this.createTimeEnd = builder.createTimeEnd;
            this.createTimeStart = builder.createTimeStart;
            this.docIds = builder.docIds;
            this.docTypes = builder.docTypes;
            this.docUuids = builder.docUuids;
            this.endTime = builder.endTime;
            this.extend1 = builder.extend1;
            this.extend2 = builder.extend2;
            this.extend3 = builder.extend3;
            this.searchSources = builder.searchSources;
            this.startTime = builder.startTime;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchParam create() {
            return builder().build();
        }

        /**
         * @return categoryUuids
         */
        public java.util.List<String> getCategoryUuids() {
            return this.categoryUuids;
        }

        /**
         * @return createTimeEnd
         */
        public Long getCreateTimeEnd() {
            return this.createTimeEnd;
        }

        /**
         * @return createTimeStart
         */
        public Long getCreateTimeStart() {
            return this.createTimeStart;
        }

        /**
         * @return docIds
         */
        public java.util.List<String> getDocIds() {
            return this.docIds;
        }

        /**
         * @return docTypes
         */
        public java.util.List<String> getDocTypes() {
            return this.docTypes;
        }

        /**
         * @return docUuids
         */
        public java.util.List<String> getDocUuids() {
            return this.docUuids;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return extend1
         */
        public String getExtend1() {
            return this.extend1;
        }

        /**
         * @return extend2
         */
        public String getExtend2() {
            return this.extend2;
        }

        /**
         * @return extend3
         */
        public String getExtend3() {
            return this.extend3;
        }

        /**
         * @return searchSources
         */
        public java.util.List<SearchSources> getSearchSources() {
            return this.searchSources;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<String> categoryUuids; 
            private Long createTimeEnd; 
            private Long createTimeStart; 
            private java.util.List<String> docIds; 
            private java.util.List<String> docTypes; 
            private java.util.List<String> docUuids; 
            private Long endTime; 
            private String extend1; 
            private String extend2; 
            private String extend3; 
            private java.util.List<SearchSources> searchSources; 
            private Long startTime; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(SearchParam model) {
                this.categoryUuids = model.categoryUuids;
                this.createTimeEnd = model.createTimeEnd;
                this.createTimeStart = model.createTimeStart;
                this.docIds = model.docIds;
                this.docTypes = model.docTypes;
                this.docUuids = model.docUuids;
                this.endTime = model.endTime;
                this.extend1 = model.extend1;
                this.extend2 = model.extend2;
                this.extend3 = model.extend3;
                this.searchSources = model.searchSources;
                this.startTime = model.startTime;
                this.tags = model.tags;
            } 

            /**
             * CategoryUuids.
             */
            public Builder categoryUuids(java.util.List<String> categoryUuids) {
                this.categoryUuids = categoryUuids;
                return this;
            }

            /**
             * CreateTimeEnd.
             */
            public Builder createTimeEnd(Long createTimeEnd) {
                this.createTimeEnd = createTimeEnd;
                return this;
            }

            /**
             * CreateTimeStart.
             */
            public Builder createTimeStart(Long createTimeStart) {
                this.createTimeStart = createTimeStart;
                return this;
            }

            /**
             * DocIds.
             */
            public Builder docIds(java.util.List<String> docIds) {
                this.docIds = docIds;
                return this;
            }

            /**
             * DocTypes.
             */
            public Builder docTypes(java.util.List<String> docTypes) {
                this.docTypes = docTypes;
                return this;
            }

            /**
             * DocUuids.
             */
            public Builder docUuids(java.util.List<String> docUuids) {
                this.docUuids = docUuids;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Extend1.
             */
            public Builder extend1(String extend1) {
                this.extend1 = extend1;
                return this;
            }

            /**
             * Extend2.
             */
            public Builder extend2(String extend2) {
                this.extend2 = extend2;
                return this;
            }

            /**
             * Extend3.
             */
            public Builder extend3(String extend3) {
                this.extend3 = extend3;
                return this;
            }

            /**
             * SearchSources.
             */
            public Builder searchSources(java.util.List<SearchSources> searchSources) {
                this.searchSources = searchSources;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
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
