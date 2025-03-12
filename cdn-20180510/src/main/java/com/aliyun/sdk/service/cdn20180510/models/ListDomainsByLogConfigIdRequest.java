// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link ListDomainsByLogConfigIdRequest} extends {@link RequestModel}
 *
 * <p>ListDomainsByLogConfigIdRequest</p>
 */
public class ListDomainsByLogConfigIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    private ListDomainsByLogConfigIdRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsByLogConfigIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    public static final class Builder extends Request.Builder<ListDomainsByLogConfigIdRequest, Builder> {
        private String configId; 

        private Builder() {
            super();
        } 

        private Builder(ListDomainsByLogConfigIdRequest request) {
            super(request);
            this.configId = request.configId;
        } 

        /**
         * <p>The ID of the custom configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public ListDomainsByLogConfigIdRequest build() {
            return new ListDomainsByLogConfigIdRequest(this);
        } 

    } 

}
