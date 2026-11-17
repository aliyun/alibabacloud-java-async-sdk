// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DeleteWebFilterTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteWebFilterTemplateRequest</p>
 */
public class DeleteWebFilterTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebFilterTemplateId")
    private String webFilterTemplateId;

    private DeleteWebFilterTemplateRequest(Builder builder) {
        super(builder);
        this.webFilterTemplateId = builder.webFilterTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWebFilterTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return webFilterTemplateId
     */
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

    public static final class Builder extends Request.Builder<DeleteWebFilterTemplateRequest, Builder> {
        private String webFilterTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWebFilterTemplateRequest request) {
            super(request);
            this.webFilterTemplateId = request.webFilterTemplateId;
        } 

        /**
         * <p>The ID of the web filtering template to delete. This parameter is required. If you leave this parameter empty, a parameter fault is returned. The template must exist within the current Alibaba Cloud account. A template cannot be deleted if it is referenced by an access control policy of the Internet border, NAT firewalls, or virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>wft-3f2a9c1d4b5e6f70</p>
         */
        public Builder webFilterTemplateId(String webFilterTemplateId) {
            this.putQueryParameter("WebFilterTemplateId", webFilterTemplateId);
            this.webFilterTemplateId = webFilterTemplateId;
            return this;
        }

        @Override
        public DeleteWebFilterTemplateRequest build() {
            return new DeleteWebFilterTemplateRequest(this);
        } 

    } 

}
