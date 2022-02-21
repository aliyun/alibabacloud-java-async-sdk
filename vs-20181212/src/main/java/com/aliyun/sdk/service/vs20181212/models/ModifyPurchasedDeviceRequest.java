// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPurchasedDeviceRequest} extends {@link RequestModel}
 *
 * <p>ModifyPurchasedDeviceRequest</p>
 */
public class ModifyPurchasedDeviceRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegisterCode")
    private String registerCode;

    @Query
    @NameInMap("SubType")
    private String subType;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private ModifyPurchasedDeviceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.registerCode = builder.registerCode;
        this.subType = builder.subType;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPurchasedDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return registerCode
     */
    public String getRegisterCode() {
        return this.registerCode;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ModifyPurchasedDeviceRequest, Builder> {
        private String description; 
        private String id; 
        private String name; 
        private String orderId; 
        private Long ownerId; 
        private String registerCode; 
        private String subType; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPurchasedDeviceRequest response) {
            super(response);
            this.description = response.description;
            this.id = response.id;
            this.name = response.name;
            this.orderId = response.orderId;
            this.ownerId = response.ownerId;
            this.registerCode = response.registerCode;
            this.subType = response.subType;
            this.vendor = response.vendor;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegisterCode.
         */
        public Builder registerCode(String registerCode) {
            this.putQueryParameter("RegisterCode", registerCode);
            this.registerCode = registerCode;
            return this;
        }

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ModifyPurchasedDeviceRequest build() {
            return new ModifyPurchasedDeviceRequest(this);
        } 

    } 

}
