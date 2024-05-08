// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainWebSocketStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDomainWebSocketStatusRequest</p>
 */
public class SetDomainWebSocketStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WSSEnable")
    private String WSSEnable;

    private SetDomainWebSocketStatusRequest(Builder builder) {
        super(builder);
        this.actionValue = builder.actionValue;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.WSSEnable = builder.WSSEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainWebSocketStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionValue
     */
    public String getActionValue() {
        return this.actionValue;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return WSSEnable
     */
    public String getWSSEnable() {
        return this.WSSEnable;
    }

    public static final class Builder extends Request.Builder<SetDomainWebSocketStatusRequest, Builder> {
        private String actionValue; 
        private String domainName; 
        private String groupId; 
        private String securityToken; 
        private String WSSEnable; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainWebSocketStatusRequest request) {
            super(request);
            this.actionValue = request.actionValue;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.WSSEnable = request.WSSEnable;
        } 

        /**
         * The action.
         */
        public Builder actionValue(String actionValue) {
            this.putQueryParameter("ActionValue", actionValue);
            this.actionValue = actionValue;
            return this;
        }

        /**
         * The custom domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of the API group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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

        /**
         * WSSEnable.
         */
        public Builder WSSEnable(String WSSEnable) {
            this.putQueryParameter("WSSEnable", WSSEnable);
            this.WSSEnable = WSSEnable;
            return this;
        }

        @Override
        public SetDomainWebSocketStatusRequest build() {
            return new SetDomainWebSocketStatusRequest(this);
        } 

    } 

}
