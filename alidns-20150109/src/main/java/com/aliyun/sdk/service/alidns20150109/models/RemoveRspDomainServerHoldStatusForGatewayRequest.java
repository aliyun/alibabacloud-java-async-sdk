// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link RemoveRspDomainServerHoldStatusForGatewayRequest} extends {@link RequestModel}
 *
 * <p>RemoveRspDomainServerHoldStatusForGatewayRequest</p>
 */
public class RemoveRspDomainServerHoldStatusForGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusMsg")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statusMsg;

    private RemoveRspDomainServerHoldStatusForGatewayRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.domainName = builder.domainName;
        this.statusMsg = builder.statusMsg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveRspDomainServerHoldStatusForGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return statusMsg
     */
    public String getStatusMsg() {
        return this.statusMsg;
    }

    public static final class Builder extends Request.Builder<RemoveRspDomainServerHoldStatusForGatewayRequest, Builder> {
        private String clientToken; 
        private String domainName; 
        private String statusMsg; 

        private Builder() {
            super();
        } 

        private Builder(RemoveRspDomainServerHoldStatusForGatewayRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.domainName = request.domainName;
            this.statusMsg = request.statusMsg;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asdf</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder statusMsg(String statusMsg) {
            this.putQueryParameter("StatusMsg", statusMsg);
            this.statusMsg = statusMsg;
            return this;
        }

        @Override
        public RemoveRspDomainServerHoldStatusForGatewayRequest build() {
            return new RemoveRspDomainServerHoldStatusForGatewayRequest(this);
        } 

    } 

}
