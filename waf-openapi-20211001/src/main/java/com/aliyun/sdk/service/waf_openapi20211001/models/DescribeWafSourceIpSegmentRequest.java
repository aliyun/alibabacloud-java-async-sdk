// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWafSourceIpSegmentRequest} extends {@link RequestModel}
 *
 * <p>DescribeWafSourceIpSegmentRequest</p>
 */
public class DescribeWafSourceIpSegmentRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DescribeWafSourceIpSegmentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWafSourceIpSegmentRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeWafSourceIpSegmentRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWafSourceIpSegmentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
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
        public DescribeWafSourceIpSegmentRequest build() {
            return new DescribeWafSourceIpSegmentRequest(this);
        } 

    } 

}
