// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorGroupByResourceGroupIdRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupByResourceGroupIdRequest</p>
 */
public class CreateMonitorGroupByResourceGroupIdRequest extends Request {
    @Query
    @NameInMap("ContactGroupList")
    @Validation(required = true)
    private java.util.List < String > contactGroupList;

    @Query
    @NameInMap("EnableInstallAgent")
    private Boolean enableInstallAgent;

    @Query
    @NameInMap("EnableSubscribeEvent")
    private Boolean enableSubscribeEvent;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceGroupName")
    @Validation(required = true)
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
    public java.util.List < String > getContactGroupList() {
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
        private java.util.List < String > contactGroupList; 
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
         * ContactGroupList.
         */
        public Builder contactGroupList(java.util.List < String > contactGroupList) {
            this.putQueryParameter("ContactGroupList", contactGroupList);
            this.contactGroupList = contactGroupList;
            return this;
        }

        /**
         * The name of the resource group.
         * <p>
         * 
         * For information about how to obtain the name of a resource group, see [ListResourceGroups](~~158855~~).
         */
        public Builder enableInstallAgent(Boolean enableInstallAgent) {
            this.putQueryParameter("EnableInstallAgent", enableInstallAgent);
            this.enableInstallAgent = enableInstallAgent;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **CreateMonitorGroupByResourceGroupId**.
         */
        public Builder enableSubscribeEvent(Boolean enableSubscribeEvent) {
            this.putQueryParameter("EnableSubscribeEvent", enableSubscribeEvent);
            this.enableSubscribeEvent = enableSubscribeEvent;
            return this;
        }

        /**
         * The error message.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether the application group automatically subscribes to event notifications. If events whose severity level is critical or warning occur on resources in an application group, CloudMonitor sends alert notifications. Valid values:
         * <p>
         * 
         * *   true: The application group automatically subscribes to event notifications.
         * *   false (default value): The application group does not automatically subscribe to event notifications.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The alert contact group. The alert notifications of the application group are sent to the alert contacts that belong to the specified alert contact groups.
         * <p>
         * 
         * An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~). For information about how to obtain alert contact groups, see [DescribeContactGroupList](~~114922~~).
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
