// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeDeployGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeDeployGroupRequest</p>
 */
public class ChangeDeployGroupRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EccInfo")
    @Validation(required = true)
    private String eccInfo;

    @Query
    @NameInMap("ForceStatus")
    private Boolean forceStatus;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    private ChangeDeployGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eccInfo = builder.eccInfo;
        this.forceStatus = builder.forceStatus;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeDeployGroupRequest create() {
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
     * @return eccInfo
     */
    public String getEccInfo() {
        return this.eccInfo;
    }

    /**
     * @return forceStatus
     */
    public Boolean getForceStatus() {
        return this.forceStatus;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<ChangeDeployGroupRequest, Builder> {
        private String appId; 
        private String eccInfo; 
        private Boolean forceStatus; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(ChangeDeployGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.eccInfo = request.eccInfo;
            this.forceStatus = request.forceStatus;
            this.groupName = request.groupName;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the elastic compute component (ECC) that corresponds to the ECS instance for which you want to change the application instance group. You can call the ListApplicationEcc operation to query the ECC ID. For more information, see [ListApplicationEcc](~~199277~~).
         * <p>
         * 
         * > You can change the application instance group for only one ECS instance at a time.
         */
        public Builder eccInfo(String eccInfo) {
            this.putQueryParameter("EccInfo", eccInfo);
            this.eccInfo = eccInfo;
            return this;
        }

        /**
         * Specifies whether to forcibly change the application instance group if the deployment package version of the ECC is different from that of the application instance group.
         */
        public Builder forceStatus(Boolean forceStatus) {
            this.putQueryParameter("ForceStatus", forceStatus);
            this.forceStatus = forceStatus;
            return this;
        }

        /**
         * The name of the application instance group. Examples: group_a and group_b. The parameter value for the default application instance group is `_DEFAULT_GROUP`. The name can be up to 64 characters in length.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public ChangeDeployGroupRequest build() {
            return new ChangeDeployGroupRequest(this);
        } 

    } 

}
