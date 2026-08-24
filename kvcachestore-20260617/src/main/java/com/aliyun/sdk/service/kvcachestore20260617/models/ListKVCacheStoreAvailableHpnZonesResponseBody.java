// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link ListKVCacheStoreAvailableHpnZonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListKVCacheStoreAvailableHpnZonesResponseBody</p>
 */
public class ListKVCacheStoreAvailableHpnZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceHpnZones")
    private java.util.List<InstanceHpnZones> instanceHpnZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListKVCacheStoreAvailableHpnZonesResponseBody(Builder builder) {
        this.instanceHpnZones = builder.instanceHpnZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKVCacheStoreAvailableHpnZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceHpnZones
     */
    public java.util.List<InstanceHpnZones> getInstanceHpnZones() {
        return this.instanceHpnZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceHpnZones> instanceHpnZones; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListKVCacheStoreAvailableHpnZonesResponseBody model) {
            this.instanceHpnZones = model.instanceHpnZones;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceHpnZones.
         */
        public Builder instanceHpnZones(java.util.List<InstanceHpnZones> instanceHpnZones) {
            this.instanceHpnZones = instanceHpnZones;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListKVCacheStoreAvailableHpnZonesResponseBody build() {
            return new ListKVCacheStoreAvailableHpnZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKVCacheStoreAvailableHpnZonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKVCacheStoreAvailableHpnZonesResponseBody</p>
     */
    public static class AvailableHpnZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HpnZone")
        private String hpnZone;

        private AvailableHpnZones(Builder builder) {
            this.hpnZone = builder.hpnZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableHpnZones create() {
            return builder().build();
        }

        /**
         * @return hpnZone
         */
        public String getHpnZone() {
            return this.hpnZone;
        }

        public static final class Builder {
            private String hpnZone; 

            private Builder() {
            } 

            private Builder(AvailableHpnZones model) {
                this.hpnZone = model.hpnZone;
            } 

            /**
             * HpnZone.
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            public AvailableHpnZones build() {
                return new AvailableHpnZones(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKVCacheStoreAvailableHpnZonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListKVCacheStoreAvailableHpnZonesResponseBody</p>
     */
    public static class InstanceHpnZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableHpnZones")
        private java.util.List<AvailableHpnZones> availableHpnZones;

        @com.aliyun.core.annotation.NameInMap("KvcsId")
        private String kvcsId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private InstanceHpnZones(Builder builder) {
            this.availableHpnZones = builder.availableHpnZones;
            this.kvcsId = builder.kvcsId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceHpnZones create() {
            return builder().build();
        }

        /**
         * @return availableHpnZones
         */
        public java.util.List<AvailableHpnZones> getAvailableHpnZones() {
            return this.availableHpnZones;
        }

        /**
         * @return kvcsId
         */
        public String getKvcsId() {
            return this.kvcsId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<AvailableHpnZones> availableHpnZones; 
            private String kvcsId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(InstanceHpnZones model) {
                this.availableHpnZones = model.availableHpnZones;
                this.kvcsId = model.kvcsId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AvailableHpnZones.
             */
            public Builder availableHpnZones(java.util.List<AvailableHpnZones> availableHpnZones) {
                this.availableHpnZones = availableHpnZones;
                return this;
            }

            /**
             * KvcsId.
             */
            public Builder kvcsId(String kvcsId) {
                this.kvcsId = kvcsId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceHpnZones build() {
                return new InstanceHpnZones(this);
            } 

        } 

    }
}
