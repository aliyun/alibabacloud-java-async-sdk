// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateContactGroupForAlertRequest} extends {@link RequestModel}
 *
 * <p>UpdateContactGroupForAlertRequest</p>
 */
public class UpdateContactGroupForAlertRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    private String clusterId;

    private UpdateContactGroupForAlertRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContactGroupForAlertRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateContactGroupForAlertRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContactGroupForAlertRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The cluster ID. You can call the ListCluster operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UpdateContactGroupForAlertRequest build() {
            return new UpdateContactGroupForAlertRequest(this);
        } 

    } 

}
