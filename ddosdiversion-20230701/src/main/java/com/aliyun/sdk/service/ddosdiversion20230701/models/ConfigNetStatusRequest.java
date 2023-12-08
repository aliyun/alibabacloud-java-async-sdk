// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetStatusRequest} extends {@link RequestModel}
 *
 * <p>ConfigNetStatusRequest</p>
 */
public class ConfigNetStatusRequest extends Request {
    @Query
    @NameInMap("Net")
    @Validation(required = true)
    private String net;

    @Query
    @NameInMap("Regions")
    private java.util.List < String > regions;

    @Query
    @NameInMap("SaleId")
    @Validation(required = true)
    private String saleId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("SubNets")
    private java.util.List < String > subNets;

    private ConfigNetStatusRequest(Builder builder) {
        super(builder);
        this.net = builder.net;
        this.regions = builder.regions;
        this.saleId = builder.saleId;
        this.status = builder.status;
        this.subNets = builder.subNets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigNetStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return net
     */
    public String getNet() {
        return this.net;
    }

    /**
     * @return regions
     */
    public java.util.List < String > getRegions() {
        return this.regions;
    }

    /**
     * @return saleId
     */
    public String getSaleId() {
        return this.saleId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subNets
     */
    public java.util.List < String > getSubNets() {
        return this.subNets;
    }

    public static final class Builder extends Request.Builder<ConfigNetStatusRequest, Builder> {
        private String net; 
        private java.util.List < String > regions; 
        private String saleId; 
        private String status; 
        private java.util.List < String > subNets; 

        private Builder() {
            super();
        } 

        private Builder(ConfigNetStatusRequest request) {
            super(request);
            this.net = request.net;
            this.regions = request.regions;
            this.saleId = request.saleId;
            this.status = request.status;
            this.subNets = request.subNets;
        } 

        /**
         * Net.
         */
        public Builder net(String net) {
            this.putQueryParameter("Net", net);
            this.net = net;
            return this;
        }

        /**
         * Regions.
         */
        public Builder regions(java.util.List < String > regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * SaleId.
         */
        public Builder saleId(String saleId) {
            this.putQueryParameter("SaleId", saleId);
            this.saleId = saleId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SubNets.
         */
        public Builder subNets(java.util.List < String > subNets) {
            this.putQueryParameter("SubNets", subNets);
            this.subNets = subNets;
            return this;
        }

        @Override
        public ConfigNetStatusRequest build() {
            return new ConfigNetStatusRequest(this);
        } 

    } 

}
