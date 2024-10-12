// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
 */
public class GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody create() {
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
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
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
        public Builder data(Data data) {
            this.data = data;
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

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody build() {
            return new GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class Outlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outline")
        private String outline;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private Outlines(Builder builder) {
            this.outline = builder.outline;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outlines create() {
            return builder().build();
        }

        /**
         * @return outline
         */
        public String getOutline() {
            return this.outline;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String outline; 
            private String summary; 

            /**
             * Outline.
             */
            public Builder outline(String outline) {
                this.outline = outline;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Outlines build() {
                return new Outlines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class ViewPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Outlines")
        private java.util.List < Outlines> outlines;

        @com.aliyun.core.annotation.NameInMap("Point")
        private String point;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private ViewPoints(Builder builder) {
            this.outlines = builder.outlines;
            this.point = builder.point;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewPoints create() {
            return builder().build();
        }

        /**
         * @return outlines
         */
        public java.util.List < Outlines> getOutlines() {
            return this.outlines;
        }

        /**
         * @return point
         */
        public String getPoint() {
            return this.point;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List < Outlines> outlines; 
            private String point; 
            private String summary; 

            /**
             * Outlines.
             */
            public Builder outlines(java.util.List < Outlines> outlines) {
                this.outlines = outlines;
                return this;
            }

            /**
             * Point.
             */
            public Builder point(String point) {
                this.point = point;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public ViewPoints build() {
                return new ViewPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class Attitudes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitude")
        private String attitude;

        @com.aliyun.core.annotation.NameInMap("AttitudeType")
        private String attitudeType;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        @com.aliyun.core.annotation.NameInMap("ViewPoints")
        private java.util.List < ViewPoints> viewPoints;

        private Attitudes(Builder builder) {
            this.attitude = builder.attitude;
            this.attitudeType = builder.attitudeType;
            this.ratio = builder.ratio;
            this.viewPoints = builder.viewPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attitudes create() {
            return builder().build();
        }

        /**
         * @return attitude
         */
        public String getAttitude() {
            return this.attitude;
        }

        /**
         * @return attitudeType
         */
        public String getAttitudeType() {
            return this.attitudeType;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        /**
         * @return viewPoints
         */
        public java.util.List < ViewPoints> getViewPoints() {
            return this.viewPoints;
        }

        public static final class Builder {
            private String attitude; 
            private String attitudeType; 
            private String ratio; 
            private java.util.List < ViewPoints> viewPoints; 

            /**
             * Attitude.
             */
            public Builder attitude(String attitude) {
                this.attitude = attitude;
                return this;
            }

            /**
             * AttitudeType.
             */
            public Builder attitudeType(String attitudeType) {
                this.attitudeType = attitudeType;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * ViewPoints.
             */
            public Builder viewPoints(java.util.List < ViewPoints> viewPoints) {
                this.viewPoints = viewPoints;
                return this;
            }

            public Attitudes build() {
                return new Attitudes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class CustomViewPointsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attitudes")
        private java.util.List < Attitudes> attitudes;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private CustomViewPointsResult(Builder builder) {
            this.attitudes = builder.attitudes;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomViewPointsResult create() {
            return builder().build();
        }

        /**
         * @return attitudes
         */
        public java.util.List < Attitudes> getAttitudes() {
            return this.attitudes;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List < Attitudes> attitudes; 
            private String topic; 

            /**
             * Attitudes.
             */
            public Builder attitudes(java.util.List < Attitudes> attitudes) {
                this.attitudes = attitudes;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public CustomViewPointsResult build() {
                return new CustomViewPointsResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomViewPointsResult")
        private CustomViewPointsResult customViewPointsResult;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.customViewPointsResult = builder.customViewPointsResult;
            this.errorMessage = builder.errorMessage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customViewPointsResult
         */
        public CustomViewPointsResult getCustomViewPointsResult() {
            return this.customViewPointsResult;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private CustomViewPointsResult customViewPointsResult; 
            private String errorMessage; 
            private String status; 

            /**
             * CustomViewPointsResult.
             */
            public Builder customViewPointsResult(CustomViewPointsResult customViewPointsResult) {
                this.customViewPointsResult = customViewPointsResult;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
