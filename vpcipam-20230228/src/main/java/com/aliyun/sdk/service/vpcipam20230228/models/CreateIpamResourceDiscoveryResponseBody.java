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
 * {@link CreateIpamResourceDiscoveryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpamResourceDiscoveryResponseBody</p>
 */
public class CreateIpamResourceDiscoveryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryId")
    private String ipamResourceDiscoveryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpamResourceDiscoveryResponseBody(Builder builder) {
        this.ipamResourceDiscoveryId = builder.ipamResourceDiscoveryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamResourceDiscoveryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipamResourceDiscoveryId
     */
    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipamResourceDiscoveryId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIpamResourceDiscoveryResponseBody model) {
            this.ipamResourceDiscoveryId = model.ipamResourceDiscoveryId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the instance for resource discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
         */
        public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
            this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
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

        public CreateIpamResourceDiscoveryResponseBody build() {
            return new CreateIpamResourceDiscoveryResponseBody(this);
        } 

    } 

}
