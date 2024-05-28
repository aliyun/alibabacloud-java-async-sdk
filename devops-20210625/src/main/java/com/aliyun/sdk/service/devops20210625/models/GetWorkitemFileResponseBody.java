// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkitemFileResponseBody</p>
 */
public class GetWorkitemFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("workitemFile")
    private WorkitemFile workitemFile;

    private GetWorkitemFileResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workitemFile = builder.workitemFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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

    /**
     * @return workitemFile
     */
    public WorkitemFile getWorkitemFile() {
        return this.workitemFile;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private String success; 
        private WorkitemFile workitemFile; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * workitemFile.
         */
        public Builder workitemFile(WorkitemFile workitemFile) {
            this.workitemFile = workitemFile;
            return this;
        }

        public GetWorkitemFileResponseBody build() {
            return new GetWorkitemFileResponseBody(this);
        } 

    } 

    public static class WorkitemFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("suffix")
        private String suffix;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private WorkitemFile(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.size = builder.size;
            this.suffix = builder.suffix;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkitemFile create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return suffix
         */
        public String getSuffix() {
            return this.suffix;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private Integer size; 
            private String suffix; 
            private String url; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * suffix.
             */
            public Builder suffix(String suffix) {
                this.suffix = suffix;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public WorkitemFile build() {
                return new WorkitemFile(this);
            } 

        } 

    }
}
