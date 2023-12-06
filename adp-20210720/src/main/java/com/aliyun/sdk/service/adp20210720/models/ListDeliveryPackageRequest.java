// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeliveryPackageRequest} extends {@link RequestModel}
 *
 * <p>ListDeliveryPackageRequest</p>
 */
public class ListDeliveryPackageRequest extends Request {
    @Query
    @NameInMap("deliverableUID")
    private String deliverableUID;

    @Query
    @NameInMap("platform")
    private String platform;

    private ListDeliveryPackageRequest(Builder builder) {
        super(builder);
        this.deliverableUID = builder.deliverableUID;
        this.platform = builder.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeliveryPackageRequest create() {
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
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    public static final class Builder extends Request.Builder<ListDeliveryPackageRequest, Builder> {
        private String deliverableUID; 
        private String platform; 

        private Builder() {
            super();
        } 

        private Builder(ListDeliveryPackageRequest request) {
            super(request);
            this.deliverableUID = request.deliverableUID;
            this.platform = request.platform;
        } 

        /**
         * deliverableUID.
         */
        public Builder deliverableUID(String deliverableUID) {
            this.putQueryParameter("deliverableUID", deliverableUID);
            this.deliverableUID = deliverableUID;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        @Override
        public ListDeliveryPackageRequest build() {
            return new ListDeliveryPackageRequest(this);
        } 

    } 

}
