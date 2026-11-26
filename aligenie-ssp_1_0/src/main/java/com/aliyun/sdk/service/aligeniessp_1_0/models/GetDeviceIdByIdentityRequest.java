// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetDeviceIdByIdentityRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceIdByIdentityRequest</p>
 */
public class GetDeviceIdByIdentityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodeKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encodeKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private GetDeviceIdByIdentityRequest(Builder builder) {
        super(builder);
        this.encodeKey = builder.encodeKey;
        this.encodeType = builder.encodeType;
        this.identityId = builder.identityId;
        this.identityType = builder.identityType;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceIdByIdentityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encodeKey
     */
    public String getEncodeKey() {
        return this.encodeKey;
    }

    /**
     * @return encodeType
     */
    public String getEncodeType() {
        return this.encodeType;
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<GetDeviceIdByIdentityRequest, Builder> {
        private String encodeKey; 
        private String encodeType; 
        private String identityId; 
        private String identityType; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceIdByIdentityRequest request) {
            super(request);
            this.encodeKey = request.encodeKey;
            this.encodeType = request.encodeType;
            this.identityId = request.identityId;
            this.identityType = request.identityType;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The value corresponding to the encoding type. Enter the Project ID of the project to which this product belongs. You can view it in the Tmall Genie AI platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>129****0946</p>
         */
        public Builder encodeKey(String encodeKey) {
            this.putQueryParameter("EncodeKey", encodeKey);
            this.encodeKey = encodeKey;
            return this;
        }

        /**
         * <p>Encoding type. Enter <strong>PROJECT_ID</strong> here.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        public Builder encodeType(String encodeType) {
            this.putQueryParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * <p>Authentication identifier. Enter the MAC address or the SN value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b4:xx:xx:xx:65:2b</p>
         */
        public Builder identityId(String identityId) {
            this.putQueryParameter("IdentityId", identityId);
            this.identityId = identityId;
            return this;
        }

        /**
         * <p>Device authentication type. Enter <strong>MAC</strong>, <strong>SN</strong>, or <strong>CTEI</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAC</p>
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * <p>The unique product identifier ProductKey, which is a globally unique identity issued by the platform when the product is created in the Tmall Genie AI platform. This parameter is optional when IdentityType is <strong>CTEI</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Mm*****XnZ8</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public GetDeviceIdByIdentityRequest build() {
            return new GetDeviceIdByIdentityRequest(this);
        } 

    } 

}
