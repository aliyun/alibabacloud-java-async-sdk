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

        private Builder(CreateCloudBenchTasksRequest response) {
            super(response);
            this.amount = response.amount;
            this.backupId = response.backupId;
            this.backupTime = response.backupTime;
            this.clientType = response.clientType;
            this.description = response.description;
            this.dstConnectionString = response.dstConnectionString;
            this.dstInstanceId = response.dstInstanceId;
            this.dstPort = response.dstPort;
            this.dstSuperAccount = response.dstSuperAccount;
            this.dstSuperPassword = response.dstSuperPassword;
            this.dstType = response.dstType;
            this.dtsJobClass = response.dtsJobClass;
            this.dtsJobId = response.dtsJobId;
            this.endState = response.endState;
            this.gatewayVpcId = response.gatewayVpcId;
            this.gatewayVpcIp = response.gatewayVpcIp;
            this.rate = response.rate;
            this.requestDuration = response.requestDuration;
            this.requestEndTime = response.requestEndTime;
            this.requestStartTime = response.requestStartTime;
            this.smartPressureTime = response.smartPressureTime;
            this.srcInstanceId = response.srcInstanceId;
            this.srcPublicIp = response.srcPublicIp;
            this.srcSuperAccount = response.srcSuperAccount;
            this.srcSuperPassword = response.srcSuperPassword;
            this.taskType = response.taskType;
            this.workDir = response.workDir;
        } 

        /**
         * Amount.
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * BackupTime.
         */
        public Builder backupTime(String backupTime) {
            this.putQueryParameter("BackupTime", backupTime);
            this.backupTime = backupTime;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DstConnectionString.
         */
        public Builder dstConnectionString(String dstConnectionString) {
            this.putQueryParameter("DstConnectionString", dstConnectionString);
            this.dstConnectionString = dstConnectionString;
            return this;
        }

        /**
         * DstInstanceId.
         */
        public Builder dstInstanceId(String dstInstanceId) {
            this.putQueryParameter("DstInstanceId", dstInstanceId);
            this.dstInstanceId = dstInstanceId;
            return this;
        }

        /**
         * DstPort.
         */
        public Builder dstPort(String dstPort) {
            this.putQueryParameter("DstPort", dstPort);
            this.dstPort = dstPort;
            return this;
        }

        /**
         * DstSuperAccount.
         */
        public Builder dstSuperAccount(String dstSuperAccount) {
            this.putQueryParameter("DstSuperAccount", dstSuperAccount);
            this.dstSuperAccount = dstSuperAccount;
            return this;
        }

        /**
         * DstSuperPassword.
         */
        public Builder dstSuperPassword(String dstSuperPassword) {
            this.putQueryParameter("DstSuperPassword", dstSuperPassword);
            this.dstSuperPassword = dstSuperPassword;
            return this;
        }

        /**
         * DstType.
         */
        public Builder dstType(String dstType) {
            this.putQueryParameter("DstType", dstType);
            this.dstType = dstType;
            return this;
        }

        /**
         * DtsJobClass.
         */
        public Builder dtsJobClass(String dtsJobClass) {
            this.putQueryParameter("DtsJobClass", dtsJobClass);
            this.dtsJobClass = dtsJobClass;
            return this;
        }

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * EndState.
         */
        public Builder endState(String endState) {
            this.putQueryParameter("EndState", endState);
            this.endState = endState;
            return this;
        }

        /**
         * GatewayVpcId.
         */
        public Builder gatewayVpcId(String gatewayVpcId) {
            this.putQueryParameter("GatewayVpcId", gatewayVpcId);
            this.gatewayVpcId = gatewayVpcId;
            return this;
        }

        /**
         * GatewayVpcIp.
         */
        public Builder gatewayVpcIp(String gatewayVpcIp) {
            this.putQueryParameter("GatewayVpcIp", gatewayVpcIp);
            this.gatewayVpcIp = gatewayVpcIp;
            return this;
        }

        /**
         * Rate.
         */
        public Builder rate(String rate) {
            this.putQueryParameter("Rate", rate);
            this.rate = rate;
            return this;
        }

        /**
         * RequestDuration.
         */
        public Builder requestDuration(String requestDuration) {
            this.putQueryParameter("RequestDuration", requestDuration);
            this.requestDuration = requestDuration;
            return this;
        }

        /**
         * RequestEndTime.
         */
        public Builder requestEndTime(String requestEndTime) {
            this.putQueryParameter("RequestEndTime", requestEndTime);
            this.requestEndTime = requestEndTime;
            return this;
        }

        /**
         * RequestStartTime.
         */
        public Builder requestStartTime(String requestStartTime) {
            this.putQueryParameter("RequestStartTime", requestStartTime);
            this.requestStartTime = requestStartTime;
            return this;
        }

        /**
         * SmartPressureTime.
         */
        public Builder smartPressureTime(String smartPressureTime) {
            this.putQueryParameter("SmartPressureTime", smartPressureTime);
            this.smartPressureTime = smartPressureTime;
            return this;
        }

        /**
         * SrcInstanceId.
         */
        public Builder srcInstanceId(String srcInstanceId) {
            this.putQueryParameter("SrcInstanceId", srcInstanceId);
            this.srcInstanceId = srcInstanceId;
            return this;
        }

        /**
         * SrcPublicIp.
         */
        public Builder srcPublicIp(String srcPublicIp) {
            this.putQueryParameter("SrcPublicIp", srcPublicIp);
            this.srcPublicIp = srcPublicIp;
            return this;
        }

        /**
         * SrcSuperAccount.
         */
        public Builder srcSuperAccount(String srcSuperAccount) {
            this.putQueryParameter("SrcSuperAccount", srcSuperAccount);
            this.srcSuperAccount = srcSuperAccount;
            return this;
        }

        /**
         * SrcSuperPassword.
         */
        public Builder srcSuperPassword(String srcSuperPassword) {
            this.putQueryParameter("SrcSuperPassword", srcSuperPassword);
            this.srcSuperPassword = srcSuperPassword;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * WorkDir.
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
