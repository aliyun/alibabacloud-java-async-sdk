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
 * {@link InstallBackupClientsRequest} extends {@link RequestModel}
 *
 * <p>InstallBackupClientsRequest</p>
 */
public class InstallBackupClientsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> instanceIds;

    private InstallBackupClientsRequest(Builder builder) {
        super(builder);
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallBackupClientsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    /**
     * @return instanceIds
     */
    public java.util.Map<String, ?> getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<InstallBackupClientsRequest, Builder> {
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private java.util.Map<String, ?> instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(InstallBackupClientsRequest request) {
            super(request);
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * <p>The name of the RAM role that is created in the source account for cross-account backup.</p>
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
         * <p>The type of cross-account backup. Valid values:</p>
         * <ul>
         * <li><p>SELF_ACCOUNT: Backs up data within the current account.</p>
         * </li>
         * <li><p>CROSS_ACCOUNT: Backs up data across accounts.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * <p>The ID of the source account that is used for cross-account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>16392782xxxxxx</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * <p>The IDs of the ECS instances. You can specify a maximum of 20 instance IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-0xi5wj5*****v3j3bh2gj5&quot;]</p>
         */
        public Builder instanceIds(java.util.Map<String, ?> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public InstallBackupClientsRequest build() {
            return new InstallBackupClientsRequest(this);
        } 

    } 

}
