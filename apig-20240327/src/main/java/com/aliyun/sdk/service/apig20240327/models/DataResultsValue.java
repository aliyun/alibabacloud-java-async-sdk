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

    @com.aliyun.core.annotation.NameInMap("skipReason")
    private String skipReason;

    private DataResultsValue(Builder builder) {
        this.routeId = builder.routeId;
        this.status = builder.status;
        this.errorMessage = builder.errorMessage;
        this.skipReason = builder.skipReason;
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

    /**
     * @return skipReason
     */
    public String getSkipReason() {
        return this.skipReason;
    }

    public static final class Builder {
        private String routeId; 
        private String status; 
        private String errorMessage; 
        private String skipReason; 

        private Builder() {
        } 

        private Builder(DataResultsValue model) {
            this.routeId = model.routeId;
            this.status = model.status;
            this.errorMessage = model.errorMessage;
            this.skipReason = model.skipReason;
        } 

        /**
         * routeId.
         */
        public Builder routeId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * skipReason.
         */
        public Builder skipReason(String skipReason) {
            this.skipReason = skipReason;
            return this;
        }

        public DataResultsValue build() {
            return new DataResultsValue(this);
        } 

    } 

}
