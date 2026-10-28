// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link PreviewNotifyTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewNotifyTemplateResponseBody</p>
 */
public class PreviewNotifyTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private PreviewNotifyTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewNotifyTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PreviewNotifyTemplateResponseBody model) {
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The rendering result object, which contains two mappings: success for successfully rendered items and failed for items that failed to render.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The processing result message. The value is success if the request is successful, or an error message if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>452faed9-ab3b-4340-8a92-bc7d9b98f17a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PreviewNotifyTemplateResponseBody build() {
            return new PreviewNotifyTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewNotifyTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewNotifyTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failed")
        private java.util.Map<String, ?> failed;

        @com.aliyun.core.annotation.NameInMap("success")
        private java.util.Map<String, ?> success;

        private Data(Builder builder) {
            this.failed = builder.failed;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public java.util.Map<String, ?> getFailed() {
            return this.failed;
        }

        /**
         * @return success
         */
        public java.util.Map<String, ?> getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.Map<String, ?> failed; 
            private java.util.Map<String, ?> success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failed = model.failed;
                this.success = model.success;
            } 

            /**
             * <p>The mapping of failed rendering results. The key is the template identifier, and the value is the cause of the failure, such as a template syntax error or a reference to an undefined variable.</p>
             */
            public Builder failed(java.util.Map<String, ?> failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The mapping of successful rendering results. The key is the template identifier, which corresponds to templates[].key in the request, and the value is the rendered string content.</p>
             */
            public Builder success(java.util.Map<String, ?> success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
