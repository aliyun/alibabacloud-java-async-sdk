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
 * {@link DescribeAclRuleCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclRuleCountResponseBody</p>
 */
public class DescribeAclRuleCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InternetInAclCount")
    private Integer internetInAclCount;

    @com.aliyun.core.annotation.NameInMap("InternetOutAclCount")
    private Integer internetOutAclCount;

    @com.aliyun.core.annotation.NameInMap("NatInAclCount")
    private Integer natInAclCount;

    @com.aliyun.core.annotation.NameInMap("NatOutAclCount")
    private Integer natOutAclCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalAclCount")
    private Integer totalAclCount;

    @com.aliyun.core.annotation.NameInMap("VpcAclCount")
    private Integer vpcAclCount;

    private DescribeAclRuleCountResponseBody(Builder builder) {
        this.internetInAclCount = builder.internetInAclCount;
        this.internetOutAclCount = builder.internetOutAclCount;
        this.natInAclCount = builder.natInAclCount;
        this.natOutAclCount = builder.natOutAclCount;
        this.requestId = builder.requestId;
        this.totalAclCount = builder.totalAclCount;
        this.vpcAclCount = builder.vpcAclCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclRuleCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return internetInAclCount
     */
    public Integer getInternetInAclCount() {
        return this.internetInAclCount;
    }

    /**
     * @return internetOutAclCount
     */
    public Integer getInternetOutAclCount() {
        return this.internetOutAclCount;
    }

    /**
     * @return natInAclCount
     */
    public Integer getNatInAclCount() {
        return this.natInAclCount;
    }

    /**
     * @return natOutAclCount
     */
    public Integer getNatOutAclCount() {
        return this.natOutAclCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalAclCount
     */
    public Integer getTotalAclCount() {
        return this.totalAclCount;
    }

    /**
     * @return vpcAclCount
     */
    public Integer getVpcAclCount() {
        return this.vpcAclCount;
    }

    public static final class Builder {
        private Integer internetInAclCount; 
        private Integer internetOutAclCount; 
        private Integer natInAclCount; 
        private Integer natOutAclCount; 
        private String requestId; 
        private Integer totalAclCount; 
        private Integer vpcAclCount; 

        private Builder() {
        } 

        private Builder(DescribeAclRuleCountResponseBody model) {
            this.internetInAclCount = model.internetInAclCount;
            this.internetOutAclCount = model.internetOutAclCount;
            this.natInAclCount = model.natInAclCount;
            this.natOutAclCount = model.natOutAclCount;
            this.requestId = model.requestId;
            this.totalAclCount = model.totalAclCount;
            this.vpcAclCount = model.vpcAclCount;
        } 

        /**
         * InternetInAclCount.
         */
        public Builder internetInAclCount(Integer internetInAclCount) {
            this.internetInAclCount = internetInAclCount;
            return this;
        }

        /**
         * InternetOutAclCount.
         */
        public Builder internetOutAclCount(Integer internetOutAclCount) {
            this.internetOutAclCount = internetOutAclCount;
            return this;
        }

        /**
         * NatInAclCount.
         */
        public Builder natInAclCount(Integer natInAclCount) {
            this.natInAclCount = natInAclCount;
            return this;
        }

        /**
         * NatOutAclCount.
         */
        public Builder natOutAclCount(Integer natOutAclCount) {
            this.natOutAclCount = natOutAclCount;
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
         * TotalAclCount.
         */
        public Builder totalAclCount(Integer totalAclCount) {
            this.totalAclCount = totalAclCount;
            return this;
        }

        /**
         * VpcAclCount.
         */
        public Builder vpcAclCount(Integer vpcAclCount) {
            this.vpcAclCount = vpcAclCount;
            return this;
        }

        public DescribeAclRuleCountResponseBody build() {
            return new DescribeAclRuleCountResponseBody(this);
        } 

    } 

}
