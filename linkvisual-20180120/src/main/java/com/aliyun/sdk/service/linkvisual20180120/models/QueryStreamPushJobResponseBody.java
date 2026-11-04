// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryStreamPushJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStreamPushJobResponseBody</p>
 */
public class QueryStreamPushJobResponseBody extends TeaModel {
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

    private QueryStreamPushJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStreamPushJobResponseBody create() {
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

        private Builder(QueryStreamPushJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li><strong>200</strong>: The call is successful.</li>
         * <li>Other values: An error code. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Request parameter error.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The unique identifier that Alibaba Cloud generates for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55<em><strong>B7-4</strong></em>-4***-8***-D3******F565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryStreamPushJobResponseBody build() {
            return new QueryStreamPushJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryStreamPushJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStreamPushJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Integer createTime;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private Integer jobType;

        @com.aliyun.core.annotation.NameInMap("PushStatus")
        private Integer pushStatus;

        @com.aliyun.core.annotation.NameInMap("PushUrl")
        private String pushUrl;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private Integer streamType;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.jobType = builder.jobType;
            this.pushStatus = builder.pushStatus;
            this.pushUrl = builder.pushUrl;
            this.streamType = builder.streamType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobType
         */
        public Integer getJobType() {
            return this.jobType;
        }

        /**
         * @return pushStatus
         */
        public Integer getPushStatus() {
            return this.pushStatus;
        }

        /**
         * @return pushUrl
         */
        public String getPushUrl() {
            return this.pushUrl;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        public static final class Builder {
            private Integer createTime; 
            private Integer jobType; 
            private Integer pushStatus; 
            private String pushUrl; 
            private Integer streamType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.jobType = model.jobType;
                this.pushStatus = model.pushStatus;
                this.pushUrl = model.pushUrl;
                this.streamType = model.streamType;
            } 

            /**
             * <p>The time when the job was created. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1581595942</p>
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the stream push job. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Continuous job.</li>
             * <li><strong>2</strong>: Triggered job, which ends after an interruption.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder jobType(Integer jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The current stream push status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Pushing.</li>
             * <li><strong>2</strong>: Waiting to push.</li>
             * <li><strong>3</strong>: Push ended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pushStatus(Integer pushStatus) {
                this.pushStatus = pushStatus;
                return this;
            }

            /**
             * <p>The stream push URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://****</p>
             */
            public Builder pushUrl(String pushUrl) {
                this.pushUrl = pushUrl;
                return this;
            }

            /**
             * <p>The stream type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Main stream.</li>
             * <li><strong>1</strong>: Sub stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
