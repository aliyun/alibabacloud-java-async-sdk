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
 * {@link CreateEnterpriseCodeRequest} extends {@link RequestModel}
 *
 * <p>CreateEnterpriseCodeRequest</p>
 */
public class CreateEnterpriseCodeRequest extends Request {
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

    private CreateEnterpriseCodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.enterpriseCode = builder.enterpriseCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnterpriseCodeRequest create() {
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

    public static final class Builder extends Request.Builder<CreateEnterpriseCodeRequest, Builder> {
        private String clientToken; 
        private String enterpriseCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnterpriseCodeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.enterpriseCode = request.enterpriseCode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the system automatically set <strong>ClientToken</strong> to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
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
         * <p>The enterprise code must be five characters in length and must contain letters and digits. Each enterprise code must be globally unique.</p>
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
         * <p>The ID of the region.</p>
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
        public CreateEnterpriseCodeRequest build() {
            return new CreateEnterpriseCodeRequest(this);
        } 

    } 

}
