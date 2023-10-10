// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConvertableEcuRequest} extends {@link RequestModel}
 *
 * <p>ListConvertableEcuRequest</p>
 */
public class ListConvertableEcuRequest extends Request {
    @Query
    @NameInMap("clusterId")
    @Validation(required = true)
    private String clusterId;

    private ListConvertableEcuRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConvertableEcuRequest create() {
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

    public static final class Builder extends Request.Builder<ListConvertableEcuRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListConvertableEcuRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The ID of the cluster. You can call the ListCluster operation to query the cluster ID. For more information, see [ListCluster](~~154995~~).
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ListConvertableEcuRequest build() {
            return new ListConvertableEcuRequest(this);
        } 

    } 

}
