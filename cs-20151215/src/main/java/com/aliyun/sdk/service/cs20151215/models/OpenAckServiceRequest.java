// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAckServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenAckServiceRequest</p>
 */
public class OpenAckServiceRequest extends Request {
    @Query
    @NameInMap("type")
    private String type;

    private OpenAckServiceRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenAckServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OpenAckServiceRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OpenAckServiceRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * The type of ACK service that you want to activate. Valid values:
         * <p>
         * 
         * *   `propayasgo`: ACK Pro
         * *   `edgepayasgo`: ACK Edge
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public OpenAckServiceRequest build() {
            return new OpenAckServiceRequest(this);
        } 

    } 

}
