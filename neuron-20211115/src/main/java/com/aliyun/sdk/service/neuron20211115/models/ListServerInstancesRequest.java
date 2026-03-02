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
 * {@link ListServerInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListServerInstancesRequest</p>
 */
public class ListServerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceGroupId;

    private ListServerInstancesRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<ListServerInstancesRequest, Builder> {
        private String env; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListServerInstancesRequest request) {
            super(request);
            this.env = request.env;
            this.serviceGroupId = request.serviceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder env(String env) {
            this.putPathParameter("env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putPathParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public ListServerInstancesRequest build() {
            return new ListServerInstancesRequest(this);
        } 

    } 

}
