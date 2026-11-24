// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DataResultsValue} extends {@link TeaModel}
 *
 * <p>DataResultsValue</p>
 */
public class DataResultsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    private DataResultsValue(Builder builder) {
        this.routeId = builder.routeId;
        this.status = builder.status;
        this.errorMessage = builder.errorMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataResultsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static final class Builder {
        private String routeId; 
        private String status; 
        private String errorMessage; 

        private Builder() {
        } 

        private Builder(DataResultsValue model) {
            this.routeId = model.routeId;
            this.status = model.status;
            this.errorMessage = model.errorMessage;
        } 

        /**
         * <p>The route ID corresponding to the result, which is the same as the key in results.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-example001</p>
         */
        public Builder routeId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * <p>For asynchronous publishing, Pending indicates that the request is accepted, and Rejected indicates that the request is rejected before submission. For synchronous publishing, Succeeded indicates that the route is successfully published, and Failed indicates that the publishing failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The cause of the route being rejected or failing to be published. This parameter is returned when the status is Rejected or Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>ErrorType: Conflict, ErrorCode: DeployRouteForbidden, Message: the route  example-route is not allowed to deploy when it\&quot;s status is Deploying., Params: [example-route Deploying]</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public DataResultsValue build() {
            return new DataResultsValue(this);
        } 

    } 

}
