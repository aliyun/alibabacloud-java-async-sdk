// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudBenchTasksRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudBenchTasksRequest</p>
 */
public class CreateCloudBenchTasksRequest extends Request {
    @Query
    @NameInMap("Amount")
    private String amount;

    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("BackupTime")
    private String backupTime;

    @Query
    @NameInMap("ClientType")
    @Validation(required = true)
    private String clientType;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("DstConnectionString")
    private String dstConnectionString;

    @Query
    @NameInMap("DstInstanceId")
    private String dstInstanceId;

    @Query
    @NameInMap("DstPort")
    private String dstPort;

    @Query
    @NameInMap("DstSuperAccount")
    private String dstSuperAccount;

    @Query
    @NameInMap("DstSuperPassword")
    private String dstSuperPassword;

    @Query
    @NameInMap("DstType")
    private String dstType;

    @Query
    @NameInMap("DtsJobClass")
    private String dtsJobClass;

    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("EndState")
    private String endState;

    @Query
    @NameInMap("GatewayVpcId")
    private String gatewayVpcId;

    @Query
    @NameInMap("GatewayVpcIp")
    private String gatewayVpcIp;

    @Query
    @NameInMap("Rate")
    private String rate;

    @Query
    @NameInMap("RequestDuration")
    private String requestDuration;

    @Query
    @NameInMap("RequestEndTime")
    private String requestEndTime;

    @Query
    @NameInMap("RequestStartTime")
    private String requestStartTime;

    @Query
    @NameInMap("SmartPressureTime")
    private String smartPressureTime;

    @Query
    @NameInMap("SrcInstanceId")
    @Validation(required = true)
    private String srcInstanceId;

    @Query
    @NameInMap("SrcPublicIp")
    private String srcPublicIp;

    @Query
    @NameInMap("SrcSuperAccount")
    private String srcSuperAccount;

    @Query
    @NameInMap("SrcSuperPassword")
    private String srcSuperPassword;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    @Query
    @NameInMap("WorkDir")
    private String workDir;

    private CreateCloudBenchTasksRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.backupId = builder.backupId;
        this.backupTime = builder.backupTime;
        this.clientType = builder.clientType;
        this.description = builder.description;
        this.dstConnectionString = builder.dstConnectionString;
        this.dstInstanceId = builder.dstInstanceId;
        this.dstPort = builder.dstPort;
        this.dstSuperAccount = builder.dstSuperAccount;
        this.dstSuperPassword = builder.dstSuperPassword;
        this.dstType = builder.dstType;
        this.dtsJobClass = builder.dtsJobClass;
        this.dtsJobId = builder.dtsJobId;
        this.endState = builder.endState;
        this.gatewayVpcId = builder.gatewayVpcId;
        this.gatewayVpcIp = builder.gatewayVpcIp;
        this.rate = builder.rate;
        this.requestDuration = builder.requestDuration;
        this.requestEndTime = builder.requestEndTime;
        this.requestStartTime = builder.requestStartTime;
        this.smartPressureTime = builder.smartPressureTime;
        this.srcInstanceId = builder.srcInstanceId;
        this.srcPublicIp = builder.srcPublicIp;
        this.srcSuperAccount = builder.srcSuperAccount;
        this.srcSuperPassword = builder.srcSuperPassword;
        this.taskType = builder.taskType;
        this.workDir = builder.workDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudBenchTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupTime
     */
    public String getBackupTime() {
        return this.backupTime;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dstConnectionString
     */
    public String getDstConnectionString() {
        return this.dstConnectionString;
    }

    /**
     * @return dstInstanceId
     */
    public String getDstInstanceId() {
        return this.dstInstanceId;
    }

    /**
     * @return dstPort
     */
    public String getDstPort() {
        return this.dstPort;
    }

    /**
     * @return dstSuperAccount
     */
    public String getDstSuperAccount() {
        return this.dstSuperAccount;
    }

    /**
     * @return dstSuperPassword
     */
    public String getDstSuperPassword() {
        return this.dstSuperPassword;
    }

    /**
     * @return dstType
     */
    public String getDstType() {
        return this.dstType;
    }

    /**
     * @return dtsJobClass
     */
    public String getDtsJobClass() {
        return this.dtsJobClass;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return endState
     */
    public String getEndState() {
        return this.endState;
    }

    /**
     * @return gatewayVpcId
     */
    public String getGatewayVpcId() {
        return this.gatewayVpcId;
    }

    /**
     * @return gatewayVpcIp
     */
    public String getGatewayVpcIp() {
        return this.gatewayVpcIp;
    }

    /**
     * @return rate
     */
    public String getRate() {
        return this.rate;
    }

    /**
     * @return requestDuration
     */
    public String getRequestDuration() {
        return this.requestDuration;
    }

    /**
     * @return requestEndTime
     */
    public String getRequestEndTime() {
        return this.requestEndTime;
    }

    /**
     * @return requestStartTime
     */
    public String getRequestStartTime() {
        return this.requestStartTime;
    }

    /**
     * @return smartPressureTime
     */
    public String getSmartPressureTime() {
        return this.smartPressureTime;
    }

    /**
     * @return srcInstanceId
     */
    public String getSrcInstanceId() {
        return this.srcInstanceId;
    }

    /**
     * @return srcPublicIp
     */
    public String getSrcPublicIp() {
        return this.srcPublicIp;
    }

    /**
     * @return srcSuperAccount
     */
    public String getSrcSuperAccount() {
        return this.srcSuperAccount;
    }

    /**
     * @return srcSuperPassword
     */
    public String getSrcSuperPassword() {
        return this.srcSuperPassword;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return workDir
     */
    public String getWorkDir() {
        return this.workDir;
    }

    public static final class Builder extends Request.Builder<CreateCloudBenchTasksRequest, Builder> {
        private String amount; 
        private String backupId; 
        private String backupTime; 
        private String clientType; 
        private String description; 
        private String dstConnectionString; 
        private String dstInstanceId; 
        private String dstPort; 
        private String dstSuperAccount; 
        private String dstSuperPassword; 
        private String dstType; 
        private String dtsJobClass; 
        private String dtsJobId; 
        private String endState; 
        private String gatewayVpcId; 
        private String gatewayVpcIp; 
        private String rate; 
        private String requestDuration; 
        private String requestEndTime; 
        private String requestStartTime; 
        private String smartPressureTime; 
        private String srcInstanceId; 
        private String srcPublicIp; 
        private String srcSuperAccount; 
        private String srcSuperPassword; 
        private String taskType; 
        private String workDir; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudBenchTasksRequest request) {
            super(request);
            this.amount = request.amount;
            this.backupId = request.backupId;
            this.backupTime = request.backupTime;
            this.clientType = request.clientType;
            this.description = request.description;
            this.dstConnectionString = request.dstConnectionString;
            this.dstInstanceId = request.dstInstanceId;
            this.dstPort = request.dstPort;
            this.dstSuperAccount = request.dstSuperAccount;
            this.dstSuperPassword = request.dstSuperPassword;
            this.dstType = request.dstType;
            this.dtsJobClass = request.dtsJobClass;
            this.dtsJobId = request.dtsJobId;
            this.endState = request.endState;
            this.gatewayVpcId = request.gatewayVpcId;
            this.gatewayVpcIp = request.gatewayVpcIp;
            this.rate = request.rate;
            this.requestDuration = request.requestDuration;
            this.requestEndTime = request.requestEndTime;
            this.requestStartTime = request.requestStartTime;
            this.smartPressureTime = request.smartPressureTime;
            this.srcInstanceId = request.srcInstanceId;
            this.srcPublicIp = request.srcPublicIp;
            this.srcSuperAccount = request.srcSuperAccount;
            this.srcSuperPassword = request.srcSuperPassword;
            this.taskType = request.taskType;
            this.workDir = request.workDir;
        } 

        /**
         * The total number of stress testing tasks that you want to create. Valid values: **0** to **30**. Default value: **1**.
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * The ID of the backup set. You can call the [DescribeBackups](~~26273~~) operation to query the ID of the backup set.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The time when the backup starts. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder backupTime(String backupTime) {
            this.putQueryParameter("BackupTime", backupTime);
            this.backupTime = backupTime;
            return this;
        }

        /**
         * The type of the stress testing client. Valid values:
         * <p>
         * 
         * *   **ECS**: indicates that you must create the [DBGateway](~~64905~~).
         * *   **DAS_ECS**: indicates that DAS automatically purchases and deploys an Elastic Compute Service (ECS) instance for stress testing.
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * The description of the stress testing task.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The endpoint of the destination instance. The specified endpoint must be the endpoint of an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.
         * <p>
         * 
         * >  This parameter takes effect only if you set **DstType** to **ConnectionString**.
         */
        public Builder dstConnectionString(String dstConnectionString) {
            this.putQueryParameter("DstConnectionString", dstConnectionString);
            this.dstConnectionString = dstConnectionString;
            return this;
        }

        /**
         * The ID of the destination instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the [GetInstanceInspections](~~202857~~) operation to query the ID.
         * <p>
         * 
         * >  This parameter must be specified if you set **DstType** to **Instance**.
         */
        public Builder dstInstanceId(String dstInstanceId) {
            this.putQueryParameter("DstInstanceId", dstInstanceId);
            this.dstInstanceId = dstInstanceId;
            return this;
        }

        /**
         * The port number of the instance that you want to access.
         * <p>
         * 
         * >  This parameter takes effect only if you set **DstType** to **ConnectionString**.
         */
        public Builder dstPort(String dstPort) {
            this.putQueryParameter("DstPort", dstPort);
            this.dstPort = dstPort;
            return this;
        }

        /**
         * The name of the privileged account for the destination instance.
         */
        public Builder dstSuperAccount(String dstSuperAccount) {
            this.putQueryParameter("DstSuperAccount", dstSuperAccount);
            this.dstSuperAccount = dstSuperAccount;
            return this;
        }

        /**
         * The password of the privileged account for the destination instance.
         */
        public Builder dstSuperPassword(String dstSuperPassword) {
            this.putQueryParameter("DstSuperPassword", dstSuperPassword);
            this.dstSuperPassword = dstSuperPassword;
            return this;
        }

        /**
         * The type of the identifier that is used to indicate the destination instance. Valid values:
         * <p>
         * 
         * *   **Instance**: the instance ID. This is the default value.
         * *   **ConnectionString**: the endpoint of the instance.
         */
        public Builder dstType(String dstType) {
            this.putQueryParameter("DstType", dstType);
            this.dstType = dstType;
            return this;
        }

        /**
         * The specification of the Data Transmission Service (DTS) migration task. You can call the [DescribeCloudbenchTask](~~230669~~) operation to query the specification.
         * <p>
         * 
         * >  You must migrate the basic data in the source instance to the destination instance before you start a stress testing task. When you create a DTS migration task, you must specify this parameter.
         */
        public Builder dtsJobClass(String dtsJobClass) {
            this.putQueryParameter("DtsJobClass", dtsJobClass);
            this.dtsJobClass = dtsJobClass;
            return this;
        }

        /**
         * The ID of the DTS migration task. You can call the [ConfigureDtsJob](~~208399~~) operation to query the ID.
         * <p>
         * 
         * >  After a DTS migration task is created in the DTS console, you must specify this parameter.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The state that specifies the last operation that is performed for the stress testing task. Valid values:
         * <p>
         * 
         * *   **WAIT_TARGET**: prepares the destination instance
         * *   **WAIT_DBGATEWAY**: prepares the DBGateway
         * *   **WAIT_SQL**: prepares the full SQL statistics
         * *   **WAIT_LOGIC**: prepares to replay the traffic
         * 
         * >  When the state of a stress testing task changes to the state that is specified by the EndState parameter, the stress testing task becomes completed.
         */
        public Builder endState(String endState) {
            this.putQueryParameter("EndState", endState);
            this.endState = endState;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) in which the database gateway (DBGateway) is deployed.
         * <p>
         * 
         * >  This parameter must be specified if you set **ClientType** to **ECS**.
         */
        public Builder gatewayVpcId(String gatewayVpcId) {
            this.putQueryParameter("GatewayVpcId", gatewayVpcId);
            this.gatewayVpcId = gatewayVpcId;
            return this;
        }

        /**
         * The IP address or domain name of the DBGateway.
         * <p>
         * 
         * >  This parameter must be specified if you set **ClientType** to **ECS**.
         */
        public Builder gatewayVpcIp(String gatewayVpcIp) {
            this.putQueryParameter("GatewayVpcIp", gatewayVpcIp);
            this.gatewayVpcIp = gatewayVpcIp;
            return this;
        }

        /**
         * The rate at which the traffic captured from the source instance is replayed on the destination instance. The value must be a positive integer. Valid values: **1** to **30**. Default value: **1**.
         */
        public Builder rate(String rate) {
            this.putQueryParameter("Rate", rate);
            this.rate = rate;
            return this;
        }

        /**
         * The duration of the stress testing task for which the traffic is captured from the source instance. Unit: milliseconds.
         */
        public Builder requestDuration(String requestDuration) {
            this.putQueryParameter("RequestDuration", requestDuration);
            this.requestDuration = requestDuration;
            return this;
        }

        /**
         * The time when the stress testing task ends. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder requestEndTime(String requestEndTime) {
            this.putQueryParameter("RequestEndTime", requestEndTime);
            this.requestEndTime = requestEndTime;
            return this;
        }

        /**
         * The time when the stress testing task starts. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder requestStartTime(String requestStartTime) {
            this.putQueryParameter("RequestStartTime", requestStartTime);
            this.requestStartTime = requestStartTime;
            return this;
        }

        /**
         * The duration within which the traffic generation stressing test takes effect. Unit: milliseconds.
         * <p>
         * 
         * >  This parameter must be specified if you set **TaskType** to **smart pressure test**.
         */
        public Builder smartPressureTime(String smartPressureTime) {
            this.putQueryParameter("SmartPressureTime", smartPressureTime);
            this.smartPressureTime = smartPressureTime;
            return this;
        }

        /**
         * The ID of the source instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the [GetInstanceInspections](~~202857~~) operation to query the ID.
         * <p>
         * 
         * >  This parameter must be specified if you set **DstType** to **Instance**.
         */
        public Builder srcInstanceId(String srcInstanceId) {
            this.putQueryParameter("SrcInstanceId", srcInstanceId);
            this.srcInstanceId = srcInstanceId;
            return this;
        }

        /**
         * The reserved parameter.
         */
        public Builder srcPublicIp(String srcPublicIp) {
            this.putQueryParameter("SrcPublicIp", srcPublicIp);
            this.srcPublicIp = srcPublicIp;
            return this;
        }

        /**
         * The name of the privileged account for the source instance. Set the value to **admin**.
         * <p>
         * 
         * >  This parameter must be specified if you set **DstType** to **Instance**.
         */
        public Builder srcSuperAccount(String srcSuperAccount) {
            this.putQueryParameter("SrcSuperAccount", srcSuperAccount);
            this.srcSuperAccount = srcSuperAccount;
            return this;
        }

        /**
         * The password of the privileged account for the source instance.
         * <p>
         * 
         * >  This parameter must be specified if you set **DstType** to **Instance**.
         */
        public Builder srcSuperPassword(String srcSuperPassword) {
            this.putQueryParameter("SrcSuperPassword", srcSuperPassword);
            this.srcSuperPassword = srcSuperPassword;
            return this;
        }

        /**
         * The type of the stress testing task. Valid values:
         * <p>
         * 
         * *   **pressure test** (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.
         * *   **smart pressure test**: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * The temporary directory generated for stress testing.
         */
        public Builder workDir(String workDir) {
            this.putQueryParameter("WorkDir", workDir);
            this.workDir = workDir;
            return this;
        }

        @Override
        public CreateCloudBenchTasksRequest build() {
            return new CreateCloudBenchTasksRequest(this);
        } 

    } 

}
