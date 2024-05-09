// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOtaItemDetailRequest} extends {@link RequestModel}
 *
 * <p>FlightOtaItemDetailRequest</p>
 */
public class FlightOtaItemDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightOtaItemDetailRequest(Builder builder) {
        super(builder);
        this.isvName = builder.isvName;
        this.otaItemId = builder.otaItemId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightOtaItemDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return otaItemId
     */
    public String getOtaItemId() {
        return this.otaItemId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightOtaItemDetailRequest, Builder> {
        private String isvName; 
        private String otaItemId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightOtaItemDetailRequest request) {
            super(request);
            this.isvName = request.isvName;
            this.otaItemId = request.otaItemId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * ota_item_id.
         */
        public Builder otaItemId(String otaItemId) {
            this.putQueryParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
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
        public FlightOtaItemDetailRequest build() {
            return new FlightOtaItemDetailRequest(this);
        } 

    } 

}
