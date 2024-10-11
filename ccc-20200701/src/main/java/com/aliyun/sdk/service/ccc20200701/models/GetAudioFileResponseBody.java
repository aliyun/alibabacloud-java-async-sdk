// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAudioFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetAudioFileResponseBody</p>
 */
public class GetAudioFileResponseBody extends TeaModel {
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

    private GetAudioFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAudioFileResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

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

        public GetAudioFileResponseBody build() {
            return new GetAudioFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAudioFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetAudioFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFileName")
        private String audioFileName;

        @com.aliyun.core.annotation.NameInMap("AudioResourceId")
        private String audioResourceId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssFileKey")
        private String ossFileKey;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private String updatedTime;

        private Data(Builder builder) {
            this.audioFileName = builder.audioFileName;
            this.audioResourceId = builder.audioResourceId;
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.ossFileKey = builder.ossFileKey;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioFileName
         */
        public String getAudioFileName() {
            return this.audioFileName;
        }

        /**
         * @return audioResourceId
         */
        public String getAudioResourceId() {
            return this.audioResourceId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossFileKey
         */
        public String getOssFileKey() {
            return this.ossFileKey;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String audioFileName; 
            private String audioResourceId; 
            private String createdTime; 
            private String instanceId; 
            private String name; 
            private String ossFileKey; 
            private String updatedTime; 

            /**
             * AudioFileName.
             */
            public Builder audioFileName(String audioFileName) {
                this.audioFileName = audioFileName;
                return this;
            }

            /**
             * AudioResourceId.
             */
            public Builder audioResourceId(String audioResourceId) {
                this.audioResourceId = audioResourceId;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OssFileKey.
             */
            public Builder ossFileKey(String ossFileKey) {
                this.ossFileKey = ossFileKey;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
