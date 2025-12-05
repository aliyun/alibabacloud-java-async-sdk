// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ChangeResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeResourceGroupRequest</p>
 */
public class ChangeResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ChangeResourceGroupInput body;

    private ChangeResourceGroupRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResourceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ChangeResourceGroupInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ChangeResourceGroupRequest, Builder> {
        private ChangeResourceGroupInput body; 

        private Builder() {
            super();
        } 

        private Builder(ChangeResourceGroupRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>The request details for updating the resource group.</p>
         */
        public Builder body(ChangeResourceGroupInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ChangeResourceGroupRequest build() {
            return new ChangeResourceGroupRequest(this);
        } 

    } 

}
