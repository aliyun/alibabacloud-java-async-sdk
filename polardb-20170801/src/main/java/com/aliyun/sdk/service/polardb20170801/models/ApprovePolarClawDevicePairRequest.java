// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ApprovePolarClawDevicePairRequest} extends {@link RequestModel}
 *
 * <p>ApprovePolarClawDevicePairRequest</p>
 */
public class ApprovePolarClawDevicePairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pairRequestId;

    private ApprovePolarClawDevicePairRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.pairRequestId = builder.pairRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApprovePolarClawDevicePairRequest create() {
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
     * @return pairRequestId
     */
    public String getPairRequestId() {
        return this.pairRequestId;
    }

    public static final class Builder extends Request.Builder<ApprovePolarClawDevicePairRequest, Builder> {
        private String applicationId; 
        private String pairRequestId; 

        private Builder() {
            super();
        } 

        private Builder(ApprovePolarClawDevicePairRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.pairRequestId = request.pairRequestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>req-abc-123</p>
         */
        public Builder pairRequestId(String pairRequestId) {
            this.putQueryParameter("PairRequestId", pairRequestId);
            this.pairRequestId = pairRequestId;
            return this;
        }

        @Override
        public ApprovePolarClawDevicePairRequest build() {
            return new ApprovePolarClawDevicePairRequest(this);
        } 

    } 

}
