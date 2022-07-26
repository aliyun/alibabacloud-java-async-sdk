// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceSearchResponseBody} extends {@link TeaModel}
 *
 * <p>InvoiceSearchResponseBody</p>
 */
public class InvoiceSearchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("module")
    private java.util.List < Module> module;

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

    private InvoiceSearchResponseBody(Builder builder) {
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

    public static InvoiceSearchResponseBody create() {
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
    public java.util.List < Module> getModule() {
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
        private java.util.List < Module> module; 
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
        public Builder module(java.util.List < Module> module) {
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

        public InvoiceSearchResponseBody build() {
            return new InvoiceSearchResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @NameInMap("title")
        private String title;

        private Module(Builder builder) {
            this.id = builder.id;
            this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return thirdPartInvoiceId
         */
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private String thirdPartInvoiceId; 
            private String title; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * third_part_invoice_id.
             */
            public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
                this.thirdPartInvoiceId = thirdPartInvoiceId;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
