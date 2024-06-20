// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessControlListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessControlListRequest</p>
 */
public class DescribeAccessControlListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DescribeAccessControlListRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessControlListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeAccessControlListRequest, Builder> {
        private String region; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessControlListRequest request) {
            super(request);
            this.region = request.region;
            this.instanceId = request.instanceId;
        } 

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putHostParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeAccessControlListRequest build() {
            return new DescribeAccessControlListRequest(this);
        } 

    } 

}
