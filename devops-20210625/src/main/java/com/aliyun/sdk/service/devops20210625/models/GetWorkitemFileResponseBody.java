// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkitemFileResponseBody</p>
 */
public class GetWorkitemFileResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private String success;

    @NameInMap("workitemFile")
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
        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("size")
        private Integer size;

        @NameInMap("suffix")
        private String suffix;

        @NameInMap("url")
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
