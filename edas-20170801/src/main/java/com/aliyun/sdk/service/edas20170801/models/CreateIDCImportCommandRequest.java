// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIDCImportCommandRequest} extends {@link RequestModel}
 *
 * <p>CreateIDCImportCommandRequest</p>
 */
public class CreateIDCImportCommandRequest extends Request {
    @Body
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private CreateIDCImportCommandRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIDCImportCommandRequest create() {
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

    public static final class Builder extends Request.Builder<CreateIDCImportCommandRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIDCImportCommandRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The cluster ID. You can call the ListCluster operation to query the cluster ID. For more information, see [ListCluster](~~154995~~).
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public CreateIDCImportCommandRequest build() {
            return new CreateIDCImportCommandRequest(this);
        } 

    } 

}
