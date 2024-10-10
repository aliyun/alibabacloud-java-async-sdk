// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteBackupPolicyMachineRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPolicyMachineRequest</p>
 */
public class DeleteBackupPolicyMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List < String > uuidList;

    private DeleteBackupPolicyMachineRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyVersion = builder.policyVersion;
        this.uuid = builder.uuid;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupPolicyMachineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<DeleteBackupPolicyMachineRequest, Builder> {
        private Long policyId; 
        private String policyVersion; 
        private String uuid; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupPolicyMachineRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.policyVersion = request.policyVersion;
            this.uuid = request.uuid;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the IDs of anti-ransomware policies.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The version of the anti-ransomware policy. Valid values:</p>
         * <ul>
         * <li><strong>1.0.0</strong></li>
         * <li><strong>2.0.0</strong></li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the versions of anti-ransomware policies.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * <p>The UUID of the server to which the anti-ransomware policy is applied.</p>
         * <blockquote>
         * <p>You must specify at least one of the <code>UuidList</code> and <code>Uuid</code> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>083036e9-8411-4a9d-83af-9acbd****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The UUIDs of the servers to which the anti-ransomware policy is applied.</p>
         * <blockquote>
         * <p>You must specify at least one of the <code>UuidList</code> and <code>Uuid</code> parameters.</p>
         * </blockquote>
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public DeleteBackupPolicyMachineRequest build() {
            return new DeleteBackupPolicyMachineRequest(this);
        } 

    } 

}
