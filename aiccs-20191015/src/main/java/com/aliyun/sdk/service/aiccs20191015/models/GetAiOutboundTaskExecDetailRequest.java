// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskExecDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAiOutboundTaskExecDetailRequest</p>
 */
public class GetAiOutboundTaskExecDetailRequest extends Request {
    @Query
    @NameInMap("BatchVersion")
    private Integer batchVersion;

    @Query
    @NameInMap("CaseId")
    private Long caseId;

    @Query
    @NameInMap("CaseStatus")
    private Integer caseStatus;

    @Query
    @NameInMap("CreateTimeEnd")
    private Long createTimeEnd;

    @Query
    @NameInMap("CreateTimeStart")
    private Long createTimeStart;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PhoneNum")
    private String phoneNum;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private GetAiOutboundTaskExecDetailRequest(Builder builder) {
        super(builder);
        this.batchVersion = builder.batchVersion;
        this.caseId = builder.caseId;
        this.caseStatus = builder.caseStatus;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.phoneNum = builder.phoneNum;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiOutboundTaskExecDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchVersion
     */
    public Integer getBatchVersion() {
        return this.batchVersion;
    }

    /**
     * @return caseId
     */
    public Long getCaseId() {
        return this.caseId;
    }

    /**
     * @return caseStatus
     */
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    /**
     * @return createTimeEnd
     */
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return phoneNum
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetAiOutboundTaskExecDetailRequest, Builder> {
        private Integer batchVersion; 
        private Long caseId; 
        private Integer caseStatus; 
        private Long createTimeEnd; 
        private Long createTimeStart; 
        private Integer currentPage; 
        private String instanceId; 
        private Integer pageSize; 
        private String phoneNum; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiOutboundTaskExecDetailRequest response) {
            super(response);
            this.batchVersion = response.batchVersion;
            this.caseId = response.caseId;
            this.caseStatus = response.caseStatus;
            this.createTimeEnd = response.createTimeEnd;
            this.createTimeStart = response.createTimeStart;
            this.currentPage = response.currentPage;
            this.instanceId = response.instanceId;
            this.pageSize = response.pageSize;
            this.phoneNum = response.phoneNum;
            this.taskId = response.taskId;
        } 

        /**
         * 任务批次
         */
        public Builder batchVersion(Integer batchVersion) {
            this.putQueryParameter("BatchVersion", batchVersion);
            this.batchVersion = batchVersion;
            return this;
        }

        /**
         * 单条外呼id
         */
        public Builder caseId(Long caseId) {
            this.putQueryParameter("CaseId", caseId);
            this.caseId = caseId;
            return this;
        }

        /**
         * 单条号码任务执行状态（1：待呼叫，2:呼叫中，3:已完成，4:已终止，5:待重呼）
         */
        public Builder caseStatus(Integer caseStatus) {
            this.putQueryParameter("CaseStatus", caseStatus);
            this.caseStatus = caseStatus;
            return this;
        }

        /**
         * 号码导入结束时间戳（毫秒）
         */
        public Builder createTimeEnd(Long createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * 号码导入起始时间戳（毫秒）
         */
        public Builder createTimeStart(Long createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * 当前页数
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 分页大小（<=50）
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 手机号
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * 任务id
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetAiOutboundTaskExecDetailRequest build() {
            return new GetAiOutboundTaskExecDetailRequest(this);
        } 

    } 

}
