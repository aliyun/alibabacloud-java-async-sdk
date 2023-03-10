// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindRequest} extends {@link RequestModel}
 *
 * <p>UnbindRequest</p>
 */
public class UnbindRequest extends Request {
    @Body
    @NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @Body
    @NameInMap("AppInstanceId")
    private String appInstanceId;

    @Body
    @NameInMap("EndUserId")
    private String endUserId;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    private UnbindRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.endUserId = builder.endUserId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<UnbindRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstanceId; 
        private String endUserId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(UnbindRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceId = request.appInstanceId;
            this.endUserId = request.endUserId;
            this.productType = request.productType;
        } 

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putBodyParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public UnbindRequest build() {
            return new UnbindRequest(this);
        } 

    } 

}
