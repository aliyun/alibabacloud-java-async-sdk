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
 * {@link GetVpcIpamServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcIpamServiceStatusResponseBody</p>
 */
public class GetVpcIpamServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVpcIpamServiceStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcIpamServiceStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean enabled; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetVpcIpamServiceStatusResponseBody model) {
            this.enabled = model.enabled;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether IPAM is activated.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FEE9FFF-57EE-5832-BE88-9308352F3B68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVpcIpamServiceStatusResponseBody build() {
            return new GetVpcIpamServiceStatusResponseBody(this);
        } 

    } 

}
