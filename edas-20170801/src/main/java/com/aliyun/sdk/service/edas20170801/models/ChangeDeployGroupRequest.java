// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ChangeDeployGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeDeployGroupRequest</p>
 */
public class ChangeDeployGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EccInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eccInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStatus")
    private Boolean forceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-4f92-**********</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The Elastic Compute Container (ECC) ID of the ECS instance whose group you want to change. Call the ListApplicationEcc operation to query the ECC ID of an application. For more information, see <a href="https://help.aliyun.com/document_detail/199277.html">ListApplicationEcc</a>.</p>
         * <blockquote>
         * <p>You can change the group for only one ECS instance at a time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0cf49a6c-95a8-4aa8******</p>
         */
        public Builder eccInfo(String eccInfo) {
            this.putQueryParameter("EccInfo", eccInfo);
            this.eccInfo = eccInfo;
            return this;
        }

        /**
         * <p>Specifies whether to force the change when the deployment package version of the ECC is different from the deployment package version of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceStatus(Boolean forceStatus) {
            this.putQueryParameter("ForceStatus", forceStatus);
            this.forceStatus = forceStatus;
            return this;
        }

        /**
         * <p>The name of the application group, such as \<code>group_a\\</code> and \<code>group_b\\</code>. The GroupName for the default group is <code>_DEFAULT_GROUP</code>. The name can be up to 64 characters long.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
