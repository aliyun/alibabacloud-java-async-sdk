// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDigitalWatermarkExtractResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetDigitalWatermarkExtractResultResponseBody</p>
 */
public class GetDigitalWatermarkExtractResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiExtractResultList")
    private java.util.List < AiExtractResultList> aiExtractResultList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDigitalWatermarkExtractResultResponseBody(Builder builder) {
        this.aiExtractResultList = builder.aiExtractResultList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalWatermarkExtractResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return aiExtractResultList
     */
    public java.util.List < AiExtractResultList> getAiExtractResultList() {
        return this.aiExtractResultList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AiExtractResultList> aiExtractResultList; 
        private String requestId; 

        /**
         * <p>The details of the watermark extraction job.</p>
         */
        public Builder aiExtractResultList(java.util.List < AiExtractResultList> aiExtractResultList) {
            this.aiExtractResultList = aiExtractResultList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>42E0554B-80F4-4921-****-ACFB22CAAAD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDigitalWatermarkExtractResultResponseBody build() {
            return new GetDigitalWatermarkExtractResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDigitalWatermarkExtractResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalWatermarkExtractResultResponseBody</p>
     */
    public static class AiExtractResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WaterMarkText")
        private String waterMarkText;

        private AiExtractResultList(Builder builder) {
            this.createTime = builder.createTime;
            this.errorMessage = builder.errorMessage;
            this.jobId = builder.jobId;
            this.modifyTime = builder.modifyTime;
            this.status = builder.status;
            this.waterMarkText = builder.waterMarkText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiExtractResultList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return waterMarkText
         */
        public String getWaterMarkText() {
            return this.waterMarkText;
        }

        public static final class Builder {
            private String createTime; 
            private String errorMessage; 
            private String jobId; 
            private String modifyTime; 
            private String status; 
            private String waterMarkText; 

            /**
             * <p>The time when the watermark extraction job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-16T02:49:04Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the watermark extraction job.</p>
             * 
             * <strong>example:</strong>
             * <p>3af004763bcf459698860f4ede20****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The time when the watermark extraction job was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-17T06:20:45Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The status of the watermark extraction job. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
             * <li><strong>Processing</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The extracted watermark content.</p>
             * 
             * <strong>example:</strong>
             * <p>test mark</p>
             */
            public Builder waterMarkText(String waterMarkText) {
                this.waterMarkText = waterMarkText;
                return this;
            }

            public AiExtractResultList build() {
                return new AiExtractResultList(this);
            } 

        } 

    }
}
