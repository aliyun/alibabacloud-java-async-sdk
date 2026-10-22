// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link DetachProjectsFromProjectAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>DetachProjectsFromProjectAuthorizationRequest</p>
 */
public class DetachProjectsFromProjectAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authorizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DetachProjectsFromProjectAuthorizationRequest(Builder builder) {
        super(builder);
        this.authorizationId = builder.authorizationId;
        this.instanceId = builder.instanceId;
        this.projectIds = builder.projectIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachProjectsFromProjectAuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationId
     */
    public Long getAuthorizationId() {
        return this.authorizationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectIds
     */
    public String getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachProjectsFromProjectAuthorizationRequest, Builder> {
        private Long authorizationId; 
        private String instanceId; 
        private String projectIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachProjectsFromProjectAuthorizationRequest request) {
            super(request);
            this.authorizationId = request.authorizationId;
            this.instanceId = request.instanceId;
            this.projectIds = request.projectIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The project authorization ID.</p>
         * <blockquote>
         * <p>You can call the ListProjectAuthorizations operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authorizationId(Long authorizationId) {
            this.putQueryParameter("AuthorizationId", authorizationId);
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * <p>The ID of the bastion host instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The array of project IDs to remove from the project authorization.</p>
         * <blockquote>
         * <p>You can call the GetProjectAuthorization operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        public Builder projectIds(String projectIds) {
            this.putQueryParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        /**
         * <p>The region ID of the bastion host. </p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DetachProjectsFromProjectAuthorizationRequest build() {
            return new DetachProjectsFromProjectAuthorizationRequest(this);
        } 

    } 

}
