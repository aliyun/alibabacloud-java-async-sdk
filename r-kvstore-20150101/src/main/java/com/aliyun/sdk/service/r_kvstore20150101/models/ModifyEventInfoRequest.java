// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
         * <p>The JSON-formatted parameters related to the action. Set this parameter to <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code> if the <strong>TaskAction</strong> parameter is set to <strong>modifySwitchTime</strong>.</p>
         * <ul>
         * <li><p><strong>recoverMode</strong>: specifies the restoration mode for the task. Valid values:</p>
         * <ul>
         * <li><strong>timePoint</strong>: performs the task at the specified point in time.</li>
         * <li><strong>immediate</strong>: performs the task immediately.</li>
         * <li><strong>maintainTime</strong>: performs the task within the maintenance window.</li>
         * </ul>
         * </li>
         * <li><p><strong>recoverTime</strong>: specifies the point in time for restoration. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. This parameter is required if the <strong>recoverMode</strong> parameter is set to <strong>timePoint</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;recoverTime&quot;:&quot;2023-04-17T14:02:35Z&quot;,&quot;recoverMode&quot;:&quot;timePoint&quot;}</p>
         */
        public Builder actionParams(String actionParams) {
            this.putQueryParameter("ActionParams", actionParams);
            this.actionParams = actionParams;
            return this;
        }

        /**
         * <p>The event handling action. Valid values:</p>
         * <ul>
         * <li><strong>archive</strong></li>
         * <li><strong>undo</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>archive</p>
         */
        public Builder eventAction(String eventAction) {
            this.putQueryParameter("EventAction", eventAction);
            this.eventAction = eventAction;
            return this;
        }

        /**
         * <p>The event IDs. Separate multiple event IDs with commas (,). You can specify up to 20 event IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5422964</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
