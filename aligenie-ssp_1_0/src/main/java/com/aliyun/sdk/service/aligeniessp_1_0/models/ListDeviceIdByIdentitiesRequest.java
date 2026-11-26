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
 * {@link ListDeviceIdByIdentitiesRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceIdByIdentitiesRequest</p>
 */
public class ListDeviceIdByIdentitiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodeKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encodeKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityIds")
    private java.util.List<String> identityIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private ListDeviceIdByIdentitiesRequest(Builder builder) {
        super(builder);
        this.encodeKey = builder.encodeKey;
        this.encodeType = builder.encodeType;
        this.identityIds = builder.identityIds;
        this.identityType = builder.identityType;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceIdByIdentitiesRequest create() {
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
     * @return identityIds
     */
    public java.util.List<String> getIdentityIds() {
        return this.identityIds;
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

    public static final class Builder extends Request.Builder<ListDeviceIdByIdentitiesRequest, Builder> {
        private String encodeKey; 
        private String encodeType; 
        private java.util.List<String> identityIds; 
        private String identityType; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceIdByIdentitiesRequest request) {
            super(request);
            this.encodeKey = request.encodeKey;
            this.encodeType = request.encodeType;
            this.identityIds = request.identityIds;
            this.identityType = request.identityType;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The value corresponding to the encoding type. Enter the Project ID of the project to which this product belongs. You can view it in the Tmall Genie AI platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>125****0946</p>
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
         * <p>List of device authentication identifiers.</p>
         */
        public Builder identityIds(java.util.List<String> identityIds) {
            String identityIdsShrink = shrink(identityIds, "IdentityIds", "json");
            this.putQueryParameter("IdentityIds", identityIdsShrink);
            this.identityIds = identityIds;
            return this;
        }

        /**
         * <p>Device authentication type. Enter <strong>MAC</strong> or <strong>SN</strong>.</p>
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
         * <p>The unique product identifier ProductKey, which is a globally unique identity issued by the platform when creating a product in the Tmall Genie AI platform.</p>
         * <p>This parameter is required.</p>
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
        public ListDeviceIdByIdentitiesRequest build() {
            return new ListDeviceIdByIdentitiesRequest(this);
        } 

    } 

}
