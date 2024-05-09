// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TicketChangingCancelRequest} extends {@link RequestModel}
 *
 * <p>TicketChangingCancelRequest</p>
 */
public class TicketChangingCancelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    private String disOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dis_sub_order_id")
    private String disSubOrderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TicketChangingCancelRequest(Builder builder) {
        super(builder);
        this.disOrderId = builder.disOrderId;
        this.disSubOrderId = builder.disSubOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketChangingCancelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return disSubOrderId
     */
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TicketChangingCancelRequest, Builder> {
        private String disOrderId; 
        private String disSubOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TicketChangingCancelRequest request) {
            super(request);
            this.disOrderId = request.disOrderId;
            this.disSubOrderId = request.disSubOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * dis_order_id.
         */
        public Builder disOrderId(String disOrderId) {
            this.putQueryParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * dis_sub_order_id.
         */
        public Builder disSubOrderId(String disSubOrderId) {
            this.putQueryParameter("dis_sub_order_id", disSubOrderId);
            this.disSubOrderId = disSubOrderId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TicketChangingCancelRequest build() {
            return new TicketChangingCancelRequest(this);
        } 

    } 

}
