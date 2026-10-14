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
 * {@link GetImageDefectDetectionTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageDefectDetectionTaskResultResponseBody</p>
 */
public class GetImageDefectDetectionTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbnormalityReason")
    private String abnormalityReason;

    @com.aliyun.core.annotation.NameInMap("AbnormalityScore")
    private Float abnormalityScore;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("RiskCode")
    private String riskCode;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetImageDefectDetectionTaskResultResponseBody(Builder builder) {
        this.abnormalityReason = builder.abnormalityReason;
        this.abnormalityScore = builder.abnormalityScore;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.riskCode = builder.riskCode;
        this.status = builder.status;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageDefectDetectionTaskResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalityReason
     */
    public String getAbnormalityReason() {
        return this.abnormalityReason;
    }

    /**
     * @return abnormalityScore
     */
    public Float getAbnormalityScore() {
        return this.abnormalityScore;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return riskCode
     */
    public String getRiskCode() {
        return this.riskCode;
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

    public static final class Builder {
        private String abnormalityReason; 
        private Float abnormalityScore; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String result; 
        private String riskCode; 
        private String status; 
        private Boolean success; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(GetImageDefectDetectionTaskResultResponseBody model) {
            this.abnormalityReason = model.abnormalityReason;
            this.abnormalityScore = model.abnormalityScore;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.riskCode = model.riskCode;
            this.status = model.status;
            this.success = model.success;
            this.taskId = model.taskId;
        } 

        /**
         * <p><strong>The image abnormality reason.</strong> This field is returned only when <code>Status</code> is <code>succeeded</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>The main subject of the image is blurry</p>
         */
        public Builder abnormalityReason(String abnormalityReason) {
            this.abnormalityReason = abnormalityReason;
            return this;
        }

        /**
         * <p><strong>The image abnormality score.</strong> The value ranges from 0 to 1. A higher value indicates a more severe image abnormality. This field is returned only when <code>Status</code> is <code>succeeded</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9667</p>
         */
        public Builder abnormalityScore(Float abnormalityScore) {
            this.abnormalityScore = abnormalityScore;
            return this;
        }

        /**
         * <p><strong>The business error code.</strong> The value &quot;OK&quot; is returned for successful requests.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p><strong>The HTTP status code.</strong> The value 200 is returned for successful requests.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The failure reason. This field is returned only when <code>Status</code> is <code>failed</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>poll timeout: no result within 30m0s</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The raw downstream detection result (JSON string). The <code>AbnormalityScore</code> and <code>AbnormalityReason</code> fields are parsed from this raw result. The raw result is retained for debugging and passing through newly added upstream fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;image_abnormality_score&quot;: 0.75, &quot;image_abnormality_reason&quot;: &quot;The main subject of the image is blurry&quot;}</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The risk code. <strong>This field is deprecated and has no meaning.</strong> Determine whether an abnormality exists based on the AbnormalityScore, AbnormalityReason, and Result fields.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;0&quot;</p>
         */
        public Builder riskCode(String riskCode) {
            this.riskCode = riskCode;
            return this;
        }

        /**
         * <p><strong>The task status.</strong> Valid values:</p>
         * <ul>
         * <li><code>running</code>: The task is running.</li>
         * <li><code>succeeded</code>: The task is completed.</li>
         * <li><code>failed</code>: The task failed.</li>
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
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p><strong>The task ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public GetImageDefectDetectionTaskResultResponseBody build() {
            return new GetImageDefectDetectionTaskResultResponseBody(this);
        } 

    } 

}
