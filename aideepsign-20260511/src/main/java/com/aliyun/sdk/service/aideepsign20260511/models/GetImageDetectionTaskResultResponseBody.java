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
 * {@link GetImageDetectionTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageDetectionTaskResultResponseBody</p>
 */
public class GetImageDetectionTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DetectMode")
    private String detectMode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tamper")
    private Tamper tamper;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetImageDetectionTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.detectMode = builder.detectMode;
        this.httpStatusCode = builder.httpStatusCode;
        this.labels = builder.labels;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.tamper = builder.tamper;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageDetectionTaskResultResponseBody create() {
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
     * @return detectMode
     */
    public String getDetectMode() {
        return this.detectMode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
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
     * @return tamper
     */
    public Tamper getTamper() {
        return this.tamper;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String code; 
        private String detectMode; 
        private Integer httpStatusCode; 
        private java.util.List<Labels> labels; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private Tamper tamper; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(GetImageDetectionTaskResultResponseBody model) {
            this.code = model.code;
            this.detectMode = model.detectMode;
            this.httpStatusCode = model.httpStatusCode;
            this.labels = model.labels;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
            this.tamper = model.tamper;
            this.taskId = model.taskId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DetectMode.
         */
        public Builder detectMode(String detectMode) {
            this.detectMode = detectMode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Tamper.
         */
        public Builder tamper(Tamper tamper) {
            this.tamper = tamper;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public GetImageDetectionTaskResultResponseBody build() {
            return new GetImageDetectionTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDetectionTaskResultResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Labels(Builder builder) {
            this.confidence = builder.confidence;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Float confidence; 
            private String label; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.confidence = model.confidence;
                this.label = model.label;
            } 

            /**
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDetectionTaskResultResponseBody</p>
     */
    public static class Aigc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private Aigc(Builder builder) {
            this.desc = builder.desc;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aigc create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private String desc; 
            private Float score; 

            private Builder() {
            } 

            private Builder(Aigc model) {
                this.desc = model.desc;
                this.score = model.score;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            public Aigc build() {
                return new Aigc(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDetectionTaskResultResponseBody</p>
     */
    public static class Aips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private Aips(Builder builder) {
            this.desc = builder.desc;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aips create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private String desc; 
            private Float score; 

            private Builder() {
            } 

            private Builder(Aips model) {
                this.desc = model.desc;
                this.score = model.score;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            public Aips build() {
                return new Aips(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDetectionTaskResultResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bbox")
        private java.util.List<Float> bbox;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private Items(Builder builder) {
            this.bbox = builder.bbox;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bbox
         */
        public java.util.List<Float> getBbox() {
            return this.bbox;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private java.util.List<Float> bbox; 
            private Float score; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.bbox = model.bbox;
                this.score = model.score;
            } 

            /**
             * Bbox.
             */
            public Builder bbox(java.util.List<Float> bbox) {
                this.bbox = bbox;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDetectionTaskResultResponseBody</p>
     */
    public static class PsLoc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private PsLoc(Builder builder) {
            this.desc = builder.desc;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PsLoc create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(PsLoc model) {
                this.desc = model.desc;
                this.items = model.items;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public PsLoc build() {
                return new PsLoc(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDetectionTaskResultResponseBody</p>
     */
    public static class BaseResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aigc")
        private Aigc aigc;

        @com.aliyun.core.annotation.NameInMap("Aips")
        private Aips aips;

        @com.aliyun.core.annotation.NameInMap("ImgType")
        private String imgType;

        @com.aliyun.core.annotation.NameInMap("PsLoc")
        private PsLoc psLoc;

        private BaseResults(Builder builder) {
            this.aigc = builder.aigc;
            this.aips = builder.aips;
            this.imgType = builder.imgType;
            this.psLoc = builder.psLoc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseResults create() {
            return builder().build();
        }

        /**
         * @return aigc
         */
        public Aigc getAigc() {
            return this.aigc;
        }

        /**
         * @return aips
         */
        public Aips getAips() {
            return this.aips;
        }

        /**
         * @return imgType
         */
        public String getImgType() {
            return this.imgType;
        }

        /**
         * @return psLoc
         */
        public PsLoc getPsLoc() {
            return this.psLoc;
        }

        public static final class Builder {
            private Aigc aigc; 
            private Aips aips; 
            private String imgType; 
            private PsLoc psLoc; 

            private Builder() {
            } 

            private Builder(BaseResults model) {
                this.aigc = model.aigc;
                this.aips = model.aips;
                this.imgType = model.imgType;
                this.psLoc = model.psLoc;
            } 

            /**
             * Aigc.
             */
            public Builder aigc(Aigc aigc) {
                this.aigc = aigc;
                return this;
            }

            /**
             * Aips.
             */
            public Builder aips(Aips aips) {
                this.aips = aips;
                return this;
            }

            /**
             * ImgType.
             */
            public Builder imgType(String imgType) {
                this.imgType = imgType;
                return this;
            }

            /**
             * PsLoc.
             */
            public Builder psLoc(PsLoc psLoc) {
                this.psLoc = psLoc;
                return this;
            }

            public BaseResults build() {
                return new BaseResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageDetectionTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDetectionTaskResultResponseBody</p>
     */
    public static class Tamper extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseResults")
        private BaseResults baseResults;

        @com.aliyun.core.annotation.NameInMap("LlmResult")
        private String llmResult;

        @com.aliyun.core.annotation.NameInMap("RiskCode")
        private String riskCode;

        @com.aliyun.core.annotation.NameInMap("RiskReasons")
        private java.util.List<String> riskReasons;

        private Tamper(Builder builder) {
            this.baseResults = builder.baseResults;
            this.llmResult = builder.llmResult;
            this.riskCode = builder.riskCode;
            this.riskReasons = builder.riskReasons;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tamper create() {
            return builder().build();
        }

        /**
         * @return baseResults
         */
        public BaseResults getBaseResults() {
            return this.baseResults;
        }

        /**
         * @return llmResult
         */
        public String getLlmResult() {
            return this.llmResult;
        }

        /**
         * @return riskCode
         */
        public String getRiskCode() {
            return this.riskCode;
        }

        /**
         * @return riskReasons
         */
        public java.util.List<String> getRiskReasons() {
            return this.riskReasons;
        }

        public static final class Builder {
            private BaseResults baseResults; 
            private String llmResult; 
            private String riskCode; 
            private java.util.List<String> riskReasons; 

            private Builder() {
            } 

            private Builder(Tamper model) {
                this.baseResults = model.baseResults;
                this.llmResult = model.llmResult;
                this.riskCode = model.riskCode;
                this.riskReasons = model.riskReasons;
            } 

            /**
             * BaseResults.
             */
            public Builder baseResults(BaseResults baseResults) {
                this.baseResults = baseResults;
                return this;
            }

            /**
             * LlmResult.
             */
            public Builder llmResult(String llmResult) {
                this.llmResult = llmResult;
                return this;
            }

            /**
             * RiskCode.
             */
            public Builder riskCode(String riskCode) {
                this.riskCode = riskCode;
                return this;
            }

            /**
             * RiskReasons.
             */
            public Builder riskReasons(java.util.List<String> riskReasons) {
                this.riskReasons = riskReasons;
                return this;
            }

            public Tamper build() {
                return new Tamper(this);
            } 

        } 

    }
}
