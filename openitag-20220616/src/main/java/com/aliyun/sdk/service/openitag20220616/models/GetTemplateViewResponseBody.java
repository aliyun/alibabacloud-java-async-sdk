// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateViewResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateViewResponseBody</p>
 */
public class GetTemplateViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Details")
    private String details;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("ViewConfigs")
    private ViewConfigs viewConfigs;

    private GetTemplateViewResponseBody(Builder builder) {
        this.code = builder.code;
        this.details = builder.details;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.viewConfigs = builder.viewConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateViewResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return details
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return viewConfigs
     */
    public ViewConfigs getViewConfigs() {
        return this.viewConfigs;
    }

    public static final class Builder {
        private Integer code; 
        private String details; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private ViewConfigs viewConfigs; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Details.
         */
        public Builder details(String details) {
            this.details = details;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ViewConfigs.
         */
        public Builder viewConfigs(ViewConfigs viewConfigs) {
            this.viewConfigs = viewConfigs;
            return this;
        }

        public GetTemplateViewResponseBody build() {
            return new GetTemplateViewResponseBody(this);
        } 

    } 

    public static class ViewConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ViewPlugins")
        private java.util.List < ViewPlugin > viewPlugins;

        private ViewConfigs(Builder builder) {
            this.viewPlugins = builder.viewPlugins;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewConfigs create() {
            return builder().build();
        }

        /**
         * @return viewPlugins
         */
        public java.util.List < ViewPlugin > getViewPlugins() {
            return this.viewPlugins;
        }

        public static final class Builder {
            private java.util.List < ViewPlugin > viewPlugins; 

            /**
             * ViewPlugins.
             */
            public Builder viewPlugins(java.util.List < ViewPlugin > viewPlugins) {
                this.viewPlugins = viewPlugins;
                return this;
            }

            public ViewConfigs build() {
                return new ViewConfigs(this);
            } 

        } 

    }
}
