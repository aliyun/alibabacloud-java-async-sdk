// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskTemplateViewsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskTemplateViewsResponseBody</p>
 */
public class GetTaskTemplateViewsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Views")
    private Views views;

    private GetTaskTemplateViewsResponseBody(Builder builder) {
        this.code = builder.code;
        this.details = builder.details;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.views = builder.views;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskTemplateViewsResponseBody create() {
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
     * @return views
     */
    public Views getViews() {
        return this.views;
    }

    public static final class Builder {
        private Integer code; 
        private String details; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Views views; 

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
         * Views.
         */
        public Builder views(Views views) {
            this.views = views;
            return this;
        }

        public GetTaskTemplateViewsResponseBody build() {
            return new GetTaskTemplateViewsResponseBody(this);
        } 

    } 

    public static class Views extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ViewPlugins")
        private java.util.List < ViewPlugin > viewPlugins;

        private Views(Builder builder) {
            this.viewPlugins = builder.viewPlugins;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Views create() {
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

            public Views build() {
                return new Views(this);
            } 

        } 

    }
}
