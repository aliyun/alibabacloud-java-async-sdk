// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpenStoreUsageRequest} extends {@link RequestModel}
 *
 * <p>GetOpenStoreUsageRequest</p>
 */
public class GetOpenStoreUsageRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("body")
    private String body;

    private GetOpenStoreUsageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpenStoreUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetOpenStoreUsageRequest, Builder> {
        private String instanceId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(GetOpenStoreUsageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
        } 

        /**
         * 实例id
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GetOpenStoreUsageRequest build() {
            return new GetOpenStoreUsageRequest(this);
        } 

    } 

}
