// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ReportNodesStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ReportNodesStatusResponseBody</p>
 */
public class ReportNodesStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReportNodesStatusResponseBody(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportNodesStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String errorMessage; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ReportNodesStatusResponseBody model) {
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Error Message</p>
         * 
         * <strong>example:</strong>
         * <p>Resource not found</p>
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

        public ReportNodesStatusResponseBody build() {
            return new ReportNodesStatusResponseBody(this);
        } 

    } 

}
