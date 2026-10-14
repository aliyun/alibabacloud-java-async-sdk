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
         * <p>The business error code. The value &quot;OK&quot; is returned when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detection mode that was actually executed. Valid values:</p>
         * <ul>
         * <li>aigc: AIGC only.</li>
         * <li>tamper: tamper detection.</li>
         * </ul>
         * <p>This field is returned only when Status is succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>tamper</p>
         */
        public Builder detectMode(String detectMode) {
            this.detectMode = detectMode;
            return this;
        }

        /**
         * <p>The HTTP status code. The value 200 is returned when the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of detection result labels. This field is returned only when Status is succeeded and AIGC detection is included. The label values and confidence ranges vary depending on DetectMode. In aigc mode, AIGC generation identification labels are returned (see the table below). In tamper mode, aigc/aips labels are returned (confidence range: 0 to 1).</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The additional information. The value &quot;success&quot; is returned when the request succeeds. The error message is returned when the task fails. This field is returned only when Status is failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>pending: waiting.</li>
         * <li>running: in progress.</li>
         * <li>succeeded: completed.</li>
         * <li>failed: failed.</li>
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
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The tamper detection result.</p>
         */
        public Builder tamper(Tamper tamper) {
            this.tamper = tamper;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
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
             * <p>The confidence level. Value range: 0 to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9562</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The detection label. When DetectMode is aigc, valid values are: risk_aigc (the image is suspected to be AIGC-generated), risk_fake (the image is suspected to be a composite image), risk_edit (the image is suspected to be AI-edited). When DetectMode is tamper, valid values are: aigc (AIGC detection score), aips (AI post-processing detection score).</p>
             * 
             * <strong>example:</strong>
             * <p>risk_aigc</p>
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

        @com.aliyun.core.annotation.NameInMap("Risk")
        private String risk;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private Aigc(Builder builder) {
            this.desc = builder.desc;
            this.risk = builder.risk;
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
         * @return risk
         */
        public String getRisk() {
            return this.risk;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private String desc; 
            private String risk; 
            private Float score; 

            private Builder() {
            } 

            private Builder(Aigc model) {
                this.desc = model.desc;
                this.risk = model.risk;
                this.score = model.score;
            } 

            /**
             * <p>The AIGC detection result description.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspected AI-generated image</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The AIGC dimension risk label.</p>
             * 
             * <strong>example:</strong>
             * <p>高风险</p>
             */
            public Builder risk(String risk) {
                this.risk = risk;
                return this;
            }

            /**
             * <p>The AIGC detection score. Value range: 0 to 1. A higher value indicates a greater likelihood of AI generation.</p>
             * 
             * <strong>example:</strong>
             * <p>0.47</p>
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

        @com.aliyun.core.annotation.NameInMap("Risk")
        private String risk;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private Aips(Builder builder) {
            this.desc = builder.desc;
            this.risk = builder.risk;
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
         * @return risk
         */
        public String getRisk() {
            return this.risk;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private String desc; 
            private String risk; 
            private Float score; 

            private Builder() {
            } 

            private Builder(Aips model) {
                this.desc = model.desc;
                this.risk = model.risk;
                this.score = model.score;
            } 

            /**
             * <p>The AI post-processing detection result description.</p>
             * 
             * <strong>example:</strong>
             * <p>No AI post-processing traces detected</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The local PS/AI editing dimension risk label.</p>
             * 
             * <strong>example:</strong>
             * <p>高风险</p>
             */
            public Builder risk(String risk) {
                this.risk = risk;
                return this;
            }

            /**
             * <p>The AI post-processing detection score. Value range: 0 to 1. A higher value indicates a greater likelihood of AI post-processing.</p>
             * 
             * <strong>example:</strong>
             * <p>0.12</p>
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
             * <p>The bounding box coordinates of the tampered region, in the format <code>[x1, y1, x2, y2]</code>.</p>
             */
            public Builder bbox(java.util.List<Float> bbox) {
                this.bbox = bbox;
                return this;
            }

            /**
             * <p>The tamper confidence of the region. Value range: 0 to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0.67</p>
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
             * <p>The PS tamper localization result description.</p>
             * 
             * <strong>example:</strong>
             * <p>1 suspected PS-modified region detected</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The list of tampered regions.</p>
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
    public static class Recap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Risk")
        private String risk;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private Recap(Builder builder) {
            this.desc = builder.desc;
            this.risk = builder.risk;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recap create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return risk
         */
        public String getRisk() {
            return this.risk;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private String desc; 
            private String risk; 
            private Float score; 

            private Builder() {
            } 

            private Builder(Recap model) {
                this.desc = model.desc;
                this.risk = model.risk;
                this.score = model.score;
            } 

            /**
             * <p>The recapture/copy detection result description.</p>
             * 
             * <strong>example:</strong>
             * <p>Recapture detection score</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The recapture/copy dimension risk label.</p>
             * 
             * <strong>example:</strong>
             * <p>高风险</p>
             */
            public Builder risk(String risk) {
                this.risk = risk;
                return this;
            }

            /**
             * <p>The recapture/copy detection score. Value range: 0 to 1. A higher value indicates a greater likelihood of recapture or copying.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9998</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            public Recap build() {
                return new Recap(this);
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

        @com.aliyun.core.annotation.NameInMap("Recap")
        private Recap recap;

        private BaseResults(Builder builder) {
            this.aigc = builder.aigc;
            this.aips = builder.aips;
            this.imgType = builder.imgType;
            this.psLoc = builder.psLoc;
            this.recap = builder.recap;
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

        /**
         * @return recap
         */
        public Recap getRecap() {
            return this.recap;
        }

        public static final class Builder {
            private Aigc aigc; 
            private Aips aips; 
            private String imgType; 
            private PsLoc psLoc; 
            private Recap recap; 

            private Builder() {
            } 

            private Builder(BaseResults model) {
                this.aigc = model.aigc;
                this.aips = model.aips;
                this.imgType = model.imgType;
                this.psLoc = model.psLoc;
                this.recap = model.recap;
            } 

            /**
             * <p>The AIGC detection result.</p>
             */
            public Builder aigc(Aigc aigc) {
                this.aigc = aigc;
                return this;
            }

            /**
             * <p>The AI post-processing detection score.</p>
             */
            public Builder aips(Aips aips) {
                this.aips = aips;
                return this;
            }

            /**
             * <p>The image type.</p>
             * 
             * <strong>example:</strong>
             * <p>natural</p>
             */
            public Builder imgType(String imgType) {
                this.imgType = imgType;
                return this;
            }

            /**
             * <p>The PS tamper localization result.</p>
             */
            public Builder psLoc(PsLoc psLoc) {
                this.psLoc = psLoc;
                return this;
            }

            /**
             * <p>The recapture/copy detection result.</p>
             */
            public Builder recap(Recap recap) {
                this.recap = recap;
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
        @com.aliyun.core.annotation.NameInMap("AiWatermark")
        private String aiWatermark;

        @com.aliyun.core.annotation.NameInMap("BaseResults")
        private BaseResults baseResults;

        @com.aliyun.core.annotation.NameInMap("FinalConclusion")
        private String finalConclusion;

        @com.aliyun.core.annotation.NameInMap("LlmResult")
        private String llmResult;

        @com.aliyun.core.annotation.NameInMap("MetadataAiFlag")
        private String metadataAiFlag;

        @com.aliyun.core.annotation.NameInMap("MetadataAiSource")
        private String metadataAiSource;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Tamper(Builder builder) {
            this.aiWatermark = builder.aiWatermark;
            this.baseResults = builder.baseResults;
            this.finalConclusion = builder.finalConclusion;
            this.llmResult = builder.llmResult;
            this.metadataAiFlag = builder.metadataAiFlag;
            this.metadataAiSource = builder.metadataAiSource;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tamper create() {
            return builder().build();
        }

        /**
         * @return aiWatermark
         */
        public String getAiWatermark() {
            return this.aiWatermark;
        }

        /**
         * @return baseResults
         */
        public BaseResults getBaseResults() {
            return this.baseResults;
        }

        /**
         * @return finalConclusion
         */
        public String getFinalConclusion() {
            return this.finalConclusion;
        }

        /**
         * @return llmResult
         */
        public String getLlmResult() {
            return this.llmResult;
        }

        /**
         * @return metadataAiFlag
         */
        public String getMetadataAiFlag() {
            return this.metadataAiFlag;
        }

        /**
         * @return metadataAiSource
         */
        public String getMetadataAiSource() {
            return this.metadataAiSource;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String aiWatermark; 
            private BaseResults baseResults; 
            private String finalConclusion; 
            private String llmResult; 
            private String metadataAiFlag; 
            private String metadataAiSource; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Tamper model) {
                this.aiWatermark = model.aiWatermark;
                this.baseResults = model.baseResults;
                this.finalConclusion = model.finalConclusion;
                this.llmResult = model.llmResult;
                this.metadataAiFlag = model.metadataAiFlag;
                this.metadataAiSource = model.metadataAiSource;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The AI visible watermark. This field is returned only in large model mode. It is empty in small model mode.</p>
             * 
             * <strong>example:</strong>
             * <p>是</p>
             */
            public Builder aiWatermark(String aiWatermark) {
                this.aiWatermark = aiWatermark;
                return this;
            }

            /**
             * <p>The basic algorithm detection results, including multi-dimensional detection scores and risk labels.</p>
             */
            public Builder baseResults(BaseResults baseResults) {
                this.baseResults = baseResults;
                return this;
            }

            /**
             * <p>The final conclusion.</p>
             * 
             * <strong>example:</strong>
             * <p>Metadata data analytics result verified as high risk</p>
             */
            public Builder finalConclusion(String finalConclusion) {
                this.finalConclusion = finalConclusion;
                return this;
            }

            /**
             * <p>The comprehensive analysis result from the large language model.</p>
             * 
             * <strong>example:</strong>
             * <p>The image has been detected with traces of AI generation. The AIGC detection score is 0.95. We recommend further verifying the image source</p>
             */
            public Builder llmResult(String llmResult) {
                this.llmResult = llmResult;
                return this;
            }

            /**
             * <p>The metadata AI flag. This field is always returned.</p>
             * 
             * <strong>example:</strong>
             * <p>高风险</p>
             */
            public Builder metadataAiFlag(String metadataAiFlag) {
                this.metadataAiFlag = metadataAiFlag;
                return this;
            }

            /**
             * <p>The source of the metadata AI flag. This field is returned only in large model mode. It is empty in small model mode.</p>
             * 
             * <strong>example:</strong>
             * <p>通义</p>
             */
            public Builder metadataAiSource(String metadataAiSource) {
                this.metadataAiSource = metadataAiSource;
                return this;
            }

            /**
             * <p>The determination result. This field is always returned.</p>
             * 
             * <strong>example:</strong>
             * <p>高风险</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Tamper build() {
                return new Tamper(this);
            } 

        } 

    }
}
