// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AssociateNetworkCidrBlockResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateNetworkCidrBlockResponseBody</p>
 */
public class AssociateNetworkCidrBlockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateNetworkCidrBlockResponseBody(Builder builder) {
        this.cidrBlock = builder.cidrBlock;
        this.ipVersion = builder.ipVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateNetworkCidrBlockResponseBody create() {
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

        private Builder(AssociateNetworkCidrBlockResponseBody model) {
            this.cidrBlock = model.cidrBlock;
            this.ipVersion = model.ipVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The allocated secondary CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:0:a600::/110</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The IP address type of the secondary CIDR block. Valid values:</p>
         * <ul>
         * <li>IPV4: IPv4 address.</li>
         * <li>IPV6: IPv6 address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPV6</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateNetworkCidrBlockResponseBody build() {
            return new AssociateNetworkCidrBlockResponseBody(this);
        } 

    } 

}
