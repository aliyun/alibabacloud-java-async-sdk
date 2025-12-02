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
 * {@link GetOssCheckResultDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssCheckResultDetailResponseBody</p>
 */
public class GetOssCheckResultDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOssCheckResultDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssCheckResultDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private Integer code; 
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetOssCheckResultDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code, consistent with HTTP status.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Detailed data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Further description of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>Backend-assigned ID used to uniquely identify a request. Can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>62E97001-1255-50A9-8E1E-4FD05473D952</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Success indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOssCheckResultDetailResponseBody build() {
            return new GetOssCheckResultDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOssCheckResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckResultDetailResponseBody</p>
     */
    public static class LabelDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private LabelDetails(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelDetails create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 

            private Builder() {
            } 

            private Builder(LabelDetails model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * <p>Confidence score, 0 to 100, retained to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Label description.</p>
             * 
             * <strong>example:</strong>
             * <p>涉政</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Label.</p>
             * 
             * <strong>example:</strong>
             * <p>politics</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public LabelDetails build() {
                return new LabelDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOssCheckResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckResultDetailResponseBody</p>
     */
    public static class LabelDetails2 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private LabelDetails2(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelDetails2 create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 

            private Builder() {
            } 

            private Builder(LabelDetails2 model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * <p>Confidence score, 0 to 100, retained to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Label description.</p>
             * 
             * <strong>example:</strong>
             * <p>涉政</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Label.</p>
             * 
             * <strong>example:</strong>
             * <p>politics</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public LabelDetails2 build() {
                return new LabelDetails2(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOssCheckResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckResultDetailResponseBody</p>
     */
    public static class ScanServiceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CopyFrom")
        private String copyFrom;

        @com.aliyun.core.annotation.NameInMap("IsCopy")
        private Boolean isCopy;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private ScanServiceInfos(Builder builder) {
            this.copyFrom = builder.copyFrom;
            this.isCopy = builder.isCopy;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanServiceInfos create() {
            return builder().build();
        }

        /**
         * @return copyFrom
         */
        public String getCopyFrom() {
            return this.copyFrom;
        }

        /**
         * @return isCopy
         */
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String copyFrom; 
            private Boolean isCopy; 
            private String serviceCode; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(ScanServiceInfos model) {
                this.copyFrom = model.copyFrom;
                this.isCopy = model.isCopy;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>Main service.</p>
             * 
             * <strong>example:</strong>
             * <p>audio_media_detection</p>
             */
            public Builder copyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
                return this;
            }

            /**
             * <p>Whether to copy.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * <p>Service code.</p>
             * 
             * <strong>example:</strong>
             * <p>audio_media_detection_01</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>服务名称</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ScanServiceInfos build() {
                return new ScanServiceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOssCheckResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckResultDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("CopyFrom")
        private String copyFrom;

        @com.aliyun.core.annotation.NameInMap("FreezeStatus")
        private String freezeStatus;

        @com.aliyun.core.annotation.NameInMap("FreezeType")
        private String freezeType;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("IsCopy")
        private Boolean isCopy;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("LabelDetails")
        private java.util.List<LabelDetails> labelDetails;

        @com.aliyun.core.annotation.NameInMap("LabelDetails2")
        private java.util.List<LabelDetails2> labelDetails2;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("Labels2")
        private java.util.List<String> labels2;

        @com.aliyun.core.annotation.NameInMap("ManualFreezeAction")
        private String manualFreezeAction;

        @com.aliyun.core.annotation.NameInMap("ManualOperateTime")
        private String manualOperateTime;

        @com.aliyun.core.annotation.NameInMap("ManualOperator")
        private String manualOperator;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskLevel0")
        private String riskLevel0;

        @com.aliyun.core.annotation.NameInMap("RiskLevel2")
        private String riskLevel2;

        @com.aliyun.core.annotation.NameInMap("ScanResult")
        private String scanResult;

        @com.aliyun.core.annotation.NameInMap("ScanServiceInfos")
        private java.util.List<ScanServiceInfos> scanServiceInfos;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.bucket = builder.bucket;
            this.code = builder.code;
            this.contentType = builder.contentType;
            this.copyFrom = builder.copyFrom;
            this.freezeStatus = builder.freezeStatus;
            this.freezeType = builder.freezeType;
            this.imageUrl = builder.imageUrl;
            this.isCopy = builder.isCopy;
            this.jobName = builder.jobName;
            this.labelDetails = builder.labelDetails;
            this.labelDetails2 = builder.labelDetails2;
            this.labels = builder.labels;
            this.labels2 = builder.labels2;
            this.manualFreezeAction = builder.manualFreezeAction;
            this.manualOperateTime = builder.manualOperateTime;
            this.manualOperator = builder.manualOperator;
            this.md5 = builder.md5;
            this.msg = builder.msg;
            this.object = builder.object;
            this.riskLevel = builder.riskLevel;
            this.riskLevel0 = builder.riskLevel0;
            this.riskLevel2 = builder.riskLevel2;
            this.scanResult = builder.scanResult;
            this.scanServiceInfos = builder.scanServiceInfos;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
            this.taskId = builder.taskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return copyFrom
         */
        public String getCopyFrom() {
            return this.copyFrom;
        }

        /**
         * @return freezeStatus
         */
        public String getFreezeStatus() {
            return this.freezeStatus;
        }

        /**
         * @return freezeType
         */
        public String getFreezeType() {
            return this.freezeType;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return isCopy
         */
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return labelDetails
         */
        public java.util.List<LabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        /**
         * @return labelDetails2
         */
        public java.util.List<LabelDetails2> getLabelDetails2() {
            return this.labelDetails2;
        }

        /**
         * @return labels
         */
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        /**
         * @return labels2
         */
        public java.util.List<String> getLabels2() {
            return this.labels2;
        }

        /**
         * @return manualFreezeAction
         */
        public String getManualFreezeAction() {
            return this.manualFreezeAction;
        }

        /**
         * @return manualOperateTime
         */
        public String getManualOperateTime() {
            return this.manualOperateTime;
        }

        /**
         * @return manualOperator
         */
        public String getManualOperator() {
            return this.manualOperator;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskLevel0
         */
        public String getRiskLevel0() {
            return this.riskLevel0;
        }

        /**
         * @return riskLevel2
         */
        public String getRiskLevel2() {
            return this.riskLevel2;
        }

        /**
         * @return scanResult
         */
        public String getScanResult() {
            return this.scanResult;
        }

        /**
         * @return scanServiceInfos
         */
        public java.util.List<ScanServiceInfos> getScanServiceInfos() {
            return this.scanServiceInfos;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String bucket; 
            private String code; 
            private String contentType; 
            private String copyFrom; 
            private String freezeStatus; 
            private String freezeType; 
            private String imageUrl; 
            private Boolean isCopy; 
            private String jobName; 
            private java.util.List<LabelDetails> labelDetails; 
            private java.util.List<LabelDetails2> labelDetails2; 
            private java.util.List<String> labels; 
            private java.util.List<String> labels2; 
            private String manualFreezeAction; 
            private String manualOperateTime; 
            private String manualOperator; 
            private String md5; 
            private String msg; 
            private String object; 
            private String riskLevel; 
            private String riskLevel0; 
            private String riskLevel2; 
            private String scanResult; 
            private java.util.List<ScanServiceInfos> scanServiceInfos; 
            private String serviceCode; 
            private String serviceName; 
            private String taskId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bucket = model.bucket;
                this.code = model.code;
                this.contentType = model.contentType;
                this.copyFrom = model.copyFrom;
                this.freezeStatus = model.freezeStatus;
                this.freezeType = model.freezeType;
                this.imageUrl = model.imageUrl;
                this.isCopy = model.isCopy;
                this.jobName = model.jobName;
                this.labelDetails = model.labelDetails;
                this.labelDetails2 = model.labelDetails2;
                this.labels = model.labels;
                this.labels2 = model.labels2;
                this.manualFreezeAction = model.manualFreezeAction;
                this.manualOperateTime = model.manualOperateTime;
                this.manualOperator = model.manualOperator;
                this.md5 = model.md5;
                this.msg = model.msg;
                this.object = model.object;
                this.riskLevel = model.riskLevel;
                this.riskLevel0 = model.riskLevel0;
                this.riskLevel2 = model.riskLevel2;
                this.scanResult = model.scanResult;
                this.scanServiceInfos = model.scanServiceInfos;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
                this.taskId = model.taskId;
                this.url = model.url;
            } 

            /**
             * <p>Bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-tmp</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>Error code, consistent with HTTP status.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Audio and video detection type.</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>Primary service.</p>
             * 
             * <strong>example:</strong>
             * <p>audio_media_detection</p>
             */
            public Builder copyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
                return this;
            }

            /**
             * <p>Freeze status.</p>
             * 
             * <strong>example:</strong>
             * <p>UNFREEZED</p>
             */
            public Builder freezeStatus(String freezeStatus) {
                this.freezeStatus = freezeStatus;
                return this;
            }

            /**
             * <p>Freeze type.</p>
             * 
             * <strong>example:</strong>
             * <p>COPY</p>
             */
            public Builder freezeType(String freezeType) {
                this.freezeType = freezeType;
                return this;
            }

            /**
             * <p>Image URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyuncs.com/test.jpg">http://www.aliyuncs.com/test.jpg</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>Whether to copy.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * <p>Job name.</p>
             * 
             * <strong>example:</strong>
             * <p>dhT20X2310</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>Labels.</p>
             */
            public Builder labelDetails(java.util.List<LabelDetails> labelDetails) {
                this.labelDetails = labelDetails;
                return this;
            }

            /**
             * <p>Labels.</p>
             */
            public Builder labelDetails2(java.util.List<LabelDetails2> labelDetails2) {
                this.labelDetails2 = labelDetails2;
                return this;
            }

            /**
             * <p>Image labels.</p>
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>Text labels.</p>
             */
            public Builder labels2(java.util.List<String> labels2) {
                this.labels2 = labels2;
                return this;
            }

            /**
             * <p>Manual handling status.</p>
             * 
             * <strong>example:</strong>
             * <p>FREEZE</p>
             */
            public Builder manualFreezeAction(String manualFreezeAction) {
                this.manualFreezeAction = manualFreezeAction;
                return this;
            }

            /**
             * <p>Handling time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-09 12:00:00</p>
             */
            public Builder manualOperateTime(String manualOperateTime) {
                this.manualOperateTime = manualOperateTime;
                return this;
            }

            /**
             * <p>Handler.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder manualOperator(String manualOperator) {
                this.manualOperator = manualOperator;
                return this;
            }

            /**
             * <p>File MD5.</p>
             * 
             * <strong>example:</strong>
             * <p>f6e2e1946f06310c8a0cc443a05819f3</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>Further description of the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>Object name.</p>
             * 
             * <strong>example:</strong>
             * <p>1748396909030.jpg</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>Image risk level</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>Overall risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder riskLevel0(String riskLevel0) {
                this.riskLevel0 = riskLevel0;
                return this;
            }

            /**
             * <p>Text risk level</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder riskLevel2(String riskLevel2) {
                this.riskLevel2 = riskLevel2;
                return this;
            }

            /**
             * <p>Detailed scan results.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder scanResult(String scanResult) {
                this.scanResult = scanResult;
                return this;
            }

            /**
             * <p>Detection service information</p>
             */
            public Builder scanServiceInfos(java.util.List<ScanServiceInfos> scanServiceInfos) {
                this.scanServiceInfos = scanServiceInfos;
                return this;
            }

            /**
             * <p>Service code.</p>
             * 
             * <strong>example:</strong>
             * <p>audio_media_detection_01</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>服务名称</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>P_Z7OLMN</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyuncs.com/test.mp3">http://www.aliyuncs.com/test.mp3</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
