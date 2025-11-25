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
 * {@link DescribeInternetTrafficTopResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetTrafficTopResponseBody</p>
 */
public class DescribeInternetTrafficTopResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCount")
    private Integer dataCount;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInternetTrafficTopResponseBody(Builder builder) {
        this.dataCount = builder.dataCount;
        this.dataList = builder.dataList;
        this.dataType = builder.dataType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetTrafficTopResponseBody create() {
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

        private Builder(DescribeInternetTrafficTopResponseBody model) {
            this.dataCount = model.dataCount;
            this.dataList = model.dataList;
            this.dataType = model.dataType;
            this.requestId = model.requestId;
        } 

        /**
         * DataCount.
         */
        public Builder dataCount(Integer dataCount) {
            this.dataCount = dataCount;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInternetTrafficTopResponseBody build() {
            return new DescribeInternetTrafficTopResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInternetTrafficTopResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetTrafficTopResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataName")
        private String dataName;

        @com.aliyun.core.annotation.NameInMap("DataValue")
        private String dataValue;

        @com.aliyun.core.annotation.NameInMap("IsSubscribed")
        private Boolean isSubscribed;

        @com.aliyun.core.annotation.NameInMap("LabelList")
        private java.util.List<String> labelList;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private Long totalBytes;

        private DataList(Builder builder) {
            this.dataName = builder.dataName;
            this.dataValue = builder.dataValue;
            this.isSubscribed = builder.isSubscribed;
            this.labelList = builder.labelList;
            this.sessionCount = builder.sessionCount;
            this.totalBytes = builder.totalBytes;
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

        /**
         * @return isSubscribed
         */
        public Boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        /**
         * @return labelList
         */
        public java.util.List<String> getLabelList() {
            return this.labelList;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public static final class Builder {
            private String dataName; 
            private String dataValue; 
            private Boolean isSubscribed; 
            private java.util.List<String> labelList; 
            private Long sessionCount; 
            private Long totalBytes; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.dataName = model.dataName;
                this.dataValue = model.dataValue;
                this.isSubscribed = model.isSubscribed;
                this.labelList = model.labelList;
                this.sessionCount = model.sessionCount;
                this.totalBytes = model.totalBytes;
            } 

            /**
             * DataName.
             */
            public Builder dataName(String dataName) {
                this.dataName = dataName;
                return this;
            }

            /**
             * DataValue.
             */
            public Builder dataValue(String dataValue) {
                this.dataValue = dataValue;
                return this;
            }

            /**
             * IsSubscribed.
             */
            public Builder isSubscribed(Boolean isSubscribed) {
                this.isSubscribed = isSubscribed;
                return this;
            }

            /**
             * LabelList.
             */
            public Builder labelList(java.util.List<String> labelList) {
                this.labelList = labelList;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * TotalBytes.
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
