// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeIspInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIspInfoResponseBody</p>
 */
public class DescribeIspInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIspInfoResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIspInfoResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeIspInfoResponseBody model) {
            this.dataList = model.dataList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIspInfoResponseBody build() {
            return new DescribeIspInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIspInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIspInfoResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IspId")
        private Integer ispId;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        private DataList(Builder builder) {
            this.ispId = builder.ispId;
            this.ispName = builder.ispName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return ispId
         */
        public Integer getIspId() {
            return this.ispId;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        public static final class Builder {
            private Integer ispId; 
            private String ispName; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.ispId = model.ispId;
                this.ispName = model.ispName;
            } 

            /**
             * IspId.
             */
            public Builder ispId(Integer ispId) {
                this.ispId = ispId;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
