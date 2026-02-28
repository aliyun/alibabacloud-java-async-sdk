// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link PageQuerySharedSpeechOpenResponseBody} extends {@link TeaModel}
 *
 * <p>PageQuerySharedSpeechOpenResponseBody</p>
 */
public class PageQuerySharedSpeechOpenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(PageQuerySharedSpeechOpenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>String	iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result returned if the request was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PageQuerySharedSpeechOpenResponseBody build() {
            return new PageQuerySharedSpeechOpenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageQuerySharedSpeechOpenResponseBody} extends {@link TeaModel}
     *
     * <p>PageQuerySharedSpeechOpenResponseBody</p>
     */
    public static class ResultDataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFormat")
        private String audioFormat;

        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        @com.aliyun.core.annotation.NameInMap("Volume")
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

            private Builder() {
            } 

            private Builder(ResultDataData model) {
                this.audioFormat = model.audioFormat;
                this.bizCode = model.bizCode;
                this.code = model.code;
                this.speechRate = model.speechRate;
                this.status = model.status;
                this.text = model.text;
                this.voice = model.voice;
                this.volume = model.volume;
            } 

            /**
             * <p>The audio format. Valid values: <strong>wav</strong>, <strong>mp3</strong>, and <strong>amr</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>wav</p>
             */
            public Builder audioFormat(String audioFormat) {
                this.audioFormat = audioFormat;
                return this;
            }

            /**
             * <p>The unique identifier of the speech in the project.</p>
             * 
             * <strong>example:</strong>
             * <p>identifying</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>The unique identifier of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ws****</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The broadcasting speed. Valid values: -500 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>The status of the speeches. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The speeches are pending approval.</li>
             * <li><strong>2</strong>: The speeches are approved.</li>
             * <li><strong>3</strong>: The speeches are rejected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The content of the speech.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The sound effect that is used to broadcast speeches.</p>
             * 
             * <strong>example:</strong>
             * <p>Siyue</p>
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * <p>The volume. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
    /**
     * 
     * {@link PageQuerySharedSpeechOpenResponseBody} extends {@link TeaModel}
     *
     * <p>PageQuerySharedSpeechOpenResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<ResultDataData> data;

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
        public java.util.List<ResultDataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<ResultDataData> data; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.data = model.data;
            } 

            /**
             * <p>The result returned if the request was successful.</p>
             */
            public Builder data(java.util.List<ResultDataData> data) {
                this.data = data;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
    /**
     * 
     * {@link PageQuerySharedSpeechOpenResponseBody} extends {@link TeaModel}
     *
     * <p>PageQuerySharedSpeechOpenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageId")
        private Integer pageId;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ResultData")
        private ResultData resultData;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageId = model.pageId;
                this.pageSize = model.pageSize;
                this.resultData = model.resultData;
                this.total = model.total;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
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
             * <p>The information about shared speeches.</p>
             */
            public Builder resultData(ResultData resultData) {
                this.resultData = resultData;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
