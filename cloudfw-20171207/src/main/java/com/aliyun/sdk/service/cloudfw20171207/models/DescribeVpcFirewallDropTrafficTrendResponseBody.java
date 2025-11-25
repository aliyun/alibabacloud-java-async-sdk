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
 * {@link DescribeVpcFirewallDropTrafficTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallDropTrafficTrendResponseBody</p>
 */
public class DescribeVpcFirewallDropTrafficTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("DropSessionMax")
    private Long dropSessionMax;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVpcFirewallDropTrafficTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.dropSessionMax = builder.dropSessionMax;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDropTrafficTrendResponseBody create() {
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
     * @return dropSessionMax
     */
    public Long getDropSessionMax() {
        return this.dropSessionMax;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Long dropSessionMax; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallDropTrafficTrendResponseBody model) {
            this.dataList = model.dataList;
            this.dropSessionMax = model.dropSessionMax;
            this.requestId = model.requestId;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * DropSessionMax.
         */
        public Builder dropSessionMax(Long dropSessionMax) {
            this.dropSessionMax = dropSessionMax;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVpcFirewallDropTrafficTrendResponseBody build() {
            return new DescribeVpcFirewallDropTrafficTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallDropTrafficTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDropTrafficTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclDrop")
        private Long aclDrop;

        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("DropSession")
        private Long dropSession;

        @com.aliyun.core.annotation.NameInMap("IpsDrop")
        private Long ipsDrop;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TotalSession")
        private Long totalSession;

        private DataList(Builder builder) {
            this.aclDrop = builder.aclDrop;
            this.dataTime = builder.dataTime;
            this.dropSession = builder.dropSession;
            this.ipsDrop = builder.ipsDrop;
            this.time = builder.time;
            this.totalSession = builder.totalSession;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return aclDrop
         */
        public Long getAclDrop() {
            return this.aclDrop;
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return dropSession
         */
        public Long getDropSession() {
            return this.dropSession;
        }

        /**
         * @return ipsDrop
         */
        public Long getIpsDrop() {
            return this.ipsDrop;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return totalSession
         */
        public Long getTotalSession() {
            return this.totalSession;
        }

        public static final class Builder {
            private Long aclDrop; 
            private String dataTime; 
            private Long dropSession; 
            private Long ipsDrop; 
            private Long time; 
            private Long totalSession; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.aclDrop = model.aclDrop;
                this.dataTime = model.dataTime;
                this.dropSession = model.dropSession;
                this.ipsDrop = model.ipsDrop;
                this.time = model.time;
                this.totalSession = model.totalSession;
            } 

            /**
             * AclDrop.
             */
            public Builder aclDrop(Long aclDrop) {
                this.aclDrop = aclDrop;
                return this;
            }

            /**
             * DataTime.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * DropSession.
             */
            public Builder dropSession(Long dropSession) {
                this.dropSession = dropSession;
                return this;
            }

            /**
             * IpsDrop.
             */
            public Builder ipsDrop(Long ipsDrop) {
                this.ipsDrop = ipsDrop;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * TotalSession.
             */
            public Builder totalSession(Long totalSession) {
                this.totalSession = totalSession;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
