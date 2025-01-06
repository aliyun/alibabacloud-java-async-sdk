// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link GetDataServiceFunctionRequest} extends {@link RequestModel}
 *
 * <p>GetDataServiceFunctionRequest</p>
 */
public class GetDataServiceFunctionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionId")
    private Long functionId;

    private GetDataServiceFunctionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.functionId = builder.functionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return functionId
     */
    public Long getFunctionId() {
        return this.functionId;
    }

    public static final class Builder extends Request.Builder<GetDataServiceFunctionRequest, Builder> {
        private String regionId; 
        private Long functionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataServiceFunctionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.functionId = request.functionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * FunctionId.
         */
        public Builder functionId(Long functionId) {
            this.putQueryParameter("FunctionId", functionId);
            this.functionId = functionId;
            return this;
        }

        @Override
        public GetDataServiceFunctionRequest build() {
            return new GetDataServiceFunctionRequest(this);
        } 

    } 

}
