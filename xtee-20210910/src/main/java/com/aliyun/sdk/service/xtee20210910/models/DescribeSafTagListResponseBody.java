// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
    private java.util.List<ResultObject> resultObject;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ResultObject> getResultObject() {
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
        private java.util.List<ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeSafTagListResponseBody model) {
            this.requestId = model.requestId;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Returned object.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeSafTagListResponseBody build() {
            return new DescribeSafTagListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSafTagListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSafTagListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.tagDesc = model.tagDesc;
                this.tagMean = model.tagMean;
                this.tagName = model.tagName;
                this.tagState = model.tagState;
                this.tagType = model.tagType;
                this.tagUid = model.tagUid;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Tag description.</p>
             * 
             * <strong>example:</strong>
             * <p>依赖IP画像模型识别输出风险高、中高、中的判定\n数据来源主要基于IP的网络属性数据和对黑产行为轨迹的情报监控数据，涵盖可识别检测IP网络属性特征、恶意属性等特征\n而模型评分的高中低主要是根据当前IP号段命中风险行为的恶意程度和种类来判定的\n备注：以下rn0311、rn0312、rn0313、rn0314、rn0315属于IP画像模型针对当前请求IP识别出的风险类别</p>
             */
            public Builder tagDesc(String tagDesc) {
                this.tagDesc = tagDesc;
                return this;
            }

            /**
             * <p>Tag meaning.</p>
             * 
             * <strong>example:</strong>
             * <p>IP风险评分高</p>
             */
            public Builder tagMean(String tagMean) {
                this.tagMean = tagMean;
                return this;
            }

            /**
             * <p>Tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>rn0301</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * <p>Tag identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>rn0301</p>
             */
            public Builder tagState(String tagState) {
                this.tagState = tagState;
                return this;
            }

            /**
             * <p>Tag type.</p>
             * 
             * <strong>example:</strong>
             * <p>IP风险类</p>
             */
            public Builder tagType(String tagType) {
                this.tagType = tagType;
                return this;
            }

            /**
             * <p>Unique identifier of the tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>rn0301</p>
             */
            public Builder tagUid(String tagUid) {
                this.tagUid = tagUid;
                return this;
            }

            /**
             * <p>Update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1684744034000</p>
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
