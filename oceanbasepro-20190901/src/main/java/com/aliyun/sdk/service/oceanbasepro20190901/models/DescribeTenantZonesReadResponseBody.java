// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTenantZonesReadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantZonesReadResponseBody</p>
 */
public class DescribeTenantZonesReadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantZones")
    private java.util.List<TenantZones> tenantZones;

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
    public java.util.List<TenantZones> getTenantZones() {
        return this.tenantZones;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TenantZones> tenantZones; 

        /**
         * <p>Indicates whether a read-only connection needs to be created for the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         */
        public Builder tenantZones(java.util.List<TenantZones> tenantZones) {
            this.tenantZones = tenantZones;
            return this;
        }

        public DescribeTenantZonesReadResponseBody build() {
            return new DescribeTenantZonesReadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTenantZonesReadResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantZonesReadResponseBody</p>
     */
    public static class TenantZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsElectable")
        private Boolean isElectable;

        @com.aliyun.core.annotation.NameInMap("IsPrimary")
        private Boolean isPrimary;

        @com.aliyun.core.annotation.NameInMap("IsReadable")
        private String isReadable;

        @com.aliyun.core.annotation.NameInMap("Zone")
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
             * <p>Example 1</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
