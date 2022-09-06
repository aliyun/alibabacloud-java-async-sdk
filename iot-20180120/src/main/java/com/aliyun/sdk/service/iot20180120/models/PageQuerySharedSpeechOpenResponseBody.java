// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageQuerySharedSpeechOpenResponseBody} extends {@link TeaModel}
 *
 * <p>PageQuerySharedSpeechOpenResponseBody</p>
 */
public class PageQuerySharedSpeechOpenResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PageQuerySharedSpeechOpenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageQuerySharedSpeechOpenResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public PageQuerySharedSpeechOpenResponseBody build() {
            return new PageQuerySharedSpeechOpenResponseBody(this);
        } 

    } 

    public static class ResultDataData extends TeaModel {
        @NameInMap("AudioFormat")
        private String audioFormat;

        @NameInMap("BizCode")
        private String bizCode;

        @NameInMap("Code")
        private String code;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Text")
        private String text;

        @NameInMap("Voice")
        private String voice;

        @NameInMap("Volume")
        private Integer volume;

        private ResultDataData(Builder builder) {
            this.audioFormat = builder.audioFormat;
            this.bizCode = builder.bizCode;
            this.code = builder.code;
            this.speechRate = builder.speechRate;
            this.status = builder.status;
            this.text = builder.text;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultDataData create() {
            return builder().build();
        }

        /**
         * @return audioFormat
         */
        public String getAudioFormat() {
            return this.audioFormat;
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String audioFormat; 
            private String bizCode; 
            private String code; 
            private Integer speechRate; 
            private Integer status; 
            private String text; 
            private String voice; 
            private Integer volume; 

            /**
             * AudioFormat.
             */
            public Builder audioFormat(String audioFormat) {
                this.audioFormat = audioFormat;
                return this;
            }

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
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
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public ResultDataData build() {
                return new ResultDataData(this);
            } 

        } 

    }
    public static class ResultData extends TeaModel {
        @NameInMap("Data")
        private java.util.List < ResultDataData> data;

        private ResultData(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < ResultDataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < ResultDataData> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List < ResultDataData> data) {
                this.data = data;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageId")
        private Integer pageId;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ResultData")
        private ResultData resultData;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.pageId = builder.pageId;
            this.pageSize = builder.pageSize;
            this.resultData = builder.resultData;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageId
         */
        public Integer getPageId() {
            return this.pageId;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return resultData
         */
        public ResultData getResultData() {
            return this.resultData;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageId; 
            private Integer pageSize; 
            private ResultData resultData; 
            private Integer total; 

            /**
             * PageId.
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
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
             * ResultData.
             */
            public Builder resultData(ResultData resultData) {
                this.resultData = resultData;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
