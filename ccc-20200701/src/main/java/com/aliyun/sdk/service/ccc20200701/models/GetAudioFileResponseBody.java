// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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

        private Builder() {
        } 

        private Builder(GetAudioFileResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Audio file data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEE26562-D921-5CB2-AE49-E4C45A42D432</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.audioFileName = model.audioFileName;
                this.audioResourceId = model.audioResourceId;
                this.createdTime = model.createdTime;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.ossFileKey = model.ossFileKey;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>Audio file name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-file.wav</p>
             */
            public Builder audioFileName(String audioFileName) {
                this.audioFileName = audioFileName;
                return this;
            }

            /**
             * <p>Audio resource ID, the UUID of the audio file.</p>
             * 
             * <strong>example:</strong>
             * <p>c1a06b46-302a-4c6e-928b-a43c0df485cf</p>
             */
            public Builder audioResourceId(String audioResourceId) {
                this.audioResourceId = audioResourceId;
                return this;
            }

            /**
             * <p>Creation Time of the audio resource.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-14 10:48:43.0</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Display name of the audio.</p>
             * 
             * <strong>example:</strong>
             * <p>欢迎语</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Key of the audio resource file in OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test/test-file.wav</p>
             */
            public Builder ossFileKey(String ossFileKey) {
                this.ossFileKey = ossFileKey;
                return this;
            }

            /**
             * <p>Last Updated At of the audio resource.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-14 10:48:43.0</p>
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
