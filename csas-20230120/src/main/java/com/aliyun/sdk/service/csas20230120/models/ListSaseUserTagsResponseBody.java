// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListSaseUserTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSaseUserTagsResponseBody</p>
 */
public class ListSaseUserTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListSaseUserTagsResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSaseUserTagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListSaseUserTagsResponseBody model) {
            this.dataList = model.dataList;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The list of user labels returned.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of user labels.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListSaseUserTagsResponseBody build() {
            return new ListSaseUserTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSaseUserTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSaseUserTagsResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        private DataList(Builder builder) {
            this.aliuid = builder.aliuid;
            this.count = builder.count;
            this.description = builder.description;
            this.name = builder.name;
            this.tagId = builder.tagId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        public static final class Builder {
            private String aliuid; 
            private Integer count; 
            private String description; 
            private String name; 
            private String tagId; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.aliuid = model.aliuid;
                this.count = model.count;
                this.description = model.description;
                this.name = model.name;
                this.tagId = model.tagId;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>141681795035****</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The number of users associated with the user label.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The description of the user label.</p>
             * 
             * <strong>example:</strong>
             * <p>These are the company\&quot;s employees</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the user label.</p>
             * 
             * <strong>example:</strong>
             * <p>boss</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user label ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su-tag-1ae52f66039fa0d4****</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
