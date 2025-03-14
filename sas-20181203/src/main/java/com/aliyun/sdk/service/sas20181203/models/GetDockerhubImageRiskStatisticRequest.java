// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetDockerhubImageRiskStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetDockerhubImageRiskStatisticRequest</p>
 */
public class GetDockerhubImageRiskStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List<String> types;

    private GetDockerhubImageRiskStatisticRequest(Builder builder) {
        super(builder);
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDockerhubImageRiskStatisticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<GetDockerhubImageRiskStatisticRequest, Builder> {
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(GetDockerhubImageRiskStatisticRequest request) {
            super(request);
            this.types = request.types;
        } 

        /**
         * <p>The types of image risks to be queried.</p>
         */
        public Builder types(java.util.List<String> types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public GetDockerhubImageRiskStatisticRequest build() {
            return new GetDockerhubImageRiskStatisticRequest(this);
        } 

    } 

}
