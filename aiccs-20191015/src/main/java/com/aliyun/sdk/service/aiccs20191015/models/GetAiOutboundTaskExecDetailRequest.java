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
         * <p>The job batch version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder batchVersion(Integer batchVersion) {
            this.putQueryParameter("BatchVersion", batchVersion);
            this.batchVersion = batchVersion;
            return this;
        }

        /**
         * <p>Activity ID associated with this outbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder caseId(Long caseId) {
            this.putQueryParameter("CaseId", caseId);
            this.caseId = caseId;
            return this;
        }

        /**
         * <p>Job execution status for a single phone number. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Pending call.</li>
         * <li><strong>2</strong>: Calling.</li>
         * <li><strong>3</strong>: Completed.</li>
         * <li><strong>4</strong>: Stopped.</li>
         * <li><strong>5</strong>: Pending retry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder caseStatus(Integer caseStatus) {
            this.putQueryParameter("CaseStatus", caseStatus);
            this.caseStatus = caseStatus;
            return this;
        }

        /**
         * <p>End time of phone number import. Format: UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1632290119000</p>
         */
        public Builder createTimeEnd(Long createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * <p>Start time of phone number import. Format: UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1632289999000</p>
         */
        public Builder createTimeStart(Long createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * <p>Page size. The value must be greater than <strong>0</strong>. Default Value: <strong>20</strong>.</p>
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
         * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.</p>
         * <p>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
         * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
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
         * <p>The outbound phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>150****000</p>
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API and check the <strong>Data</strong> field in the response, or invoke the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API and check the <strong>TaskId</strong> field in the response.</p>
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
