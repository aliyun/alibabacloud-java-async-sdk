// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link QueryEnableMultiAzPriceRequest} extends {@link RequestModel}
 *
 * <p>QueryEnableMultiAzPriceRequest</p>
 */
public class QueryEnableMultiAzPriceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("observers")
    private java.util.List<Observers> observers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("promotionOptionNo")
    private String promotionOptionNo;

    private QueryEnableMultiAzPriceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.observers = builder.observers;
        this.promotionOptionNo = builder.promotionOptionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEnableMultiAzPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return observers
     */
    public java.util.List<Observers> getObservers() {
        return this.observers;
    }

    /**
     * @return promotionOptionNo
     */
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public static final class Builder extends Request.Builder<QueryEnableMultiAzPriceRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<Observers> observers; 
        private String promotionOptionNo; 

        private Builder() {
            super();
        } 

        private Builder(QueryEnableMultiAzPriceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.observers = request.observers;
            this.promotionOptionNo = request.promotionOptionNo;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * observers.
         */
        public Builder observers(java.util.List<Observers> observers) {
            this.putBodyParameter("observers", observers);
            this.observers = observers;
            return this;
        }

        /**
         * promotionOptionNo.
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putBodyParameter("promotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        @Override
        public QueryEnableMultiAzPriceRequest build() {
            return new QueryEnableMultiAzPriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryEnableMultiAzPriceRequest} extends {@link TeaModel}
     *
     * <p>QueryEnableMultiAzPriceRequest</p>
     */
    public static class Observers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vswId")
        private String vswId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private Observers(Builder builder) {
            this.vswId = builder.vswId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Observers create() {
            return builder().build();
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vswId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Observers model) {
                this.vswId = model.vswId;
                this.zoneId = model.zoneId;
            } 

            /**
             * vswId.
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Observers build() {
                return new Observers(this);
            } 

        } 

    }
}
