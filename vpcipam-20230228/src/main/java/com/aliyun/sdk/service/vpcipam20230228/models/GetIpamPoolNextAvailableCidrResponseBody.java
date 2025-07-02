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
 * {@link GetIpamPoolNextAvailableCidrResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpamPoolNextAvailableCidrResponseBody</p>
 */
public class GetIpamPoolNextAvailableCidrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIpamPoolNextAvailableCidrResponseBody(Builder builder) {
        this.cidrBlock = builder.cidrBlock;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpamPoolNextAvailableCidrResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cidrBlock; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIpamPoolNextAvailableCidrResponseBody model) {
            this.cidrBlock = model.cidrBlock;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Available CIDR.</p>
         * 
         * <strong>example:</strong>
         * <p>172.68.0.0/26</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29FC6758-9B7C-5CC7-8CBF-4DD846FE7D82</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIpamPoolNextAvailableCidrResponseBody build() {
            return new GetIpamPoolNextAvailableCidrResponseBody(this);
        } 

    } 

}
