// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link AddOrQuitPdpLaneForServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>AddOrQuitPdpLaneForServiceGroupRequest</p>
 */
public class AddOrQuitPdpLaneForServiceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private AddOrQuitLaneCmd body;

    private AddOrQuitPdpLaneForServiceGroupRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddOrQuitPdpLaneForServiceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public AddOrQuitLaneCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AddOrQuitPdpLaneForServiceGroupRequest, Builder> {
        private AddOrQuitLaneCmd body; 

        private Builder() {
            super();
        } 

        private Builder(AddOrQuitPdpLaneForServiceGroupRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(AddOrQuitLaneCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public AddOrQuitPdpLaneForServiceGroupRequest build() {
            return new AddOrQuitPdpLaneForServiceGroupRequest(this);
        } 

    } 

}
