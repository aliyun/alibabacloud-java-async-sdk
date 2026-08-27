// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeModelOperatorRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelOperatorRequest</p>
 */
public class DescribeModelOperatorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private DescribeModelOperatorRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOperatorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<DescribeModelOperatorRequest, Builder> {
        private String instanceId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelOperatorRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.region = request.region;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public DescribeModelOperatorRequest build() {
            return new DescribeModelOperatorRequest(this);
        } 

    } 

}
