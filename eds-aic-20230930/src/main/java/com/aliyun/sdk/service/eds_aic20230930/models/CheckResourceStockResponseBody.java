// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CheckResourceStockResponseBody} extends {@link TeaModel}
 *
 * <p>CheckResourceStockResponseBody</p>
 */
public class CheckResourceStockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceStockModels")
    private java.util.List<ResourceStockModels> resourceStockModels;

    private CheckResourceStockResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceStockModels = builder.resourceStockModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckResourceStockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceStockModels
     */
    public java.util.List<ResourceStockModels> getResourceStockModels() {
        return this.resourceStockModels;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourceStockModels> resourceStockModels; 

        private Builder() {
        } 

        private Builder(CheckResourceStockResponseBody model) {
            this.requestId = model.requestId;
            this.resourceStockModels = model.resourceStockModels;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>805D8FB6-512A-531C-9E4D-2A807D3C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of resource inventory.</p>
         */
        public Builder resourceStockModels(java.util.List<ResourceStockModels> resourceStockModels) {
            this.resourceStockModels = resourceStockModels;
            return this;
        }

        public CheckResourceStockResponseBody build() {
            return new CheckResourceStockResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckResourceStockResponseBody} extends {@link TeaModel}
     *
     * <p>CheckResourceStockResponseBody</p>
     */
    public static class ResourceStockModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StockStatus")
        private String stockStatus;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ResourceStockModels(Builder builder) {
            this.regionId = builder.regionId;
            this.stockStatus = builder.stockStatus;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceStockModels create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stockStatus
         */
        public String getStockStatus() {
            return this.stockStatus;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String regionId; 
            private String stockStatus; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ResourceStockModels model) {
                this.regionId = model.regionId;
                this.stockStatus = model.stockStatus;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Inventory status of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder stockStatus(String stockStatus) {
                this.stockStatus = stockStatus;
                return this;
            }

            /**
             * <p>Zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ResourceStockModels build() {
                return new ResourceStockModels(this);
            } 

        } 

    }
}
