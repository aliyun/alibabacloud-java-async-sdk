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
 * {@link UpdateRspDomainServerHoldStatusOteRequest} extends {@link RequestModel}
 *
 * <p>UpdateRspDomainServerHoldStatusOteRequest</p>
 */
public class UpdateRspDomainServerHoldStatusOteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerHoldStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverHoldStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusMsg")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statusMsg;

    private UpdateRspDomainServerHoldStatusOteRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.domainName = builder.domainName;
        this.operatorId = builder.operatorId;
        this.operatorType = builder.operatorType;
        this.serverHoldStatus = builder.serverHoldStatus;
        this.statusMsg = builder.statusMsg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRspDomainServerHoldStatusOteRequest create() {
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
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return operatorType
     */
    public String getOperatorType() {
        return this.operatorType;
    }

    /**
     * @return serverHoldStatus
     */
    public String getServerHoldStatus() {
        return this.serverHoldStatus;
    }

    /**
     * @return statusMsg
     */
    public String getStatusMsg() {
        return this.statusMsg;
    }

    public static final class Builder extends Request.Builder<UpdateRspDomainServerHoldStatusOteRequest, Builder> {
        private String clientToken; 
        private String domainName; 
        private String operatorId; 
        private String operatorType; 
        private String serverHoldStatus; 
        private String statusMsg; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRspDomainServerHoldStatusOteRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.domainName = request.domainName;
            this.operatorId = request.operatorId;
            this.operatorType = request.operatorType;
            this.serverHoldStatus = request.serverHoldStatus;
            this.statusMsg = request.statusMsg;
        } 

        /**
         * ClientToken.
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
         * 
         * <strong>example:</strong>
         * <p>gatewayId001</p>
         */
        public Builder operatorId(String operatorId) {
            this.putQueryParameter("OperatorId", operatorId);
            this.operatorId = operatorId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registryGateway</p>
         */
        public Builder operatorType(String operatorType) {
            this.putQueryParameter("OperatorType", operatorType);
            this.operatorType = operatorType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder serverHoldStatus(String serverHoldStatus) {
            this.putQueryParameter("ServerHoldStatus", serverHoldStatus);
            this.serverHoldStatus = serverHoldStatus;
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
        public UpdateRspDomainServerHoldStatusOteRequest build() {
            return new UpdateRspDomainServerHoldStatusOteRequest(this);
        } 

    } 

}
