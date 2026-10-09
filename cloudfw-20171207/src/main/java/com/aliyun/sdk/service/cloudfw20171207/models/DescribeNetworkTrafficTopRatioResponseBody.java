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
 * {@link DescribeNetworkTrafficTopRatioResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkTrafficTopRatioResponseBody</p>
 */
public class DescribeNetworkTrafficTopRatioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCount")
    private Integer dataCount;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNetworkTrafficTopRatioResponseBody(Builder builder) {
        this.dataCount = builder.dataCount;
        this.dataList = builder.dataList;
        this.dataType = builder.dataType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkTrafficTopRatioResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataCount
     */
    public Integer getDataCount() {
        return this.dataCount;
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer dataCount; 
        private java.util.List<DataList> dataList; 
        private String dataType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNetworkTrafficTopRatioResponseBody model) {
            this.dataCount = model.dataCount;
            this.dataList = model.dataList;
            this.dataType = model.dataType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataCount(Integer dataCount) {
            this.dataCount = dataCount;
            return this;
        }

        /**
         * <p>The list of data values.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>in_src_ip</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C05D58A1-28A9-563A-BB59-5F7D1867****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNetworkTrafficTopRatioResponseBody build() {
            return new DescribeNetworkTrafficTopRatioResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkTrafficTopRatioResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkTrafficTopRatioResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataName")
        private String dataName;

        @com.aliyun.core.annotation.NameInMap("DataValue")
        private String dataValue;

        private DataList(Builder builder) {
            this.dataName = builder.dataName;
            this.dataValue = builder.dataValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return dataName
         */
        public String getDataName() {
            return this.dataName;
        }

        /**
         * @return dataValue
         */
        public String getDataValue() {
            return this.dataValue;
        }

        public static final class Builder {
            private String dataName; 
            private String dataValue; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.dataName = model.dataName;
                this.dataValue = model.dataValue;
            } 

            /**
             * <p>The data name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dataName(String dataName) {
                this.dataName = dataName;
                return this;
            }

            /**
             * <p>The ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder dataValue(String dataValue) {
                this.dataValue = dataValue;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
