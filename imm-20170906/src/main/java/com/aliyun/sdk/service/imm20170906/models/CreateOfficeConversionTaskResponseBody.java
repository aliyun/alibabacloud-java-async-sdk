// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOfficeConversionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOfficeConversionTaskResponseBody</p>
 */
public class CreateOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Percent")
    private Integer percent;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TgtLoc")
    private String tgtLoc;

    private CreateOfficeConversionTaskResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.percent = builder.percent;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.tgtLoc = builder.tgtLoc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOfficeConversionTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return percent
     */
    public Integer getPercent() {
        return this.percent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return tgtLoc
     */
    public String getTgtLoc() {
        return this.tgtLoc;
    }

    public static final class Builder {
        private String createTime; 
        private Integer percent; 
        private String requestId; 
        private String status; 
        private String taskId; 
        private String tgtLoc; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Percent.
         */
        public Builder percent(Integer percent) {
            this.percent = percent;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TgtLoc.
         */
        public Builder tgtLoc(String tgtLoc) {
            this.tgtLoc = tgtLoc;
            return this;
        }

        public CreateOfficeConversionTaskResponseBody build() {
            return new CreateOfficeConversionTaskResponseBody(this);
        } 

    } 

}
