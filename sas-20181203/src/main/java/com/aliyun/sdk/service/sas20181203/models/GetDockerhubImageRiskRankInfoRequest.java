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
 * {@link GetDockerhubImageRiskRankInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDockerhubImageRiskRankInfoRequest</p>
 */
public class GetDockerhubImageRiskRankInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List<String> types;

    private GetDockerhubImageRiskRankInfoRequest(Builder builder) {
        super(builder);
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDockerhubImageRiskRankInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetDockerhubImageRiskRankInfoRequest, Builder> {
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(GetDockerhubImageRiskRankInfoRequest request) {
            super(request);
            this.types = request.types;
        } 

        /**
         * <p>The types of image dimensions to be counted.</p>
         */
        public Builder types(java.util.List<String> types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public GetDockerhubImageRiskRankInfoRequest build() {
            return new GetDockerhubImageRiskRankInfoRequest(this);
        } 

    } 

}
