// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListRectifyFlowResponseBody} extends {@link TeaModel}
 *
 * <p>ListRectifyFlowResponseBody</p>
 */
public class ListRectifyFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRectifyFlowResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRectifyFlowResponseBody create() {
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRectifyFlowResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination result.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRectifyFlowResponseBody build() {
            return new ListRectifyFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>ListRectifyFlowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("ProblemCount")
        private Long problemCount;

        @com.aliyun.core.annotation.NameInMap("RectifyId")
        private Long rectifyId;

        @com.aliyun.core.annotation.NameInMap("RectifyName")
        private String rectifyName;

        @com.aliyun.core.annotation.NameInMap("RectifyPriority")
        private String rectifyPriority;

        @com.aliyun.core.annotation.NameInMap("RectifyUser")
        private String rectifyUser;

        @com.aliyun.core.annotation.NameInMap("RectifyUserName")
        private String rectifyUserName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitUser")
        private String submitUser;

        @com.aliyun.core.annotation.NameInMap("SubmitUserName")
        private String submitUserName;

        @com.aliyun.core.annotation.NameInMap("VerifyUser")
        private String verifyUser;

        @com.aliyun.core.annotation.NameInMap("VerifyUserName")
        private String verifyUserName;

        private Data(Builder builder) {
            this.finishTime = builder.finishTime;
            this.problemCount = builder.problemCount;
            this.rectifyId = builder.rectifyId;
            this.rectifyName = builder.rectifyName;
            this.rectifyPriority = builder.rectifyPriority;
            this.rectifyUser = builder.rectifyUser;
            this.rectifyUserName = builder.rectifyUserName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.submitUser = builder.submitUser;
            this.submitUserName = builder.submitUserName;
            this.verifyUser = builder.verifyUser;
            this.verifyUserName = builder.verifyUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return problemCount
         */
        public Long getProblemCount() {
            return this.problemCount;
        }

        /**
         * @return rectifyId
         */
        public Long getRectifyId() {
            return this.rectifyId;
        }

        /**
         * @return rectifyName
         */
        public String getRectifyName() {
            return this.rectifyName;
        }

        /**
         * @return rectifyPriority
         */
        public String getRectifyPriority() {
            return this.rectifyPriority;
        }

        /**
         * @return rectifyUser
         */
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        /**
         * @return rectifyUserName
         */
        public String getRectifyUserName() {
            return this.rectifyUserName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitUser
         */
        public String getSubmitUser() {
            return this.submitUser;
        }

        /**
         * @return submitUserName
         */
        public String getSubmitUserName() {
            return this.submitUserName;
        }

        /**
         * @return verifyUser
         */
        public String getVerifyUser() {
            return this.verifyUser;
        }

        /**
         * @return verifyUserName
         */
        public String getVerifyUserName() {
            return this.verifyUserName;
        }

        public static final class Builder {
            private Long finishTime; 
            private Long problemCount; 
            private Long rectifyId; 
            private String rectifyName; 
            private String rectifyPriority; 
            private String rectifyUser; 
            private String rectifyUserName; 
            private Long startTime; 
            private String status; 
            private String submitUser; 
            private String submitUserName; 
            private String verifyUser; 
            private String verifyUserName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.finishTime = model.finishTime;
                this.problemCount = model.problemCount;
                this.rectifyId = model.rectifyId;
                this.rectifyName = model.rectifyName;
                this.rectifyPriority = model.rectifyPriority;
                this.rectifyUser = model.rectifyUser;
                this.rectifyUserName = model.rectifyUserName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.submitUser = model.submitUser;
                this.submitUserName = model.submitUserName;
                this.verifyUser = model.verifyUser;
                this.verifyUserName = model.verifyUserName;
            } 

            /**
             * <p>The completion time. The value is a UNIX timestamp in milliseconds. If the process is not completed, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>648218233037</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The total number of issues in the current process.</p>
             * 
             * <strong>example:</strong>
             * <p>264461775547</p>
             */
            public Builder problemCount(Long problemCount) {
                this.problemCount = problemCount;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>474448887101</p>
             */
            public Builder rectifyId(Long rectifyId) {
                this.rectifyId = rectifyId;
                return this;
            }

            /**
             * <p>The process name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rectifyName(String rectifyName) {
                this.rectifyName = rectifyName;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rectifyPriority(String rectifyPriority) {
                this.rectifyPriority = rectifyPriority;
                return this;
            }

            /**
             * <p>The rectifier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder rectifyUser(String rectifyUser) {
                this.rectifyUser = rectifyUser;
                return this;
            }

            /**
             * <p>The rectifier name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rectifyUserName(String rectifyUserName) {
                this.rectifyUserName = rectifyUserName;
                return this;
            }

            /**
             * <p>The start time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>356278124692</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The process status.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The initiator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder submitUser(String submitUser) {
                this.submitUser = submitUser;
                return this;
            }

            /**
             * <p>The initiator name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder submitUserName(String submitUserName) {
                this.submitUserName = submitUserName;
                return this;
            }

            /**
             * <p>The verifier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder verifyUser(String verifyUser) {
                this.verifyUser = verifyUser;
                return this;
            }

            /**
             * <p>The verifier name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder verifyUserName(String verifyUserName) {
                this.verifyUserName = verifyUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>ListRectifyFlowResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The processes on the current page.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of processes.</p>
             * 
             * <strong>example:</strong>
             * <p>699386170553</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
