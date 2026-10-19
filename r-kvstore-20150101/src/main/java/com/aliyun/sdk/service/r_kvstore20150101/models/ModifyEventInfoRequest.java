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
         * <p>The parameters related to the action in JSON format.
         * When <strong>TaskAction</strong> is set to <strong>modifySwitchTime</strong>, set this parameter to <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code>.</p>
         * <ul>
         * <li><strong>recoverMode</strong>: the task recovery mode. Valid values:<ul>
         * <li><strong>imePoint</strong>: executes the task at a specified point in time.</li>
         * <li><strong>immediate</strong>: executes the task immediately.</li>
         * <li><strong>maintainTime</strong>: executes the task during the O&amp;M window.</li>
         * </ul>
         * </li>
         * <li><strong>recoverTime</strong>: the specified point in time in UTC. The format is yyyy-MM-ddTHH:mm:ssZ. This parameter is required when <strong>recoverMode</strong> is set to <strong>timePoint</strong>.</li>
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
         * <p>The action to process the event. Valid values:</p>
         * <ul>
         * <li><strong>archive</strong>: Archives the event.</li>
         * <li><strong>undo</strong>: Does not process the event.</li>
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
         * <p>The event IDs. Separate multiple IDs with commas. A maximum of 20 IDs are supported.</p>
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
