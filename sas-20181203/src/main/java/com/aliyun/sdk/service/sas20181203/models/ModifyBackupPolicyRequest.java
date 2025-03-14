// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyRegionId")
    private String policyRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    private String policyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> uuidList;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.policy = builder.policy;
        this.policyRegionId = builder.policyRegionId;
        this.policyVersion = builder.policyVersion;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policy
     */
    public java.util.Map<String, ?> getPolicy() {
        return this.policy;
    }

    /**
     * @return policyRegionId
     */
    public String getPolicyRegionId() {
        return this.policyRegionId;
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private Long id; 
        private String name; 
        private java.util.Map<String, ?> policy; 
        private String policyRegionId; 
        private String policyVersion; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
            this.policy = request.policy;
            this.policyRegionId = request.policyRegionId;
            this.policyVersion = request.policyVersion;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The ID of the anti-ransomware policy that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the anti-ransomware policy that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy_name_A</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The configurations of the anti-ransomware policy that you want to modify. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Source</strong>: the directory that you want to protect. If you want to protect all directories, set this field to brackets [].</p>
         * </li>
         * <li><p><strong>Include</strong>: the format of the file that you want to protect. Examples: *.jpg and *.doc.</p>
         * </li>
         * <li><p><strong>Exclude</strong>: the directory that you want to exclude from the anti-ransomware policy. You can call the DescribeExcludeSystemPath operation to query all directories and then specify the directory that you want to exclude. Example: /home/user.</p>
         * </li>
         * <li><p><strong>Schedule</strong>: the start time and interval of a data backup task. We recommend that you specify a start time that begins during off-peak hours but does not start on the hour.</p>
         * <ul>
         * <li>If you set this field to I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is executed at an interval of three weeks.</li>
         * <li>If you set this field to I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is executed at an interval of 24 hours.</li>
         * </ul>
         * </li>
         * <li><p><strong>Retention</strong>: the period during which backup data is retained. Unit: day. If you set this field to 7, backup data is retained for a week. If you set this field to 365, backup data is retained for a year. If you set this field to -1, backup data is permanently retained.</p>
         * </li>
         * <li><p><strong>SpeedLimiter</strong>: the limit on the network bandwidth for data backup tasks. If you set this field to 12:15:15360|6:12:5120, the maximum bandwidth for a data backup task is 15 Mbit/s from 12:00 to 15:00 and 5 Mbit/s from 06:00 to 12:00.</p>
         * </li>
         * </ul>
         * <p>If you back up data on an Elastic Compute Service (ECS) instance that is connected over an internal network, we recommend that you leave this field empty. If this field is left empty, the bandwidth for data backup tasks is unlimited.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Source&quot;:[&quot;home&quot;,&quot;admin&quot;]}</p>
         */
        public Builder policy(java.util.Map<String, ?> policy) {
            String policyShrink = shrink(policy, "Policy", "json");
            this.putQueryParameter("Policy", policyShrink);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The region ID of the server to which the anti-ransomware policy is applied.</p>
         * <p>You can call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the regions in which the anti-ransomware feature is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder policyRegionId(String policyRegionId) {
            this.putQueryParameter("PolicyRegionId", policyRegionId);
            this.policyRegionId = policyRegionId;
            return this;
        }

        /**
         * <p>The version of the anti-ransomware policy. You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the versions of anti-ransomware policies.</p>
         * <ul>
         * <li><strong>1.0.0</strong></li>
         * <li><strong>2.0.0</strong></li>
         * </ul>
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
         * <p>The UUIDs of the servers to which the anti-ransomware policy is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;, &quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

}
