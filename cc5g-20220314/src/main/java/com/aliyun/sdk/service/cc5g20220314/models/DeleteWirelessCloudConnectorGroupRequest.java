// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWirelessCloudConnectorGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteWirelessCloudConnectorGroupRequest</p>
 */
public class DeleteWirelessCloudConnectorGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorGroupId;

    private DeleteWirelessCloudConnectorGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.wirelessCloudConnectorGroupId = builder.wirelessCloudConnectorGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWirelessCloudConnectorGroupRequest create() {
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
     * @return wirelessCloudConnectorGroupId
     */
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteWirelessCloudConnectorGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String wirelessCloudConnectorGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWirelessCloudConnectorGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.wirelessCloudConnectorGroupId = request.wirelessCloudConnectorGroupId;
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
         * WirelessCloudConnectorGroupId.
         */
        public Builder wirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
            this.putQueryParameter("WirelessCloudConnectorGroupId", wirelessCloudConnectorGroupId);
            this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
            return this;
        }

        @Override
        public DeleteWirelessCloudConnectorGroupRequest build() {
            return new DeleteWirelessCloudConnectorGroupRequest(this);
        } 

    } 

}
