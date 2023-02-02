// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceBaseInfoRequest</p>
 */
public class OnsInstanceBaseInfoRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private OnsInstanceBaseInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceBaseInfoRequest create() {
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

    public static final class Builder extends Request.Builder<OnsInstanceBaseInfoRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OnsInstanceBaseInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the instance that you want to query.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OnsInstanceBaseInfoRequest build() {
            return new OnsInstanceBaseInfoRequest(this);
        } 

    } 

}
