// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateEdgeInstanceMessageRoutingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeInstanceMessageRoutingResponseBody</p>
 */
public class CreateEdgeInstanceMessageRoutingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteId")
    private Long routeId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateEdgeInstanceMessageRoutingResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.routeId = builder.routeId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeInstanceMessageRoutingResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeId
     */
    public Long getRouteId() {
        return this.routeId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private Long routeId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateEdgeInstanceMessageRoutingResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.routeId = model.routeId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * RouteId.
         */
        public Builder routeId(Long routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEdgeInstanceMessageRoutingResponseBody build() {
            return new CreateEdgeInstanceMessageRoutingResponseBody(this);
        } 

    } 

}
