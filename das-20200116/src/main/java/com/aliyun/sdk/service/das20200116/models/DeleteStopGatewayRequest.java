// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteStopGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeleteStopGatewayRequest</p>
 */
public class DeleteStopGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    private DeleteStopGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStopGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static final class Builder extends Request.Builder<DeleteStopGatewayRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStopGatewayRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>The ID that can uniquely identify the DBGateway. You can obtain the DBGateway ID by calling the <a href="https://help.aliyun.com/document_detail/230669.html">DescribeCloudbenchTask</a> operation. The DBGateway ID is the value of the <strong>ClientGatewayId</strong> field in the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22938c83fcfbced4b4869b9695e3****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public DeleteStopGatewayRequest build() {
            return new DeleteStopGatewayRequest(this);
        } 

    } 

}
