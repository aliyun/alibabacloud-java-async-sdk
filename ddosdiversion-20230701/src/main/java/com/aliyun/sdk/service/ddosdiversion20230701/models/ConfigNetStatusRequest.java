// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetStatusRequest} extends {@link RequestModel}
 *
 * <p>ConfigNetStatusRequest</p>
 */
public class ConfigNetStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Net")
    @com.aliyun.core.annotation.Validation(required = true)
    private String net;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List < String > regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String saleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubNets")
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
         * The CIDR block of the anti-DDoS diversion instance.
         */
        public Builder net(String net) {
            this.putQueryParameter("Net", net);
            this.net = net;
            return this;
        }

        /**
         * The regions in which the CIDR block needs to be advertised or withdrawn from advertising. If you leave this parameter empty, the CIDR blocks in all regions are configured.
         * <p>
         * 
         * >  You can call the [QueryNetList](~~2639086~~) operation to obtain the regions of the CIDR blocks.
         */
        public Builder regions(java.util.List < String > regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * The ID of the anti-DDoS diversion instance.
         */
        public Builder saleId(String saleId) {
            this.putQueryParameter("SaleId", saleId);
            this.saleId = saleId;
            return this;
        }

        /**
         * The status of the CIDR block. Valid values:
         * <p>
         * 
         * *   enable: advertises the CIDR block.
         * *   disable: withdraws the advertising of the CIDR block.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The subnet CIDR blocks of the CIDR block.
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
