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
    @com.aliyun.core.annotation.NameInMap("SelectType")
    private String selectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerType")
    private String serverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.policy = builder.policy;
        this.policyRegionId = builder.policyRegionId;
        this.policyVersion = builder.policyVersion;
        this.selectType = builder.selectType;
        this.serverType = builder.serverType;
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
     * @return selectType
     */
    public String getSelectType() {
        return this.selectType;
    }

    /**
     * @return serverType
     */
    public String getServerType() {
        return this.serverType;
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
        private String selectType; 
        private String serverType; 
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
            this.selectType = request.selectType;
            this.serverType = request.serverType;
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
         * <p>The content of the policy that you want to modify. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Source</strong>: the server directories to be protected. To protect all directories, set this field to [].</p>
         * </li>
         * <li><p><strong>Include</strong>: the types of files to be protected. Examples: &quot;\<em>.jpg&quot; and &quot;\</em>.doc&quot;.</p>
         * </li>
         * <li><p><strong>Exclude</strong>: the custom directories to be excluded. To exclude the &quot;/home/user&quot; directory, call the DescribeExcludeSystemPath operation to obtain all directories and then add the directories to be excluded. Example: exclude the &quot;/home/user&quot; directory.</p>
         * </li>
         * <li><p><strong>Schedule</strong>: the start time and interval of the data backup task. Specify a time during off-peak hours and avoid exact hours.</p>
         * <ul>
         * <li><p>Example 1: I|1583216092|P21D indicates that the start time is 2020-03-03 14:14:52 and the interval is 3 weeks.</p>
         * </li>
         * <li><p>Example 2: I|1583216092|PT24H indicates that the start time is 2020-03-03 14:14:52 and the interval is 24 hours.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>Retention</strong>: the retention period of backup data. Unit: days. A value of 7 indicates 1 week, 365 indicates 1 year, and -1 indicates permanent retention.</p>
         * </li>
         * <li><p><strong>SpeedLimiter</strong>: the bandwidth limit for the backup network. Example: 12:15:15360|6:12:5120 indicates a limit of 15 MB from 12:00 to 15:00 and 5 MB from 06:00 to 12:00.
         * If the cloud server is connected to the internal network, do not limit the backup network bandwidth. To remove the bandwidth limit, set this parameter to an empty string (&quot;&quot;).</p>
         * </li>
         * </ul>
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
         * <p>The region where the server to which the policy applies resides.</p>
         * <p>You can call the <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> operation to query the regions supported by the anti-ransomware feature.</p>
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
         * <p>The version of the policy. You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the version.</p>
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
         * <p>The method to cover assets. Valid values:</p>
         * <ul>
         * <li><strong>ALL_MACHINE</strong>: all assets<blockquote>
         * <p>To cover all assets of this type, set this parameter to <strong>ALL_MACHINE</strong>. In this case, <strong>UuidList</strong> does not take effect. Only one policy that covers all assets can exist for the same server type.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL_MACHINE</p>
         */
        public Builder selectType(String selectType) {
            this.putQueryParameter("SelectType", selectType);
            this.selectType = selectType;
            return this;
        }

        /**
         * <p>The server type. Valid values:</p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud server</li>
         * <li><strong>OUT_CLOUD</strong>: third-party server</li>
         * <li><strong>TRIPARTITE</strong>: simple application server</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder serverType(String serverType) {
            this.putQueryParameter("ServerType", serverType);
            this.serverType = serverType;
            return this;
        }

        /**
         * <p>The list of UUIDs of the servers protected by the policy.</p>
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
