// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantZonesReadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantZonesReadResponseBody</p>
 */
public class DescribeTenantZonesReadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantZones")
    private java.util.List < TenantZones> tenantZones;

    private DescribeTenantZonesReadResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantZones = builder.tenantZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantZonesReadResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantZones
     */
    public java.util.List < TenantZones> getTenantZones() {
        return this.tenantZones;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TenantZones> tenantZones; 

        /**
         * Indicates whether a read-only connection needs to be created for the zone.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder tenantZones(java.util.List < TenantZones> tenantZones) {
            this.tenantZones = tenantZones;
            return this;
        }

        public DescribeTenantZonesReadResponseBody build() {
            return new DescribeTenantZonesReadResponseBody(this);
        } 

    } 

    public static class TenantZones extends TeaModel {
        @NameInMap("IsElectable")
        private Boolean isElectable;

        @NameInMap("IsPrimary")
        private Boolean isPrimary;

        @NameInMap("IsReadable")
        private String isReadable;

        @NameInMap("Zone")
        private String zone;

        private TenantZones(Builder builder) {
            this.isElectable = builder.isElectable;
            this.isPrimary = builder.isPrimary;
            this.isReadable = builder.isReadable;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantZones create() {
            return builder().build();
        }

        /**
         * @return isElectable
         */
        public Boolean getIsElectable() {
            return this.isElectable;
        }

        /**
         * @return isPrimary
         */
        public Boolean getIsPrimary() {
            return this.isPrimary;
        }

        /**
         * @return isReadable
         */
        public String getIsReadable() {
            return this.isReadable;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private Boolean isElectable; 
            private Boolean isPrimary; 
            private String isReadable; 
            private String zone; 

            /**
             * Example 1
             */
            public Builder isElectable(Boolean isElectable) {
                this.isElectable = isElectable;
                return this;
            }

            /**
             * IsPrimary.
             */
            public Builder isPrimary(Boolean isPrimary) {
                this.isPrimary = isPrimary;
                return this;
            }

            /**
             * IsReadable.
             */
            public Builder isReadable(String isReadable) {
                this.isReadable = isReadable;
                return this;
            }

            /**
             * Zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public TenantZones build() {
                return new TenantZones(this);
            } 

        } 

    }
}
