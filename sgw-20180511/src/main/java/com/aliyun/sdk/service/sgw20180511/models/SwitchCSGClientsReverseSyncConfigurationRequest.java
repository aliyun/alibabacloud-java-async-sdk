// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchCSGClientsReverseSyncConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SwitchCSGClientsReverseSyncConfigurationRequest</p>
 */
public class SwitchCSGClientsReverseSyncConfigurationRequest extends Request {
    @Query
    @NameInMap("ClientIds")
    @Validation(required = true)
    private java.util.List < String > clientIds;

    @Query
    @NameInMap("ClientRegionId")
    @Validation(required = true)
    private String clientRegionId;

    @Query
    @NameInMap("IsReverseSync")
    @Validation(required = true)
    private Boolean isReverseSync;

    @Query
    @NameInMap("ReverseSyncInternalSecond")
    private Integer reverseSyncInternalSecond;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SwitchCSGClientsReverseSyncConfigurationRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.clientRegionId = builder.clientRegionId;
        this.isReverseSync = builder.isReverseSync;
        this.reverseSyncInternalSecond = builder.reverseSyncInternalSecond;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchCSGClientsReverseSyncConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIds
     */
    public java.util.List < String > getClientIds() {
        return this.clientIds;
    }

    /**
     * @return clientRegionId
     */
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    /**
     * @return isReverseSync
     */
    public Boolean getIsReverseSync() {
        return this.isReverseSync;
    }

    /**
     * @return reverseSyncInternalSecond
     */
    public Integer getReverseSyncInternalSecond() {
        return this.reverseSyncInternalSecond;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SwitchCSGClientsReverseSyncConfigurationRequest, Builder> {
        private java.util.List < String > clientIds; 
        private String clientRegionId; 
        private Boolean isReverseSync; 
        private Integer reverseSyncInternalSecond; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SwitchCSGClientsReverseSyncConfigurationRequest request) {
            super(request);
            this.clientIds = request.clientIds;
            this.clientRegionId = request.clientRegionId;
            this.isReverseSync = request.isReverseSync;
            this.reverseSyncInternalSecond = request.reverseSyncInternalSecond;
            this.securityToken = request.securityToken;
        } 

        /**
         * ClientIds.
         */
        public Builder clientIds(java.util.List < String > clientIds) {
            String clientIdsShrink = shrink(clientIds, "ClientIds", "simple");
            this.putQueryParameter("ClientIds", clientIdsShrink);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * ClientRegionId.
         */
        public Builder clientRegionId(String clientRegionId) {
            this.putQueryParameter("ClientRegionId", clientRegionId);
            this.clientRegionId = clientRegionId;
            return this;
        }

        /**
         * IsReverseSync.
         */
        public Builder isReverseSync(Boolean isReverseSync) {
            this.putQueryParameter("IsReverseSync", isReverseSync);
            this.isReverseSync = isReverseSync;
            return this;
        }

        /**
         * ReverseSyncInternalSecond.
         */
        public Builder reverseSyncInternalSecond(Integer reverseSyncInternalSecond) {
            this.putQueryParameter("ReverseSyncInternalSecond", reverseSyncInternalSecond);
            this.reverseSyncInternalSecond = reverseSyncInternalSecond;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public SwitchCSGClientsReverseSyncConfigurationRequest build() {
            return new SwitchCSGClientsReverseSyncConfigurationRequest(this);
        } 

    } 

}
