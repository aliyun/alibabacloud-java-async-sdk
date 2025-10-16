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
 * {@link DescribeAclWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclWhitelistResponseBody</p>
 */
public class DescribeAclWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainGroupUseDns")
    private Boolean domainGroupUseDns;

    @com.aliyun.core.annotation.NameInMap("NatDomainGroupUseDns")
    private Boolean natDomainGroupUseDns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportMessageType")
    private Boolean supportMessageType;

    @com.aliyun.core.annotation.NameInMap("VpcDomainGroupUseDns")
    private Boolean vpcDomainGroupUseDns;

    private DescribeAclWhitelistResponseBody(Builder builder) {
        this.domainGroupUseDns = builder.domainGroupUseDns;
        this.natDomainGroupUseDns = builder.natDomainGroupUseDns;
        this.requestId = builder.requestId;
        this.supportMessageType = builder.supportMessageType;
        this.vpcDomainGroupUseDns = builder.vpcDomainGroupUseDns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclWhitelistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainGroupUseDns
     */
    public Boolean getDomainGroupUseDns() {
        return this.domainGroupUseDns;
    }

    /**
     * @return natDomainGroupUseDns
     */
    public Boolean getNatDomainGroupUseDns() {
        return this.natDomainGroupUseDns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportMessageType
     */
    public Boolean getSupportMessageType() {
        return this.supportMessageType;
    }

    /**
     * @return vpcDomainGroupUseDns
     */
    public Boolean getVpcDomainGroupUseDns() {
        return this.vpcDomainGroupUseDns;
    }

    public static final class Builder {
        private Boolean domainGroupUseDns; 
        private Boolean natDomainGroupUseDns; 
        private String requestId; 
        private Boolean supportMessageType; 
        private Boolean vpcDomainGroupUseDns; 

        private Builder() {
        } 

        private Builder(DescribeAclWhitelistResponseBody model) {
            this.domainGroupUseDns = model.domainGroupUseDns;
            this.natDomainGroupUseDns = model.natDomainGroupUseDns;
            this.requestId = model.requestId;
            this.supportMessageType = model.supportMessageType;
            this.vpcDomainGroupUseDns = model.vpcDomainGroupUseDns;
        } 

        /**
         * DomainGroupUseDns.
         */
        public Builder domainGroupUseDns(Boolean domainGroupUseDns) {
            this.domainGroupUseDns = domainGroupUseDns;
            return this;
        }

        /**
         * NatDomainGroupUseDns.
         */
        public Builder natDomainGroupUseDns(Boolean natDomainGroupUseDns) {
            this.natDomainGroupUseDns = natDomainGroupUseDns;
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
         * SupportMessageType.
         */
        public Builder supportMessageType(Boolean supportMessageType) {
            this.supportMessageType = supportMessageType;
            return this;
        }

        /**
         * VpcDomainGroupUseDns.
         */
        public Builder vpcDomainGroupUseDns(Boolean vpcDomainGroupUseDns) {
            this.vpcDomainGroupUseDns = vpcDomainGroupUseDns;
            return this;
        }

        public DescribeAclWhitelistResponseBody build() {
            return new DescribeAclWhitelistResponseBody(this);
        } 

    } 

}
