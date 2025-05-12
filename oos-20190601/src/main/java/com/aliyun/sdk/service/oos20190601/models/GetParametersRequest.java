// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GetParametersRequest} extends {@link RequestModel}
 *
 * <p>GetParametersRequest</p>
 */
public class GetParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    @com.aliyun.core.annotation.Validation(required = true)
    private String names;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetParametersRequest(Builder builder) {
        super(builder);
        this.names = builder.names;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParametersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return names
     */
    public String getNames() {
        return this.names;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetParametersRequest, Builder> {
        private String names; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetParametersRequest request) {
            super(request);
            this.names = request.names;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The names of the common parameters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;parameter1&quot;,&quot;parameter2&quot;]</p>
         */
        public Builder names(String names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetParametersRequest build() {
            return new GetParametersRequest(this);
        } 

    } 

}
