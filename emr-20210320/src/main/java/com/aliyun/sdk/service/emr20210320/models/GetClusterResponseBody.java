// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterResponseBody</p>
 */
public class GetClusterResponseBody extends TeaModel {
    @NameInMap("Cluster")
    private Cluster cluster;

    @NameInMap("RequestId")
    private String requestId;

    private GetClusterResponseBody(Builder builder) {
        this.cluster = builder.cluster;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return cluster
     */
    public Cluster getCluster() {
        return this.cluster;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Cluster cluster; 
        private String requestId; 

        /**
         * The details of the master instance.
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

}
