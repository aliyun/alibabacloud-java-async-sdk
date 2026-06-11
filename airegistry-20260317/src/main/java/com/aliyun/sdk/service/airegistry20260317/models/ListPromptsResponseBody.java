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
 * {@link ListPromptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPromptsResponseBody</p>
 */
public class ListPromptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPromptsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPromptsResponseBody create() {
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

        private Builder(ListPromptsResponseBody model) {
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

        public ListPromptsResponseBody build() {
            return new ListPromptsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPromptsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromptsResponseBody</p>
     */
    public static class PageItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizTags")
        private java.util.List<String> bizTags;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EditingVersion")
        private String editingVersion;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("LatestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("OnlineCnt")
        private Integer onlineCnt;

        @com.aliyun.core.annotation.NameInMap("PromptKey")
        private String promptKey;

        @com.aliyun.core.annotation.NameInMap("ReviewingVersion")
        private String reviewingVersion;

        @com.aliyun.core.annotation.NameInMap("SchemaVersion")
        private Integer schemaVersion;

        private PageItems(Builder builder) {
            this.bizTags = builder.bizTags;
            this.description = builder.description;
            this.editingVersion = builder.editingVersion;
            this.gmtModified = builder.gmtModified;
            this.labels = builder.labels;
            this.latestVersion = builder.latestVersion;
            this.onlineCnt = builder.onlineCnt;
            this.promptKey = builder.promptKey;
            this.reviewingVersion = builder.reviewingVersion;
            this.schemaVersion = builder.schemaVersion;
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
        public java.util.List<String> getBizTags() {
            return this.bizTags;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return editingVersion
         */
        public String getEditingVersion() {
            return this.editingVersion;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return onlineCnt
         */
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        /**
         * @return promptKey
         */
        public String getPromptKey() {
            return this.promptKey;
        }

        /**
         * @return reviewingVersion
         */
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        /**
         * @return schemaVersion
         */
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

        public static final class Builder {
            private java.util.List<String> bizTags; 
            private String description; 
            private String editingVersion; 
            private Long gmtModified; 
            private java.util.Map<String, String> labels; 
            private String latestVersion; 
            private Integer onlineCnt; 
            private String promptKey; 
            private String reviewingVersion; 
            private Integer schemaVersion; 

            private Builder() {
            } 

            private Builder(PageItems model) {
                this.bizTags = model.bizTags;
                this.description = model.description;
                this.editingVersion = model.editingVersion;
                this.gmtModified = model.gmtModified;
                this.labels = model.labels;
                this.latestVersion = model.latestVersion;
                this.onlineCnt = model.onlineCnt;
                this.promptKey = model.promptKey;
                this.reviewingVersion = model.reviewingVersion;
                this.schemaVersion = model.schemaVersion;
            } 

            /**
             * BizTags.
             */
            public Builder bizTags(java.util.List<String> bizTags) {
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
             * EditingVersion.
             */
            public Builder editingVersion(String editingVersion) {
                this.editingVersion = editingVersion;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * LatestVersion.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
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
             * PromptKey.
             */
            public Builder promptKey(String promptKey) {
                this.promptKey = promptKey;
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
             * SchemaVersion.
             */
            public Builder schemaVersion(Integer schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            public PageItems build() {
                return new PageItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPromptsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromptsResponseBody</p>
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
             * PagesAvailable.
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
