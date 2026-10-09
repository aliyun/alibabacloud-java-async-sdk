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
 * {@link DescribeFirewallDropTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallDropTrendResponseBody</p>
 */
public class DescribeFirewallDropTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("MaxDropSession")
    private Long maxDropSession;

    @com.aliyun.core.annotation.NameInMap("MaxDropTime")
    private Long maxDropTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFirewallDropTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.maxDropSession = builder.maxDropSession;
        this.maxDropTime = builder.maxDropTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallDropTrendResponseBody create() {
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
     * @return maxDropSession
     */
    public Long getMaxDropSession() {
        return this.maxDropSession;
    }

    /**
     * @return maxDropTime
     */
    public Long getMaxDropTime() {
        return this.maxDropTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Long maxDropSession; 
        private Long maxDropTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFirewallDropTrendResponseBody model) {
            this.dataList = model.dataList;
            this.maxDropSession = model.maxDropSession;
            this.maxDropTime = model.maxDropTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data list.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The maximum number of total blocked sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder maxDropSession(Long maxDropSession) {
            this.maxDropSession = maxDropSession;
            return this;
        }

        /**
         * <p>The time when the maximum number of total blocked sessions occurred. The value is a UNIX timestamp in seconds, such as 1672502400.</p>
         * 
         * <strong>example:</strong>
         * <p>1656837360</p>
         */
        public Builder maxDropTime(Long maxDropTime) {
            this.maxDropTime = maxDropTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75E60025-43C5-5635-B7B7-272C5246****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFirewallDropTrendResponseBody build() {
            return new DescribeFirewallDropTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFirewallDropTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallDropTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InternetDropSession")
        private Long internetDropSession;

        @com.aliyun.core.annotation.NameInMap("NatDropSession")
        private Long natDropSession;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TotalDropSession")
        private Long totalDropSession;

        @com.aliyun.core.annotation.NameInMap("VpcDropSession")
        private Long vpcDropSession;

        private DataList(Builder builder) {
            this.internetDropSession = builder.internetDropSession;
            this.natDropSession = builder.natDropSession;
            this.time = builder.time;
            this.totalDropSession = builder.totalDropSession;
            this.vpcDropSession = builder.vpcDropSession;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return internetDropSession
         */
        public Long getInternetDropSession() {
            return this.internetDropSession;
        }

        /**
         * @return natDropSession
         */
        public Long getNatDropSession() {
            return this.natDropSession;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return totalDropSession
         */
        public Long getTotalDropSession() {
            return this.totalDropSession;
        }

        /**
         * @return vpcDropSession
         */
        public Long getVpcDropSession() {
            return this.vpcDropSession;
        }

        public static final class Builder {
            private Long internetDropSession; 
            private Long natDropSession; 
            private Long time; 
            private Long totalDropSession; 
            private Long vpcDropSession; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.internetDropSession = model.internetDropSession;
                this.natDropSession = model.natDropSession;
                this.time = model.time;
                this.totalDropSession = model.totalDropSession;
                this.vpcDropSession = model.vpcDropSession;
            } 

            /**
             * <p>The number of sessions blocked by the Internet firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder internetDropSession(Long internetDropSession) {
                this.internetDropSession = internetDropSession;
                return this;
            }

            /**
             * <p>The number of sessions blocked by the NAT firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder natDropSession(Long natDropSession) {
                this.natDropSession = natDropSession;
                return this;
            }

            /**
             * <p>The time when the traffic occurred. The value is a UNIX timestamp in seconds.</p>
             * <p>If the data at this point in time has not been processed, the values of all other fields are -1.</p>
             * 
             * <strong>example:</strong>
             * <p>1758474000</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The total number of sessions blocked by the firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder totalDropSession(Long totalDropSession) {
                this.totalDropSession = totalDropSession;
                return this;
            }

            /**
             * <p>The number of sessions blocked by the VPC firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder vpcDropSession(Long vpcDropSession) {
                this.vpcDropSession = vpcDropSession;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
