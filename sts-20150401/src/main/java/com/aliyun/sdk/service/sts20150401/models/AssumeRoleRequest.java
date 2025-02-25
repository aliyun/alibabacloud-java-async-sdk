// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssumeRoleRequest} extends {@link RequestModel}
 *
 * <p>AssumeRoleRequest</p>
 */
public class AssumeRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationSeconds")
    private Long durationSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalId")
    private String externalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleSessionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleSessionName;

    private AssumeRoleRequest(Builder builder) {
        super(builder);
        this.durationSeconds = builder.durationSeconds;
        this.externalId = builder.externalId;
        this.policy = builder.policy;
        this.roleArn = builder.roleArn;
        this.roleSessionName = builder.roleSessionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return roleSessionName
     */
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public static final class Builder extends Request.Builder<AssumeRoleRequest, Builder> {
        private Long durationSeconds; 
        private String externalId; 
        private String policy; 
        private String roleArn; 
        private String roleSessionName; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleRequest request) {
            super(request);
            this.durationSeconds = request.durationSeconds;
            this.externalId = request.externalId;
            this.policy = request.policy;
            this.roleArn = request.roleArn;
            this.roleSessionName = request.roleSessionName;
        } 

        /**
         * <p>The validity period of the STS token. Unit: seconds.</p>
         * <p>Minimum value: 900. Maximum value: the value of the <code>MaxSessionDuration</code> parameter. Default value: 3600.</p>
         * <p>You can call the CreateRole or UpdateRole operation to configure the <code>MaxSessionDuration</code> parameter. For more information, see <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a> or <a href="https://help.aliyun.com/document_detail/28712.html">UpdateRole</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * <p>The external ID of the RAM role.</p>
         * <p>This parameter is provided by an external party and is used to prevent the confused deputy problem. For more information, see <a href="https://help.aliyun.com/document_detail/2361741.html">Use ExternalId to prevent the confused deputy problem</a>.</p>
         * <p>The value must be 2 to 1,224 characters in length and can contain letters, digits, and the following special characters: <code>= , . @ : / - _</code>. The regular expression for this parameter is <code>[\w+=,.@:\/-]*</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd1234</p>
         */
        public Builder externalId(String externalId) {
            this.putQueryParameter("ExternalId", externalId);
            this.externalId = externalId;
            return this;
        }

        /**
         * <p>The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.</p>
         * <ul>
         * <li>If you specify this parameter, the permissions of the returned STS token are the permissions that are included in the value of this parameter and owned by the RAM role.</li>
         * <li>If you do not specify this parameter, the returned STS token has all the permissions of the RAM role.</li>
         * </ul>
         * <p>The value must be 1 to 2,048 characters in length.</p>
         * <p>For more information about policy elements and sample policies, see <a href="https://help.aliyun.com/document_detail/93738.html">Policy elements</a> and <a href="https://help.aliyun.com/document_detail/210969.html">Overview of sample policies</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: [&quot;<em>&quot;],&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: [&quot;</em>&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The custom name of the role session.</p>
         * <p>Set this parameter based on your business requirements. In most cases, you can set this parameter to the identity of the API caller. For example, you can specify a username. You can specify <code>RoleSessionName</code> to identify API callers that assume the same RAM role in ActionTrail logs. This allows you to track the users that perform the operations.</p>
         * <p>The value must be 2 to 64 characters in length and can contain letters, digits, and the following special characters: <code>. @ - _</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder roleSessionName(String roleSessionName) {
            this.putQueryParameter("RoleSessionName", roleSessionName);
            this.roleSessionName = roleSessionName;
            return this;
        }

        @Override
        public AssumeRoleRequest build() {
            return new AssumeRoleRequest(this);
        } 

    } 

}
