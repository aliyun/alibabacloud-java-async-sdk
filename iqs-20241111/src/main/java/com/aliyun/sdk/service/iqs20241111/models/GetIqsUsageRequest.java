// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link GetIqsUsageRequest} extends {@link RequestModel}
 *
 * <p>GetIqsUsageRequest</p>
 */
public class GetIqsUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("callerId")
    private String callerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDate")
    private String startDate;

    private GetIqsUsageRequest(Builder builder) {
        super(builder);
        this.callerId = builder.callerId;
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIqsUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callerId
     */
    public String getCallerId() {
        return this.callerId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetIqsUsageRequest, Builder> {
        private String callerId; 
        private String endDate; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetIqsUsageRequest request) {
            super(request);
            this.callerId = request.callerId;
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * callerId.
         */
        public Builder callerId(String callerId) {
            this.putQueryParameter("callerId", callerId);
            this.callerId = callerId;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetIqsUsageRequest build() {
            return new GetIqsUsageRequest(this);
        } 

    } 

}
