// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetInnerReadAsyncResultRequest} extends {@link RequestModel}
 *
 * <p>GetInnerReadAsyncResultRequest</p>
 */
public class GetInnerReadAsyncResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    private String dataSourceName;

    private GetInnerReadAsyncResultRequest(Builder builder) {
        super(builder);
        this.dataSourceName = builder.dataSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInnerReadAsyncResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public static final class Builder extends Request.Builder<GetInnerReadAsyncResultRequest, Builder> {
        private String dataSourceName; 

        private Builder() {
            super();
        } 

        private Builder(GetInnerReadAsyncResultRequest request) {
            super(request);
            this.dataSourceName = request.dataSourceName;
        } 

        /**
         * <p>The data source name. The probe task uses this field as its dimension identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_dolphin_prod</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        @Override
        public GetInnerReadAsyncResultRequest build() {
            return new GetInnerReadAsyncResultRequest(this);
        } 

    } 

}
