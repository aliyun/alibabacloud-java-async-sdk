// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link CreateCloudBenchTasksRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudBenchTasksRequest</p>
 */
public class CreateCloudBenchTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private String amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupTime")
    private String backupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstConnectionString")
    private String dstConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstInstanceId")
    private String dstInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstPort")
    private String dstPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstSuperAccount")
    private String dstSuperAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstSuperPassword")
    private String dstSuperPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstType")
    private String dstType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobClass")
    private String dtsJobClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndState")
    private String endState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayVpcId")
    private String gatewayVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayVpcIp")
    private String gatewayVpcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rate")
    private String rate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestDuration")
    private String requestDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestEndTime")
    private String requestEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestStartTime")
    private String requestStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartPressureTime")
    private String smartPressureTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPublicIp")
    private String srcPublicIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcSuperAccount")
    private String srcSuperAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcSuperPassword")
    private String srcSuperPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkDir")
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
         * <p>The total number of stress testing tasks that you want to create. Valid values: <strong>0</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(String amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>229132</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The time when the backup starts. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-23T13:22:14Z</p>
         */
        public Builder backupTime(String backupTime) {
            this.putQueryParameter("BackupTime", backupTime);
            this.backupTime = backupTime;
            return this;
        }

        /**
         * <p>The type of the stress testing client. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: indicates that you must create the <a href="https://help.aliyun.com/document_detail/64905.html">DBGateway</a>.</li>
         * <li><strong>DAS_ECS</strong>: indicates that DAS automatically purchases and deploys an Elastic Compute Service (ECS) instance for stress testing.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The description of the stress testing task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-das-bench-0501</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The endpoint of the destination instance. The specified endpoint must be the endpoint of an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>DstType</strong> to <strong>ConnectionString</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-de21209****.mysql.rds.aliyuncs.com</p>
         */
        public Builder dstConnectionString(String dstConnectionString) {
            this.putQueryParameter("DstConnectionString", dstConnectionString);
            this.dstConnectionString = dstConnectionString;
            return this;
        }

        /**
         * <p>The ID of the destination instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the <a href="https://help.aliyun.com/document_detail/202857.html">GetInstanceInspections</a> operation to query the ID.</p>
         * <blockquote>
         * <p> This parameter must be specified if you set <strong>DstType</strong> to <strong>Instance</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder dstInstanceId(String dstInstanceId) {
            this.putQueryParameter("DstInstanceId", dstInstanceId);
            this.dstInstanceId = dstInstanceId;
            return this;
        }

        /**
         * <p>The port number of the instance that you want to access.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <strong>DstType</strong> to <strong>ConnectionString</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder dstPort(String dstPort) {
            this.putQueryParameter("DstPort", dstPort);
            this.dstPort = dstPort;
            return this;
        }

        /**
         * <p>The name of the privileged account for the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder dstSuperAccount(String dstSuperAccount) {
            this.putQueryParameter("DstSuperAccount", dstSuperAccount);
            this.dstSuperAccount = dstSuperAccount;
            return this;
        }

        /**
         * <p>The password of the privileged account for the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder dstSuperPassword(String dstSuperPassword) {
            this.putQueryParameter("DstSuperPassword", dstSuperPassword);
            this.dstSuperPassword = dstSuperPassword;
            return this;
        }

        /**
         * <p>The type of the identifier that is used to indicate the destination instance. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong>: the instance ID. This is the default value.</li>
         * <li><strong>ConnectionString</strong>: the endpoint of the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder dstType(String dstType) {
            this.putQueryParameter("DstType", dstType);
            this.dstType = dstType;
            return this;
        }

        /**
         * <p>The specification of the Data Transmission Service (DTS) migration task. You can call the <a href="https://help.aliyun.com/document_detail/230669.html">DescribeCloudbenchTask</a> operation to query the specification.</p>
         * <blockquote>
         * <p> You must migrate the basic data in the source instance to the destination instance before you start a stress testing task. When you create a DTS migration task, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        public Builder dtsJobClass(String dtsJobClass) {
            this.putQueryParameter("DtsJobClass", dtsJobClass);
            this.dtsJobClass = dtsJobClass;
            return this;
        }

        /**
         * <p>The ID of the DTS migration task. You can call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to query the ID.</p>
         * <blockquote>
         * <p> After a DTS migration task is created in the DTS console, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23127</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The state that specifies the last operation that is performed for the stress testing task. Valid values:</p>
         * <ul>
         * <li><strong>WAIT_TARGET</strong>: prepares the destination instance</li>
         * <li><strong>WAIT_DBGATEWAY</strong>: prepares the DBGateway</li>
         * <li><strong>WAIT_SQL</strong>: prepares the full SQL statistics</li>
         * <li><strong>WAIT_LOGIC</strong>: prepares to replay the traffic</li>
         * </ul>
         * <blockquote>
         * <p> When the state of a stress testing task changes to the state that is specified by the EndState parameter, the stress testing task becomes completed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WAIT_TARGET</p>
         */
        public Builder endState(String endState) {
            this.putQueryParameter("EndState", endState);
            this.endState = endState;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the database gateway (DBGateway) is deployed.</p>
         * <blockquote>
         * <p> This parameter must be specified if you set <strong>ClientType</strong> to <strong>ECS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4nsnwvpbc1h76ja4****</p>
         */
        public Builder gatewayVpcId(String gatewayVpcId) {
            this.putQueryParameter("GatewayVpcId", gatewayVpcId);
            this.gatewayVpcId = gatewayVpcId;
            return this;
        }

        /**
         * <p>The IP address or domain name of the DBGateway.</p>
         * <blockquote>
         * <p> This parameter must be specified if you set <strong>ClientType</strong> to <strong>ECS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.30.XX.XX</p>
         */
        public Builder gatewayVpcIp(String gatewayVpcIp) {
            this.putQueryParameter("GatewayVpcIp", gatewayVpcIp);
            this.gatewayVpcIp = gatewayVpcIp;
            return this;
        }

        /**
         * <p>The rate at which the traffic captured from the source instance is replayed on the destination instance. The value must be a positive integer. Valid values: <strong>1</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder rate(String rate) {
            this.putQueryParameter("Rate", rate);
            this.rate = rate;
            return this;
        }

        /**
         * <p>The duration of the stress testing task for which the traffic is captured from the source instance. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400000</p>
         */
        public Builder requestDuration(String requestDuration) {
            this.putQueryParameter("RequestDuration", requestDuration);
            this.requestDuration = requestDuration;
            return this;
        }

        /**
         * <p>The time when the stress testing task ends. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296001</p>
         */
        public Builder requestEndTime(String requestEndTime) {
            this.putQueryParameter("RequestEndTime", requestEndTime);
            this.requestEndTime = requestEndTime;
            return this;
        }

        /**
         * <p>The time when the stress testing task starts. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        public Builder requestStartTime(String requestStartTime) {
            this.putQueryParameter("RequestStartTime", requestStartTime);
            this.requestStartTime = requestStartTime;
            return this;
        }

        /**
         * <p>The duration within which the traffic generation stressing test takes effect. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This parameter must be specified if you set <strong>TaskType</strong> to <strong>smart pressure test</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400000</p>
         */
        public Builder smartPressureTime(String smartPressureTime) {
            this.putQueryParameter("SmartPressureTime", smartPressureTime);
            this.smartPressureTime = smartPressureTime;
            return this;
        }

        /**
         * <p>The ID of the source instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the <a href="https://help.aliyun.com/document_detail/202857.html">GetInstanceInspections</a> operation to query the ID.</p>
         * <blockquote>
         * <p> This parameter must be specified if you set <strong>DstType</strong> to <strong>Instance</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder srcInstanceId(String srcInstanceId) {
            this.putQueryParameter("SrcInstanceId", srcInstanceId);
            this.srcInstanceId = srcInstanceId;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder srcPublicIp(String srcPublicIp) {
            this.putQueryParameter("SrcPublicIp", srcPublicIp);
            this.srcPublicIp = srcPublicIp;
            return this;
        }

        /**
         * <p>The name of the privileged account for the source instance. Set the value to <strong>admin</strong>.</p>
         * <blockquote>
         * <p> This parameter must be specified if you set <strong>DstType</strong> to <strong>Instance</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder srcSuperAccount(String srcSuperAccount) {
            this.putQueryParameter("SrcSuperAccount", srcSuperAccount);
            this.srcSuperAccount = srcSuperAccount;
            return this;
        }

        /**
         * <p>The password of the privileged account for the source instance.</p>
         * <blockquote>
         * <p> This parameter must be specified if you set <strong>DstType</strong> to <strong>Instance</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        public Builder srcSuperPassword(String srcSuperPassword) {
            this.putQueryParameter("SrcSuperPassword", srcSuperPassword);
            this.srcSuperPassword = srcSuperPassword;
            return this;
        }

        /**
         * <p>The type of the stress testing task. Valid values:</p>
         * <ul>
         * <li><strong>pressure test</strong> (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.</li>
         * <li><strong>smart pressure test</strong>: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pressure test</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The temporary directory generated for stress testing.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/bench/</p>
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
