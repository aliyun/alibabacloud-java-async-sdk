// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link AssociateVpcCidrBlockResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateVpcCidrBlockResponseBody</p>
 */
public class AssociateVpcCidrBlockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateVpcCidrBlockResponseBody(Builder builder) {
        this.cidrBlock = builder.cidrBlock;
        this.ipVersion = builder.ipVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateVpcCidrBlockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cidrBlock; 
        private String ipVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssociateVpcCidrBlockResponseBody model) {
            this.cidrBlock = model.cidrBlock;
            this.ipVersion = model.ipVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IPv4 CIDR block to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The version of the IP address. Valid values:</p>
         * <ul>
         * <li><strong>IPV4</strong>: the IPv4 address.</li>
         * <li><strong>IPV6</strong>: the IPv6 address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPV4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C1221A1F-2ACD-4592-8F27-474E02883159</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateVpcCidrBlockResponseBody build() {
            return new AssociateVpcCidrBlockResponseBody(this);
        } 

    } 

}
