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
 * {@link SuggestCategoryRequest} extends {@link RequestModel}
 *
 * <p>SuggestCategoryRequest</p>
 */
public class SuggestCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cna")
    private String cna;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

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
    @com.aliyun.core.annotation.NameInMap("TicketId")
    private String ticketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopN")
    private Integer topN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseHotSuggestCatchAll")
    private Boolean useHotSuggestCatchAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XGatewayExtendInfo")
    private String xGatewayExtendInfo;

    private SuggestCategoryRequest(Builder builder) {
        super(builder);
        this.cna = builder.cna;
        this.content = builder.content;
        this.distributionChannel = builder.distributionChannel;
        this.referrer = builder.referrer;
        this.subDistributionChannel = builder.subDistributionChannel;
        this.ticketId = builder.ticketId;
        this.topN = builder.topN;
        this.useHotSuggestCatchAll = builder.useHotSuggestCatchAll;
        this.xGatewayExtendInfo = builder.xGatewayExtendInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuggestCategoryRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
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
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return topN
     */
    public Integer getTopN() {
        return this.topN;
    }

    /**
     * @return useHotSuggestCatchAll
     */
    public Boolean getUseHotSuggestCatchAll() {
        return this.useHotSuggestCatchAll;
    }

    /**
     * @return xGatewayExtendInfo
     */
    public String getXGatewayExtendInfo() {
        return this.xGatewayExtendInfo;
    }

    public static final class Builder extends Request.Builder<SuggestCategoryRequest, Builder> {
        private String cna; 
        private String content; 
        private String distributionChannel; 
        private String referrer; 
        private String subDistributionChannel; 
        private String ticketId; 
        private Integer topN; 
        private Boolean useHotSuggestCatchAll; 
        private String xGatewayExtendInfo; 

        private Builder() {
            super();
        } 

        private Builder(SuggestCategoryRequest request) {
            super(request);
            this.cna = request.cna;
            this.content = request.content;
            this.distributionChannel = request.distributionChannel;
            this.referrer = request.referrer;
            this.subDistributionChannel = request.subDistributionChannel;
            this.ticketId = request.ticketId;
            this.topN = request.topN;
            this.useHotSuggestCatchAll = request.useHotSuggestCatchAll;
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
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
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
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        /**
         * TopN.
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        /**
         * UseHotSuggestCatchAll.
         */
        public Builder useHotSuggestCatchAll(Boolean useHotSuggestCatchAll) {
            this.putQueryParameter("UseHotSuggestCatchAll", useHotSuggestCatchAll);
            this.useHotSuggestCatchAll = useHotSuggestCatchAll;
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
        public SuggestCategoryRequest build() {
            return new SuggestCategoryRequest(this);
        } 

    } 

}
