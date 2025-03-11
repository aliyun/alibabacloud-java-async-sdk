// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link CreateOrderForRdsRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderForRdsRequest</p>
 */
public class CreateOrderForRdsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    @com.aliyun.core.annotation.Validation(required = true)
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateOrderForRdsRequest(Builder builder) {
        super(builder);
        this.params = builder.params;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderForRdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateOrderForRdsRequest, Builder> {
        private String params; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderForRdsRequest request) {
            super(request);
            this.params = request.params;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The JSON string that contains the order details. For more information, see <a href="https://help.aliyun.com/document_detail/26228.html">CreateDBInstance</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
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
        public CreateOrderForRdsRequest build() {
            return new CreateOrderForRdsRequest(this);
        } 

    } 

}
