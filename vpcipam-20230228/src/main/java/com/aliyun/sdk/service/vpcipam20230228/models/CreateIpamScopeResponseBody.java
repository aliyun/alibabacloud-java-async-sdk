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
 * {@link CreateIpamScopeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpamScopeResponseBody</p>
 */
public class CreateIpamScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpamScopeId")
    private String ipamScopeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpamScopeResponseBody(Builder builder) {
        this.ipamScopeId = builder.ipamScopeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamScopeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipamScopeId
     */
    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipamScopeId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIpamScopeResponseBody model) {
            this.ipamScopeId = model.ipamScopeId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the IPAM scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-glfmcyldpm8lsy****</p>
         */
        public Builder ipamScopeId(String ipamScopeId) {
            this.ipamScopeId = ipamScopeId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E897D16A-50EB-543F-B002-C5A26AB818FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpamScopeResponseBody build() {
            return new CreateIpamScopeResponseBody(this);
        } 

    } 

}
