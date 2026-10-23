// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link CheckRoleRequest} extends {@link RequestModel}
 *
 * <p>CheckRoleRequest</p>
 */
public class CheckRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckRoleType")
    private String checkRoleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    private CheckRoleRequest(Builder builder) {
        super(builder);
        this.checkRoleType = builder.checkRoleType;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountUserId = builder.crossAccountUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkRoleType
     */
    public String getCheckRoleType() {
        return this.checkRoleType;
    }

    /**
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public static final class Builder extends Request.Builder<CheckRoleRequest, Builder> {
        private String checkRoleType; 
        private String crossAccountRoleName; 
        private Long crossAccountUserId; 

        private Builder() {
            super();
        } 

        private Builder(CheckRoleRequest request) {
            super(request);
            this.checkRoleType = request.checkRoleType;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountUserId = request.crossAccountUserId;
        } 

        /**
         * <p>The role type. Valid values:</p>
         * <ul>
         * <li>EcsRole: access permissions for ECS resources</li>
         * <li>CsgRole: permissions to back up Cloud Storage Gateway resources</li>
         * <li>NasRole: permissions to back up NAS resources</li>
         * <li>OssRole: permissions to back up OSS resources</li>
         * <li>UdmRole: permissions to back up entire ECS instances</li>
         * <li>VMwareLocalRole: permissions to back up on-premises VMware virtual machines</li>
         * <li>VMwareCloudRole: permissions to back up cloud-based VMware virtual machines</li>
         * <li>EcsBackupRole: permissions for ECS backup</li>
         * <li>OtsRole: permissions to back up OTS resources</li>
         * <li>CrossAccountRole: permissions for cross-account backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OssRole</p>
         */
        public Builder checkRoleType(String checkRoleType) {
            this.putQueryParameter("CheckRoleType", checkRoleType);
            this.checkRoleType = checkRoleType;
            return this;
        }

        /**
         * <p>The name of the RAM role created in the source account for cross-account backup managed by the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupRole</p>
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * <p>The ID of the source account for cross-account backup managed by the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>158975xxxxx4625</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        @Override
        public CheckRoleRequest build() {
            return new CheckRoleRequest(this);
        } 

    } 

}
