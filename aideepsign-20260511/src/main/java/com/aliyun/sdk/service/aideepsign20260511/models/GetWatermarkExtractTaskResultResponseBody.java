// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link GetWatermarkExtractTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetWatermarkExtractTaskResultResponseBody</p>
 */
public class GetWatermarkExtractTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvgAcc")
    private Double avgAcc;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Detected")
    private Boolean detected;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("WatermarkContent")
    private String watermarkContent;

    private GetWatermarkExtractTaskResultResponseBody(Builder builder) {
        this.avgAcc = builder.avgAcc;
        this.code = builder.code;
        this.detected = builder.detected;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.watermarkContent = builder.watermarkContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWatermarkExtractTaskResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avgAcc
     */
    public Double getAvgAcc() {
        return this.avgAcc;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return detected
     */
    public Boolean getDetected() {
        return this.detected;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return watermarkContent
     */
    public String getWatermarkContent() {
        return this.watermarkContent;
    }

    public static final class Builder {
        private Double avgAcc; 
        private String code; 
        private Boolean detected; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private String taskId; 
        private String watermarkContent; 

        private Builder() {
        } 

        private Builder(GetWatermarkExtractTaskResultResponseBody model) {
            this.avgAcc = model.avgAcc;
            this.code = model.code;
            this.detected = model.detected;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
            this.taskId = model.taskId;
            this.watermarkContent = model.watermarkContent;
        } 

        /**
         * <p>The average extraction confidence, ranging from 0 to 1. This parameter is returned only when Status is succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        public Builder avgAcc(Double avgAcc) {
            this.avgAcc = avgAcc;
            return this;
        }

        /**
         * <p>The business error code. OK is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether a watermark is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder detected(Boolean detected) {
            this.detected = detected;
            return this;
        }

        /**
         * <p>The HTTP status code. 200 is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The failure reason when the task fails. This parameter is returned only when Status is failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request has failed due to a temporary failure of the server.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>running: In progress.</li>
         * <li>succeeded: Completed.</li>
         * <li>failed: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The dark watermark extraction task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The extracted watermark content. This parameter is returned only when <code>Status</code> is <code>succeeded</code> and <code>Detected=true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>wm-e2e-85970647</p>
         */
        public Builder watermarkContent(String watermarkContent) {
            this.watermarkContent = watermarkContent;
            return this;
        }

        public GetWatermarkExtractTaskResultResponseBody build() {
            return new GetWatermarkExtractTaskResultResponseBody(this);
        } 

    } 

}
