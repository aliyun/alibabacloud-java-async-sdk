// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccessRuleRequest</p>
 */
public class ModifyAccessRuleRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    private String accessGroupName;

    @Query
    @NameInMap("AccessRuleId")
    @Validation(required = true)
    private String accessRuleId;

    @Query
    @NameInMap("FileSystemType")
    private String fileSystemType;

    @Query
    @NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    @Query
    @NameInMap("Priority")
    @Validation(maximum = 100, minimum = 1)
    private Integer priority;

    @Query
    @NameInMap("RWAccessType")
    private String RWAccessType;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @Query
    @NameInMap("UserAccessType")
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
         * The name of the permission group.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * The rule ID.
         */
        public Builder accessRuleId(String accessRuleId) {
            this.putQueryParameter("AccessRuleId", accessRuleId);
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * The type of the file system.
         * <p>
         * 
         * Valid values:
         * 
         * *   standard (default): General-purpose NAS file system
         * *   extreme: Extreme NAS file system
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * The IPv6 address or CIDR block of the authorized object.
         * <p>
         * 
         * You must set this parameter to an IPv6 IP address or CIDR block.
         * 
         * > *   Only Extreme NAS file systems that reside in the China (Hohhot) region support IPv6.
         * >*   Only permission groups that reside in virtual private clouds (VPCs) support IPv6.
         * >*   This parameter is unavailable if you specify the SourceCidrIp parameter.
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * The priority of the rule.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 1, which indicates the highest priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The access permissions of the authorized object on the file system.
         * <p>
         * 
         * Valid values:
         * 
         * *   RDWR (default): the read and write permissions
         * *   RDONLY: the read-only permissions
         */
        public Builder RWAccessType(String RWAccessType) {
            this.putQueryParameter("RWAccessType", RWAccessType);
            this.RWAccessType = RWAccessType;
            return this;
        }

        /**
         * The IP address or CIDR block of the authorized object.
         * <p>
         * 
         * You must set this parameter to an IP address or CIDR block.
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * The access permissions for different types of users in the authorized object.
         * <p>
         * 
         * Valid values:
         * 
         * *   no_squash: allows access from root users to the file system.
         * *   root_squash: grants root users the least permissions as the nobody user.
         * *   all_squash: grants all users the least permissions as the nobody user.
         * 
         * The nobody user has the least permissions in Linux and can access only the public content of the file system. This ensures the security of the file system.
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
