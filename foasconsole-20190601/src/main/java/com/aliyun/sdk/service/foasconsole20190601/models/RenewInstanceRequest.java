// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

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
 * {@link RenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewInstanceRequest</p>
 */
public class RenewInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RenewInstanceRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private RenewInstanceRequestRenewInstanceRequest renewInstanceRequest;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.renewInstanceRequest = builder.renewInstanceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return renewInstanceRequest
     */
    public RenewInstanceRequestRenewInstanceRequest getRenewInstanceRequest() {
        return this.renewInstanceRequest;
    }

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private RenewInstanceRequestRenewInstanceRequest renewInstanceRequest; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest request) {
            super(request);
            this.renewInstanceRequest = request.renewInstanceRequest;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder renewInstanceRequest(RenewInstanceRequestRenewInstanceRequest renewInstanceRequest) {
            this.putBodyParameter("RenewInstanceRequest", renewInstanceRequest);
            this.renewInstanceRequest = renewInstanceRequest;
            return this;
        }

        @Override
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link RenewInstanceRequest} extends {@link TeaModel}
     *
     * <p>RenewInstanceRequest</p>
     */
    public static class RenewInstanceRequestRenewInstanceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PricingCycle")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pricingCycle;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        private RenewInstanceRequestRenewInstanceRequest(Builder builder) {
            this.duration = builder.duration;
            this.instanceId = builder.instanceId;
            this.pricingCycle = builder.pricingCycle;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenewInstanceRequestRenewInstanceRequest create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer duration; 
            private String instanceId; 
            private String pricingCycle; 
            private String region; 

            private Builder() {
            } 

            private Builder(RenewInstanceRequestRenewInstanceRequest model) {
                this.duration = model.duration;
                this.instanceId = model.instanceId;
                this.pricingCycle = model.pricingCycle;
                this.region = model.region;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sc_flinkserverless_public_cn-7e22ae5****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RenewInstanceRequestRenewInstanceRequest build() {
                return new RenewInstanceRequestRenewInstanceRequest(this);
            } 

        } 

    }
}
