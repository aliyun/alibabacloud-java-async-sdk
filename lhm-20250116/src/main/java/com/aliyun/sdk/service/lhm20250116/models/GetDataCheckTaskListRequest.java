// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetDataCheckTaskListRequest} extends {@link RequestModel}
 *
 * <p>GetDataCheckTaskListRequest</p>
 */
public class GetDataCheckTaskListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkResult")
    private Integer checkResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("checkType")
    private Integer checkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createEndTime")
    private String createEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createStartTime")
    private String createStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("execStatus")
    private Integer execStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isScheduled")
    private Integer isScheduled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updateEndTime")
    private String updateEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updateStartTime")
    private String updateStartTime;

    private GetDataCheckTaskListRequest(Builder builder) {
        super(builder);
        this.checkResult = builder.checkResult;
        this.checkType = builder.checkType;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.execStatus = builder.execStatus;
        this.isScheduled = builder.isScheduled;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.taskName = builder.taskName;
        this.templateName = builder.templateName;
        this.updateEndTime = builder.updateEndTime;
        this.updateStartTime = builder.updateStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckTaskListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkResult
     */
    public Integer getCheckResult() {
        return this.checkResult;
    }

    /**
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
    }

    /**
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return execStatus
     */
    public Integer getExecStatus() {
        return this.execStatus;
    }

    /**
     * @return isScheduled
     */
    public Integer getIsScheduled() {
        return this.isScheduled;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return updateEndTime
     */
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    /**
     * @return updateStartTime
     */
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public static final class Builder extends Request.Builder<GetDataCheckTaskListRequest, Builder> {
        private Integer checkResult; 
        private Integer checkType; 
        private String createEndTime; 
        private String createStartTime; 
        private Integer execStatus; 
        private Integer isScheduled; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String taskName; 
        private String templateName; 
        private String updateEndTime; 
        private String updateStartTime; 

        private Builder() {
            super();
        } 

        private Builder(GetDataCheckTaskListRequest request) {
            super(request);
            this.checkResult = request.checkResult;
            this.checkType = request.checkType;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.execStatus = request.execStatus;
            this.isScheduled = request.isScheduled;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.taskName = request.taskName;
            this.templateName = request.templateName;
            this.updateEndTime = request.updateEndTime;
            this.updateStartTime = request.updateStartTime;
        } 

        /**
         * <p>The validation result filter. Valid values:</p>
         * <ul>
         * <li>0: no record.</li>
         * <li>1: passed.</li>
         * <li>2: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder checkResult(Integer checkResult) {
            this.putBodyParameter("checkResult", checkResult);
            this.checkResult = checkResult;
            return this;
        }

        /**
         * <p>The validation type filter. Valid values:</p>
         * <ul>
         * <li>0: row count comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder checkType(Integer checkType) {
            this.putBodyParameter("checkType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>The end of the creation time range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        public Builder createEndTime(String createEndTime) {
            this.putBodyParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * <p>The start of the creation time range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 00:00:00</p>
         */
        public Builder createStartTime(String createStartTime) {
            this.putBodyParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * <p>The execution status filter. Valid values:</p>
         * <ul>
         * <li>0: pending.</li>
         * <li>1: running.</li>
         * <li>2: stopped.</li>
         * <li>3: failed.</li>
         * <li>4: completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder execStatus(Integer execStatus) {
            this.putBodyParameter("execStatus", execStatus);
            this.execStatus = execStatus;
            return this;
        }

        /**
         * <p>Specifies whether scheduling is enabled. Valid values:</p>
         * <ul>
         * <li>0: disabled.</li>
         * <li>1: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isScheduled(Integer isScheduled) {
            this.putBodyParameter("isScheduled", isScheduled);
            this.isScheduled = isScheduled;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The task name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>data_check_task_demo</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The validation template name. Fuzzy match is supported. The server automatically converts the name into a list of template IDs for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>Row Count Validation Template</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The end of the update time range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-14 13:59:03</p>
         */
        public Builder updateEndTime(String updateEndTime) {
            this.putBodyParameter("updateEndTime", updateEndTime);
            this.updateEndTime = updateEndTime;
            return this;
        }

        /**
         * <p>The start of the update time range. Format: YYYY-MM-DD HH:MM:SS.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-14 11:21:53</p>
         */
        public Builder updateStartTime(String updateStartTime) {
            this.putBodyParameter("updateStartTime", updateStartTime);
            this.updateStartTime = updateStartTime;
            return this;
        }

        @Override
        public GetDataCheckTaskListRequest build() {
            return new GetDataCheckTaskListRequest(this);
        } 

    } 

}
