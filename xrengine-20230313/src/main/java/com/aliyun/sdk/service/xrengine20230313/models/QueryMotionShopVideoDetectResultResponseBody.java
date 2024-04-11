// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMotionShopVideoDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMotionShopVideoDetectResultResponseBody</p>
 */
public class QueryMotionShopVideoDetectResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryMotionShopVideoDetectResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMotionShopVideoDetectResultResponseBody create() {
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

        public QueryMotionShopVideoDetectResultResponseBody build() {
            return new QueryMotionShopVideoDetectResultResponseBody(this);
        } 

    } 

    public static class DetectResult extends TeaModel {
        @NameInMap("Box")
        private java.util.List < Double > box;

        @NameInMap("Code")
        private Integer code;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("HumanBoxes")
        private java.util.List < java.util.List < Double > > humanBoxes;

        @NameInMap("Message")
        private String message;

        @NameInMap("SelectedFrameIndex")
        private Integer selectedFrameIndex;

        private DetectResult(Builder builder) {
            this.box = builder.box;
            this.code = builder.code;
            this.coverUrl = builder.coverUrl;
            this.humanBoxes = builder.humanBoxes;
            this.message = builder.message;
            this.selectedFrameIndex = builder.selectedFrameIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectResult create() {
            return builder().build();
        }

        /**
         * @return box
         */
        public java.util.List < Double > getBox() {
            return this.box;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return humanBoxes
         */
        public java.util.List < java.util.List < Double > > getHumanBoxes() {
            return this.humanBoxes;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return selectedFrameIndex
         */
        public Integer getSelectedFrameIndex() {
            return this.selectedFrameIndex;
        }

        public static final class Builder {
            private java.util.List < Double > box; 
            private Integer code; 
            private String coverUrl; 
            private java.util.List < java.util.List < Double > > humanBoxes; 
            private String message; 
            private Integer selectedFrameIndex; 

            /**
             * Box.
             */
            public Builder box(java.util.List < Double > box) {
                this.box = box;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * HumanBoxes.
             */
            public Builder humanBoxes(java.util.List < java.util.List < Double > > humanBoxes) {
                this.humanBoxes = humanBoxes;
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
             * SelectedFrameIndex.
             */
            public Builder selectedFrameIndex(Integer selectedFrameIndex) {
                this.selectedFrameIndex = selectedFrameIndex;
                return this;
            }

            public DetectResult build() {
                return new DetectResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DetectResult")
        private DetectResult detectResult;

        @NameInMap("Status")
        private String status;

        @NameInMap("VideoId")
        private String videoId;

        private Data(Builder builder) {
            this.detectResult = builder.detectResult;
            this.status = builder.status;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detectResult
         */
        public DetectResult getDetectResult() {
            return this.detectResult;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private DetectResult detectResult; 
            private String status; 
            private String videoId; 

            /**
             * DetectResult.
             */
            public Builder detectResult(DetectResult detectResult) {
                this.detectResult = detectResult;
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
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
