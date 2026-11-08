// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link CreateMonitorGroupByResourceGroupIdRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupByResourceGroupIdRequest</p>
 */
public class CreateMonitorGroupByResourceGroupIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> contactGroupList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableInstallAgent")
    private Boolean enableInstallAgent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSubscribeEvent")
    private Boolean enableSubscribeEvent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupName;

    private CreateMonitorGroupByResourceGroupIdRequest(Builder builder) {
        super(builder);
        this.contactGroupList = builder.contactGroupList;
        this.enableInstallAgent = builder.enableInstallAgent;
        this.enableSubscribeEvent = builder.enableSubscribeEvent;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupByResourceGroupIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupList
     */
    public java.util.List<String> getContactGroupList() {
        return this.contactGroupList;
    }

    /**
     * @return enableInstallAgent
     */
    public Boolean getEnableInstallAgent() {
        return this.enableInstallAgent;
    }

    /**
     * @return enableSubscribeEvent
     */
    public Boolean getEnableSubscribeEvent() {
        return this.enableSubscribeEvent;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<CreateMonitorGroupByResourceGroupIdRequest, Builder> {
        private java.util.List<String> contactGroupList; 
        private Boolean enableInstallAgent; 
        private Boolean enableSubscribeEvent; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorGroupByResourceGroupIdRequest request) {
            super(request);
            this.contactGroupList = request.contactGroupList;
            this.enableInstallAgent = request.enableInstallAgent;
            this.enableSubscribeEvent = request.enableSubscribeEvent;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * <p>The alert contact group. Alert notifications for the application group are sent to the alert contacts in this alert contact group.</p>
         * <p>An alert contact group is a collection of alert contacts and can contain one or more alert contacts. For more information about how to create alert contacts and alert contact groups, see <a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a> and <a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>. For more information about how to obtain alert contact groups, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        public Builder contactGroupList(java.util.List<String> contactGroupList) {
            this.putQueryParameter("ContactGroupList", contactGroupList);
            this.contactGroupList = contactGroupList;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic installation of the CloudMonitor agent for the application group. CloudMonitor automatically installs the CloudMonitor agent on hosts in the application group. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled. Default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInstallAgent(Boolean enableInstallAgent) {
            this.putQueryParameter("EnableInstallAgent", enableInstallAgent);
            this.enableInstallAgent = enableInstallAgent;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic subscription to event notifications for the application group. When critical or warning events occur on resources in the application group, CloudMonitor sends alert notifications. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled. Default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSubscribeEvent(Boolean enableSubscribeEvent) {
            this.putQueryParameter("EnableSubscribeEvent", enableSubscribeEvent);
            this.enableSubscribeEvent = enableSubscribeEvent;
            return this;
        }

        /**
         * <p>The region ID of the resource group.</p>
         * <p>For more information about how to obtain the region ID of a resource group, see <a href="https://help.aliyun.com/document_detail/158866.html">GetResourceGroup</a>.</p>
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
         * <p>The ID of the resource group.</p>
         * <p>For more information about how to obtain the resource group ID, see <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw3ty5y7****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <p>For more information about how to obtain the resource group name, see <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudMonitor</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public CreateMonitorGroupByResourceGroupIdRequest build() {
            return new CreateMonitorGroupByResourceGroupIdRequest(this);
        } 

    } 

}
