// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePodContainerLogListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePodContainerLogListResponseBody</p>
 */
public class DescribePodContainerLogListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribePodContainerLogListResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePodContainerLogListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePodContainerLogListResponseBody build() {
            return new DescribePodContainerLogListResponseBody(this);
        } 

    } 

    public static class ContainerLogList extends TeaModel {
        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("Content")
        private String content;

        @NameInMap("PodName")
        private String podName;

        private ContainerLogList(Builder builder) {
            this.containerName = builder.containerName;
            this.content = builder.content;
            this.podName = builder.podName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerLogList create() {
            return builder().build();
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        public static final class Builder {
            private String containerName; 
            private String content; 
            private String podName; 

            /**
             * ContainerName.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * PodName.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            public ContainerLogList build() {
                return new ContainerLogList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("ContainerLogList")
        private java.util.List < ContainerLogList> containerLogList;

        private Result(Builder builder) {
            this.containerLogList = builder.containerLogList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return containerLogList
         */
        public java.util.List < ContainerLogList> getContainerLogList() {
            return this.containerLogList;
        }

        public static final class Builder {
            private java.util.List < ContainerLogList> containerLogList; 

            /**
             * ContainerLogList.
             */
            public Builder containerLogList(java.util.List < ContainerLogList> containerLogList) {
                this.containerLogList = containerLogList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
