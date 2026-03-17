// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link UpdateSmartAGEnterpriseCodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSmartAGEnterpriseCodeRequest</p>
 */
public class UpdateSmartAGEnterpriseCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enterpriseCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    private UpdateSmartAGEnterpriseCodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.enterpriseCode = builder.enterpriseCode;
        this.regionId = builder.regionId;
        this.smartAGId = builder.smartAGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSmartAGEnterpriseCodeRequest create() {
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
     * @return enterpriseCode
     */
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public static final class Builder extends Request.Builder<UpdateSmartAGEnterpriseCodeRequest, Builder> {
        private String clientToken; 
        private String enterpriseCode; 
        private String regionId; 
        private String smartAGId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSmartAGEnterpriseCodeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enterpriseCode = request.enterpriseCode;
            this.regionId = request.regionId;
            this.smartAGId = request.smartAGId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The enterprise code with you want to associate the SAG APP instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12P**</p>
         */
        public Builder enterpriseCode(String enterpriseCode) {
            this.putQueryParameter("EnterpriseCode", enterpriseCode);
            this.enterpriseCode = enterpriseCode;
            return this;
        }

        /**
         * <p>The ID of the region where the SAG APP instance is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the SAG APP instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-rz2e23c0e78ema****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        @Override
        public UpdateSmartAGEnterpriseCodeRequest build() {
            return new UpdateSmartAGEnterpriseCodeRequest(this);
        } 

    } 

}
