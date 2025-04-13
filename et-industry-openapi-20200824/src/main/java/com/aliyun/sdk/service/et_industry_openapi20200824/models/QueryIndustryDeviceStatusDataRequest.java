// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.et_industry_openapi20200824.models;

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
 * {@link QueryIndustryDeviceStatusDataRequest} extends {@link RequestModel}
 *
 * <p>QueryIndustryDeviceStatusDataRequest</p>
 */
public class QueryIndustryDeviceStatusDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Request")
    private String request;

    private QueryIndustryDeviceStatusDataRequest(Builder builder) {
        super(builder);
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIndustryDeviceStatusDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return request
     */
    public String getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<QueryIndustryDeviceStatusDataRequest, Builder> {
        private String request; 

        private Builder() {
            super();
        } 

        private Builder(QueryIndustryDeviceStatusDataRequest request) {
            super(request);
            this.request = request.request;
        } 

        /**
         * Request.
         */
        public Builder request(String request) {
            this.putBodyParameter("Request", request);
            this.request = request;
            return this;
        }

        @Override
        public QueryIndustryDeviceStatusDataRequest build() {
            return new QueryIndustryDeviceStatusDataRequest(this);
        } 

    } 

}
