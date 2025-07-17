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

        private Builder() {
        } 

        private Builder(GetRumExceptionStackResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * <p>The response message.</p>
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

            private Builder() {
            } 

            private Builder(ThreadInfoList model) {
                this.threadDetail = model.threadDetail;
                this.threadTag = model.threadTag;
            } 

            /**
             * <p>Thread stack details.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;0  libsystem_platform.dylib + 0x1ab5\n    rax = 0x0000000000000001   rdx = 0x0000000000000064\n    rcx = 0xffffffffffffffff   rbx = 0x0000000107701bd0\n    rsi = 0x0101010101010101   rdi = 0x0000000000000001\n    rbp = 0x00007ff7b8d64300   rsp = 0x00007ff7b8d64300\n     r8 = 0x000000000000000a    r9 = 0x0000000000000000\n    r10 = 0x0000000000000001   r11 = 0x0000000000000247\n    r12 = 0x00007ff7b8d64390   r13 = 0x0000000000000000\n    r14 = 0x000000010719d770   r15 = 0x00007ff7b8d64500\n    rip = 0x00007ff807a40ab5\n    Found by: given as instruction pointer in context\n 1  alibabacloud_rum_example + 0x2ad1\n    rbp = 0x00007ff7b8d64310   rsp = 0x00007ff7b8d64310\n    rip = 0x000000010719dad1\n    Found by: previous frame&quot;s frame pointer\n 2  alibabacloud_rum_example + 0x2a3b\n    rbp = 0x00007ff7b8d64360   rsp = 0x00007ff7b8d64320\n    rip = 0x000000010719da3b\n    Found by: previous frame&quot;s frame pointer\n 3  0x7ff807688345\n    rbp = 0x00007ff7b8d64580   rsp = 0x00007ff7b8d64370\n    rip = 0x00007ff807688345\n    Found by: previous frame&quot;s frame pointer&quot;</p>
             */
            public Builder threadDetail(String threadDetail) {
                this.threadDetail = threadDetail;
                return this;
            }

            /**
             * <p>The thread tag, including the thread number and name.</p>
             * 
             * <strong>example:</strong>
             * <p>Thread 0 (crashed)</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.binaryImages = model.binaryImages;
                this.crashAddress = model.crashAddress;
                this.crashReason = model.crashReason;
                this.lines = model.lines;
                this.moduleName = model.moduleName;
                this.threadId = model.threadId;
                this.threadInfoList = model.threadInfoList;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The name and UUID of the symbol table required for parsing the exception stack. This parameter is exposed during the parsing of PC errors.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;04B5B216682E40BF9BBE9698E3F98CAA0,libcurl.4.dylib;7878DB3CF21A3C13A203B7E3B0FA66250,libalibabacloud_rum.dylib;0F9F96FE6B1C3253A33AC9E4A0C2A3860,libsystem_kernel.dylib;3DF3256F466E37BCB995A5A9956E14150,libsystem_pthread.dylib;000000000000000000000000000000000,Security;EA4B83A319EB3E15B22CDF035DBD49250,alibabacloud_rum_example;710BB12EEEC744BAB41D1849CA3AD8021,LTSDK.pdb;EE330BA9C49E4730AA15A2B7C0BB2CAE1,JBLive.pdb&quot;</p>
             */
            public Builder binaryImages(String binaryImages) {
                this.binaryImages = binaryImages;
                return this;
            }

            /**
             * <p>The crash address. This parameter is exposed during the parsing of PC errors.</p>
             * 
             * <strong>example:</strong>
             * <p>0x1</p>
             */
            public Builder crashAddress(String crashAddress) {
                this.crashAddress = crashAddress;
                return this;
            }

            /**
             * <p>The cause of the exception. This parameter is exposed during the parsing of PC errors.</p>
             * 
             * <strong>example:</strong>
             * <p>EXC_BAD_ACCESS / KERN_INVALID_ADDRESS</p>
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
             * <p>The name of the crash parsing module. This parameter is exposed during the parsing of PC errors.</p>
             * 
             * <strong>example:</strong>
             * <p>alibabacloud_rum_example</p>
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
             * <p>The thread stack information captured during PC crashes.</p>
             */
            public Builder threadInfoList(java.util.List<ThreadInfoList> threadInfoList) {
                this.threadInfoList = threadInfoList;
                return this;
            }

            /**
             * <p>The UUID of the symbol table required for parsing the stack. This parameter is exposed during the parsing of PC errors.</p>
             * 
             * <strong>example:</strong>
             * <p>9032259CEB9130E780C6DE8FDECCD7990</p>
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
