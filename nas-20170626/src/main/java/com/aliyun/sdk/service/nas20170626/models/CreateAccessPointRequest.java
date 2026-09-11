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
 * {@link CreateAccessPointRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessPointRequest</p>
 */
public class CreateAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroup")
    private String accessGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointName")
    private String accessPointName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgenticSpaceId")
    private String agenticSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnabledRam")
    private Boolean enabledRam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerGroupId")
    private Integer ownerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    private Integer ownerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permission")
    private String permission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosixGroupId")
    private Integer posixGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosixSecondaryGroupIds")
    private String posixSecondaryGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosixUserId")
    private Integer posixUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDirectory")
    private String rootDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vswId;

    private CreateAccessPointRequest(Builder builder) {
        super(builder);
        this.accessGroup = builder.accessGroup;
        this.accessPointName = builder.accessPointName;
        this.agenticSpaceId = builder.agenticSpaceId;
        this.enabledRam = builder.enabledRam;
        this.fileSystemId = builder.fileSystemId;
        this.ownerGroupId = builder.ownerGroupId;
        this.ownerUserId = builder.ownerUserId;
        this.permission = builder.permission;
        this.posixGroupId = builder.posixGroupId;
        this.posixSecondaryGroupIds = builder.posixSecondaryGroupIds;
        this.posixUserId = builder.posixUserId;
        this.rootDirectory = builder.rootDirectory;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
        this.vswId = builder.vswId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessPointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroup
     */
    public String getAccessGroup() {
        return this.accessGroup;
    }

    /**
     * @return accessPointName
     */
    public String getAccessPointName() {
        return this.accessPointName;
    }

    /**
     * @return agenticSpaceId
     */
    public String getAgenticSpaceId() {
        return this.agenticSpaceId;
    }

    /**
     * @return enabledRam
     */
    public Boolean getEnabledRam() {
        return this.enabledRam;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return ownerGroupId
     */
    public Integer getOwnerGroupId() {
        return this.ownerGroupId;
    }

    /**
     * @return ownerUserId
     */
    public Integer getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return posixGroupId
     */
    public Integer getPosixGroupId() {
        return this.posixGroupId;
    }

    /**
     * @return posixSecondaryGroupIds
     */
    public String getPosixSecondaryGroupIds() {
        return this.posixSecondaryGroupIds;
    }

    /**
     * @return posixUserId
     */
    public Integer getPosixUserId() {
        return this.posixUserId;
    }

    /**
     * @return rootDirectory
     */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswId
     */
    public String getVswId() {
        return this.vswId;
    }

    public static final class Builder extends Request.Builder<CreateAccessPointRequest, Builder> {
        private String accessGroup; 
        private String accessPointName; 
        private String agenticSpaceId; 
        private Boolean enabledRam; 
        private String fileSystemId; 
        private Integer ownerGroupId; 
        private Integer ownerUserId; 
        private String permission; 
        private Integer posixGroupId; 
        private String posixSecondaryGroupIds; 
        private Integer posixUserId; 
        private String rootDirectory; 
        private java.util.List<Tag> tag; 
        private String vpcId; 
        private String vswId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessPointRequest request) {
            super(request);
            this.accessGroup = request.accessGroup;
            this.accessPointName = request.accessPointName;
            this.agenticSpaceId = request.agenticSpaceId;
            this.enabledRam = request.enabledRam;
            this.fileSystemId = request.fileSystemId;
            this.ownerGroupId = request.ownerGroupId;
            this.ownerUserId = request.ownerUserId;
            this.permission = request.permission;
            this.posixGroupId = request.posixGroupId;
            this.posixSecondaryGroupIds = request.posixSecondaryGroupIds;
            this.posixUserId = request.posixUserId;
            this.rootDirectory = request.rootDirectory;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
            this.vswId = request.vswId;
        } 

        /**
         * <p>The permission group name.</p>
         * <p>This parameter is required if the file system is a General-purpose NAS file system.</p>
         * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (the default permission group for VPCs).</p>
         * <blockquote>
         * <p>Not supported for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        public Builder accessGroup(String accessGroup) {
            this.putQueryParameter("AccessGroup", accessGroup);
            this.accessGroup = accessGroup;
            return this;
        }

        /**
         * <p>The access point name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accessPointName(String accessPointName) {
            this.putQueryParameter("AccessPointName", accessPointName);
            this.accessPointName = accessPointName;
            return this;
        }

        /**
         * <p>The AgenticSpace ID.</p>
         * <blockquote>
         * <p>This parameter is required for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>agentic-229oypxjgpau2****</p>
         */
        public Builder agenticSpaceId(String agenticSpaceId) {
            this.putQueryParameter("AgenticSpaceId", agenticSpaceId);
            this.agenticSpaceId = agenticSpaceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the RAM policy.
         * Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false (default): not enabled.</li>
         * </ul>
         * <blockquote>
         * <p>After you enable the access point RAM policy, all Resource Access Management (RAM) users are denied access to mount and access data through the access point by default. You must grant the corresponding access permissions through authorization and mount the file system through the access point. After you disable the RAM policy, the access point allows anonymous mounting. For more information about how to configure access point permissions, see <a href="https://help.aliyun.com/document_detail/2545998.html">Configure an access point policy</a>.</p>
         * </blockquote>
         * <blockquote>
         * <p>For Agentic file systems, this parameter must be set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabledRam(Boolean enabledRam) {
            this.putQueryParameter("EnabledRam", enabledRam);
            this.enabledRam = enabledRam;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The owner group ID.</p>
         * <p>This parameter is required if the RootDirectory directory does not exist.</p>
         * <blockquote>
         * <p>Not supported for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ownerGroupId(Integer ownerGroupId) {
            this.putQueryParameter("OwnerGroupId", ownerGroupId);
            this.ownerGroupId = ownerGroupId;
            return this;
        }

        /**
         * <p>The owner user ID.</p>
         * <p>This parameter is required if the RootDirectory directory does not exist.</p>
         * <blockquote>
         * <p>Not supported for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ownerUserId(Integer ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * <p>The POSIX permission. Default value: &quot;0755&quot;. Limit: The value must be a four-digit octal number that starts with 0.</p>
         * <p>This parameter takes effect after you specify the OwnerUserId and OwnerGroupId parameters.</p>
         * <blockquote>
         * <p>Not supported for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0755</p>
         */
        public Builder permission(String permission) {
            this.putQueryParameter("Permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * <p>The POSIX group ID.</p>
         * <blockquote>
         * <p>Not supported for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder posixGroupId(Integer posixGroupId) {
            this.putQueryParameter("PosixGroupId", posixGroupId);
            this.posixGroupId = posixGroupId;
            return this;
        }

        /**
         * <p>The secondary group IDs. Separate multiple group IDs with commas (,).</p>
         * <blockquote>
         * <p>Not supported for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123,345</p>
         */
        public Builder posixSecondaryGroupIds(String posixSecondaryGroupIds) {
            this.putQueryParameter("PosixSecondaryGroupIds", posixSecondaryGroupIds);
            this.posixSecondaryGroupIds = posixSecondaryGroupIds;
            return this;
        }

        /**
         * <p>The POSIX user ID.</p>
         * <blockquote>
         * <p>Not supported for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder posixUserId(Integer posixUserId) {
            this.putQueryParameter("PosixUserId", posixUserId);
            this.posixUserId = posixUserId;
            return this;
        }

        /**
         * <p>The root directory of the access point.
         * Default value: &quot;/&quot;. If the access point directory does not exist, you must also specify the OwnerUserId and OwnerGroupId parameters.</p>
         * <blockquote>
         * <p>Not supported for Agentic file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder rootDirectory(String rootDirectory) {
            this.putQueryParameter("RootDirectory", rootDirectory);
            this.rootDirectory = rootDirectory;
            return this;
        }

        /**
         * <p>The list of access point tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zesj9afh3y518k9o****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zevmwkwyztjuoffg****</p>
         */
        public Builder vswId(String vswId) {
            this.putQueryParameter("VswId", vswId);
            this.vswId = vswId;
            return this;
        }

        @Override
        public CreateAccessPointRequest build() {
            return new CreateAccessPointRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAccessPointRequest} extends {@link TeaModel}
     *
     * <p>CreateAccessPointRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.
             * Limits:</p>
             * <ul>
             * <li>The tag key cannot be empty or an empty string.</li>
             * <li>The tag key can be up to 128 characters in length.</li>
             * <li>The tag key cannot start with aliyun or acs:.</li>
             * <li>The tag key cannot contain http:// or https://.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.
             * Limits:</p>
             * <ul>
             * <li>The tag value cannot be empty or an empty string.</li>
             * <li>The tag value can be up to 128 characters in length.</li>
             * <li>The tag value cannot contain http:// or https://.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
