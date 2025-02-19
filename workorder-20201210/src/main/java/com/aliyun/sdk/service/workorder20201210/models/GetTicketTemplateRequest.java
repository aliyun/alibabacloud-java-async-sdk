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
 * {@link GetTicketTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTicketTemplateRequest</p>
 */
public class GetTicketTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999)
    private Long categoryId;

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

    private GetTicketTemplateRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.cna = builder.cna;
        this.distributionChannel = builder.distributionChannel;
        this.referrer = builder.referrer;
        this.subDistributionChannel = builder.subDistributionChannel;
        this.xGatewayExtendInfo = builder.xGatewayExtendInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
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

    public static final class Builder extends Request.Builder<GetTicketTemplateRequest, Builder> {
        private Long categoryId; 
        private String cna; 
        private String distributionChannel; 
        private String referrer; 
        private String subDistributionChannel; 
        private String xGatewayExtendInfo; 

        private Builder() {
            super();
        } 

        private Builder(GetTicketTemplateRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.cna = request.cna;
            this.distributionChannel = request.distributionChannel;
            this.referrer = request.referrer;
            this.subDistributionChannel = request.subDistributionChannel;
            this.xGatewayExtendInfo = request.xGatewayExtendInfo;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
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
        public GetTicketTemplateRequest build() {
            return new GetTicketTemplateRequest(this);
        } 

    } 

}
