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
 * {@link GetClusterCheckItemWarningStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetClusterCheckItemWarningStatisticsRequest</p>
 */
public class GetClusterCheckItemWarningStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
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
         * <p>The ID of the container cluster that you want to query.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cd49575861a3044d49c954e4b3911****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ae1527a9-2308-46ab-b10a-48ae7ff7****</p>
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
