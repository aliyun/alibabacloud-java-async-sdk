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
 * {@link CreateIpamPoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpamPoolResponseBody</p>
 */
public class CreateIpamPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpamPoolId")
    private String ipamPoolId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpamPoolResponseBody(Builder builder) {
        this.ipamPoolId = builder.ipamPoolId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamPoolResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipamPoolId
     */
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipamPoolId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIpamPoolResponseBody model) {
            this.ipamPoolId = model.ipamPoolId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BB2C39DE-CEB8-595A-981A-F2EFCBE7324E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpamPoolResponseBody build() {
            return new CreateIpamPoolResponseBody(this);
        } 

    } 

}
