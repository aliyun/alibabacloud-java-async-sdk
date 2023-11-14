// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterCheckItemWarningStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetClusterCheckItemWarningStatisticsRequest</p>
 */
public class GetClusterCheckItemWarningStatisticsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private GetClusterCheckItemWarningStatisticsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterCheckItemWarningStatisticsRequest create() {
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

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetClusterCheckItemWarningStatisticsRequest, Builder> {
        private String clusterId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterCheckItemWarningStatisticsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.uuid = request.uuid;
        } 

        /**
         * The ID of the container cluster.
         * <p>
         * 
         * >  You can call the [DescribeGroupedContainerInstances](~~182997~~) operation to query the IDs of container clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The UUID of the server.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetClusterCheckItemWarningStatisticsRequest build() {
            return new GetClusterCheckItemWarningStatisticsRequest(this);
        } 

    } 

}
