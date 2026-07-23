// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link GetEventHouseRuntimeRequest} extends {@link RequestModel}
 *
 * <p>GetEventHouseRuntimeRequest</p>
 */
public class GetEventHouseRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 127)
    private String name;

    private GetEventHouseRuntimeRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventHouseRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetEventHouseRuntimeRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetEventHouseRuntimeRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>EventHouse Runtime 名称。不传时查询默认 Runtime</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetEventHouseRuntimeRequest build() {
            return new GetEventHouseRuntimeRequest(this);
        } 

    } 

}
