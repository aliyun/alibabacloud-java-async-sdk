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
 * {@link ListNetBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetBandwidthResponseBody</p>
 */
public class ListNetBandwidthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("NetBandwidthList")
    private java.util.List<NetBandwidthList> netBandwidthList;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListNetBandwidthResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.netBandwidthList = builder.netBandwidthList;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetBandwidthResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return netBandwidthList
     */
    public java.util.List<NetBandwidthList> getNetBandwidthList() {
        return this.netBandwidthList;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private Integer currentPage; 
        private java.util.List<NetBandwidthList> netBandwidthList; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListNetBandwidthResponseBody model) {
            this.currentPage = model.currentPage;
            this.netBandwidthList = model.netBandwidthList;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * NetBandwidthList.
         */
        public Builder netBandwidthList(java.util.List<NetBandwidthList> netBandwidthList) {
            this.netBandwidthList = netBandwidthList;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListNetBandwidthResponseBody build() {
            return new ListNetBandwidthResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetBandwidthResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetBandwidthResponseBody</p>
     */
    public static class NetBandwidthList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private NetBandwidthList(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.netType = builder.netType;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetBandwidthList create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String gmtCreate; 
            private String gmtModified; 
            private String instanceId; 
            private String instanceName; 
            private String netType; 
            private String region; 

            private Builder() {
            } 

            private Builder(NetBandwidthList model) {
                this.bandwidth = model.bandwidth;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.netType = model.netType;
                this.region = model.region;
            } 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public NetBandwidthList build() {
                return new NetBandwidthList(this);
            } 

        } 

    }
}
