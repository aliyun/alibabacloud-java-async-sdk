// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetRumExceptionStackResponseBody} extends {@link TeaModel}
 *
 * <p>GetRumExceptionStackResponseBody</p>
 */
public class GetRumExceptionStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetRumExceptionStackResponseBody(Builder builder) {
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

    public static GetRumExceptionStackResponseBody create() {
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
    public String getHttpStatusCode() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The responses code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error. Please try again. Contact the DingTalk service account if the issue                              persists after multiple retries.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B6A00968-82A8-4F14-9D1B-B53827DB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetRumExceptionStackResponseBody build() {
            return new GetRumExceptionStackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRumExceptionStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetRumExceptionStackResponseBody</p>
     */
    public static class ThreadInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ThreadDetail")
        private String threadDetail;

        @com.aliyun.core.annotation.NameInMap("ThreadTag")
        private String threadTag;

        private ThreadInfoList(Builder builder) {
            this.threadDetail = builder.threadDetail;
            this.threadTag = builder.threadTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreadInfoList create() {
            return builder().build();
        }

        /**
         * @return threadDetail
         */
        public String getThreadDetail() {
            return this.threadDetail;
        }

        /**
         * @return threadTag
         */
        public String getThreadTag() {
            return this.threadTag;
        }

        public static final class Builder {
            private String threadDetail; 
            private String threadTag; 

            /**
             * ThreadDetail.
             */
            public Builder threadDetail(String threadDetail) {
                this.threadDetail = threadDetail;
                return this;
            }

            /**
             * ThreadTag.
             */
            public Builder threadTag(String threadTag) {
                this.threadTag = threadTag;
                return this;
            }

            public ThreadInfoList build() {
                return new ThreadInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRumExceptionStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetRumExceptionStackResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BinaryImages")
        private String binaryImages;

        @com.aliyun.core.annotation.NameInMap("CrashAddress")
        private String crashAddress;

        @com.aliyun.core.annotation.NameInMap("CrashReason")
        private String crashReason;

        @com.aliyun.core.annotation.NameInMap("Lines")
        private java.util.List<String> lines;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private String threadId;

        @com.aliyun.core.annotation.NameInMap("ThreadInfoList")
        private java.util.List<ThreadInfoList> threadInfoList;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.binaryImages = builder.binaryImages;
            this.crashAddress = builder.crashAddress;
            this.crashReason = builder.crashReason;
            this.lines = builder.lines;
            this.moduleName = builder.moduleName;
            this.threadId = builder.threadId;
            this.threadInfoList = builder.threadInfoList;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return binaryImages
         */
        public String getBinaryImages() {
            return this.binaryImages;
        }

        /**
         * @return crashAddress
         */
        public String getCrashAddress() {
            return this.crashAddress;
        }

        /**
         * @return crashReason
         */
        public String getCrashReason() {
            return this.crashReason;
        }

        /**
         * @return lines
         */
        public java.util.List<String> getLines() {
            return this.lines;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        /**
         * @return threadInfoList
         */
        public java.util.List<ThreadInfoList> getThreadInfoList() {
            return this.threadInfoList;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String binaryImages; 
            private String crashAddress; 
            private String crashReason; 
            private java.util.List<String> lines; 
            private String moduleName; 
            private String threadId; 
            private java.util.List<ThreadInfoList> threadInfoList; 
            private String uuid; 

            /**
             * BinaryImages.
             */
            public Builder binaryImages(String binaryImages) {
                this.binaryImages = binaryImages;
                return this;
            }

            /**
             * CrashAddress.
             */
            public Builder crashAddress(String crashAddress) {
                this.crashAddress = crashAddress;
                return this;
            }

            /**
             * CrashReason.
             */
            public Builder crashReason(String crashReason) {
                this.crashReason = crashReason;
                return this;
            }

            /**
             * <p>The list of stacks.</p>
             */
            public Builder lines(java.util.List<String> lines) {
                this.lines = lines;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The thread ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16643</p>
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * ThreadInfoList.
             */
            public Builder threadInfoList(java.util.List<ThreadInfoList> threadInfoList) {
                this.threadInfoList = threadInfoList;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
