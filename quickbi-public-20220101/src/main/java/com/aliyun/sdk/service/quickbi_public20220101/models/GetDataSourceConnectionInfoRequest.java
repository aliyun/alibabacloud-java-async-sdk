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
 * {@link GetDataSourceConnectionInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceConnectionInfoRequest</p>
 */
public class GetDataSourceConnectionInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dsId;

    private GetDataSourceConnectionInfoRequest(Builder builder) {
        super(builder);
        this.dsId = builder.dsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceConnectionInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dsId
     */
    public String getDsId() {
        return this.dsId;
    }

    public static final class Builder extends Request.Builder<GetDataSourceConnectionInfoRequest, Builder> {
        private String dsId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceConnectionInfoRequest request) {
            super(request);
            this.dsId = request.dsId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7AAB95D-*****-****-*4FC0C976</p>
         */
        public Builder dsId(String dsId) {
            this.putQueryParameter("DsId", dsId);
            this.dsId = dsId;
            return this;
        }

        @Override
        public GetDataSourceConnectionInfoRequest build() {
            return new GetDataSourceConnectionInfoRequest(this);
        } 

    } 

}
