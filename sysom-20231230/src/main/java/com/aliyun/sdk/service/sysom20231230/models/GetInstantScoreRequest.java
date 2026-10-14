// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetInstantScoreRequest} extends {@link RequestModel}
 *
 * <p>GetInstantScoreRequest</p>
 */
public class GetInstantScoreRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster")
    private String cluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance")
    private String instance;

    private GetInstantScoreRequest(Builder builder) {
        super(builder);
        this.cluster = builder.cluster;
        this.instance = builder.instance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstantScoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cluster
     */
    public String getCluster() {
        return this.cluster;
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    public static final class Builder extends Request.Builder<GetInstantScoreRequest, Builder> {
        private String cluster; 
        private String instance; 

        private Builder() {
            super();
        } 

        private Builder(GetInstantScoreRequest request) {
            super(request);
            this.cluster = request.cluster;
            this.instance = request.instance;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2ijff4be-bf24-4070-89ca-c47c879b0g32</p>
         */
        public Builder cluster(String cluster) {
            this.putQueryParameter("cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        public Builder instance(String instance) {
            this.putQueryParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        @Override
        public GetInstantScoreRequest build() {
            return new GetInstantScoreRequest(this);
        } 

    } 

}
