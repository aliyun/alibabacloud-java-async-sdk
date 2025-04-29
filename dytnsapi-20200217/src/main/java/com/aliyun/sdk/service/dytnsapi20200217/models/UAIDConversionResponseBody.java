// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link UAIDConversionResponseBody} extends {@link TeaModel}
 *
 * <p>UAIDConversionResponseBody</p>
 */
public class UAIDConversionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UAIDConversionResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UAIDConversionResponseBody create() {
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
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UAIDConversionResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UAIDConversionResponseBody build() {
            return new UAIDConversionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UAIDConversionResponseBody} extends {@link TeaModel}
     *
     * <p>UAIDConversionResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhoneList")
        private String phoneList;

        private Model(Builder builder) {
            this.phoneList = builder.phoneList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return phoneList
         */
        public String getPhoneList() {
            return this.phoneList;
        }

        public static final class Builder {
            private String phoneList; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.phoneList = model.phoneList;
            } 

            /**
             * PhoneList.
             */
            public Builder phoneList(String phoneList) {
                this.phoneList = phoneList;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
