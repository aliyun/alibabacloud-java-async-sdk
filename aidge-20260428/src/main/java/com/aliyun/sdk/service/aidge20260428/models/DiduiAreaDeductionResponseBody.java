// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link DiduiAreaDeductionResponseBody} extends {@link TeaModel}
 *
 * <p>DiduiAreaDeductionResponseBody</p>
 */
public class DiduiAreaDeductionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DiduiAreaDeductionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiduiAreaDeductionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DiduiAreaDeductionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DiduiAreaDeductionResponseBody build() {
            return new DiduiAreaDeductionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DiduiAreaDeductionResponseBody} extends {@link TeaModel}
     *
     * <p>DiduiAreaDeductionResponseBody</p>
     */
    public static class Stage4AreaLabel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaM2")
        private Double areaM2;

        @com.aliyun.core.annotation.NameInMap("LeftEdgeM")
        private Double leftEdgeM;

        @com.aliyun.core.annotation.NameInMap("RightEdgeM")
        private Double rightEdgeM;

        private Stage4AreaLabel(Builder builder) {
            this.areaM2 = builder.areaM2;
            this.leftEdgeM = builder.leftEdgeM;
            this.rightEdgeM = builder.rightEdgeM;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stage4AreaLabel create() {
            return builder().build();
        }

        /**
         * @return areaM2
         */
        public Double getAreaM2() {
            return this.areaM2;
        }

        /**
         * @return leftEdgeM
         */
        public Double getLeftEdgeM() {
            return this.leftEdgeM;
        }

        /**
         * @return rightEdgeM
         */
        public Double getRightEdgeM() {
            return this.rightEdgeM;
        }

        public static final class Builder {
            private Double areaM2; 
            private Double leftEdgeM; 
            private Double rightEdgeM; 

            private Builder() {
            } 

            private Builder(Stage4AreaLabel model) {
                this.areaM2 = model.areaM2;
                this.leftEdgeM = model.leftEdgeM;
                this.rightEdgeM = model.rightEdgeM;
            } 

            /**
             * AreaM2.
             */
            public Builder areaM2(Double areaM2) {
                this.areaM2 = areaM2;
                return this;
            }

            /**
             * LeftEdgeM.
             */
            public Builder leftEdgeM(Double leftEdgeM) {
                this.leftEdgeM = leftEdgeM;
                return this;
            }

            /**
             * RightEdgeM.
             */
            public Builder rightEdgeM(Double rightEdgeM) {
                this.rightEdgeM = rightEdgeM;
                return this;
            }

            public Stage4AreaLabel build() {
                return new Stage4AreaLabel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiduiAreaDeductionResponseBody} extends {@link TeaModel}
     *
     * <p>DiduiAreaDeductionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Stage4AreaLabel")
        private Stage4AreaLabel stage4AreaLabel;

        private Result(Builder builder) {
            this.stage4AreaLabel = builder.stage4AreaLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return stage4AreaLabel
         */
        public Stage4AreaLabel getStage4AreaLabel() {
            return this.stage4AreaLabel;
        }

        public static final class Builder {
            private Stage4AreaLabel stage4AreaLabel; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.stage4AreaLabel = model.stage4AreaLabel;
            } 

            /**
             * Stage4AreaLabel.
             */
            public Builder stage4AreaLabel(Stage4AreaLabel stage4AreaLabel) {
                this.stage4AreaLabel = stage4AreaLabel;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiduiAreaDeductionResponseBody} extends {@link TeaModel}
     *
     * <p>DiduiAreaDeductionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attempts")
        private Integer attempts;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HttpStatus")
        private Integer httpStatus;

        @com.aliyun.core.annotation.NameInMap("LatencyMs")
        private Long latencyMs;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModelRequestId")
        private String modelRequestId;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.attempts = builder.attempts;
            this.code = builder.code;
            this.httpStatus = builder.httpStatus;
            this.latencyMs = builder.latencyMs;
            this.message = builder.message;
            this.modelRequestId = builder.modelRequestId;
            this.reqId = builder.reqId;
            this.result = builder.result;
            this.status = builder.status;
            this.success = builder.success;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attempts
         */
        public Integer getAttempts() {
            return this.attempts;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return httpStatus
         */
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        /**
         * @return latencyMs
         */
        public Long getLatencyMs() {
            return this.latencyMs;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modelRequestId
         */
        public String getModelRequestId() {
            return this.modelRequestId;
        }

        /**
         * @return reqId
         */
        public String getReqId() {
            return this.reqId;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
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
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private Integer attempts; 
            private String code; 
            private Integer httpStatus; 
            private Long latencyMs; 
            private String message; 
            private String modelRequestId; 
            private String reqId; 
            private Result result; 
            private String status; 
            private Boolean success; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.attempts = model.attempts;
                this.code = model.code;
                this.httpStatus = model.httpStatus;
                this.latencyMs = model.latencyMs;
                this.message = model.message;
                this.modelRequestId = model.modelRequestId;
                this.reqId = model.reqId;
                this.result = model.result;
                this.status = model.status;
                this.success = model.success;
                this.usageMap = model.usageMap;
            } 

            /**
             * Attempts.
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * HttpStatus.
             */
            public Builder httpStatus(Integer httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * LatencyMs.
             */
            public Builder latencyMs(Long latencyMs) {
                this.latencyMs = latencyMs;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ModelRequestId.
             */
            public Builder modelRequestId(String modelRequestId) {
                this.modelRequestId = modelRequestId;
                return this;
            }

            /**
             * ReqId.
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Result result) {
                this.result = result;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * UsageMap.
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
