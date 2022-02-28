// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerStatisticsRequest</p>
 */
public class DescribeContainerStatisticsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    private DescribeContainerStatisticsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeContainerStatisticsRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerStatisticsRequest response) {
            super(response);
            this.clusterId = response.clusterId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DescribeContainerStatisticsRequest build() {
            return new DescribeContainerStatisticsRequest(this);
        } 

    } 

}
