// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link DescribeApiKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiKeyRequest</p>
 */
public class DescribeApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("apiKeyID")
    private String apiKeyID;

    private DescribeApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyID = builder.apiKeyID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyID
     */
    public String getApiKeyID() {
        return this.apiKeyID;
    }

    public static final class Builder extends Request.Builder<DescribeApiKeyRequest, Builder> {
        private String apiKeyID; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiKeyRequest request) {
            super(request);
            this.apiKeyID = request.apiKeyID;
        } 

        /**
         * apiKeyID.
         */
        public Builder apiKeyID(String apiKeyID) {
            this.putPathParameter("apiKeyID", apiKeyID);
            this.apiKeyID = apiKeyID;
            return this;
        }

        @Override
        public DescribeApiKeyRequest build() {
            return new DescribeApiKeyRequest(this);
        } 

    } 

}
