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
 * {@link ModifyInvocationAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInvocationAttributeRequest</p>
 */
public class ModifyInvocationAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandContent")
    private String commandContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableParameter")
    private Boolean enableParameter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private String frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private java.util.List<String> instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invokeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyInvocationAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.commandContent = builder.commandContent;
        this.contentEncoding = builder.contentEncoding;
        this.enableParameter = builder.enableParameter;
        this.frequency = builder.frequency;
        this.instanceId = builder.instanceId;
        this.invokeId = builder.invokeId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInvocationAttributeRequest create() {
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
     * @return enableParameter
     */
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return instanceId
     */
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
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
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyInvocationAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private String commandContent; 
        private String contentEncoding; 
        private Boolean enableParameter; 
        private String frequency; 
        private java.util.List<String> instanceId; 
        private String invokeId; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.Map<String, ?> parameters; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInvocationAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
            this.commandContent = request.commandContent;
            this.contentEncoding = request.contentEncoding;
            this.enableParameter = request.enableParameter;
            this.frequency = request.frequency;
            this.instanceId = request.instanceId;
            this.invokeId = request.invokeId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The modified command content. The command content can be plaintext or Base64-encoded. Note the following items:</p>
         * <ul>
         * <li><p>The size of the command content after Base64 encoding cannot exceed 24 KB.</p>
         * </li>
         * <li><p>If your command content is Base64-encoded, you must set <code>ContentEncoding=Base64</code>.</p>
         * </li>
         * <li><p>You can set <code>EnableParameter=true</code> to enable the custom parameter feature in the command content:</p>
         * <ul>
         * <li>Custom parameters are defined by enclosing them in <code>{{}}</code>. Spaces and line breaks before and after the parameter name within <code>{{}}</code> are ignored.</li>
         * <li>The number of custom parameters cannot exceed 20.</li>
         * <li>Custom parameter names can contain a-z, A-Z, 0-9, hyphens (-), and underscores (_). The acs:: prefix for specifying non-built-in environment parameters is not supported. Other characters are not supported. Parameter names are case-insensitive.</li>
         * <li>A single custom parameter name cannot exceed 64 bytes.</li>
         * </ul>
         * </li>
         * <li><p>You can specify built-in environment parameters as custom parameters. When the command is executed, you do not need to manually assign values to the parameters. Cloud Assistant automatically replaces them with the corresponding values in the environment. The following built-in environment parameters are supported:</p>
         * <ul>
         * <li><code>{{ACS::RegionId}}</code>: The region ID.</li>
         * <li><code>{{ACS::AccountId}}</code>: The UID of the Alibaba Cloud account.</li>
         * <li><code>{{ACS::InstanceId}}</code>: The instance ID. When the command is sent to multiple instances, to specify <code>{{ACS::InstanceId}}</code> as a built-in environment parameter, ensure that the Cloud Assistant Agent version is not earlier than the following versions:<ul>
         * <li>Linux: 2.2.3.309</li>
         * <li>Windows: 2.1.3.309</li>
         * </ul>
         * </li>
         * <li><code>{{ACS::InstanceName}}</code>: The instance name. When the command is sent to multiple instances, to specify <code>{{ACS::InstanceName}}</code> as a built-in environment parameter, ensure that the Cloud Assistant Agent version is not earlier than the following versions:<ul>
         * <li>Linux: 2.2.3.344</li>
         * <li>Windows: 2.1.3.344</li>
         * </ul>
         * </li>
         * <li><code>{{ACS::InvokeId}}</code>: The command execution ID. To specify <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, ensure that the Cloud Assistant Agent version is not earlier than the following versions:<ul>
         * <li>Linux: 2.2.3.309</li>
         * <li>Windows: 2.1.3.309</li>
         * </ul>
         * </li>
         * <li><code>{{ACS::CommandId}}</code>: The command ID. When you call this operation to execute a command, to specify <code>{{ACS::CommandId}}</code> as a built-in environment parameter, ensure that the Cloud Assistant Agent version is not earlier than the following versions: <ul>
         * <li>Linux: 2.2.3.309</li>
         * <li>Windows: 2.1.3.309</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
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
         * <p>The encoding method of the command content (<code>CommandContent</code>). Valid values (case-insensitive):</p>
         * <ul>
         * <li>PlainText: no encoding. The content is transmitted in plaintext.</li>
         * <li>Base64: Base64 encoding.</li>
         * </ul>
         * <p>Default value: PlainText. If an invalid value is specified, it is treated as PlainText.</p>
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
         * <p>Specifies whether the modified command contains custom parameters.</p>
         * <ul>
         * <li>When you enable custom parameters or modify the custom parameters <code>Parameters</code>, set this parameter to <code>true</code>.</li>
         * <li>When you do not modify the custom parameters <code>Parameters</code>, do not set this parameter or set it to <code>false</code>.</li>
         * </ul>
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
         * <p>The modified scheduled execution frequency. This parameter takes effect only when <code>RepeatMode</code> is set to <code>Period</code>. Three types of scheduled execution are supported: fixed interval execution (based on Rate expressions), one-time execution at a specified time, and clock-based scheduled execution (based on Cron expressions).</p>
         * <ul>
         * <li><p>Fixed interval execution: Based on Rate expressions, the command is executed at the specified time interval. The time interval can be specified in seconds (s), minutes (m), hours (h), or days (d). This is applicable to scenarios where tasks are executed at fixed intervals. Format: <code>rate(&lt;interval value&gt;&lt;interval unit&gt;)</code>. For example, to execute every 5 minutes, the format is <code>rate(5m)</code>. The following limits apply to fixed interval execution:</p>
         * <ul>
         * <li>The specified interval cannot exceed 7 days or be less than 60 seconds, and must be greater than the timeout period specified when the scheduled task was created.</li>
         * <li>The execution interval is based only on the fixed frequency and is not related to the actual time required for task execution. For example, if the command is set to execute every 5 minutes and the task takes 2 minutes to complete, the next round of execution starts 3 minutes after the task is completed.</li>
         * <li>The next execution time is calculated based on the task creation time (see <a href="https://help.aliyun.com/document_detail/64840.html">CreationTime</a> returned by <code>DescribeInvocations</code>, note that this is not the modification time) and the modified execution interval.</li>
         * </ul>
         * </li>
         * <li><p>One-time execution at a specified time: The command is executed once at the specified time zone and time point. Format: <code>at(yyyy-MM-dd HH:mm:ss &lt;time zone&gt;)</code>, which is <code>at(year-month-day hour:minute:second &lt;time zone&gt;)</code>. If no time zone is specified, the default is UTC. The time zone supports the following three formats:</p>
         * <ul>
         * <li>Full time zone name: such as <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
         * <li>Time zone offset from Greenwich Mean Time: such as <code>GMT+8:00</code> (East 8th time zone) or <code>GMT-7:00</code> (West 7th time zone). When using the GMT format, leading zeros are not supported in the hour field.</li>
         * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.</li>
         * </ul>
         * <p>For example, to execute once at 13:15:30 on June 6, 2022 in China/Shanghai time, the format is: <code>at(2022-06-06 13:15:30 Asia/Shanghai)</code>. To execute once at 13:15:30 on June 6, 2022 in the West 7th time zone, the format is: <code>at(2022-06-06 13:15:30 GMT-7:00)</code>.</p>
         * </li>
         * <li><p>Clock-based scheduled execution (based on Cron expressions): Based on Cron expressions, the command is executed according to the scheduled task settings. Format: <code>&lt;seconds&gt; &lt;minutes&gt; &lt;hours&gt; &lt;day of month&gt; &lt;month&gt; &lt;day of week&gt; &lt;year (optional)&gt; &lt;time zone&gt;</code>, which is <code>&lt;Cron expression&gt; &lt;time zone&gt;</code>. The scheduled task execution time is calculated based on the Cron expression in the specified time zone. If no time zone is specified, the default is the internal system time zone of the instance running the scheduled task. For more information about Cron expressions, see <a href="https://help.aliyun.com/document_detail/64769.html">Cron expressions</a>. The time zone supports the following three formats:</p>
         * <ul>
         * <li>Full time zone name: such as <code>Asia/Shanghai</code> (China/Shanghai time) or <code>America/Los_Angeles</code> (US/Los Angeles time).</li>
         * <li>Time zone offset from Greenwich Mean Time: such as <code>GMT+8:00</code> (East 8th time zone) or <code>GMT-7:00</code> (West 7th time zone). When using the GMT format, leading zeros are not supported in the hour field.</li>
         * <li>Time zone abbreviation: Only UTC (Coordinated Universal Time) is supported.
         * For example, to execute a command once a day at 10:15 AM in China/Shanghai time in 2022, the format is <code>0 15 10 ? * * 2022 Asia/Shanghai</code>. To execute every half hour from 10:00 AM to 11:30 AM every day in the East 8th time zone in 2022, the format is <code>0 0/30 10-11 * * ? 2022 GMT+8:00</code>. To execute every 5 minutes from 2:00 PM to 2:55 PM every day in October every two years starting from 2022 in UTC, the format is <code>0 0/5 14 * 10 ? 2022/2 UTC</code>.</li>
         * </ul>
         * <blockquote>
         * <p>The minimum time interval must be greater than or equal to the timeout period specified when the scheduled task was created, and must not be less than 10 seconds.</p>
         * </blockquote>
         * </li>
         * </ul>
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The instance ID of the ECS instance or managed instance to add to the task.</p>
         */
        public Builder instanceId(java.util.List<String> instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The command execution ID of the task to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz0jdfwd9f****</p>
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
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
         * <p>The key-value pairs of custom parameters to modify when the command contains custom parameters.</p>
         * <p>The number of custom parameters ranges from 0 to 10. Note the following items:</p>
         * <ul>
         * <li>Keys cannot be empty strings and can contain up to 64 characters.</li>
         * <li>Values can be empty strings.</li>
         * <li>After the custom parameters and original command content are Base64-encoded, the total size of the command content cannot exceed 24 KB.</li>
         * <li>The set of custom parameter names must be a subset of the parameter set defined when the command was created. For parameters that are not passed in, you can use empty strings as substitutes.</li>
         * </ul>
         * <p>Default value: empty, which indicates that no custom parameter key-value pairs are modified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAI*************&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
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

        @Override
        public ModifyInvocationAttributeRequest build() {
            return new ModifyInvocationAttributeRequest(this);
        } 

    } 

}
