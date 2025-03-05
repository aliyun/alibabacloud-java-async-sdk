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

        /**
         * CidrBlock.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * RequestId.
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
