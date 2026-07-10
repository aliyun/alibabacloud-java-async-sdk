// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link BatchQueryDepartmentResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQueryDepartmentResponseBody</p>
 */
public class BatchQueryDepartmentResponseBody extends TeaModel {
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

    private BatchQueryDepartmentResponseBody(Builder builder) {
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

    public static BatchQueryDepartmentResponseBody create() {
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

        private Builder() {
        } 

        private Builder(BatchQueryDepartmentResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public BatchQueryDepartmentResponseBody build() {
            return new BatchQueryDepartmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchQueryDepartmentResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryDepartmentResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dept_name")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("manager_employee_id_list")
        private java.util.List<String> managerEmployeeIdList;

        @com.aliyun.core.annotation.NameInMap("out_dept_id")
        private String outDeptId;

        private Items(Builder builder) {
            this.deptName = builder.deptName;
            this.managerEmployeeIdList = builder.managerEmployeeIdList;
            this.outDeptId = builder.outDeptId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return managerEmployeeIdList
         */
        public java.util.List<String> getManagerEmployeeIdList() {
            return this.managerEmployeeIdList;
        }

        /**
         * @return outDeptId
         */
        public String getOutDeptId() {
            return this.outDeptId;
        }

        public static final class Builder {
            private String deptName; 
            private java.util.List<String> managerEmployeeIdList; 
            private String outDeptId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.deptName = model.deptName;
                this.managerEmployeeIdList = model.managerEmployeeIdList;
                this.outDeptId = model.outDeptId;
            } 

            /**
             * dept_name.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * manager_employee_id_list.
             */
            public Builder managerEmployeeIdList(java.util.List<String> managerEmployeeIdList) {
                this.managerEmployeeIdList = managerEmployeeIdList;
                return this;
            }

            /**
             * out_dept_id.
             */
            public Builder outDeptId(String outDeptId) {
                this.outDeptId = outDeptId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchQueryDepartmentResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryDepartmentResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("has_more")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("next_cursor_token")
        private String nextCursorToken;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Module(Builder builder) {
            this.hasMore = builder.hasMore;
            this.items = builder.items;
            this.nextCursorToken = builder.nextCursorToken;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return nextCursorToken
         */
        public String getNextCursorToken() {
            return this.nextCursorToken;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List<Items> items; 
            private String nextCursorToken; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.hasMore = model.hasMore;
                this.items = model.items;
                this.nextCursorToken = model.nextCursorToken;
                this.total = model.total;
            } 

            /**
             * has_more.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * next_cursor_token.
             */
            public Builder nextCursorToken(String nextCursorToken) {
                this.nextCursorToken = nextCursorToken;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
