// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link OpenAckServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenAckServiceRequest</p>
 */
public class OpenAckServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
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
         * <p>The type of service that you want to activate. Valid values:</p>
         * <ul>
         * <li><code>propayasgo</code>: ACK clusters (including ACK managed clusters and ACK dedicated clusters), ACK Serverless clusters, and registered clusters.</li>
         * <li><code>edgepayasgo</code>: ACK Edge clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>propayasgo</p>
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
