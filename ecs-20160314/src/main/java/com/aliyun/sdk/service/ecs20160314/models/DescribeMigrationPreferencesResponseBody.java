// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationPreferencesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationPreferencesResponseBody</p>
 */
public class DescribeMigrationPreferencesResponseBody extends TeaModel {
    @NameInMap("MigrationNetworkType")
    private String migrationNetworkType;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TargetZoneIdSet")
    private TargetZoneIdSet targetZoneIdSet;

    private DescribeMigrationPreferencesResponseBody(Builder builder) {
        this.migrationNetworkType = builder.migrationNetworkType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.targetZoneIdSet = builder.targetZoneIdSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationPreferencesResponseBody create() {
        return builder().build();
    }

    /**
     * @return migrationNetworkType
     */
    public String getMigrationNetworkType() {
        return this.migrationNetworkType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetZoneIdSet
     */
    public TargetZoneIdSet getTargetZoneIdSet() {
        return this.targetZoneIdSet;
    }

    public static final class Builder {
        private String migrationNetworkType; 
        private String regionId; 
        private String requestId; 
        private TargetZoneIdSet targetZoneIdSet; 

        /**
         * MigrationNetworkType.
         */
        public Builder migrationNetworkType(String migrationNetworkType) {
            this.migrationNetworkType = migrationNetworkType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TargetZoneIdSet.
         */
        public Builder targetZoneIdSet(TargetZoneIdSet targetZoneIdSet) {
            this.targetZoneIdSet = targetZoneIdSet;
            return this;
        }

        public DescribeMigrationPreferencesResponseBody build() {
            return new DescribeMigrationPreferencesResponseBody(this);
        } 

    } 

    public static class TargetZoneIdSet extends TeaModel {
        @NameInMap("TargetZoneId")
        private java.util.List < String > targetZoneId;

        private TargetZoneIdSet(Builder builder) {
            this.targetZoneId = builder.targetZoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetZoneIdSet create() {
            return builder().build();
        }

        /**
         * @return targetZoneId
         */
        public java.util.List < String > getTargetZoneId() {
            return this.targetZoneId;
        }

        public static final class Builder {
            private java.util.List < String > targetZoneId; 

            /**
             * TargetZoneId.
             */
            public Builder targetZoneId(java.util.List < String > targetZoneId) {
                this.targetZoneId = targetZoneId;
                return this;
            }

            public TargetZoneIdSet build() {
                return new TargetZoneIdSet(this);
            } 

        } 

    }
}
