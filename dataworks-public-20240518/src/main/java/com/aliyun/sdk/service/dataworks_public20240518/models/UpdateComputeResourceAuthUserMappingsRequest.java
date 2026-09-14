// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateComputeResourceAuthUserMappingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateComputeResourceAuthUserMappingsRequest</p>
 */
public class UpdateComputeResourceAuthUserMappingsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComputeResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long computeResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveUserIds")
    private java.util.List<String> removeUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Upserts")
    private java.util.List<Upserts> upserts;

    private UpdateComputeResourceAuthUserMappingsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.computeResourceId = builder.computeResourceId;
        this.projectId = builder.projectId;
        this.removeUserIds = builder.removeUserIds;
        this.upserts = builder.upserts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComputeResourceAuthUserMappingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return computeResourceId
     */
    public Long getComputeResourceId() {
        return this.computeResourceId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return removeUserIds
     */
    public java.util.List<String> getRemoveUserIds() {
        return this.removeUserIds;
    }

    /**
     * @return upserts
     */
    public java.util.List<Upserts> getUpserts() {
        return this.upserts;
    }

    public static final class Builder extends Request.Builder<UpdateComputeResourceAuthUserMappingsRequest, Builder> {
        private String regionId; 
        private Long computeResourceId; 
        private Long projectId; 
        private java.util.List<String> removeUserIds; 
        private java.util.List<Upserts> upserts; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComputeResourceAuthUserMappingsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.computeResourceId = request.computeResourceId;
            this.projectId = request.projectId;
            this.removeUserIds = request.removeUserIds;
            this.upserts = request.upserts;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The compute resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123455</p>
         */
        public Builder computeResourceId(Long computeResourceId) {
            this.putBodyParameter("ComputeResourceId", computeResourceId);
            this.computeResourceId = computeResourceId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The list of user mappings to remove.</p>
         */
        public Builder removeUserIds(java.util.List<String> removeUserIds) {
            String removeUserIdsShrink = shrink(removeUserIds, "RemoveUserIds", "json");
            this.putBodyParameter("RemoveUserIds", removeUserIdsShrink);
            this.removeUserIds = removeUserIds;
            return this;
        }

        /**
         * <p>The list of objects to update.</p>
         */
        public Builder upserts(java.util.List<Upserts> upserts) {
            String upsertsShrink = shrink(upserts, "Upserts", "json");
            this.putBodyParameter("Upserts", upsertsShrink);
            this.upserts = upserts;
            return this;
        }

        @Override
        public UpdateComputeResourceAuthUserMappingsRequest build() {
            return new UpdateComputeResourceAuthUserMappingsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateComputeResourceAuthUserMappingsRequest} extends {@link TeaModel}
     *
     * <p>UpdateComputeResourceAuthUserMappingsRequest</p>
     */
    public static class Upserts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Upserts(Builder builder) {
            this.password = builder.password;
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Upserts create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String password; 
            private String userId; 
            private String username; 

            private Builder() {
            } 

            private Builder(Upserts model) {
                this.password = model.password;
                this.userId = model.userId;
                this.username = model.username;
            } 

            /**
             * <p>The password of the target system for the mapping, such as an LDAP password.</p>
             * 
             * <strong>example:</strong>
             * <p>123xx</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID.</p>
             * 
             * <strong>example:</strong>
             * <p>12747300953xxx62</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username of the target system for the mapping, such as an LDAP username.</p>
             * 
             * <strong>example:</strong>
             * <p>lisa</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Upserts build() {
                return new Upserts(this);
            } 

        } 

    }
}
