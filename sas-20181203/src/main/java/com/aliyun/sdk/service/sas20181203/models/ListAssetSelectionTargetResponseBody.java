// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetSelectionTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetSelectionTargetResponseBody</p>
 */
public class ListAssetSelectionTargetResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListAssetSelectionTargetResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetSelectionTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssetSelectionTargetResponseBody build() {
            return new ListAssetSelectionTargetResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        private Data(Builder builder) {
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        public static final class Builder {
            private String targetId; 
            private String targetName; 

            /**
             * TargetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * TargetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
