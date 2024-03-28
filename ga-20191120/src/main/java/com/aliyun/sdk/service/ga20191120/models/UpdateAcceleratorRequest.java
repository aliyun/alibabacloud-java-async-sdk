// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>UpdateAcceleratorRequest</p>
 */
public class UpdateAcceleratorRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Spec")
    private String spec;

    private UpdateAcceleratorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.autoPay = builder.autoPay;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAcceleratorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<UpdateAcceleratorRequest, Builder> {
        private String acceleratorId; 
        private Boolean autoPay; 
        private Boolean autoUseCoupon; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String regionId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAcceleratorRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.autoPay = request.autoPay;
            this.autoUseCoupon = request.autoUseCoupon;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.spec = request.spec;
        } 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * Specifies whether to enable automatic payment. Valid values:
         * <p>
         * 
         * *   **false**: disables automatic payment. This is the default value. After an order is generated, you must go to the [Order Center](https://usercenter2-intl.aliyun.com/order/list) to complete the payment.
         * *   **true**: enables automatic payment. Payments are automatically completed.
         * 
         * >  This parameter takes effect only if you call the operation to upgrade a GA instance.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to automatically pay bills by using coupons. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: automatically pays bills by using coupons.
         * *   **false**: does not automatically pay bills by using coupons.
         * 
         * >  This parameter takes effect only if the **AutoPay** parameter is set to **true**.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the GA instance. The description can be up to 200 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the GA instance.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The specification of the GA instance. Valid values:
         * <p>
         * 
         * *   **1**: Small Ⅰ
         * *   **2**: Small Ⅱ
         * *   **3**: Small Ⅲ
         * *   **5**: Medium Ⅰ
         * *   **8**: Medium Ⅱ
         * *   **10**: Medium Ⅲ
         * *   **20**: Large Ⅰ
         * *   **30**: Large Ⅱ
         * *   **40**: Large Ⅲ
         * *   **50**: Large Ⅳ
         * *   **60**: Large Ⅴ
         * *   **70**: Large Ⅵ
         * *   **80**: Large VⅡ
         * *   **90**: Large VⅢ
         * *   **100**: Super Large Ⅰ
         * *   **200**: Super Large Ⅱ
         * 
         * >  The Large Ⅲ specification and higher specifications are available only for accounts that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.
         * 
         * Different specifications provide different capabilities. For more information, see [Instance specifications](~~153127~~).
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public UpdateAcceleratorRequest build() {
            return new UpdateAcceleratorRequest(this);
        } 

    } 

}
