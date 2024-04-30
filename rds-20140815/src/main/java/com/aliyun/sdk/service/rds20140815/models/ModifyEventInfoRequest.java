// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyEventInfoRequest</p>
 */
public class ModifyEventInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionParams")
    private String actionParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventAction")
    private String eventAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private ModifyEventInfoRequest(Builder builder) {
        super(builder);
        this.actionParams = builder.actionParams;
        this.eventAction = builder.eventAction;
        this.eventId = builder.eventId;
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionParams
     */
    public String getActionParams() {
        return this.actionParams;
    }

    /**
     * @return eventAction
     */
    public String getEventAction() {
        return this.eventAction;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyEventInfoRequest, Builder> {
        private String actionParams; 
        private String eventAction; 
        private String eventId; 
        private String regionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEventInfoRequest request) {
            super(request);
            this.actionParams = request.actionParams;
            this.eventAction = request.eventAction;
            this.eventId = request.eventId;
            this.regionId = request.regionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The action parameter. Set this value in the JSON string format.
         */
        public Builder actionParams(String actionParams) {
            this.putQueryParameter("ActionParams", actionParams);
            this.actionParams = actionParams;
            return this;
        }

        /**
         * The event handling action. Set this value to archive or undo.
         */
        public Builder eventAction(String eventAction) {
            this.putQueryParameter("EventAction", eventAction);
            this.eventAction = eventAction;
            return this;
        }

        /**
         * The event ID. Separate multiple event IDs with commas (,). You can configure up to 20 event IDs.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ModifyEventInfoRequest build() {
            return new ModifyEventInfoRequest(this);
        } 

    } 

}
