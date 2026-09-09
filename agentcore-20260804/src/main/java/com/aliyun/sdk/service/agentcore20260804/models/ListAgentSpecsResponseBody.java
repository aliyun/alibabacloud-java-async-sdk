// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListAgentSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentSpecsResponseBody</p>
 */
public class ListAgentSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAgentSpecsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentSpecsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAgentSpecsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAgentSpecsResponseBody build() {
            return new ListAgentSpecsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSpecsResponseBody</p>
     */
    public static class McpServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private McpServers(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(McpServers model) {
                this.name = model.name;
            } 

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>agentspec-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public McpServers build() {
                return new McpServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSpecsResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Skills(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skills create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
            } 

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>agentspec-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSpecsResponseBody</p>
     */
    public static class PageItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizTags")
        private String bizTags;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("downloadCount")
        private Long downloadCount;

        @com.aliyun.core.annotation.NameInMap("editingVersion")
        private String editingVersion;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("from")
        private String from;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("mcpServers")
        private java.util.List<McpServers> mcpServers;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("onlineCnt")
        private Integer onlineCnt;

        @com.aliyun.core.annotation.NameInMap("reviewingVersion")
        private String reviewingVersion;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("skills")
        private java.util.List<Skills> skills;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private PageItems(Builder builder) {
            this.bizTags = builder.bizTags;
            this.description = builder.description;
            this.downloadCount = builder.downloadCount;
            this.editingVersion = builder.editingVersion;
            this.enable = builder.enable;
            this.from = builder.from;
            this.labels = builder.labels;
            this.mcpServers = builder.mcpServers;
            this.name = builder.name;
            this.onlineCnt = builder.onlineCnt;
            this.reviewingVersion = builder.reviewingVersion;
            this.scope = builder.scope;
            this.skills = builder.skills;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageItems create() {
            return builder().build();
        }

        /**
         * @return bizTags
         */
        public String getBizTags() {
            return this.bizTags;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadCount
         */
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        /**
         * @return editingVersion
         */
        public String getEditingVersion() {
            return this.editingVersion;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return from
         */
        public String getFrom() {
            return this.from;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return mcpServers
         */
        public java.util.List<McpServers> getMcpServers() {
            return this.mcpServers;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onlineCnt
         */
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        /**
         * @return reviewingVersion
         */
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return skills
         */
        public java.util.List<Skills> getSkills() {
            return this.skills;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String bizTags; 
            private String description; 
            private Long downloadCount; 
            private String editingVersion; 
            private Boolean enable; 
            private String from; 
            private java.util.Map<String, String> labels; 
            private java.util.List<McpServers> mcpServers; 
            private String name; 
            private Integer onlineCnt; 
            private String reviewingVersion; 
            private String scope; 
            private java.util.List<Skills> skills; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(PageItems model) {
                this.bizTags = model.bizTags;
                this.description = model.description;
                this.downloadCount = model.downloadCount;
                this.editingVersion = model.editingVersion;
                this.enable = model.enable;
                this.from = model.from;
                this.labels = model.labels;
                this.mcpServers = model.mcpServers;
                this.name = model.name;
                this.onlineCnt = model.onlineCnt;
                this.reviewingVersion = model.reviewingVersion;
                this.scope = model.scope;
                this.skills = model.skills;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The business tags.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample property value</p>
             */
            public Builder bizTags(String bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>A sample description that explains the purpose of the resource</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The download count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder downloadCount(Long downloadCount) {
                this.downloadCount = downloadCount;
                return this;
            }

            /**
             * <p>The version currently being edited.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder editingVersion(String editingVersion) {
                this.editingVersion = editingVersion;
                return this;
            }

            /**
             * <p>Indicates whether the AgentSpec is enabled.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>UPLOAD</p>
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The version labels.</p>
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The list of MCP server references.</p>
             */
            public Builder mcpServers(java.util.List<McpServers> mcpServers) {
                this.mcpServers = mcpServers;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>agentspec-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of online versions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder onlineCnt(Integer onlineCnt) {
                this.onlineCnt = onlineCnt;
                return this;
            }

            /**
             * <p>The version currently under review.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder reviewingVersion(String reviewingVersion) {
                this.reviewingVersion = reviewingVersion;
                return this;
            }

            /**
             * <p>The visibility scope.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The list of Skill references.</p>
             */
            public Builder skills(java.util.List<Skills> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1787671022000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PageItems build() {
                return new PageItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSpecsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pageItems")
        private java.util.List<PageItems> pageItems;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pagesAvailable")
        private Integer pagesAvailable;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageItems = builder.pageItems;
            this.pageNumber = builder.pageNumber;
            this.pagesAvailable = builder.pagesAvailable;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageItems
         */
        public java.util.List<PageItems> getPageItems() {
            return this.pageItems;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pagesAvailable
         */
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<PageItems> pageItems; 
            private Integer pageNumber; 
            private Integer pagesAvailable; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageItems = model.pageItems;
                this.pageNumber = model.pageNumber;
                this.pagesAvailable = model.pagesAvailable;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The data on the current page.</p>
             */
            public Builder pageItems(java.util.List<PageItems> pageItems) {
                this.pageItems = pageItems;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder pagesAvailable(Integer pagesAvailable) {
                this.pagesAvailable = pagesAvailable;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
