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

        private Builder(ModifyAccessRuleRequest response) {
            super(response);
            this.accessGroupName = response.accessGroupName;
            this.accessRuleId = response.accessRuleId;
            this.fileSystemType = response.fileSystemType;
            this.ipv6SourceCidrIp = response.ipv6SourceCidrIp;
            this.priority = response.priority;
            this.RWAccessType = response.RWAccessType;
            this.sourceCidrIp = response.sourceCidrIp;
            this.userAccessType = response.userAccessType;
        } 

        /**
         * AccessGroupName.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * AccessRuleId.
         */
        public Builder accessRuleId(String accessRuleId) {
            this.putQueryParameter("AccessRuleId", accessRuleId);
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * FileSystemType.
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * Ipv6SourceCidrIp.
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RWAccessType.
         */
        public Builder RWAccessType(String RWAccessType) {
            this.putQueryParameter("RWAccessType", RWAccessType);
            this.RWAccessType = RWAccessType;
            return this;
        }

        /**
         * SourceCidrIp.
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * UserAccessType.
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
