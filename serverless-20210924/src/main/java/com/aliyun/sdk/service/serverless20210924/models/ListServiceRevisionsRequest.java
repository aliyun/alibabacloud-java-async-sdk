// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceRevisionsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceRevisionsRequest</p>
 */
public class ListServiceRevisionsRequest extends Request {
    @Query
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    private ListServiceRevisionsRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceRevisionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListServiceRevisionsRequest, Builder> {
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceRevisionsRequest request) {
            super(request);
            this.serviceName = request.serviceName;
        } 

        /**
         * The name of a service.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListServiceRevisionsRequest build() {
            return new ListServiceRevisionsRequest(this);
        } 

    } 

}
