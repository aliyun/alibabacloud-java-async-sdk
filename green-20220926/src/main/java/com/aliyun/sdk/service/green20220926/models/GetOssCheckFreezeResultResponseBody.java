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
 * {@link GetOssCheckFreezeResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssCheckFreezeResultResponseBody</p>
 */
public class GetOssCheckFreezeResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetOssCheckFreezeResultResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssCheckFreezeResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetOssCheckFreezeResultResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetOssCheckFreezeResultResponseBody build() {
            return new GetOssCheckFreezeResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOssCheckFreezeResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckFreezeResultResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label.
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
     * {@link GetOssCheckFreezeResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckFreezeResultResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("CopyFrom")
        private String copyFrom;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("Freeze")
        private Boolean freeze;

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

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskLevel0")
        private String riskLevel0;

        @com.aliyun.core.annotation.NameInMap("RiskLevel2")
        private String riskLevel2;

        @com.aliyun.core.annotation.NameInMap("ScanResult")
        private String scanResult;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SysDisposalStatus")
        private String sysDisposalStatus;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Items(Builder builder) {
            this.bucket = builder.bucket;
            this.code = builder.code;
            this.contentType = builder.contentType;
            this.copyFrom = builder.copyFrom;
            this.feedback = builder.feedback;
            this.freeze = builder.freeze;
            this.freezeStatus = builder.freezeStatus;
            this.freezeType = builder.freezeType;
            this.imageUrl = builder.imageUrl;
            this.isCopy = builder.isCopy;
            this.jobName = builder.jobName;
            this.labelDetails = builder.labelDetails;
            this.labels = builder.labels;
            this.labels2 = builder.labels2;
            this.manualFreezeAction = builder.manualFreezeAction;
            this.manualOperateTime = builder.manualOperateTime;
            this.manualOperator = builder.manualOperator;
            this.md5 = builder.md5;
            this.msg = builder.msg;
            this.object = builder.object;
            this.requestId = builder.requestId;
            this.riskLevel = builder.riskLevel;
            this.riskLevel0 = builder.riskLevel0;
            this.riskLevel2 = builder.riskLevel2;
            this.scanResult = builder.scanResult;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
            this.sysDisposalStatus = builder.sysDisposalStatus;
            this.taskId = builder.taskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return freeze
         */
        public Boolean getFreeze() {
            return this.freeze;
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
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
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
         * @return sysDisposalStatus
         */
        public String getSysDisposalStatus() {
            return this.sysDisposalStatus;
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
            private String feedback; 
            private Boolean freeze; 
            private String freezeStatus; 
            private String freezeType; 
            private String imageUrl; 
            private Boolean isCopy; 
            private String jobName; 
            private java.util.List<LabelDetails> labelDetails; 
            private java.util.List<String> labels; 
            private java.util.List<String> labels2; 
            private String manualFreezeAction; 
            private String manualOperateTime; 
            private String manualOperator; 
            private String md5; 
            private String msg; 
            private String object; 
            private String requestId; 
            private String riskLevel; 
            private String riskLevel0; 
            private String riskLevel2; 
            private String scanResult; 
            private String serviceCode; 
            private String serviceName; 
            private String sysDisposalStatus; 
            private String taskId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.bucket = model.bucket;
                this.code = model.code;
                this.contentType = model.contentType;
                this.copyFrom = model.copyFrom;
                this.feedback = model.feedback;
                this.freeze = model.freeze;
                this.freezeStatus = model.freezeStatus;
                this.freezeType = model.freezeType;
                this.imageUrl = model.imageUrl;
                this.isCopy = model.isCopy;
                this.jobName = model.jobName;
                this.labelDetails = model.labelDetails;
                this.labels = model.labels;
                this.labels2 = model.labels2;
                this.manualFreezeAction = model.manualFreezeAction;
                this.manualOperateTime = model.manualOperateTime;
                this.manualOperator = model.manualOperator;
                this.md5 = model.md5;
                this.msg = model.msg;
                this.object = model.object;
                this.requestId = model.requestId;
                this.riskLevel = model.riskLevel;
                this.riskLevel0 = model.riskLevel0;
                this.riskLevel2 = model.riskLevel2;
                this.scanResult = model.scanResult;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
                this.sysDisposalStatus = model.sysDisposalStatus;
                this.taskId = model.taskId;
                this.url = model.url;
            } 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
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
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * CopyFrom.
             */
            public Builder copyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
                return this;
            }

            /**
             * Feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * Freeze.
             */
            public Builder freeze(Boolean freeze) {
                this.freeze = freeze;
                return this;
            }

            /**
             * FreezeStatus.
             */
            public Builder freezeStatus(String freezeStatus) {
                this.freezeStatus = freezeStatus;
                return this;
            }

            /**
             * FreezeType.
             */
            public Builder freezeType(String freezeType) {
                this.freezeType = freezeType;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * IsCopy.
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * LabelDetails.
             */
            public Builder labelDetails(java.util.List<LabelDetails> labelDetails) {
                this.labelDetails = labelDetails;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Labels2.
             */
            public Builder labels2(java.util.List<String> labels2) {
                this.labels2 = labels2;
                return this;
            }

            /**
             * ManualFreezeAction.
             */
            public Builder manualFreezeAction(String manualFreezeAction) {
                this.manualFreezeAction = manualFreezeAction;
                return this;
            }

            /**
             * ManualOperateTime.
             */
            public Builder manualOperateTime(String manualOperateTime) {
                this.manualOperateTime = manualOperateTime;
                return this;
            }

            /**
             * ManualOperator.
             */
            public Builder manualOperator(String manualOperator) {
                this.manualOperator = manualOperator;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
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
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * RiskLevel0.
             */
            public Builder riskLevel0(String riskLevel0) {
                this.riskLevel0 = riskLevel0;
                return this;
            }

            /**
             * RiskLevel2.
             */
            public Builder riskLevel2(String riskLevel2) {
                this.riskLevel2 = riskLevel2;
                return this;
            }

            /**
             * ScanResult.
             */
            public Builder scanResult(String scanResult) {
                this.scanResult = scanResult;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SysDisposalStatus.
             */
            public Builder sysDisposalStatus(String sysDisposalStatus) {
                this.sysDisposalStatus = sysDisposalStatus;
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
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
