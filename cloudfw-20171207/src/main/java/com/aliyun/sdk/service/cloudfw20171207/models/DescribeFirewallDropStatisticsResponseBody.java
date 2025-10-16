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
 * {@link DescribeFirewallDropStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallDropStatisticsResponseBody</p>
 */
public class DescribeFirewallDropStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclDropCnt")
    private Long aclDropCnt;

    @com.aliyun.core.annotation.NameInMap("IpsDropCnt")
    private Long ipsDropCnt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalDropCnt")
    private Long totalDropCnt;

    @com.aliyun.core.annotation.NameInMap("VulnDropCnt")
    private Long vulnDropCnt;

    private DescribeFirewallDropStatisticsResponseBody(Builder builder) {
        this.aclDropCnt = builder.aclDropCnt;
        this.ipsDropCnt = builder.ipsDropCnt;
        this.requestId = builder.requestId;
        this.totalDropCnt = builder.totalDropCnt;
        this.vulnDropCnt = builder.vulnDropCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallDropStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclDropCnt
     */
    public Long getAclDropCnt() {
        return this.aclDropCnt;
    }

    /**
     * @return ipsDropCnt
     */
    public Long getIpsDropCnt() {
        return this.ipsDropCnt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalDropCnt
     */
    public Long getTotalDropCnt() {
        return this.totalDropCnt;
    }

    /**
     * @return vulnDropCnt
     */
    public Long getVulnDropCnt() {
        return this.vulnDropCnt;
    }

    public static final class Builder {
        private Long aclDropCnt; 
        private Long ipsDropCnt; 
        private String requestId; 
        private Long totalDropCnt; 
        private Long vulnDropCnt; 

        private Builder() {
        } 

        private Builder(DescribeFirewallDropStatisticsResponseBody model) {
            this.aclDropCnt = model.aclDropCnt;
            this.ipsDropCnt = model.ipsDropCnt;
            this.requestId = model.requestId;
            this.totalDropCnt = model.totalDropCnt;
            this.vulnDropCnt = model.vulnDropCnt;
        } 

        /**
         * AclDropCnt.
         */
        public Builder aclDropCnt(Long aclDropCnt) {
            this.aclDropCnt = aclDropCnt;
            return this;
        }

        /**
         * IpsDropCnt.
         */
        public Builder ipsDropCnt(Long ipsDropCnt) {
            this.ipsDropCnt = ipsDropCnt;
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
         * TotalDropCnt.
         */
        public Builder totalDropCnt(Long totalDropCnt) {
            this.totalDropCnt = totalDropCnt;
            return this;
        }

        /**
         * VulnDropCnt.
         */
        public Builder vulnDropCnt(Long vulnDropCnt) {
            this.vulnDropCnt = vulnDropCnt;
            return this;
        }

        public DescribeFirewallDropStatisticsResponseBody build() {
            return new DescribeFirewallDropStatisticsResponseBody(this);
        } 

    } 

}
