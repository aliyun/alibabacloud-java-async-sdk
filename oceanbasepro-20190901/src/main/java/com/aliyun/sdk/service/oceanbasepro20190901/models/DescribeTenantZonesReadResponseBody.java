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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The zone information of the tenant.
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

        @NameInMap("IsReadOnlyAddressMaster")
        private Boolean isReadOnlyAddressMaster;

        @NameInMap("IsReadable")
        private String isReadable;

        @NameInMap("Zone")
        private String zone;

        private TenantZones(Builder builder) {
            this.isElectable = builder.isElectable;
            this.isPrimary = builder.isPrimary;
            this.isReadOnlyAddressMaster = builder.isReadOnlyAddressMaster;
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
         * @return isReadOnlyAddressMaster
         */
        public Boolean getIsReadOnlyAddressMaster() {
            return this.isReadOnlyAddressMaster;
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
            private Boolean isReadOnlyAddressMaster; 
            private String isReadable; 
            private String zone; 

            /**
             * Indicates whether the zone can be set as the primary zone.
             */
            public Builder isElectable(Boolean isElectable) {
                this.isElectable = isElectable;
                return this;
            }

            /**
             * Indicates whether the zone is the primary zone.
             */
            public Builder isPrimary(Boolean isPrimary) {
                this.isPrimary = isPrimary;
                return this;
            }

            /**
             * Indicates whether a read-only connection has been created.
             */
            public Builder isReadOnlyAddressMaster(Boolean isReadOnlyAddressMaster) {
                this.isReadOnlyAddressMaster = isReadOnlyAddressMaster;
                return this;
            }

            /**
             * Indicates whether a read-only connection needs to be created for the zone.
             */
            public Builder isReadable(String isReadable) {
                this.isReadable = isReadable;
                return this;
            }

            /**
             * The ID of the zone.
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
