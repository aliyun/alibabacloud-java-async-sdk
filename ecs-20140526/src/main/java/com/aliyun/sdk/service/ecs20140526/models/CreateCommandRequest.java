// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCommandRequest} extends {@link RequestModel}
 *
 * <p>CreateCommandRequest</p>
 */
public class CreateCommandRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableParameter")
    private Boolean enableParameter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Launcher")
    private String launcher;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkingDir")
    private String workingDir;

    private CreateCommandRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.commandContent = builder.commandContent;
        this.contentEncoding = builder.contentEncoding;
        this.description = builder.description;
        this.enableParameter = builder.enableParameter;
        this.launcher = builder.launcher;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.timeout = builder.timeout;
        this.type = builder.type;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableParameter
     */
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    /**
     * @return launcher
     */
    public String getLauncher() {
        return this.launcher;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<CreateCommandRequest, Builder> {
        private String sourceRegionId; 
        private String commandContent; 
        private String contentEncoding; 
        private String description; 
        private Boolean enableParameter; 
        private String launcher; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private Long timeout; 
        private String type; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommandRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.commandContent = request.commandContent;
            this.contentEncoding = request.contentEncoding;
            this.description = request.description;
            this.enableParameter = request.enableParameter;
            this.launcher = request.launcher;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.timeout = request.timeout;
            this.type = request.type;
            this.workingDir = request.workingDir;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The Base64-encoded content of the command. Take note of the following items:</p>
         * <ul>
         * <li><p>The value must be Base64-encoded and cannot exceed 18 KB in size.</p>
         * </li>
         * <li><p>You can use custom parameters in the command content. To enable the custom parameter feature, you must set <code>EnableParameter</code> to true.</p>
         * <ul>
         * <li>Custom parameters are defined in the <code>{{}}</code> format. Within <code>{{}}</code>, the spaces and line feeds before and after the parameter names are ignored.</li>
         * <li>You can specify up to 20 custom parameters.</li>
         * <li>A custom parameter name can contain only letters, digits, underscores (_), and hyphens (-). The name is case-insensitive. The ACS:: prefix cannot be used to specify non-built-in environment parameters.</li>
         * <li>Each custom parameter name can be up to 64 bytes in length.</li>
         * </ul>
         * </li>
         * <li><p>You can specify built-in environment parameters as custom parameters in a command. When you run the command, Cloud Assistant automatically uses the environment parameter values for the custom parameters. You can specify the following built-in environment variables:</p>
         * <ul>
         * <li><p><code>{{ACS::RegionId}}</code>: the region ID.</p>
         * </li>
         * <li><p><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</p>
         * </li>
         * <li><p><code>{{ACS::InstanceId}}</code>: the instance ID. If you want to run the command on multiple instances and specify <code>{{ACS::InstanceId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
         * <ul>
         * <li>Linux: 2.2.3.309</li>
         * <li>Windows: 2.1.3.309</li>
         * </ul>
         * </li>
         * <li><p><code>{{ACS::InstanceName}}</code>: the instance name. If you want to run the command on multiple instances and specify <code>{{ACS::InstanceName}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
         * <ul>
         * <li>Linux: 2.2.3.344</li>
         * <li>Windows: 2.1.3.344</li>
         * </ul>
         * </li>
         * <li><p><code>{{ACS::InvokeId}}</code>: the ID of the task. If you want to specify <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
         * <ul>
         * <li>Linux: 2.2.3.309</li>
         * <li>Windows: 2.1.3.309</li>
         * </ul>
         * </li>
         * <li><p><code>{{ACS::CommandId}}</code>: the command ID. If you want to call the <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> operation to run the command and specify <code>{{ACS::CommandId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
         * <ul>
         * <li>Linux: 2.2.3.309</li>
         * <li>Windows: 2.1.3.309</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyAxMjM=</p>
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * <p>The encoding mode of the command content (CommandContent). Valid values:</p>
         * <ul>
         * <li>PlainText: The command content is not encoded.</li>
         * <li>Base64: The command content is Base64-encoded.</li>
         * </ul>
         * <p>Default value: Base64.</p>
         * <blockquote>
         * <p>If the specified value of this parameter is invalid, Base64 is used by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>The description of the command. The description supports all character sets and can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to use custom parameters in the command.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putQueryParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * Launcher.
         */
        public Builder launcher(String launcher) {
            this.putQueryParameter("Launcher", launcher);
            this.launcher = launcher;
            return this;
        }

        /**
         * <p>The name of the command. The name supports all character sets and can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which to assign the command.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The tags to add to the command.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>he maximum timeout period for the command execution on the instance. Unit: seconds. When a command that you created cannot be run, the command times out. When a command execution times out, Cloud Assistant Agent forcefully terminates the command process by canceling the PID. </p>
         * <p>Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The command type. Valid values:</p>
         * <ul>
         * <li>RunBatScript: batch commands. These commands are applicable to Windows instances.</li>
         * <li>RunPowerShellScript: PowerShell commands. These commands are applicable to Windows instances.</li>
         * <li>RunShellScript: shell commands. These commands are applicable to Linux instances.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RunShellScript</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The execution path of the command on ECS instances. The value can be up to 200 characters in length.</p>
         * <p>Default values:</p>
         * <ul>
         * <li>For Linux instance, the default value is the home directory of the root user, which is the <code>/root</code> directory.</li>
         * <li>For Windows instances, the default value is the directory where the Cloud Assistant Agent process resides, such as <code>C:\Windows\System32\</code>.</li>
         * </ul>
         * <blockquote>
         * <p> If you set WorkingDir to a directory other than default ones, make sure that the directory exists on the instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/root/</p>
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        @Override
        public CreateCommandRequest build() {
            return new CreateCommandRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCommandRequest} extends {@link TeaModel}
     *
     * <p>CreateCommandRequest</p>
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

            /**
             * <p>The key of tag N. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
             * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags, call <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
             * <p>The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
             * <p>It can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
