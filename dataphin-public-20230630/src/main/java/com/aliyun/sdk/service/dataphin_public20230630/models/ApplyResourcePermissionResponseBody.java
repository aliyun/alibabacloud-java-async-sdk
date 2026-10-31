// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ApplyResourcePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyResourcePermissionResponseBody</p>
 */
public class ApplyResourcePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ApplyResourcePermissionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyResourcePermissionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ApplyResourcePermissionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code of the request. A value of OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The application result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ApplyResourcePermissionResponseBody build() {
            return new ApplyResourcePermissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyResourcePermissionResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyResourcePermissionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyIds")
        private java.util.List<String> applyIds;

        @com.aliyun.core.annotation.NameInMap("BpmsIds")
        private java.util.List<String> bpmsIds;

        private Data(Builder builder) {
            this.applyIds = builder.applyIds;
            this.bpmsIds = builder.bpmsIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applyIds
         */
        public java.util.List<String> getApplyIds() {
            return this.applyIds;
        }

        /**
         * @return bpmsIds
         */
        public java.util.List<String> getBpmsIds() {
            return this.bpmsIds;
        }

        public static final class Builder {
            private java.util.List<String> applyIds; 
            private java.util.List<String> bpmsIds; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applyIds = model.applyIds;
                this.bpmsIds = model.bpmsIds;
            } 

            /**
             * <p>The list of application IDs.</p>
             */
            public Builder applyIds(java.util.List<String> applyIds) {
                this.applyIds = applyIds;
                return this;
            }

            /**
             * <p>The list of approval IDs.</p>
             */
            public Builder bpmsIds(java.util.List<String> bpmsIds) {
                this.bpmsIds = bpmsIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
