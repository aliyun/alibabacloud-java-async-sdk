// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableWhatsappROIMetricResponseBody} extends {@link TeaModel}
 *
 * <p>EnableWhatsappROIMetricResponseBody</p>
 */
public class EnableWhatsappROIMetricResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private EnableWhatsappROIMetricResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableWhatsappROIMetricResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * The details about the access denial.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableWhatsappROIMetricResponseBody build() {
            return new EnableWhatsappROIMetricResponseBody(this);
        } 

    } 

}
