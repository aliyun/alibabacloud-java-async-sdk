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
 * {@link GetApiDestinationRequest} extends {@link RequestModel}
 *
 * <p>GetApiDestinationRequest</p>
 */
public class GetApiDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiDestinationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiDestinationName;

    private GetApiDestinationRequest(Builder builder) {
        super(builder);
        this.apiDestinationName = builder.apiDestinationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiDestinationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiDestinationName
     */
    public String getApiDestinationName() {
        return this.apiDestinationName;
    }

    public static final class Builder extends Request.Builder<GetApiDestinationRequest, Builder> {
        private String apiDestinationName; 

        private Builder() {
            super();
        } 

        private Builder(GetApiDestinationRequest request) {
            super(request);
            this.apiDestinationName = request.apiDestinationName;
        } 

        /**
         * <p>The name of the API destination.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-destination-name</p>
         */
        public Builder apiDestinationName(String apiDestinationName) {
            this.putQueryParameter("ApiDestinationName", apiDestinationName);
            this.apiDestinationName = apiDestinationName;
            return this;
        }

        @Override
        public GetApiDestinationRequest build() {
            return new GetApiDestinationRequest(this);
        } 

    } 

}
