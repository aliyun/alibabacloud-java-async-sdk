// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QuerySellerLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySellerLicenseResponseBody</p>
 */
public class QuerySellerLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySellerLicenseResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySellerLicenseResponseBody create() {
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
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5F0A38D5-F981-529A-911E-1B6D55D***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySellerLicenseResponseBody build() {
            return new QuerySellerLicenseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySellerLicenseResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySellerLicenseResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LicenseUrl")
        private String licenseUrl;

        @com.aliyun.core.annotation.NameInMap("SellerId")
        private String sellerId;

        private Model(Builder builder) {
            this.licenseUrl = builder.licenseUrl;
            this.sellerId = builder.sellerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return licenseUrl
         */
        public String getLicenseUrl() {
            return this.licenseUrl;
        }

        /**
         * @return sellerId
         */
        public String getSellerId() {
            return this.sellerId;
        }

        public static final class Builder {
            private String licenseUrl; 
            private String sellerId; 

            /**
             * LicenseUrl.
             */
            public Builder licenseUrl(String licenseUrl) {
                this.licenseUrl = licenseUrl;
                return this;
            }

            /**
             * SellerId.
             */
            public Builder sellerId(String sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
