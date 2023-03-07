// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueuesRequest} extends {@link RequestModel}
 *
 * <p>ListQueuesRequest</p>
 */
public class ListQueuesRequest extends Request {
    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private ListQueuesRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueuesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<ListQueuesRequest, Builder> {
        private Boolean async; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListQueuesRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
        } 

        /**
         * Specifies whether to enable asynchronous query.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
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
        public ListQueuesRequest build() {
            return new ListQueuesRequest(this);
        } 

    } 

}
