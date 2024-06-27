// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSafTagListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSafTagListResponseBody</p>
 */
public class DescribeSafTagListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeSafTagListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafTagListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List < ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * totalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeSafTagListResponseBody build() {
            return new DescribeSafTagListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagDesc")
        private String tagDesc;

        @com.aliyun.core.annotation.NameInMap("tagMean")
        private String tagMean;

        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("tagState")
        private String tagState;

        @com.aliyun.core.annotation.NameInMap("tagType")
        private String tagType;

        @com.aliyun.core.annotation.NameInMap("tagUid")
        private String tagUid;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private ResultObject(Builder builder) {
            this.tagDesc = builder.tagDesc;
            this.tagMean = builder.tagMean;
            this.tagName = builder.tagName;
            this.tagState = builder.tagState;
            this.tagType = builder.tagType;
            this.tagUid = builder.tagUid;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return tagDesc
         */
        public String getTagDesc() {
            return this.tagDesc;
        }

        /**
         * @return tagMean
         */
        public String getTagMean() {
            return this.tagMean;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tagState
         */
        public String getTagState() {
            return this.tagState;
        }

        /**
         * @return tagType
         */
        public String getTagType() {
            return this.tagType;
        }

        /**
         * @return tagUid
         */
        public String getTagUid() {
            return this.tagUid;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String tagDesc; 
            private String tagMean; 
            private String tagName; 
            private String tagState; 
            private String tagType; 
            private String tagUid; 
            private String updateTime; 

            /**
             * tagDesc.
             */
            public Builder tagDesc(String tagDesc) {
                this.tagDesc = tagDesc;
                return this;
            }

            /**
             * tagMean.
             */
            public Builder tagMean(String tagMean) {
                this.tagMean = tagMean;
                return this;
            }

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * tagState.
             */
            public Builder tagState(String tagState) {
                this.tagState = tagState;
                return this;
            }

            /**
             * tagType.
             */
            public Builder tagType(String tagType) {
                this.tagType = tagType;
                return this;
            }

            /**
             * tagUid.
             */
            public Builder tagUid(String tagUid) {
                this.tagUid = tagUid;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
