// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeliveryPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateDeliveryPackageRequest</p>
 */
public class CreateDeliveryPackageRequest extends Request {
    @Body
    @NameInMap("deliverableUID")
    private String deliverableUID;

    @Body
    @NameInMap("deliveryInstanceUID")
    private String deliveryInstanceUID;

    @Body
    @NameInMap("originDeliverableUID")
    private String originDeliverableUID;

    @Body
    @NameInMap("packageContentType")
    private String packageContentType;

    @Body
    @NameInMap("packageType")
    private String packageType;

    @Body
    @NameInMap("platform")
    private String platform;

    private CreateDeliveryPackageRequest(Builder builder) {
        super(builder);
        this.deliverableUID = builder.deliverableUID;
        this.deliveryInstanceUID = builder.deliveryInstanceUID;
        this.originDeliverableUID = builder.originDeliverableUID;
        this.packageContentType = builder.packageContentType;
        this.packageType = builder.packageType;
        this.platform = builder.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeliveryPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliverableUID
     */
    public String getDeliverableUID() {
        return this.deliverableUID;
    }

    /**
     * @return deliveryInstanceUID
     */
    public String getDeliveryInstanceUID() {
        return this.deliveryInstanceUID;
    }

    /**
     * @return originDeliverableUID
     */
    public String getOriginDeliverableUID() {
        return this.originDeliverableUID;
    }

    /**
     * @return packageContentType
     */
    public String getPackageContentType() {
        return this.packageContentType;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    public static final class Builder extends Request.Builder<CreateDeliveryPackageRequest, Builder> {
        private String deliverableUID; 
        private String deliveryInstanceUID; 
        private String originDeliverableUID; 
        private String packageContentType; 
        private String packageType; 
        private String platform; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeliveryPackageRequest request) {
            super(request);
            this.deliverableUID = request.deliverableUID;
            this.deliveryInstanceUID = request.deliveryInstanceUID;
            this.originDeliverableUID = request.originDeliverableUID;
            this.packageContentType = request.packageContentType;
            this.packageType = request.packageType;
            this.platform = request.platform;
        } 

        /**
         * deliverableUID.
         */
        public Builder deliverableUID(String deliverableUID) {
            this.putBodyParameter("deliverableUID", deliverableUID);
            this.deliverableUID = deliverableUID;
            return this;
        }

        /**
         * deliveryInstanceUID.
         */
        public Builder deliveryInstanceUID(String deliveryInstanceUID) {
            this.putBodyParameter("deliveryInstanceUID", deliveryInstanceUID);
            this.deliveryInstanceUID = deliveryInstanceUID;
            return this;
        }

        /**
         * originDeliverableUID.
         */
        public Builder originDeliverableUID(String originDeliverableUID) {
            this.putBodyParameter("originDeliverableUID", originDeliverableUID);
            this.originDeliverableUID = originDeliverableUID;
            return this;
        }

        /**
         * packageContentType.
         */
        public Builder packageContentType(String packageContentType) {
            this.putBodyParameter("packageContentType", packageContentType);
            this.packageContentType = packageContentType;
            return this;
        }

        /**
         * packageType.
         */
        public Builder packageType(String packageType) {
            this.putBodyParameter("packageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        @Override
        public CreateDeliveryPackageRequest build() {
            return new CreateDeliveryPackageRequest(this);
        } 

    } 

}
