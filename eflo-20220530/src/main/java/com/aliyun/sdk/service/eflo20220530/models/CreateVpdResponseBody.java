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
 * {@link CreateVpdResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpdResponseBody</p>
 */
public class CreateVpdResponseBody extends TeaModel {
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

    private CreateVpdResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateVpdResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.content = model.content;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the failed permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DBAD15D6-3F47-5B36-8A92-57C2919D13D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVpdResponseBody build() {
            return new CreateVpdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateVpdResponseBody} extends {@link TeaModel}
     *
     * <p>CreateVpdResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubnetIds")
        private java.util.List<String> subnetIds;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        private Content(Builder builder) {
            this.subnetIds = builder.subnetIds;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return subnetIds
         */
        public java.util.List<String> getSubnetIds() {
            return this.subnetIds;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private java.util.List<String> subnetIds; 
            private String vpdId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.subnetIds = model.subnetIds;
                this.vpdId = model.vpdId;
            } 

            /**
             * <p>Lingjun subnet ID list</p>
             */
            public Builder subnetIds(java.util.List<String> subnetIds) {
                this.subnetIds = subnetIds;
                return this;
            }

            /**
             * <p>Lingjun CIDR block instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-eoiy88ju</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
