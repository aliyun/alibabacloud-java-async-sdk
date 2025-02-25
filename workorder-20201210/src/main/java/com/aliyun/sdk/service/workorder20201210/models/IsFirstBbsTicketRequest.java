// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20201210.models;

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
 * {@link IsFirstBbsTicketRequest} extends {@link RequestModel}
 *
 * <p>IsFirstBbsTicketRequest</p>
 */
public class IsFirstBbsTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cna")
    private String cna;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistributionChannel")
    private String distributionChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Referrer")
    private String referrer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDistributionChannel")
    private String subDistributionChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XGatewayExtendInfo")
    private String xGatewayExtendInfo;

    private IsFirstBbsTicketRequest(Builder builder) {
        super(builder);
        this.cna = builder.cna;
        this.distributionChannel = builder.distributionChannel;
        this.referrer = builder.referrer;
        this.subDistributionChannel = builder.subDistributionChannel;
        this.xGatewayExtendInfo = builder.xGatewayExtendInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsFirstBbsTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cna
     */
    public String getCna() {
        return this.cna;
    }

    /**
     * @return distributionChannel
     */
    public String getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * @return referrer
     */
    public String getReferrer() {
        return this.referrer;
    }

    /**
     * @return subDistributionChannel
     */
    public String getSubDistributionChannel() {
        return this.subDistributionChannel;
    }

    /**
     * @return xGatewayExtendInfo
     */
    public String getXGatewayExtendInfo() {
        return this.xGatewayExtendInfo;
    }

    public static final class Builder extends Request.Builder<IsFirstBbsTicketRequest, Builder> {
        private String cna; 
        private String distributionChannel; 
        private String referrer; 
        private String subDistributionChannel; 
        private String xGatewayExtendInfo; 

        private Builder() {
            super();
        } 

        private Builder(IsFirstBbsTicketRequest request) {
            super(request);
            this.cna = request.cna;
            this.distributionChannel = request.distributionChannel;
            this.referrer = request.referrer;
            this.subDistributionChannel = request.subDistributionChannel;
            this.xGatewayExtendInfo = request.xGatewayExtendInfo;
        } 

        /**
         * Cna.
         */
        public Builder cna(String cna) {
            this.putQueryParameter("Cna", cna);
            this.cna = cna;
            return this;
        }

        /**
         * DistributionChannel.
         */
        public Builder distributionChannel(String distributionChannel) {
            this.putQueryParameter("DistributionChannel", distributionChannel);
            this.distributionChannel = distributionChannel;
            return this;
        }

        /**
         * Referrer.
         */
        public Builder referrer(String referrer) {
            this.putQueryParameter("Referrer", referrer);
            this.referrer = referrer;
            return this;
        }

        /**
         * SubDistributionChannel.
         */
        public Builder subDistributionChannel(String subDistributionChannel) {
            this.putQueryParameter("SubDistributionChannel", subDistributionChannel);
            this.subDistributionChannel = subDistributionChannel;
            return this;
        }

        /**
         * XGatewayExtendInfo.
         */
        public Builder xGatewayExtendInfo(String xGatewayExtendInfo) {
            this.putQueryParameter("XGatewayExtendInfo", xGatewayExtendInfo);
            this.xGatewayExtendInfo = xGatewayExtendInfo;
            return this;
        }

        @Override
        public IsFirstBbsTicketRequest build() {
            return new IsFirstBbsTicketRequest(this);
        } 

    } 

}
