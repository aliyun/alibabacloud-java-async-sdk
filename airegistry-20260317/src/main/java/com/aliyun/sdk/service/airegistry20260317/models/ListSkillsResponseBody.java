// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link ListSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillsResponseBody</p>
 */
public class ListSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSkillsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillsResponseBody create() {
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

        private Builder(ListSkillsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSkillsResponseBody build() {
            return new ListSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillsResponseBody</p>
     */
    public static class PageItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizTags")
        private String bizTags;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DownloadCount")
        private Long downloadCount;

        @com.aliyun.core.annotation.NameInMap("EditingVersion")
        private String editingVersion;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("OnlineCnt")
        private Integer onlineCnt;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ReviewingVersion")
        private String reviewingVersion;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("Writeable")
        private Boolean writeable;

        private PageItems(Builder builder) {
            this.bizTags = builder.bizTags;
            this.description = builder.description;
            this.downloadCount = builder.downloadCount;
            this.editingVersion = builder.editingVersion;
            this.enable = builder.enable;
            this.from = builder.from;
            this.labels = builder.labels;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.onlineCnt = builder.onlineCnt;
            this.owner = builder.owner;
            this.reviewingVersion = builder.reviewingVersion;
            this.scope = builder.scope;
            this.updateTime = builder.updateTime;
            this.writeable = builder.writeable;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return onlineCnt
         */
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return writeable
         */
        public Boolean getWriteable() {
            return this.writeable;
        }

        public static final class Builder {
            private String bizTags; 
            private String description; 
            private Long downloadCount; 
            private String editingVersion; 
            private Boolean enable; 
            private String from; 
            private java.util.Map<String, String> labels; 
            private String name; 
            private String namespaceId; 
            private Integer onlineCnt; 
            private String owner; 
            private String reviewingVersion; 
            private String scope; 
            private Long updateTime; 
            private Boolean writeable; 

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
                this.name = model.name;
                this.namespaceId = model.namespaceId;
                this.onlineCnt = model.onlineCnt;
                this.owner = model.owner;
                this.reviewingVersion = model.reviewingVersion;
                this.scope = model.scope;
                this.updateTime = model.updateTime;
                this.writeable = model.writeable;
            } 

            /**
             * BizTags.
             */
            public Builder bizTags(String bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DownloadCount.
             */
            public Builder downloadCount(Long downloadCount) {
                this.downloadCount = downloadCount;
                return this;
            }

            /**
             * EditingVersion.
             */
            public Builder editingVersion(String editingVersion) {
                this.editingVersion = editingVersion;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * From.
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
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
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * OnlineCnt.
             */
            public Builder onlineCnt(Integer onlineCnt) {
                this.onlineCnt = onlineCnt;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ReviewingVersion.
             */
            public Builder reviewingVersion(String reviewingVersion) {
                this.reviewingVersion = reviewingVersion;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Writeable.
             */
            public Builder writeable(Boolean writeable) {
                this.writeable = writeable;
                return this;
            }

            public PageItems build() {
                return new PageItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageItems")
        private java.util.List<PageItems> pageItems;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PagesAvailable")
        private Integer pagesAvailable;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * PageItems.
             */
            public Builder pageItems(java.util.List<PageItems> pageItems) {
                this.pageItems = pageItems;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>pagesAvailable.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pagesAvailable(Integer pagesAvailable) {
                this.pagesAvailable = pagesAvailable;
                return this;
            }

            /**
             * TotalCount.
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
