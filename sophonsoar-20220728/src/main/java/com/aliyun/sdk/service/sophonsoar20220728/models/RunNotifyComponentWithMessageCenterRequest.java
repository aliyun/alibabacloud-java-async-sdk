// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link RunNotifyComponentWithMessageCenterRequest} extends {@link RequestModel}
 *
 * <p>RunNotifyComponentWithMessageCenterRequest</p>
 */
public class RunNotifyComponentWithMessageCenterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Aliuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetId")
    private Integer assetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelTypeList")
    private java.util.List<String> channelTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    private RunNotifyComponentWithMessageCenterRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.aliuid = builder.aliuid;
        this.assetId = builder.assetId;
        this.channelTypeList = builder.channelTypeList;
        this.componentName = builder.componentName;
        this.eventId = builder.eventId;
        this.lang = builder.lang;
        this.nodeName = builder.nodeName;
        this.params = builder.params;
        this.playbookUuid = builder.playbookUuid;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunNotifyComponentWithMessageCenterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * @return aliuid
     */
    public String getAliuid() {
        return this.aliuid;
    }

    /**
     * @return assetId
     */
    public Integer getAssetId() {
        return this.assetId;
    }

    /**
     * @return channelTypeList
     */
    public java.util.List<String> getChannelTypeList() {
        return this.channelTypeList;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<RunNotifyComponentWithMessageCenterRequest, Builder> {
        private String actionName; 
        private String aliuid; 
        private Integer assetId; 
        private java.util.List<String> channelTypeList; 
        private String componentName; 
        private String eventId; 
        private String lang; 
        private String nodeName; 
        private String params; 
        private String playbookUuid; 
        private Long roleFor; 
        private String roleType; 

        private Builder() {
            super();
        } 

        private Builder(RunNotifyComponentWithMessageCenterRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.aliuid = request.aliuid;
            this.assetId = request.assetId;
            this.channelTypeList = request.channelTypeList;
            this.componentName = request.componentName;
            this.eventId = request.eventId;
            this.lang = request.lang;
            this.nodeName = request.nodeName;
            this.params = request.params;
            this.playbookUuid = request.playbookUuid;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notifyByMessageCenter</p>
         */
        public Builder actionName(String actionName) {
            this.putQueryParameter("ActionName", actionName);
            this.actionName = actionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>146789xxxx733152</p>
         */
        public Builder aliuid(String aliuid) {
            this.putQueryParameter("Aliuid", aliuid);
            this.aliuid = aliuid;
            return this;
        }

        /**
         * AssetId.
         */
        public Builder assetId(Integer assetId) {
            this.putQueryParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * ChannelTypeList.
         */
        public Builder channelTypeList(java.util.List<String> channelTypeList) {
            this.putQueryParameter("ChannelTypeList", channelTypeList);
            this.channelTypeList = channelTypeList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NotifyMessage</p>
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun_soar_incident_generate</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notify_message</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c88b5e-97ca-435d-8c20-xxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putQueryParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public RunNotifyComponentWithMessageCenterRequest build() {
            return new RunNotifyComponentWithMessageCenterRequest(this);
        } 

    } 

}
