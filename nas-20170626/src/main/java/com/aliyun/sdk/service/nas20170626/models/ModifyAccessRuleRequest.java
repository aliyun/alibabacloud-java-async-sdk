// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link ModifyAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessRuleRequest</p>
 */
public class ModifyAccessRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    private String fileSystemType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RWAccessType")
    private String RWAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessType")
    private String userAccessType;

    private ModifyAccessRuleRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.accessRuleId = builder.accessRuleId;
        this.fileSystemType = builder.fileSystemType;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
        this.priority = builder.priority;
        this.RWAccessType = builder.RWAccessType;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.userAccessType = builder.userAccessType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccessRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroupName
     */
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    /**
     * @return accessRuleId
     */
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * @return ipv6SourceCidrIp
     */
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return RWAccessType
     */
    public String getRWAccessType() {
        return this.RWAccessType;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    /**
     * @return userAccessType
     */
    public String getUserAccessType() {
        return this.userAccessType;
    }

    public static final class Builder extends Request.Builder<ModifyAccessRuleRequest, Builder> {
        private String accessGroupName; 
        private String accessRuleId; 
        private String fileSystemType; 
        private String ipv6SourceCidrIp; 
        private Integer priority; 
        private String RWAccessType; 
        private String sourceCidrIp; 
        private String userAccessType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccessRuleRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
            this.accessRuleId = request.accessRuleId;
            this.fileSystemType = request.fileSystemType;
            this.ipv6SourceCidrIp = request.ipv6SourceCidrIp;
            this.priority = request.priority;
            this.RWAccessType = request.RWAccessType;
            this.sourceCidrIp = request.sourceCidrIp;
            this.userAccessType = request.userAccessType;
        } 

        /**
         * <p>The name of the permission group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * <p>The ID of the permission rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder accessRuleId(String accessRuleId) {
            this.putQueryParameter("AccessRuleId", accessRuleId);
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * <p>The type of the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard (default): General-purpose NAS.</li>
         * <li>extreme: Extreme NAS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * <p>The source IPv6 CIDR block.</p>
         * <p>IPv6 addresses and CIDR blocks are supported.</p>
         * <blockquote>
         * <ul>
         * <li>Only Extreme NAS file systems in the China (Hohhot) region support IPv6 CIDR blocks.</li>
         * <li>Only VPCs are supported.</li>
         * <li>IPv4 and IPv6 are mutually exclusive. You cannot convert between the two types.</li>
         * <li>You must specify either SourceCidrIp or Ipv6SourceCidrIp. You cannot leave both parameters empty, and you cannot specify both parameters at the same time.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fe80::3d4a:80fd:f05d:****</p>
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * <p>The priority of the permission rule.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 1 (highest priority).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The read and write permissions of the authorized object on the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RDWR (default): read and write.</li>
         * <li>RDONLY: read-only.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDWR</p>
         */
        public Builder RWAccessType(String RWAccessType) {
            this.putQueryParameter("RWAccessType", RWAccessType);
            this.RWAccessType = RWAccessType;
            return this;
        }

        /**
         * <p>The IP address or CIDR block.</p>
         * <p>The value must be a single IP address or a CIDR block.</p>
         * <blockquote>
         * <p>You must specify either SourceCidrIp or Ipv6SourceCidrIp. You cannot leave both parameters empty, and you cannot specify both parameters at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>192.0.**.**</code></p>
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * <p>The authorization of the system user of the authorized object on the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>no_squash: allows access to the file system as the root user.</li>
         * <li>root_squash: maps the root user to the nobody user when the root user accesses the file system.</li>
         * <li>all_squash: maps all users to the nobody user regardless of the user identity used to access the file system.</li>
         * </ul>
         * <p>The nobody user is a default user in Linux. This user can access only public content on the server and has low privileges and high security.</p>
         * 
         * <strong>example:</strong>
         * <p>all_squash</p>
         */
        public Builder userAccessType(String userAccessType) {
            this.putQueryParameter("UserAccessType", userAccessType);
            this.userAccessType = userAccessType;
            return this;
        }

        @Override
        public ModifyAccessRuleRequest build() {
            return new ModifyAccessRuleRequest(this);
        } 

    } 

}
