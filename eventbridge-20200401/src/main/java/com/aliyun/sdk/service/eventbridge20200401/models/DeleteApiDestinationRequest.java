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
 * {@link DeleteApiDestinationRequest} extends {@link RequestModel}
 *
 * <p>DeleteApiDestinationRequest</p>
 */
public class DeleteApiDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiDestinationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiDestinationName;

    private DeleteApiDestinationRequest(Builder builder) {
        super(builder);
        this.apiDestinationName = builder.apiDestinationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApiDestinationRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteApiDestinationRequest, Builder> {
        private String apiDestinationName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApiDestinationRequest request) {
            super(request);
            this.apiDestinationName = request.apiDestinationName;
        } 

        /**
         * <p>The name of the API destination.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiDestinationName</p>
         */
        public Builder apiDestinationName(String apiDestinationName) {
            this.putQueryParameter("ApiDestinationName", apiDestinationName);
            this.apiDestinationName = apiDestinationName;
            return this;
        }

        @Override
        public DeleteApiDestinationRequest build() {
            return new DeleteApiDestinationRequest(this);
        } 

    } 

}
