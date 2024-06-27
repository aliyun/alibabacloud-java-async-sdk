// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventTaskHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventTaskHistoryResponseBody</p>
 */
public class DescribeEventTaskHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    private DescribeEventTaskHistoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventTaskHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeEventTaskHistoryResponseBody build() {
            return new DescribeEventTaskHistoryResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("taskCode")
        private String taskCode;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ResultObject(Builder builder) {
            this.taskCode = builder.taskCode;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return taskCode
         */
        public String getTaskCode() {
            return this.taskCode;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String taskCode; 
            private String taskName; 
            private String taskStatus; 
            private String url; 

            /**
             * taskCode.
             */
            public Builder taskCode(String taskCode) {
                this.taskCode = taskCode;
                return this;
            }

            /**
             * taskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * taskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
