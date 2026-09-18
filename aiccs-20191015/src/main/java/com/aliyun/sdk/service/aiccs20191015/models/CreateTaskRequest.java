// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallString")
    private String callString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallStringType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callStringType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryCount")
    private Integer retryCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryFlag")
    private Integer retryFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInterval")
    private Integer retryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryStatusCode")
    private String retryStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String seatCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartNow")
    private Boolean startNow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkTimeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workTimeList;

    private CreateTaskRequest(Builder builder) {
        super(builder);
        this.callString = builder.callString;
        this.callStringType = builder.callStringType;
        this.caller = builder.caller;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retryCount = builder.retryCount;
        this.retryFlag = builder.retryFlag;
        this.retryInterval = builder.retryInterval;
        this.retryStatusCode = builder.retryStatusCode;
        this.robotId = builder.robotId;
        this.seatCount = builder.seatCount;
        this.startNow = builder.startNow;
        this.taskName = builder.taskName;
        this.workDay = builder.workDay;
        this.workTimeList = builder.workTimeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callString
     */
    public String getCallString() {
        return this.callString;
    }

    /**
     * @return callStringType
     */
    public String getCallStringType() {
        return this.callStringType;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return retryCount
     */
    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * @return retryFlag
     */
    public Integer getRetryFlag() {
        return this.retryFlag;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return retryStatusCode
     */
    public String getRetryStatusCode() {
        return this.retryStatusCode;
    }

    /**
     * @return robotId
     */
    public String getRobotId() {
        return this.robotId;
    }

    /**
     * @return seatCount
     */
    public String getSeatCount() {
        return this.seatCount;
    }

    /**
     * @return startNow
     */
    public Boolean getStartNow() {
        return this.startNow;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return workDay
     */
    public String getWorkDay() {
        return this.workDay;
    }

    /**
     * @return workTimeList
     */
    public String getWorkTimeList() {
        return this.workTimeList;
    }

    public static final class Builder extends Request.Builder<CreateTaskRequest, Builder> {
        private String callString; 
        private String callStringType; 
        private String caller; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retryCount; 
        private Integer retryFlag; 
        private Integer retryInterval; 
        private String retryStatusCode; 
        private String robotId; 
        private String seatCount; 
        private Boolean startNow; 
        private String taskName; 
        private String workDay; 
        private String workTimeList; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskRequest request) {
            super(request);
            this.callString = request.callString;
            this.callStringType = request.callStringType;
            this.caller = request.caller;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retryCount = request.retryCount;
            this.retryFlag = request.retryFlag;
            this.retryInterval = request.retryInterval;
            this.retryStatusCode = request.retryStatusCode;
            this.robotId = request.robotId;
            this.seatCount = request.seatCount;
            this.startNow = request.startNow;
            this.taskName = request.taskName;
            this.workDay = request.workDay;
            this.workTimeList = request.workTimeList;
        } 

        /**
         * <p>Call string (callee information and parameter list). Valid values:</p>
         * <ul>
         * <li><strong>LIST</strong>: <code>05715678****,05715679****</code></li>
         * <li><strong>JSON</strong>: <code>{&quot;ParamNames&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;CalleeList&quot;:[{&quot;Callee&quot;:&quot;1810000****&quot;,&quot;Params&quot;:[&quot;Zhang San&quot;,&quot;20&quot;]},{&quot;Callee&quot;:&quot;1810001****&quot;,&quot;Params&quot;:[&quot;Li Si&quot;,&quot;21&quot;]}]}</code>. In this example, ParamNames represents the List of Parameter Names; Params represents the List of parameter values.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The order of the Parameter Name List and the parameter value List must correspond.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>A maximum of 1 000 callee numbers is allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ParamNames&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;CalleeList&quot;:[{&quot;Callee&quot;:&quot;1810000****&quot;,&quot;Params&quot;:[&quot;张三&quot;,&quot;20&quot;]},{&quot;Callee&quot;:&quot;1810001****&quot;,&quot;Params&quot;:[&quot;李四&quot;,&quot;21&quot;]}]}</p>
         */
        public Builder callString(String callString) {
            this.putQueryParameter("CallString", callString);
            this.callString = callString;
            return this;
        }

        /**
         * <p>Call string type. Valid values:  </p>
         * <ul>
         * <li><strong>LIST</strong>  </li>
         * <li><strong>JSON</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder callStringType(String callStringType) {
            this.putQueryParameter("CallStringType", callStringType);
            this.callStringType = callStringType;
            return this;
        }

        /**
         * <p>Outbound caller number.</p>
         * <blockquote>
         * <p>The number must be a purchased number. Separate multiple numbers with commas (,).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0571<strong><strong>5678,0571</strong></strong>5679</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
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
         * <p>Retry Count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder retryCount(Integer retryCount) {
            this.putQueryParameter("RetryCount", retryCount);
            this.retryCount = retryCount;
            return this;
        }

        /**
         * <p>Whether to enable automatic retry. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Retry.</li>
         * <li><strong>0</strong>: No retry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retryFlag(Integer retryFlag) {
            this.putQueryParameter("RetryFlag", retryFlag);
            this.retryFlag = retryFlag;
            return this;
        }

        /**
         * <p>Retry interval. Unit: minute. Must be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * <p>Call statuses that require redialing. Separate multiple statuses with commas (,). Valid values:  </p>
         * <ul>
         * <li><strong>200010</strong>: Power off  </li>
         * <li><strong>200011</strong>: Service suspended  </li>
         * <li><strong>200002</strong>: Busy  </li>
         * <li><strong>200012</strong>: Call failed  </li>
         * <li><strong>200005</strong>: Unable to connect  </li>
         * <li><strong>200003</strong>: No acknowledgement</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200010,200011</p>
         */
        public Builder retryStatusCode(String retryStatusCode) {
            this.putQueryParameter("RetryStatusCode", retryStatusCode);
            this.retryStatusCode = retryStatusCode;
            return this;
        }

        /**
         * <p>ID of the specified robot (script ID), indicating which robot script to use for initiating calls.  </p>
         * <p>You can obtain the script ID on the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> page in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder robotId(String robotId) {
            this.putQueryParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        /**
         * <p>Concurrency (number of agents).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder seatCount(String seatCount) {
            this.putQueryParameter("SeatCount", seatCount);
            this.seatCount = seatCount;
            return this;
        }

        /**
         * <p>Indicates whether to start immediately.  </p>
         * <ul>
         * <li><strong>true</strong>: Yes.  </li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>是</p>
         */
        public Builder startNow(Boolean startNow) {
            this.putQueryParameter("StartNow", startNow);
            this.startNow = startNow;
            return this;
        }

        /**
         * <p>Task Name. Supports Chinese and English characters. Length: 0 to 30 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试任务</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>Work day. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Monday.</li>
         * <li><strong>2</strong>: Tuesday.</li>
         * <li><strong>3</strong>: Wednesday.</li>
         * <li><strong>4</strong>: Thursday.</li>
         * <li><strong>5</strong>: Friday.</li>
         * <li><strong>6</strong>: Saturday.</li>
         * <li><strong>7</strong>: Sunday.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workDay(String workDay) {
            this.putQueryParameter("WorkDay", workDay);
            this.workDay = workDay;
            return this;
        }

        /**
         * <p>List of working hours (accurate to the minute).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00-12:00,13:00-14:00</p>
         */
        public Builder workTimeList(String workTimeList) {
            this.putQueryParameter("WorkTimeList", workTimeList);
            this.workTimeList = workTimeList;
            return this;
        }

        @Override
        public CreateTaskRequest build() {
            return new CreateTaskRequest(this);
        } 

    } 

}
