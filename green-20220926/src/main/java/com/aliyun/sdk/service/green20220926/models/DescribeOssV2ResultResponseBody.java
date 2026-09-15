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
 * {@link DescribeOssV2ResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssV2ResultResponseBody</p>
 */
public class DescribeOssV2ResultResponseBody extends TeaModel {
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

    private DescribeOssV2ResultResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssV2ResultResponseBody create() {
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

        private Builder(DescribeOssV2ResultResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The data on the current page.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOssV2ResultResponseBody build() {
            return new DescribeOssV2ResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOssV2ResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssV2ResultResponseBody</p>
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
             * <p>The confidence level.</p>
             * 
             * <strong>example:</strong>
             * <p>50.00</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>Political sensitivity</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label.</p>
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
     * {@link DescribeOssV2ResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssV2ResultResponseBody</p>
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
             * <p>The confidence level.</p>
             * 
             * <strong>example:</strong>
             * <p>90.00</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>Political sensitivity</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label.</p>
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
     * {@link DescribeOssV2ResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssV2ResultResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("Freeze")
        private Boolean freeze;

        @com.aliyun.core.annotation.NameInMap("FreezeStatus")
        private String freezeStatus;

        @com.aliyun.core.annotation.NameInMap("FreezeType")
        private String freezeType;

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
            this.freeze = builder.freeze;
            this.freezeStatus = builder.freezeStatus;
            this.freezeType = builder.freezeType;
            this.labelDetails = builder.labelDetails;
            this.labelDetails2 = builder.labelDetails2;
            this.labels = builder.labels;
            this.labels2 = builder.labels2;
            this.manualFreezeAction = builder.manualFreezeAction;
            this.manualOperateTime = builder.manualOperateTime;
            this.manualOperator = builder.manualOperator;
            this.md5 = builder.md5;
            this.object = builder.object;
            this.requestId = builder.requestId;
            this.riskLevel = builder.riskLevel;
            this.riskLevel0 = builder.riskLevel0;
            this.riskLevel2 = builder.riskLevel2;
            this.scanResult = builder.scanResult;
            this.serviceCode = builder.serviceCode;
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
            private Boolean freeze; 
            private String freezeStatus; 
            private String freezeType; 
            private java.util.List<LabelDetails> labelDetails; 
            private java.util.List<LabelDetails2> labelDetails2; 
            private java.util.List<String> labels; 
            private java.util.List<String> labels2; 
            private String manualFreezeAction; 
            private String manualOperateTime; 
            private String manualOperator; 
            private String md5; 
            private String object; 
            private String requestId; 
            private String riskLevel; 
            private String riskLevel0; 
            private String riskLevel2; 
            private String scanResult; 
            private String serviceCode; 
            private String sysDisposalStatus; 
            private String taskId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.bucket = model.bucket;
                this.code = model.code;
                this.contentType = model.contentType;
                this.freeze = model.freeze;
                this.freezeStatus = model.freezeStatus;
                this.freezeType = model.freezeType;
                this.labelDetails = model.labelDetails;
                this.labelDetails2 = model.labelDetails2;
                this.labels = model.labels;
                this.labels2 = model.labels2;
                this.manualFreezeAction = model.manualFreezeAction;
                this.manualOperateTime = model.manualOperateTime;
                this.manualOperator = model.manualOperator;
                this.md5 = model.md5;
                this.object = model.object;
                this.requestId = model.requestId;
                this.riskLevel = model.riskLevel;
                this.riskLevel0 = model.riskLevel0;
                this.riskLevel2 = model.riskLevel2;
                this.scanResult = model.scanResult;
                this.serviceCode = model.serviceCode;
                this.sysDisposalStatus = model.sysDisposalStatus;
                this.taskId = model.taskId;
                this.url = model.url;
            } 

            /**
             * <p>The OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>buckect_test</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The moderation modality type.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>Indicates whether automatic freezing is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freeze(Boolean freeze) {
                this.freeze = freeze;
                return this;
            }

            /**
             * <p>The freeze status.</p>
             * 
             * <strong>example:</strong>
             * <p>FREEZED</p>
             */
            public Builder freezeStatus(String freezeStatus) {
                this.freezeStatus = freezeStatus;
                return this;
            }

            /**
             * <p>The freeze type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACL</p>
             */
            public Builder freezeType(String freezeType) {
                this.freezeType = freezeType;
                return this;
            }

            /**
             * <p>The label details, corresponding to labels.</p>
             */
            public Builder labelDetails(java.util.List<LabelDetails> labelDetails) {
                this.labelDetails = labelDetails;
                return this;
            }

            /**
             * <p>The details of labels2, corresponding to labels2.</p>
             */
            public Builder labelDetails2(java.util.List<LabelDetails2> labelDetails2) {
                this.labelDetails2 = labelDetails2;
                return this;
            }

            /**
             * <p>The image labels.</p>
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The text labels.</p>
             */
            public Builder labels2(java.util.List<String> labels2) {
                this.labels2 = labels2;
                return this;
            }

            /**
             * <p>The manual disposition status.</p>
             * 
             * <strong>example:</strong>
             * <p>FREEZE</p>
             */
            public Builder manualFreezeAction(String manualFreezeAction) {
                this.manualFreezeAction = manualFreezeAction;
                return this;
            }

            /**
             * <p>The disposition time. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-09 12:00:00</p>
             */
            public Builder manualOperateTime(String manualOperateTime) {
                this.manualOperateTime = manualOperateTime;
                return this;
            }

            /**
             * <p>The operator who performed the disposition.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder manualOperator(String manualOperator) {
                this.manualOperator = manualOperator;
                return this;
            }

            /**
             * <p>The MD5 hash of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>54416c9b159df4a60ae03c04ccb94cb5</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The object name.</p>
             * 
             * <strong>example:</strong>
             * <p>1713014531569_958.png</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAAAA-BBBB-CCCC-DDDD-EEEEEEEEEEEE</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The image risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The overall risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder riskLevel0(String riskLevel0) {
                this.riskLevel0 = riskLevel0;
                return this;
            }

            /**
             * <p>The audio or text risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder riskLevel2(String riskLevel2) {
                this.riskLevel2 = riskLevel2;
                return this;
            }

            /**
             * <p>The result details.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder scanResult(String scanResult) {
                this.scanResult = scanResult;
                return this;
            }

            /**
             * <p>Service code。</p>
             * 
             * <strong>example:</strong>
             * <p>baselineCheck</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>The automatic freeze operation performed by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>COPY</p>
             */
            public Builder sysDisposalStatus(String sysDisposalStatus) {
                this.sysDisposalStatus = sysDisposalStatus;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>P_BT3FHS</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task URL.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
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
