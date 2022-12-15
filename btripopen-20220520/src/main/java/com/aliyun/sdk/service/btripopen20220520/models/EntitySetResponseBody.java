// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntitySetResponseBody} extends {@link TeaModel}
 *
 * <p>EntitySetResponseBody</p>
 */
public class EntitySetResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("more_page")
    private Boolean morePage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private EntitySetResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.morePage = builder.morePage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntitySetResponseBody create() {
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
     * @return morePage
     */
    public Boolean getMorePage() {
        return this.morePage;
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
        private Boolean morePage; 
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
         * 备注，结果的备注，如对结果的说明
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 返回值，服务端返回，没有结果或发生异常都返回空
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * 分页标识，由服务端设置，分页时是否有下一页更多数据。
         */
        public Builder morePage(Boolean morePage) {
            this.morePage = morePage;
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
         * 成功标识，由服务端设置，发生异常时为false。结果为null设置为false。
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public EntitySetResponseBody build() {
            return new EntitySetResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("add_num")
        private Integer addNum;

        @NameInMap("remove_num")
        private Integer removeNum;

        @NameInMap("selected_user_num")
        private Integer selectedUserNum;

        private Module(Builder builder) {
            this.addNum = builder.addNum;
            this.removeNum = builder.removeNum;
            this.selectedUserNum = builder.selectedUserNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return addNum
         */
        public Integer getAddNum() {
            return this.addNum;
        }

        /**
         * @return removeNum
         */
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        /**
         * @return selectedUserNum
         */
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

        public static final class Builder {
            private Integer addNum; 
            private Integer removeNum; 
            private Integer selectedUserNum; 

            /**
             * add_num.
             */
            public Builder addNum(Integer addNum) {
                this.addNum = addNum;
                return this;
            }

            /**
             * remove_num.
             */
            public Builder removeNum(Integer removeNum) {
                this.removeNum = removeNum;
                return this;
            }

            /**
             * selected_user_num.
             */
            public Builder selectedUserNum(Integer selectedUserNum) {
                this.selectedUserNum = selectedUserNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
