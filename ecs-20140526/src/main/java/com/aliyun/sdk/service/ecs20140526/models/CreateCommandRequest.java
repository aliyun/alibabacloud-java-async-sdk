// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateCommandRequest} extends {@link RequestModel}
 *
 * <p>CreateCommandRequest</p>
 */
public class CreateCommandRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    private java.util.List<Tag> tag;

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
        this.clientToken = builder.clientToken;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public java.util.List<Tag> getTag() {
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
        private String clientToken; 
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
        private java.util.List<Tag> tag; 
        private Long timeout; 
        private String type; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommandRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The Base64-encoded content of the command.</p>
         * <ul>
         * <li><p>The value of this parameter must be Base64-encoded and cannot exceed 24 KB in size after Base64 encoding.</p>
         * </li>
         * <li><p>The command content supports custom parameters. To enable the custom parameter feature, specify <code>EnableParameter=true</code>:</p>
         * <ul>
         * <li>Custom parameters are defined by enclosing the parameter name in <code>{{}}</code>. Spaces and line breaks before and after the parameter name in <code>{{}}</code> are ignored.</li>
         * <li>The number of custom parameters cannot exceed 20.</li>
         * <li>Custom parameter names can contain only letters (a-z, A-Z), digits (0-9), hyphens (-), and underscores (_). The acs:: prefix for specifying non-built-in environment parameters is not supported. Other characters are not supported. Parameter names are case-insensitive.</li>
         * <li>Each parameter name cannot exceed 64 bytes in length.</li>
         * </ul>
         * </li>
         * <li><p>You can specify built-in environment parameters as custom parameters. When the command is run, Cloud Assistant automatically replaces the parameters with the corresponding values from the environment without requiring manual assignment. The following built-in environment parameters are supported:</p>
         * <ul>
         * <li><p><code>{{ACS::RegionId}}</code>: the region ID.</p>
         * </li>
         * <li><p><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</p>
         * </li>
         * <li><p><code>{{ACS::InstanceId}}</code>: the instance ID. When the command is sent to multiple instances and you want to use <code>{{ACS::InstanceId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following:</p>
         * <ul>
         * <li>Linux: 2.2.3.309</li>
         * <li>Windows: 2.1.3.309</li>
         * </ul>
         * </li>
         * <li><p><code>{{ACS::InstanceName}}</code>: the instance name. When the command is sent to multiple instances and you want to use <code>{{ACS::InstanceName}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following:</p>
         * <ul>
         * <li>Linux: 2.2.3.344</li>
         * <li>Windows: 2.1.3.344</li>
         * </ul>
         * </li>
         * <li><p><code>{{ACS::InvokeId}}</code>: the command execution ID. To use <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following:</p>
         * <ul>
         * <li>Linux: 2.2.3.309</li>
         * <li>Windows: 2.1.3.309</li>
         * </ul>
         * </li>
         * <li><p><code>{{ACS::CommandId}}</code>: the command ID. When you run a command by calling the <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> operation and want to use <code>{{ACS::CommandId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following:</p>
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
         * <li><p>PlainText: no encoding. The content is transmitted in plaintext.</p>
         * </li>
         * <li><p>Base64: Base64 encoding.</p>
         * </li>
         * </ul>
         * <p>Default value: Base64.</p>
         * <blockquote>
         * <p>If an invalid value is specified, it is treated as Base64.</p>
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
         * <p>The command description. All character sets are supported. The description cannot exceed 512 characters in length.</p>
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
         * <p>Specifies whether the command uses custom parameters.</p>
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
         * <p>The bootstrap program for script execution. The value cannot exceed 1 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
         */
        public Builder launcher(String launcher) {
            this.putQueryParameter("Launcher", launcher);
            this.launcher = launcher;
            return this;
        }

        /**
         * <p>The command name. All character sets are supported. The name cannot exceed 128 characters in length.</p>
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
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the command belongs.</p>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The maximum timeout period for the command to run on ECS instances. Unit: seconds. If the command cannot be run for some reason, a timeout occurs. After the timeout, the command process is forcefully terminated by canceling the PID of the command.</p>
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
         * <p>The type of the command. Valid values: </p>
         * <ul>
         * <li>RunBatScript: creates a Bat script to run on Windows instances.</li>
         * <li>RunPowerShellScript: creates a PowerShell script to run on Windows instances.</li>
         * <li>RunShellScript: creates a Shell script to run on Linux instances.</li>
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
         * <p>The directory where the command is run on the ECS instance. The value cannot exceed 200 characters in length.</p>
         * <p>Default value: </p>
         * <ul>
         * <li>Linux instances: the home directory of the root user, which is <code>/root</code>.  </li>
         * <li>Windows instances: the directory where the Cloud Assistant Agent process is located, such as <code>C:\\Windows\\System32</code>.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to a different directory, make sure that the directory exists on the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/user</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the command. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
             * <p>If you use a single tag to filter resources, the resource count with the specified tag cannot exceed 1000. If you use multiple tags to filter resources, the resource count that have all specified tags attached cannot exceed 1000. If the resource count exceeds 1000, use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
             * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the command. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
