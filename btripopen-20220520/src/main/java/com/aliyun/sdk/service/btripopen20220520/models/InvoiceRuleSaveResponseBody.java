// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceRuleSaveResponseBody} extends {@link TeaModel}
 *
 * <p>InvoiceRuleSaveResponseBody</p>
 */
public class InvoiceRuleSaveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("module")
    private Module module;

    @NameInMap("more_page")
    private Boolean morePage;

    @NameInMap("result_code")
    private Integer resultCode;

    @NameInMap("result_msg")
    private String resultMsg;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private InvoiceRuleSaveResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.module = builder.module;
        this.morePage = builder.morePage;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceRuleSaveResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
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
        private String requestId; 
        private Module module; 
        private Boolean morePage; 
        private Integer resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * 结果代码
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * 备注，结果的备注，如对结果的说明
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public InvoiceRuleSaveResponseBody build() {
            return new InvoiceRuleSaveResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("account")
        private String account;

        @NameInMap("add_num")
        private Integer addNum;

        @NameInMap("havana_id")
        private String havanaId;

        @NameInMap("remove_num")
        private Integer removeNum;

        @NameInMap("selected_external_user_num")
        private Integer selectedExternalUserNum;

        @NameInMap("selected_user_num")
        private Integer selectedUserNum;

        @NameInMap("suite_key")
        private String suiteKey;

        @NameInMap("token_grant_type")
        private Integer tokenGrantType;

        @NameInMap("version")
        private Integer version;

        @NameInMap("without_authority")
        private Boolean withoutAuthority;

        private Module(Builder builder) {
            this.account = builder.account;
            this.addNum = builder.addNum;
            this.havanaId = builder.havanaId;
            this.removeNum = builder.removeNum;
            this.selectedExternalUserNum = builder.selectedExternalUserNum;
            this.selectedUserNum = builder.selectedUserNum;
            this.suiteKey = builder.suiteKey;
            this.tokenGrantType = builder.tokenGrantType;
            this.version = builder.version;
            this.withoutAuthority = builder.withoutAuthority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return addNum
         */
        public Integer getAddNum() {
            return this.addNum;
        }

        /**
         * @return havanaId
         */
        public String getHavanaId() {
            return this.havanaId;
        }

        /**
         * @return removeNum
         */
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        /**
         * @return selectedExternalUserNum
         */
        public Integer getSelectedExternalUserNum() {
            return this.selectedExternalUserNum;
        }

        /**
         * @return selectedUserNum
         */
        public Integer getSelectedUserNum() {
            return this.selectedUserNum;
        }

        /**
         * @return suiteKey
         */
        public String getSuiteKey() {
            return this.suiteKey;
        }

        /**
         * @return tokenGrantType
         */
        public Integer getTokenGrantType() {
            return this.tokenGrantType;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return withoutAuthority
         */
        public Boolean getWithoutAuthority() {
            return this.withoutAuthority;
        }

        public static final class Builder {
            private String account; 
            private Integer addNum; 
            private String havanaId; 
            private Integer removeNum; 
            private Integer selectedExternalUserNum; 
            private Integer selectedUserNum; 
            private String suiteKey; 
            private Integer tokenGrantType; 
            private Integer version; 
            private Boolean withoutAuthority; 

            /**
             * account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * add_num.
             */
            public Builder addNum(Integer addNum) {
                this.addNum = addNum;
                return this;
            }

            /**
             * havana_id.
             */
            public Builder havanaId(String havanaId) {
                this.havanaId = havanaId;
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
             * selected_external_user_num.
             */
            public Builder selectedExternalUserNum(Integer selectedExternalUserNum) {
                this.selectedExternalUserNum = selectedExternalUserNum;
                return this;
            }

            /**
             * selected_user_num.
             */
            public Builder selectedUserNum(Integer selectedUserNum) {
                this.selectedUserNum = selectedUserNum;
                return this;
            }

            /**
             * suite_key.
             */
            public Builder suiteKey(String suiteKey) {
                this.suiteKey = suiteKey;
                return this;
            }

            /**
             * token_grant_type.
             */
            public Builder tokenGrantType(Integer tokenGrantType) {
                this.tokenGrantType = tokenGrantType;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * without_authority.
             */
            public Builder withoutAuthority(Boolean withoutAuthority) {
                this.withoutAuthority = withoutAuthority;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
