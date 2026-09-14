// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link RunCrawlerResponseBody} extends {@link TeaModel}
 *
 * <p>RunCrawlerResponseBody</p>
 */
public class RunCrawlerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunAccepted")
    private Boolean runAccepted;

    @com.aliyun.core.annotation.NameInMap("RunStatus")
    private String runStatus;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
    private Long taskInstanceId;

    private RunCrawlerResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.runAccepted = builder.runAccepted;
        this.runStatus = builder.runStatus;
        this.success = builder.success;
        this.taskInstanceId = builder.taskInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCrawlerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runAccepted
     */
    public Boolean getRunAccepted() {
        return this.runAccepted;
    }

    /**
     * @return runStatus
     */
    public String getRunStatus() {
        return this.runStatus;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskInstanceId
     */
    public Long getTaskInstanceId() {
        return this.taskInstanceId;
    }

    public static final class Builder {
        private Long id; 
        private String requestId; 
        private Boolean runAccepted; 
        private String runStatus; 
        private Boolean success; 
        private Long taskInstanceId; 

        private Builder() {
        } 

        private Builder(RunCrawlerResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
            this.runAccepted = model.runAccepted;
            this.runStatus = model.runStatus;
            this.success = model.success;
            this.taskInstanceId = model.taskInstanceId;
        } 

        /**
         * <p>The ID of the metadata crawler.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the run request was accepted. A value of true indicates that the request was accepted, but does not indicate that the collection task is complete.</p>
         */
        public Builder runAccepted(Boolean runAccepted) {
            this.runAccepted = runAccepted;
            return this;
        }

        /**
         * <p>The initial run status after submission. The value is WAITING when the run request is successfully accepted. To query the final status, call ListCrawlerRuns.</p>
         * 
         * <strong>example:</strong>
         * <p>WAITING</p>
         */
        public Builder runStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The associated DataWorks task instance ID. This field may be empty. To query the final run record, call ListCrawlerRuns.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder taskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }

        public RunCrawlerResponseBody build() {
            return new RunCrawlerResponseBody(this);
        } 

    } 

}
