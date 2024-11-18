// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWarehouseDetailRequest} extends {@link RequestModel}
 *
 * <p>GetWarehouseDetailRequest</p>
 */
public class GetWarehouseDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    private GetWarehouseDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWarehouseDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetWarehouseDetailRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetWarehouseDetailRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-i7m2ucpyu005</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetWarehouseDetailRequest build() {
            return new GetWarehouseDetailRequest(this);
        } 

    } 

}
