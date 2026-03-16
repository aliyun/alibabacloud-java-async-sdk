// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link CheckImageExistsRequest} extends {@link RequestModel}
 *
 * <p>CheckImageExistsRequest</p>
 */
public class CheckImageExistsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String picName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    private CheckImageExistsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceName = builder.instanceName;
        this.picName = builder.picName;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckImageExistsRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return picName
     */
    public String getPicName() {
        return this.picName;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<CheckImageExistsRequest, Builder> {
        private String regionId; 
        private String instanceName; 
        private String picName; 
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(CheckImageExistsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceName = request.instanceName;
            this.picName = request.picName;
            this.productId = request.productId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demoinstance1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        public Builder picName(String picName) {
            this.putBodyParameter("PicName", picName);
            this.picName = picName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public CheckImageExistsRequest build() {
            return new CheckImageExistsRequest(this);
        } 

    } 

}
