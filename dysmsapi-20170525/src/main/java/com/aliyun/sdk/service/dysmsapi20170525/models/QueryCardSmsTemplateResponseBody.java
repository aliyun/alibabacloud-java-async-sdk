// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCardSmsTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCardSmsTemplateResponseBody</p>
 */
public class QueryCardSmsTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryCardSmsTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QueryCardSmsTemplateResponseBody build() {
            return new QueryCardSmsTemplateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Templates")
        private java.util.List < java.util.Map<String, ?>> templates;

        private Data(Builder builder) {
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return templates
         */
        public java.util.List < java.util.Map<String, ?>> getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> templates; 

            /**
             * Templates.
             */
            public Builder templates(java.util.List < java.util.Map<String, ?>> templates) {
                this.templates = templates;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
