// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ResultCallbackRequest} extends {@link RequestModel}
 *
 * <p>ResultCallbackRequest</p>
 */
public class ResultCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandleReason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String handleReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    private ResultCallbackRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.handleReason = builder.handleReason;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResultCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return handleReason
     */
    public String getHandleReason() {
        return this.handleReason;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ResultCallbackRequest, Builder> {
        private String applicationId; 
        private String handleReason; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ResultCallbackRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.handleReason = request.handleReason;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the approval process.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5ea0db8-<strong><strong>-</strong></strong>-9081-04bc0df4c6a3</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The reason for the approval.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not a Division A analyst.</p>
         */
        public Builder handleReason(String handleReason) {
            this.putQueryParameter("HandleReason", handleReason);
            this.handleReason = handleReason;
            return this;
        }

        /**
         * <p>Approval result:</p>
         * <ul>
         * <li>1: passed</li>
         * <li>2: rejected</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ResultCallbackRequest build() {
            return new ResultCallbackRequest(this);
        } 

    } 

}
