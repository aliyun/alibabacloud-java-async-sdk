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
 * {@link UpdateEnterpriseCodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnterpriseCodeRequest</p>
 */
public class UpdateEnterpriseCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enterpriseCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateEnterpriseCodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.enterpriseCode = builder.enterpriseCode;
        this.isDefault = builder.isDefault;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnterpriseCodeRequest create() {
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
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateEnterpriseCodeRequest, Builder> {
        private String clientToken; 
        private String enterpriseCode; 
        private Boolean isDefault; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnterpriseCodeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enterpriseCode = request.enterpriseCode;
            this.isDefault = request.isDefault;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The enterprise code.</p>
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
         * <p>Specifies whether to specify the enterprise code as the default one. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The ID of the region to which the enterprise code belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        @Override
        public UpdateEnterpriseCodeRequest build() {
            return new UpdateEnterpriseCodeRequest(this);
        } 

    } 

}
