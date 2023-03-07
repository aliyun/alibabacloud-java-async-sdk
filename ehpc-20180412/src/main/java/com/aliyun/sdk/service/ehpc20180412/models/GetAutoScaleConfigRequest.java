// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoScaleConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAutoScaleConfigRequest</p>
 */
public class GetAutoScaleConfigRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private GetAutoScaleConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoScaleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<GetAutoScaleConfigRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoScaleConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public GetAutoScaleConfigRequest build() {
            return new GetAutoScaleConfigRequest(this);
        } 

    } 

}
