// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryEmployeeDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEmployeeDetailResponseBody</p>
 */
public class QueryEmployeeDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private QueryEmployeeDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEmployeeDetailResponseBody create() {
        return builder().build();
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
     * @return module
     */
    public Module getModule() {
        return this.module;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public QueryEmployeeDetailResponseBody build() {
            return new QueryEmployeeDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEmployeeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEmployeeDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("is_leave")
        private Boolean isLeave;

        @com.aliyun.core.annotation.NameInMap("job_number")
        private String jobNumber;

        @com.aliyun.core.annotation.NameInMap("nick_name")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("out_dept_id")
        private String outDeptId;

        @com.aliyun.core.annotation.NameInMap("out_dept_id_list")
        private java.util.List < String > outDeptIdList;

        @com.aliyun.core.annotation.NameInMap("out_employee_id")
        private String outEmployeeId;

        @com.aliyun.core.annotation.NameInMap("real_name")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("real_name_en")
        private String realNameEn;

        private Module(Builder builder) {
            this.isLeave = builder.isLeave;
            this.jobNumber = builder.jobNumber;
            this.nickName = builder.nickName;
            this.outDeptId = builder.outDeptId;
            this.outDeptIdList = builder.outDeptIdList;
            this.outEmployeeId = builder.outEmployeeId;
            this.realName = builder.realName;
            this.realNameEn = builder.realNameEn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return isLeave
         */
        public Boolean getIsLeave() {
            return this.isLeave;
        }

        /**
         * @return jobNumber
         */
        public String getJobNumber() {
            return this.jobNumber;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return outDeptId
         */
        public String getOutDeptId() {
            return this.outDeptId;
        }

        /**
         * @return outDeptIdList
         */
        public java.util.List < String > getOutDeptIdList() {
            return this.outDeptIdList;
        }

        /**
         * @return outEmployeeId
         */
        public String getOutEmployeeId() {
            return this.outEmployeeId;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return realNameEn
         */
        public String getRealNameEn() {
            return this.realNameEn;
        }

        public static final class Builder {
            private Boolean isLeave; 
            private String jobNumber; 
            private String nickName; 
            private String outDeptId; 
            private java.util.List < String > outDeptIdList; 
            private String outEmployeeId; 
            private String realName; 
            private String realNameEn; 

            /**
             * is_leave.
             */
            public Builder isLeave(Boolean isLeave) {
                this.isLeave = isLeave;
                return this;
            }

            /**
             * job_number.
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            /**
             * nick_name.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * out_dept_id.
             */
            public Builder outDeptId(String outDeptId) {
                this.outDeptId = outDeptId;
                return this;
            }

            /**
             * out_dept_id_list.
             */
            public Builder outDeptIdList(java.util.List < String > outDeptIdList) {
                this.outDeptIdList = outDeptIdList;
                return this;
            }

            /**
             * out_employee_id.
             */
            public Builder outEmployeeId(String outEmployeeId) {
                this.outEmployeeId = outEmployeeId;
                return this;
            }

            /**
             * real_name.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * real_name_en.
             */
            public Builder realNameEn(String realNameEn) {
                this.realNameEn = realNameEn;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
