// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link AddIpamPoolCidrResponseBody} extends {@link TeaModel}
 *
 * <p>AddIpamPoolCidrResponseBody</p>
 */
public class AddIpamPoolCidrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddIpamPoolCidrResponseBody(Builder builder) {
        this.cidr = builder.cidr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpamPoolCidrResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cidr; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddIpamPoolCidrResponseBody model) {
            this.cidr = model.cidr;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The successfully provisioned CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>558BC336-8B88-53B0-B4AD-980EE900AB01</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIpamPoolCidrResponseBody build() {
            return new AddIpamPoolCidrResponseBody(this);
        } 

    } 

}
