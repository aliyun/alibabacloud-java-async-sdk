// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchWirelessCloudConnectorToBusinessRequest} extends {@link RequestModel}
 *
 * <p>SwitchWirelessCloudConnectorToBusinessRequest</p>
 */
public class SwitchWirelessCloudConnectorToBusinessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorId;

    private SwitchWirelessCloudConnectorToBusinessRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchWirelessCloudConnectorToBusinessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<SwitchWirelessCloudConnectorToBusinessRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchWirelessCloudConnectorToBusinessRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public SwitchWirelessCloudConnectorToBusinessRequest build() {
            return new SwitchWirelessCloudConnectorToBusinessRequest(this);
        } 

    } 

}
