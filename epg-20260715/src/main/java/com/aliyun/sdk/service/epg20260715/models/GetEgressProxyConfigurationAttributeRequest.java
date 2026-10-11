// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link GetEgressProxyConfigurationAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetEgressProxyConfigurationAttributeRequest</p>
 */
public class GetEgressProxyConfigurationAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyConfigurationId;

    private GetEgressProxyConfigurationAttributeRequest(Builder builder) {
        super(builder);
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEgressProxyConfigurationAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyConfigurationId
     */
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public static final class Builder extends Request.Builder<GetEgressProxyConfigurationAttributeRequest, Builder> {
        private String egressProxyConfigurationId; 

        private Builder() {
            super();
        } 

        private Builder(GetEgressProxyConfigurationAttributeRequest request) {
            super(request);
            this.egressProxyConfigurationId = request.egressProxyConfigurationId;
        } 

        /**
         * <p>The ID of the egress proxy configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epc-hn302f6a9a284c4f****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.putBodyParameter("EgressProxyConfigurationId", egressProxyConfigurationId);
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        @Override
        public GetEgressProxyConfigurationAttributeRequest build() {
            return new GetEgressProxyConfigurationAttributeRequest(this);
        } 

    } 

}
