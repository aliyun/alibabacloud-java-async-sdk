// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link MarkOssV2ResultRequest} extends {@link RequestModel}
 *
 * <p>MarkOssV2ResultRequest</p>
 */
public class MarkOssV2ResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeType")
    private String freezeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestIds")
    private String requestIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private MarkOssV2ResultRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.freezeType = builder.freezeType;
        this.operation = builder.operation;
        this.requestIds = builder.requestIds;
        this.startDate = builder.startDate;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkOssV2ResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return freezeType
     */
    public String getFreezeType() {
        return this.freezeType;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return requestIds
     */
    public String getRequestIds() {
        return this.requestIds;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<MarkOssV2ResultRequest, Builder> {
        private String endDate; 
        private String freezeType; 
        private String operation; 
        private String requestIds; 
        private String startDate; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(MarkOssV2ResultRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.freezeType = request.freezeType;
            this.operation = request.operation;
            this.requestIds = request.requestIds;
            this.startDate = request.startDate;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The end time. The time format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-21 16:08:38 +0800</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The freeze type. This parameter is required when Operation is set to freeze. Valid values:</p>
         * <ul>
         * <li>ACL: Modify file permissions.</li>
         * <li>COPY: Move the file directory. Description of the destination directory: 1. The file directory selected when the task was created takes priority. 2. If automatic freezing was not enabled during creation, or ACL freezing was configured, the directory selected during freezing in the console is used. 3. The default directory is alicip_riskfile_backup/.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        public Builder freezeType(String freezeType) {
            this.putQueryParameter("FreezeType", freezeType);
            this.freezeType = freezeType;
            return this;
        }

        /**
         * <p>The processing operation. Valid values:</p>
         * <ul>
         * <li>freeze: Freeze.</li>
         * <li>unfreeze: Unfreeze.</li>
         * <li>misreport: Non-violation false positive.</li>
         * <li>missOut: Violation missed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>freeze</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestIds(String requestIds) {
            this.putQueryParameter("RequestIds", requestIds);
            this.requestIds = requestIds;
            return this;
        }

        /**
         * <p>The start time. The time format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-21 16:08:38 +0800</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Image stock task 20240914100517757</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public MarkOssV2ResultRequest build() {
            return new MarkOssV2ResultRequest(this);
        } 

    } 

}
