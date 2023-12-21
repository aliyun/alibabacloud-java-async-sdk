// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDigitalHumanProjectResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDigitalHumanProjectResponseBody</p>
 */
public class QueryDigitalHumanProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDigitalHumanProjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDigitalHumanProjectResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List < Data> data) {
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
         * RequestId.
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

        public QueryDigitalHumanProjectResponseBody build() {
            return new QueryDigitalHumanProjectResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EstimatedDuration")
        private Integer estimatedDuration;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Id")
        private String id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("RunningTime")
        private String runningTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubtitleUrl")
        private String subtitleUrl;

        @NameInMap("Title")
        private String title;

        @NameInMap("VideoLength")
        private Integer videoLength;

        @NameInMap("WaitingTime")
        private Integer waitingTime;

        private Data(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.estimatedDuration = builder.estimatedDuration;
            this.fileUrl = builder.fileUrl;
            this.id = builder.id;
            this.intro = builder.intro;
            this.runningTime = builder.runningTime;
            this.status = builder.status;
            this.subtitleUrl = builder.subtitleUrl;
            this.title = builder.title;
            this.videoLength = builder.videoLength;
            this.waitingTime = builder.waitingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return estimatedDuration
         */
        public Integer getEstimatedDuration() {
            return this.estimatedDuration;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return runningTime
         */
        public String getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subtitleUrl
         */
        public String getSubtitleUrl() {
            return this.subtitleUrl;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return videoLength
         */
        public Integer getVideoLength() {
            return this.videoLength;
        }

        /**
         * @return waitingTime
         */
        public Integer getWaitingTime() {
            return this.waitingTime;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private Integer estimatedDuration; 
            private String fileUrl; 
            private String id; 
            private String intro; 
            private String runningTime; 
            private String status; 
            private String subtitleUrl; 
            private String title; 
            private Integer videoLength; 
            private Integer waitingTime; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * EstimatedDuration.
             */
            public Builder estimatedDuration(Integer estimatedDuration) {
                this.estimatedDuration = estimatedDuration;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Intro.
             */
            public Builder intro(String intro) {
                this.intro = intro;
                return this;
            }

            /**
             * RunningTime.
             */
            public Builder runningTime(String runningTime) {
                this.runningTime = runningTime;
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
             * SubtitleUrl.
             */
            public Builder subtitleUrl(String subtitleUrl) {
                this.subtitleUrl = subtitleUrl;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * VideoLength.
             */
            public Builder videoLength(Integer videoLength) {
                this.videoLength = videoLength;
                return this;
            }

            /**
             * WaitingTime.
             */
            public Builder waitingTime(Integer waitingTime) {
                this.waitingTime = waitingTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
