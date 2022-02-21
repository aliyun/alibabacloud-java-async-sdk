// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoutePointResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutePointResponseBody</p>
 */
public class GetRoutePointResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoutePoint")
    private String routePoint;

    @NameInMap("StatusCode")
    private String statusCode;

    @NameInMap("StatusDesc")
    private String statusDesc;

    @NameInMap("Success")
    private Boolean success;

    private GetRoutePointResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.routePoint = builder.routePoint;
        this.statusCode = builder.statusCode;
        this.statusDesc = builder.statusDesc;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutePointResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return routePoint
     */
    public String getRoutePoint() {
        return this.routePoint;
    }

    /**
     * @return statusCode
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return statusDesc
     */
    public String getStatusDesc() {
        return this.statusDesc;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String routePoint; 
        private String statusCode; 
        private String statusDesc; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RoutePoint.
         */
        public Builder routePoint(String routePoint) {
            this.routePoint = routePoint;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * StatusDesc.
         */
        public Builder statusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRoutePointResponseBody build() {
            return new GetRoutePointResponseBody(this);
        } 

    } 

}
