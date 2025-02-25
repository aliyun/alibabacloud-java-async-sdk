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
 * {@link GetAiOutboundTaskExecDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAiOutboundTaskExecDetailRequest</p>
 */
public class GetAiOutboundTaskExecDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchVersion")
    private Integer batchVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseId")
    private Long caseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseStatus")
    private Integer caseStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private Long createTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private Long createTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNum")
    private String phoneNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetAiOutboundTaskExecDetailRequest request) {
            super(request);
            this.batchVersion = request.batchVersion;
            this.caseId = request.caseId;
            this.caseStatus = request.caseStatus;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.phoneNum = request.phoneNum;
            this.taskId = request.taskId;
        } 

        /**
         * BatchVersion.
         */
        public Builder batchVersion(Integer batchVersion) {
            this.putQueryParameter("BatchVersion", batchVersion);
            this.batchVersion = batchVersion;
            return this;
        }

        /**
         * CaseId.
         */
        public Builder caseId(Long caseId) {
            this.putQueryParameter("CaseId", caseId);
            this.caseId = caseId;
            return this;
        }

        /**
         * CaseStatus.
         */
        public Builder caseStatus(Integer caseStatus) {
            this.putQueryParameter("CaseStatus", caseStatus);
            this.caseStatus = caseStatus;
            return this;
        }

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(Long createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(Long createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PhoneNum.
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
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
