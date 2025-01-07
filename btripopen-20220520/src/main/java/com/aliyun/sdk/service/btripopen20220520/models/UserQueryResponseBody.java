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
 * {@link UserQueryResponseBody} extends {@link TeaModel}
 *
 * <p>UserQueryResponseBody</p>
 */
public class UserQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

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

    private UserQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
         * <p>2f624a6316366024344424669e3279</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public UserQueryResponseBody build() {
            return new UserQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UserQueryResponseBody} extends {@link TeaModel}
     *
     * <p>UserQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("employee_nick")
        private String employeeNick;

        @com.aliyun.core.annotation.NameInMap("leave_status")
        private Integer leaveStatus;

        @com.aliyun.core.annotation.NameInMap("third_part_employee_id")
        private String thirdPartEmployeeId;

        @com.aliyun.core.annotation.NameInMap("third_part_job_no")
        private String thirdPartJobNo;

        private Items(Builder builder) {
            this.employeeNick = builder.employeeNick;
            this.leaveStatus = builder.leaveStatus;
            this.thirdPartEmployeeId = builder.thirdPartEmployeeId;
            this.thirdPartJobNo = builder.thirdPartJobNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return employeeNick
         */
        public String getEmployeeNick() {
            return this.employeeNick;
        }

        /**
         * @return leaveStatus
         */
        public Integer getLeaveStatus() {
            return this.leaveStatus;
        }

        /**
         * @return thirdPartEmployeeId
         */
        public String getThirdPartEmployeeId() {
            return this.thirdPartEmployeeId;
        }

        /**
         * @return thirdPartJobNo
         */
        public String getThirdPartJobNo() {
            return this.thirdPartJobNo;
        }

        public static final class Builder {
            private String employeeNick; 
            private Integer leaveStatus; 
            private String thirdPartEmployeeId; 
            private String thirdPartJobNo; 

            /**
             * employee_nick.
             */
            public Builder employeeNick(String employeeNick) {
                this.employeeNick = employeeNick;
                return this;
            }

            /**
             * leave_status.
             */
            public Builder leaveStatus(Integer leaveStatus) {
                this.leaveStatus = leaveStatus;
                return this;
            }

            /**
             * third_part_employee_id.
             */
            public Builder thirdPartEmployeeId(String thirdPartEmployeeId) {
                this.thirdPartEmployeeId = thirdPartEmployeeId;
                return this;
            }

            /**
             * third_part_job_no.
             */
            public Builder thirdPartJobNo(String thirdPartJobNo) {
                this.thirdPartJobNo = thirdPartJobNo;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link UserQueryResponseBody} extends {@link TeaModel}
     *
     * <p>UserQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("has_more")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("page_token")
        private String pageToken;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Module(Builder builder) {
            this.hasMore = builder.hasMore;
            this.items = builder.items;
            this.pageToken = builder.pageToken;
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
         * @return pageToken
         */
        public String getPageToken() {
            return this.pageToken;
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
            private String pageToken; 
            private Long total; 

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
             * page_token.
             */
            public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
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
