// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOfficeConversionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetOfficeConversionTaskResponseBody</p>
 */
public class GetOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ExternalID")
    private String externalID;

    @NameInMap("FailDetail")
    private FailDetail failDetail;

    @NameInMap("FinishTime")
    private String finishTime;

    @NameInMap("ImageSpec")
    private String imageSpec;

    @NameInMap("NotifyEndpoint")
    private String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("Percent")
    private Integer percent;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SrcUri")
    private String srcUri;

    @NameInMap("Status")
    private String status;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TgtType")
    private String tgtType;

    @NameInMap("TgtUri")
    private String tgtUri;

    private GetOfficeConversionTaskResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.externalID = builder.externalID;
        this.failDetail = builder.failDetail;
        this.finishTime = builder.finishTime;
        this.imageSpec = builder.imageSpec;
        this.notifyEndpoint = builder.notifyEndpoint;
        this.notifyTopicName = builder.notifyTopicName;
        this.pageCount = builder.pageCount;
        this.percent = builder.percent;
        this.requestId = builder.requestId;
        this.srcUri = builder.srcUri;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.tgtType = builder.tgtType;
        this.tgtUri = builder.tgtUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOfficeConversionTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return externalID
     */
    public String getExternalID() {
        return this.externalID;
    }

    /**
     * @return failDetail
     */
    public FailDetail getFailDetail() {
        return this.failDetail;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return imageSpec
     */
    public String getImageSpec() {
        return this.imageSpec;
    }

    /**
     * @return notifyEndpoint
     */
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    /**
     * @return notifyTopicName
     */
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
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
     * @return srcUri
     */
    public String getSrcUri() {
        return this.srcUri;
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
     * @return tgtType
     */
    public String getTgtType() {
        return this.tgtType;
    }

    /**
     * @return tgtUri
     */
    public String getTgtUri() {
        return this.tgtUri;
    }

    public static final class Builder {
        private String createTime; 
        private String externalID; 
        private FailDetail failDetail; 
        private String finishTime; 
        private String imageSpec; 
        private String notifyEndpoint; 
        private String notifyTopicName; 
        private Integer pageCount; 
        private Integer percent; 
        private String requestId; 
        private String srcUri; 
        private String status; 
        private String taskId; 
        private String tgtType; 
        private String tgtUri; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExternalID.
         */
        public Builder externalID(String externalID) {
            this.externalID = externalID;
            return this;
        }

        /**
         * FailDetail.
         */
        public Builder failDetail(FailDetail failDetail) {
            this.failDetail = failDetail;
            return this;
        }

        /**
         * FinishTime.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * ImageSpec.
         */
        public Builder imageSpec(String imageSpec) {
            this.imageSpec = imageSpec;
            return this;
        }

        /**
         * NotifyEndpoint.
         */
        public Builder notifyEndpoint(String notifyEndpoint) {
            this.notifyEndpoint = notifyEndpoint;
            return this;
        }

        /**
         * NotifyTopicName.
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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
         * SrcUri.
         */
        public Builder srcUri(String srcUri) {
            this.srcUri = srcUri;
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
         * TgtType.
         */
        public Builder tgtType(String tgtType) {
            this.tgtType = tgtType;
            return this;
        }

        /**
         * TgtUri.
         */
        public Builder tgtUri(String tgtUri) {
            this.tgtUri = tgtUri;
            return this;
        }

        public GetOfficeConversionTaskResponseBody build() {
            return new GetOfficeConversionTaskResponseBody(this);
        } 

    } 

    public static class FailDetail extends TeaModel {
        @NameInMap("Code")
        private String code;

        private FailDetail(Builder builder) {
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailDetail create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        public static final class Builder {
            private String code; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            public FailDetail build() {
                return new FailDetail(this);
            } 

        } 

    }
}
