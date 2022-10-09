// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserQueryResponseBody} extends {@link TeaModel}
 *
 * <p>UserQueryResponseBody</p>
 */
public class UserQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private Integer code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
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
    public Integer getCode() {
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
        private Integer code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(Integer code) {
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public UserQueryResponseBody build() {
            return new UserQueryResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("employee_nick")
        private String employeeNick;

        @NameInMap("third_part_employee_id")
        private String thirdPartEmployeeId;

        @NameInMap("third_part_job_no")
        private String thirdPartJobNo;

        private Items(Builder builder) {
            this.employeeNick = builder.employeeNick;
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
            private String thirdPartEmployeeId; 
            private String thirdPartJobNo; 

            /**
             * 员工昵称，user.user_nick
             */
            public Builder employeeNick(String employeeNick) {
                this.employeeNick = employeeNick;
                return this;
            }

            /**
             * 第三方员工ID，user.user_id
             */
            public Builder thirdPartEmployeeId(String thirdPartEmployeeId) {
                this.thirdPartEmployeeId = thirdPartEmployeeId;
                return this;
            }

            /**
             * 第三方员工工号，user.job_no
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
    public static class Module extends TeaModel {
        @NameInMap("has_more")
        private Boolean hasMore;

        @NameInMap("items")
        private java.util.List < Items> items;

        @NameInMap("page_token")
        private String pageToken;

        @NameInMap("total")
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
        public java.util.List < Items> getItems() {
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
            private java.util.List < Items> items; 
            private String pageToken; 
            private Long total; 

            /**
             * 是否还有更多数据项
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * 连续翻页的分页标记，当has_more为true时，会同时返回新的page_token，否则不返回page_token
             */
            public Builder pageToken(String pageToken) {
                this.pageToken = pageToken;
                return this;
            }

            /**
             * 本次请求条件下的数据项总量
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
