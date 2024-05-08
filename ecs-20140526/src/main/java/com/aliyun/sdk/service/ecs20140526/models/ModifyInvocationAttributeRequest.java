// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInvocationAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInvocationAttributeRequest</p>
 */
public class ModifyInvocationAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

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
    private java.util.List < String > instanceId;

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
    private java.util.Map < String, ? > parameters;

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
    public java.util.List < String > getInstanceId() {
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
    public java.util.Map < String, ? > getParameters() {
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
        private String commandContent; 
        private String contentEncoding; 
        private Boolean enableParameter; 
        private String frequency; 
        private java.util.List < String > instanceId; 
        private String invokeId; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.Map < String, ? > parameters; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInvocationAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
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
         * The content of the command after modification. The command content can be plaintext or Base64-encoded. Take note of the following items:
         * <p>
         * 
         * *   You can specify whether to retain the command after the command is run when you created the command. If you specified to retain the command, the Base64-encoded command content cannot exceed 18 KB in size. If you specified not to retain the command, the Base64-encoded command content cannot exceed 24 KB in size.
         * 
         * *   If the command content is Base64-encoded, set `ContentEncoding` to Base64.
         * 
         * *   If you set `EnableParameter` to true, the custom parameter feature is enabled and you can configure custom parameters based on the following rules:
         * 
         *     *   You can define custom parameters in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.
         *     *   The number of custom parameters cannot exceed 20.
         *     *   A custom parameter name can contain letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive. The ACS:: prefix cannot be used to specify non-built-in environment parameters.
         *     *   Each custom parameter name cannot exceed 64 bytes in length.
         * 
         * *   You can specify built-in environment parameters as custom parameters. Then, when you run the command, these parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:
         * 
         *     *   `{{ACS::RegionId}}`: the region ID.
         * 
         *     *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.
         * 
         *     *   `{{ACS::InstanceId}}`: the instance ID. If you want to specify `{{ACS::InstanceId}}` as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following ones:
         * 
         *         *   Linux: 2.2.3.309
         *         *   Windows: 2.1.3.309
         * 
         *     *   `{{ACS::InstanceName}}`: the instance name. When the command is run on multiple instances, if you want to specify `{{ACS::InstanceName}}` as a built-in environment variable, make sure that the Cloud Assistant Agent version is not earlier than the following ones:
         * 
         *         *   Linux: 2.2.3.344
         *         *   Windows: 2.1.3.344
         * 
         *     *   `{{ACS::InvokeId}}`: the ID of the task. If you want to specify `{{ACS::InvokeId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:
         * 
         *         *   Linux: 2.2.3.309
         *         *   Windows: 2.1.3.309
         * 
         *     *   `{{ACS::CommandId}}`: the command ID. If you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following ones:
         * 
         *         *   Linux: 2.2.3.309
         *         *   Windows: 2.1.3.309
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * The encoding mode of the command content that is specified by `CommandContent`. Valid values (case-insensitive):
         * <p>
         * 
         * *   PlainText: The command content is not encoded.
         * *   Base64: The command content is encoded in Base64.
         * 
         * Default value: PlainText. If the value is invalid, the PlainText mode is used.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Specifies whether to include custom parameters in the command.
         * <p>
         * 
         * *   If you want to enable the custom parameter feature, or configure `Parameters` to modify the custom parameters in the command, set EnableParameter to `true`.
         * *   If you do not want to configure `Parameters` to modify the custom parameters in the command, leave EnableParameter empty or set it to `false`.
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putQueryParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * The frequency at which to run the command. This parameter takes effect only when `RepeatMode` is set to `Period`. You can configure a command to run at a fixed interval based on a rate expression, run only once at a specific point in time, or run at designated points in time based on a cron expression.
         * <p>
         * 
         * *   To run the command at a fixed interval, use a rate expression to specify the interval. You can specify the interval in seconds, minutes, hours, or days. This option is suitable for scenarios in which tasks need to be executed at a fixed interval. Specify the interval in the following format: `rate(<Execution interval value> <Execution interval unit>)`. For example, specify `rate(5m)` to run the command every 5 minutes. Take note of the following limits when you specify an interval:
         * 
         *     *   The specified interval must be in the range of 60 seconds to 7 days and must be longer than the timeout period specified when you created the scheduled task.
         *     *   The interval is the amount of time that elapses between two consecutive executions. The interval is irrelevant to the amount of time that is required to run the command once. For example, you set the interval to 5 minutes and the command requires 2 minutes to run once. Each time the command running is complete, the system waits 3 minutes instead of 5 minutes before the system runs the command again.
         *     *   The point in time at which the command is run the next time is calculated based on the creation time of the task (the [CreationTime](~~64840~~) value returned by the `DescribeInvocations` operation) and the modified execution interval.
         * 
         * *   To run a command only once at a specific time, specify a point in time and a time zone. Specify the point in time in the `at(yyyy-MM-dd HH:mm:ss <Time zone>)` format, which indicates `at(Year-Month-Day Hours:Minutes:Seconds <Time zone>)`. If you do not specify a time zone, the Coordinated Universal Time (UTC) time zone is used by default. You can specify a time zone in the following forms:
         * 
         *     *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.
         *     *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.
         *     *   The time zone abbreviation. Only UTC is supported.
         * 
         *     For example, to configure a command to run only once at 13:15:30 on June 6, 2022 (Shanghai time), set the time to `at(2022-06-06 13:15:30 Asia/Shanghai)`. To configure a command to run only once at 13:15:30 on June 6, 2022 (UTC-7), set the time to `at(2022-06-06 13:15:30 GMT-7:00)`.
         * 
         * *   To run a command at designated points in time, use a cron expression to define the schedule. Specify a schedule in the `<Cron expression> <Time zone>` format. The cron expression is in the `<Seconds> <Minutes> <Hours> <Day of the month> <Month> <Day of the week> <Year (optional)>` format. The system calculates the execution times of the command based on the specified cron expression and time zone and runs the command as scheduled. If you do not specify a time zone, the system time zones of the instances on which you want to run the command are used by default. For information about cron expressions, see [Cron expressions](~~64769~~). You can specify the time zone in the following forms:
         * 
         *     *   The time zone name. Examples: `Asia/Shanghai` and `America/Los_Angeles`.
         *     *   The time offset from GMT. Examples: `GMT+8:00` (UTC+8) and `GMT-7:00` (UTC-7). If you use the GMT format, you cannot add leading zeros to the hour value.
         *     *   The time zone abbreviation. Only UTC is supported. For example, to configure a command to run at 10:15:00 every day in 2022 (Shanghai time), set the schedule to `0 15 10 ? * * 2022 Asia/Shanghai`. To configure a command to run every half an hour from 10:00:00 to 11:30:00 every day in 2022 (UTC+8), set the schedule to `0 0/30 10-11 * * ? 2022 GMT+8:00`. To configure a command to run every 5 minutes from 14:00:00 to 14:55:00 every October every two years from 2022 in UTC, set the schedule to `0 0/5 14 * 10 ? 2022/2 UTC`.
         * 
         *     **
         * 
         *     **Note** The minimum interval must be 10 seconds or longer and cannot be shorter than the timeout period of scheduled executions.
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * The IDs of the ECS instances or managed instances that you want to add to the scheduled command task.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The execution ID of the command.
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
         * The key-value pairs of the custom parameters that are passed in if custom parameters are included in the command.
         * <p>
         * 
         * You can specify 0 to 10 custom parameters. Take note of the following items:
         * 
         * *   The key of a custom parameter can be up to 64 characters in length and cannot be an empty string.
         * *   The value of a custom parameter can be an empty string.
         * *   If you specified to retain the command when you create the command task, the total size of the custom parameters and original command content that are encoded in Base64 cannot exceed 18 KB. If you specified not to retain the command when you create the command task, the total size of the custom parameters and original command content that are encoded in Base64 cannot exceed 24 KB.
         * *   The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.
         * 
         * This parameter is empty by default, which indicates not to modify the key-value pairs of the custom parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * The region ID.
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
