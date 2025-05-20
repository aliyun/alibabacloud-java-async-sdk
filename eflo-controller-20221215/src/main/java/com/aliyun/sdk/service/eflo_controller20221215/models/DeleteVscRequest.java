// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DeleteVscRequest} extends {@link RequestModel}
 *
 * <p>DeleteVscRequest</p>
 */
public class DeleteVscRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VscId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vscId;

    private DeleteVscRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.vscId = builder.vscId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVscRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return vscId
     */
    public String getVscId() {
        return this.vscId;
    }

    public static final class Builder extends Request.Builder<DeleteVscRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String vscId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVscRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.vscId = request.vscId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Idempotent parameter</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The VscId to be deleted</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-001</p>
         */
        public Builder vscId(String vscId) {
            this.putBodyParameter("VscId", vscId);
            this.vscId = vscId;
            return this;
        }

        @Override
        public DeleteVscRequest build() {
            return new DeleteVscRequest(this);
        } 

    } 

}
