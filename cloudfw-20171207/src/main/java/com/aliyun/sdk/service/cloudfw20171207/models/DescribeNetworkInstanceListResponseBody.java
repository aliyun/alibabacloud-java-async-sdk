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
 * {@link DescribeNetworkInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInstanceListResponseBody</p>
 */
public class DescribeNetworkInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkInstanceList")
    private java.util.List<NetworkInstanceList> networkInstanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNetworkInstanceListResponseBody(Builder builder) {
        this.networkInstanceList = builder.networkInstanceList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInstanceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkInstanceList
     */
    public java.util.List<NetworkInstanceList> getNetworkInstanceList() {
        return this.networkInstanceList;
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
        private java.util.List<NetworkInstanceList> networkInstanceList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeNetworkInstanceListResponseBody model) {
            this.networkInstanceList = model.networkInstanceList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * NetworkInstanceList.
         */
        public Builder networkInstanceList(java.util.List<NetworkInstanceList> networkInstanceList) {
            this.networkInstanceList = networkInstanceList;
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

        public DescribeNetworkInstanceListResponseBody build() {
            return new DescribeNetworkInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkInstanceListResponseBody</p>
     */
    public static class NetworkInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceName")
        private String networkInstanceName;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceType")
        private String networkInstanceType;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        private NetworkInstanceList(Builder builder) {
            this.networkInstanceId = builder.networkInstanceId;
            this.networkInstanceName = builder.networkInstanceName;
            this.networkInstanceType = builder.networkInstanceType;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInstanceList create() {
            return builder().build();
        }

        /**
         * @return networkInstanceId
         */
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        /**
         * @return networkInstanceName
         */
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        /**
         * @return networkInstanceType
         */
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private String networkInstanceId; 
            private String networkInstanceName; 
            private String networkInstanceType; 
            private String regionNo; 

            private Builder() {
            } 

            private Builder(NetworkInstanceList model) {
                this.networkInstanceId = model.networkInstanceId;
                this.networkInstanceName = model.networkInstanceName;
                this.networkInstanceType = model.networkInstanceType;
                this.regionNo = model.regionNo;
            } 

            /**
             * NetworkInstanceId.
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * NetworkInstanceName.
             */
            public Builder networkInstanceName(String networkInstanceName) {
                this.networkInstanceName = networkInstanceName;
                return this;
            }

            /**
             * NetworkInstanceType.
             */
            public Builder networkInstanceType(String networkInstanceType) {
                this.networkInstanceType = networkInstanceType;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public NetworkInstanceList build() {
                return new NetworkInstanceList(this);
            } 

        } 

    }
}
