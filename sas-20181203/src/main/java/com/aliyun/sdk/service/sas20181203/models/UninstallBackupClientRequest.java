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
 * {@link UninstallBackupClientRequest} extends {@link RequestModel}
 *
 * <p>UninstallBackupClientRequest</p>
 */
public class UninstallBackupClientRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

    private UninstallBackupClientRequest(Builder builder) {
        super(builder);
        this.policyVersion = builder.policyVersion;
        this.uuid = builder.uuid;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallBackupClientRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<UninstallBackupClientRequest, Builder> {
        private String policyVersion; 
        private String uuid; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(UninstallBackupClientRequest request) {
            super(request);
            this.policyVersion = request.policyVersion;
            this.uuid = request.uuid;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The version of the anti-ransomware policy. You can call the <a href="~~DescribeBackupPolicies~~">DescribeBackupPolicies</a> operation to query the versions of anti-ransomware policies. Valid values:</p>
         * <ul>
         * <li><strong>1.0.0</strong></li>
         * <li><strong>2.0.0</strong></li>
         * </ul>
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
         * <p>The UUID of the server from which you want to uninstall the anti-ransomware agent.</p>
         * <blockquote>
         * <p>You must specify at least one of the UuidList and Uuid parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA0****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The UUIDs of the servers from which you want to uninstall the anti-ransomware agent.</p>
         * <blockquote>
         * <p>You must specify at least one of the UuidList and Uuid parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;D0D6E6E4-CB8C-4897-B852-46AEFDA0****&quot;, &quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public UninstallBackupClientRequest build() {
            return new UninstallBackupClientRequest(this);
        } 

    } 

}
