// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeCacheReservePriceGapRequest} extends {@link RequestModel}
 *
 * <p>DescribeCacheReservePriceGapRequest</p>
 */
public class DescribeCacheReservePriceGapRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetQuotaGb")
    private Long targetQuotaGb;

    private DescribeCacheReservePriceGapRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.targetQuotaGb = builder.targetQuotaGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCacheReservePriceGapRequest create() {
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
     * @return targetQuotaGb
     */
    public Long getTargetQuotaGb() {
        return this.targetQuotaGb;
    }

    public static final class Builder extends Request.Builder<DescribeCacheReservePriceGapRequest, Builder> {
        private String instanceId; 
        private Long targetQuotaGb; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCacheReservePriceGapRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.targetQuotaGb = request.targetQuotaGb;
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
         * TargetQuotaGb.
         */
        public Builder targetQuotaGb(Long targetQuotaGb) {
            this.putQueryParameter("TargetQuotaGb", targetQuotaGb);
            this.targetQuotaGb = targetQuotaGb;
            return this;
        }

        @Override
        public DescribeCacheReservePriceGapRequest build() {
            return new DescribeCacheReservePriceGapRequest(this);
        } 

    } 

}
