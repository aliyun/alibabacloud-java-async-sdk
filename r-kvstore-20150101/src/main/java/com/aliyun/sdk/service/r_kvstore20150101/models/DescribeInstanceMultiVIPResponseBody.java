// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeInstanceMultiVIPResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceMultiVIPResponseBody</p>
 */
public class DescribeInstanceMultiVIPResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MasterDns")
    private String masterDns;

    @com.aliyun.core.annotation.NameInMap("MasterDnsRecord")
    private java.util.List<String> masterDnsRecord;

    @com.aliyun.core.annotation.NameInMap("MaxQuota")
    private Long maxQuota;

    @com.aliyun.core.annotation.NameInMap("MultiVIPList")
    private java.util.List<MultiVIPList> multiVIPList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceMultiVIPResponseBody(Builder builder) {
        this.masterDns = builder.masterDns;
        this.masterDnsRecord = builder.masterDnsRecord;
        this.maxQuota = builder.maxQuota;
        this.multiVIPList = builder.multiVIPList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceMultiVIPResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return masterDns
     */
    public String getMasterDns() {
        return this.masterDns;
    }

    /**
     * @return masterDnsRecord
     */
    public java.util.List<String> getMasterDnsRecord() {
        return this.masterDnsRecord;
    }

    /**
     * @return maxQuota
     */
    public Long getMaxQuota() {
        return this.maxQuota;
    }

    /**
     * @return multiVIPList
     */
    public java.util.List<MultiVIPList> getMultiVIPList() {
        return this.multiVIPList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String masterDns; 
        private java.util.List<String> masterDnsRecord; 
        private Long maxQuota; 
        private java.util.List<MultiVIPList> multiVIPList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceMultiVIPResponseBody model) {
            this.masterDns = model.masterDns;
            this.masterDnsRecord = model.masterDnsRecord;
            this.maxQuota = model.maxQuota;
            this.multiVIPList = model.multiVIPList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IP address of the primary DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>r-8vb30e8n0m4nvu7tff.redis.zhangbei.rds.aliyuncs.com</p>
         */
        public Builder masterDns(String masterDns) {
            this.masterDns = masterDns;
            return this;
        }

        /**
         * <p>The list of IP addresses corresponding to all LBs of the current instance.</p>
         */
        public Builder masterDnsRecord(java.util.List<String> masterDnsRecord) {
            this.masterDnsRecord = masterDnsRecord;
            return this;
        }

        /**
         * <p>The maximum number of VIPs that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxQuota(Long maxQuota) {
            this.maxQuota = maxQuota;
            return this;
        }

        /**
         * <p>The list of multiple LB VIPs.</p>
         */
        public Builder multiVIPList(java.util.List<MultiVIPList> multiVIPList) {
            this.multiVIPList = multiVIPList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceMultiVIPResponseBody build() {
            return new DescribeInstanceMultiVIPResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceMultiVIPResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceMultiVIPResponseBody</p>
     */
    public static class MultiVIPList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        private MultiVIPList(Builder builder) {
            this.connectionString = builder.connectionString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiVIPList create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        public static final class Builder {
            private String connectionString; 

            private Builder() {
            } 

            private Builder(MultiVIPList model) {
                this.connectionString = model.connectionString;
            } 

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1p4pzsr2rtubcvns-conn1.redis.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            public MultiVIPList build() {
                return new MultiVIPList(this);
            } 

        } 

    }
}
