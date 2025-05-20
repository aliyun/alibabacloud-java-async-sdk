// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link CheckServiceLinkedRoleEfloCnpForDeletingRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceLinkedRoleEfloCnpForDeletingRequest</p>
 */
public class CheckServiceLinkedRoleEfloCnpForDeletingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionTaskId")
    private String deletionTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SPIRegionId")
    private String SPIRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    private CheckServiceLinkedRoleEfloCnpForDeletingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountId = builder.accountId;
        this.deletionTaskId = builder.deletionTaskId;
        this.roleArn = builder.roleArn;
        this.SPIRegionId = builder.SPIRegionId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleEfloCnpForDeletingRequest create() {
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
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return deletionTaskId
     */
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return SPIRegionId
     */
    public String getSPIRegionId() {
        return this.SPIRegionId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<CheckServiceLinkedRoleEfloCnpForDeletingRequest, Builder> {
        private String regionId; 
        private String accountId; 
        private String deletionTaskId; 
        private String roleArn; 
        private String SPIRegionId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CheckServiceLinkedRoleEfloCnpForDeletingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountId = request.accountId;
            this.deletionTaskId = request.deletionTaskId;
            this.roleArn = request.roleArn;
            this.SPIRegionId = request.SPIRegionId;
            this.serviceName = request.serviceName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>345678901234</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The ID of the deletion task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-003</p>
         */
        public Builder deletionTaskId(String deletionTaskId) {
            this.putQueryParameter("DeletionTaskId", deletionTaskId);
            this.deletionTaskId = deletionTaskId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         * <p>The trusted entity of the RAM role is an Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/93691.html">Create a RAM role for a trusted Alibaba Cloud account</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</p>
         * <p>Format: <code>acs:ram::&lt;account_id&gt;:role/&lt;role_name&gt;</code>.</p>
         * <p>You can view the ARN in the RAM console or by calling operations. The following items describe the validity periods of storage addresses:</p>
         * <ul>
         * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/39744.html">How do I find the ARN of the RAM role?</a></li>
         * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> or <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>arn:aws:iam::345678901234:role/eflo-cnp-role</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder SPIRegionId(String SPIRegionId) {
            this.putQueryParameter("SPIRegionId", SPIRegionId);
            this.SPIRegionId = SPIRegionId;
            return this;
        }

        /**
         * <p>The Service Name.</p>
         * 
         * <strong>example:</strong>
         * <p>eflo-cnp</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public CheckServiceLinkedRoleEfloCnpForDeletingRequest build() {
            return new CheckServiceLinkedRoleEfloCnpForDeletingRequest(this);
        } 

    } 

}
