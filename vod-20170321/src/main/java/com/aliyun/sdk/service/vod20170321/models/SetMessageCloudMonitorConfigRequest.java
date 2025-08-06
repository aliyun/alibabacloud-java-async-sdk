// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SetMessageCloudMonitorConfigRequest} extends {@link RequestModel}
 *
 * <p>SetMessageCloudMonitorConfigRequest</p>
 */
public class SetMessageCloudMonitorConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypeList")
    private String eventTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    private SetMessageCloudMonitorConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eventTypeList = builder.eventTypeList;
        this.groupId = builder.groupId;
        this.ownerAccount = builder.ownerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMessageCloudMonitorConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return eventTypeList
     */
    public String getEventTypeList() {
        return this.eventTypeList;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public static final class Builder extends Request.Builder<SetMessageCloudMonitorConfigRequest, Builder> {
        private String appId; 
        private String eventTypeList; 
        private Long groupId; 
        private String ownerAccount; 

        private Builder() {
            super();
        } 

        private Builder(SetMessageCloudMonitorConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.eventTypeList = request.eventTypeList;
            this.groupId = request.groupId;
            this.ownerAccount = request.ownerAccount;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EventTypeList.
         */
        public Builder eventTypeList(String eventTypeList) {
            this.putQueryParameter("EventTypeList", eventTypeList);
            this.eventTypeList = eventTypeList;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        @Override
        public SetMessageCloudMonitorConfigRequest build() {
            return new SetMessageCloudMonitorConfigRequest(this);
        } 

    } 

}
