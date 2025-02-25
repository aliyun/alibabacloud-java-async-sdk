// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link CreateVccGrantRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVccGrantRuleResponseBody</p>
 */
public class CreateVccGrantRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateVccGrantRuleResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVccGrantRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVccGrantRuleResponseBody build() {
            return new CreateVccGrantRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateVccGrantRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateVccGrantRuleResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrantRuleId")
        private String grantRuleId;

        private Content(Builder builder) {
            this.grantRuleId = builder.grantRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return grantRuleId
         */
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

        public static final class Builder {
            private String grantRuleId; 

            /**
             * <p>Authorized resource primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>grant-rule-8rgvqazb</p>
             */
            public Builder grantRuleId(String grantRuleId) {
                this.grantRuleId = grantRuleId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
