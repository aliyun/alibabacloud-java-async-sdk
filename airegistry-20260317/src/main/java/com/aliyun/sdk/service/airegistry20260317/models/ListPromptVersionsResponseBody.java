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
 * {@link ListPromptVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPromptVersionsResponseBody</p>
 */
public class ListPromptVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPromptVersionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPromptVersionsResponseBody create() {
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

        private Builder(ListPromptVersionsResponseBody model) {
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

        public ListPromptVersionsResponseBody build() {
            return new ListPromptVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPromptVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromptVersionsResponseBody</p>
     */
    public static class PageItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommitMsg")
        private String commitMsg;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("PromptKey")
        private String promptKey;

        @com.aliyun.core.annotation.NameInMap("SrcUser")
        private String srcUser;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PageItems(Builder builder) {
            this.commitMsg = builder.commitMsg;
            this.gmtModified = builder.gmtModified;
            this.promptKey = builder.promptKey;
            this.srcUser = builder.srcUser;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageItems create() {
            return builder().build();
        }

        /**
         * @return commitMsg
         */
        public String getCommitMsg() {
            return this.commitMsg;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return promptKey
         */
        public String getPromptKey() {
            return this.promptKey;
        }

        /**
         * @return srcUser
         */
        public String getSrcUser() {
            return this.srcUser;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String commitMsg; 
            private Long gmtModified; 
            private String promptKey; 
            private String srcUser; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(PageItems model) {
                this.commitMsg = model.commitMsg;
                this.gmtModified = model.gmtModified;
                this.promptKey = model.promptKey;
                this.srcUser = model.srcUser;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * CommitMsg.
             */
            public Builder commitMsg(String commitMsg) {
                this.commitMsg = commitMsg;
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
             * PromptKey.
             */
            public Builder promptKey(String promptKey) {
                this.promptKey = promptKey;
                return this;
            }

            /**
             * SrcUser.
             */
            public Builder srcUser(String srcUser) {
                this.srcUser = srcUser;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PageItems build() {
                return new PageItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPromptVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromptVersionsResponseBody</p>
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
