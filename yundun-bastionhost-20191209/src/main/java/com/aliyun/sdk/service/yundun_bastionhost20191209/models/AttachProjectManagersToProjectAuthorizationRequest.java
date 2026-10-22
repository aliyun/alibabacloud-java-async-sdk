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
 * {@link AttachProjectManagersToProjectAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>AttachProjectManagersToProjectAuthorizationRequest</p>
 */
public class AttachProjectManagersToProjectAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authorizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Principals")
    private java.util.List<Principals> principals;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AttachProjectManagersToProjectAuthorizationRequest(Builder builder) {
        super(builder);
        this.authorizationId = builder.authorizationId;
        this.instanceId = builder.instanceId;
        this.principals = builder.principals;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachProjectManagersToProjectAuthorizationRequest create() {
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
     * @return principals
     */
    public java.util.List<Principals> getPrincipals() {
        return this.principals;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AttachProjectManagersToProjectAuthorizationRequest, Builder> {
        private Long authorizationId; 
        private String instanceId; 
        private java.util.List<Principals> principals; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachProjectManagersToProjectAuthorizationRequest request) {
            super(request);
            this.authorizationId = request.authorizationId;
            this.instanceId = request.instanceId;
            this.principals = request.principals;
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
         * <p>2</p>
         */
        public Builder authorizationId(Long authorizationId) {
            this.putQueryParameter("AuthorizationId", authorizationId);
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * <p>The instance ID of the bastion host.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
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
         * <p>The information about the project administrators specified in the project authorization.</p>
         */
        public Builder principals(java.util.List<Principals> principals) {
            this.putQueryParameter("Principals", principals);
            this.principals = principals;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
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
        public AttachProjectManagersToProjectAuthorizationRequest build() {
            return new AttachProjectManagersToProjectAuthorizationRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachProjectManagersToProjectAuthorizationRequest} extends {@link TeaModel}
     *
     * <p>AttachProjectManagersToProjectAuthorizationRequest</p>
     */
    public static class Principals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private Principals(Builder builder) {
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Principals create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalId; 
            private String principalName; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(Principals model) {
                this.principalId = model.principalId;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
            } 

            /**
             * <p>When PrincipalType is set to RamUser, specify the ID of the RAM user to be designated as the project administrator. When PrincipalType is set to RamRole, specify the ARN of the RAM role to be designated as the project administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>160****2519</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The display name of the RAM user or RAM role designated as the project administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The type of the project administrator. Valid values:</p>
             * <ul>
             * <li><p><strong>RamUser</strong>: Resource Access Management (RAM) user.</p>
             * </li>
             * <li><p><strong>RamRole</strong>: RAM role.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamUser</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Principals build() {
                return new Principals(this);
            } 

        } 

    }
}
