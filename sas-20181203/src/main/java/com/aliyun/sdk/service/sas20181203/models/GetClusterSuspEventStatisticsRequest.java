// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetClusterSuspEventStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetClusterSuspEventStatisticsRequest</p>
 */
public class GetClusterSuspEventStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    private GetClusterSuspEventStatisticsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterSuspEventStatisticsRequest create() {
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
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<GetClusterSuspEventStatisticsRequest, Builder> {
        private String clusterId; 
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterSuspEventStatisticsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.from = request.from;
        } 

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c6094b964bfc145fe9e418c869e7e****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the request source. Set the value to sas.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        @Override
        public GetClusterSuspEventStatisticsRequest build() {
            return new GetClusterSuspEventStatisticsRequest(this);
        } 

    } 

}
