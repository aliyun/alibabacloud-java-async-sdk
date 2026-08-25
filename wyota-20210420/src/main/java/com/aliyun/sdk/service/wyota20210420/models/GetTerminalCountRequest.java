// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link GetTerminalCountRequest} extends {@link RequestModel}
 *
 * <p>GetTerminalCountRequest</p>
 */
public class GetTerminalCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    private GetTerminalCountRequest(Builder builder) {
        super(builder);
        this.clientType = builder.clientType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTerminalCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    public static final class Builder extends Request.Builder<GetTerminalCountRequest, Builder> {
        private Integer clientType; 

        private Builder() {
            super();
        } 

        private Builder(GetTerminalCountRequest request) {
            super(request);
            this.clientType = request.clientType;
        } 

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        @Override
        public GetTerminalCountRequest build() {
            return new GetTerminalCountRequest(this);
        } 

    } 

}
