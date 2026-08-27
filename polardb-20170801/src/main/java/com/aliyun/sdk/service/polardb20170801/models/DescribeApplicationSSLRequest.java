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
 * {@link DescribeApplicationSSLRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationSSLRequest</p>
 */
public class DescribeApplicationSSLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    private DescribeApplicationSSLRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationSSLRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeApplicationSSLRequest, Builder> {
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationSSLRequest request) {
            super(request);
            this.applicationId = request.applicationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public DescribeApplicationSSLRequest build() {
            return new DescribeApplicationSSLRequest(this);
        } 

    } 

}
