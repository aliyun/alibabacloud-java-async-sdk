// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessRuleRequest</p>
 */
public class CreateAccessRuleRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    private String accessGroupName;

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

    private CreateAccessRuleRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
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

    public static CreateAccessRuleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAccessRuleRequest, Builder> {
        private String accessGroupName; 
        private String fileSystemType; 
        private String ipv6SourceCidrIp; 
        private Integer priority; 
        private String RWAccessType; 
        private String sourceCidrIp; 
        private String userAccessType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessRuleRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
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
         * You must set this parameter to an IPv6 address or CIDR block.
         * 
         * > *   Only Extreme NAS file systems that reside in the Chinese mainland support IPv6. If you specify this parameter, you must enable IPv6 for the file system.
         * >*   Only permission groups that reside in virtual private clouds (VPCs) support IPv6.
         * >*   You cannot specify an IPv4 address and an IPv6 address at the same time.
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
         * The rule with the highest priority takes effect if multiple rules are attached to the authorized object.
         * 
         * Valid values: 1 to 100. The value 1 indicates the highest priority.
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
         * 
         * > If the permission group resides in the classic network, you must set this parameter to an IP address.
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
         * *   no_squash (default): grants root users the permissions to access the file system.
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
        public CreateAccessRuleRequest build() {
            return new CreateAccessRuleRequest(this);
        } 

    } 

}
