// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketReplicationLocationResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketReplicationLocationResponseBody</p>
 */
public class GetBucketReplicationLocationResponseBody extends TeaModel {
    @ParentIgnore("ReplicationLocation")
    @NameInMap("Location")
    private java.util.List < String > locations;

    @ParentIgnore("ReplicationLocation")
    @NameInMap("LocationTransferTypeConstraint")
    private LocationTransferTypeConstraint locationTransferTypeConstraint;

    private GetBucketReplicationLocationResponseBody(Builder builder) {
        this.locations = builder.locations;
        this.locationTransferTypeConstraint = builder.locationTransferTypeConstraint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketReplicationLocationResponseBody create() {
        return builder().build();
    }

    /**
     * @return locations
     */
    public java.util.List < String > getLocations() {
        return this.locations;
    }

    /**
     * @return locationTransferTypeConstraint
     */
    public LocationTransferTypeConstraint getLocationTransferTypeConstraint() {
        return this.locationTransferTypeConstraint;
    }

    public static final class Builder {
        private java.util.List < String > locations; 
        private LocationTransferTypeConstraint locationTransferTypeConstraint; 

        /**
         * Location.
         */
        public Builder locations(java.util.List < String > locations) {
            this.locations = locations;
            return this;
        }

        /**
         * LocationTransferTypeConstraint.
         */
        public Builder locationTransferTypeConstraint(LocationTransferTypeConstraint locationTransferTypeConstraint) {
            this.locationTransferTypeConstraint = locationTransferTypeConstraint;
            return this;
        }

        public GetBucketReplicationLocationResponseBody build() {
            return new GetBucketReplicationLocationResponseBody(this);
        } 

    } 

    public static class LocationTransferTypeConstraint extends TeaModel {
        @NameInMap("LocationTransferType")
        private java.util.List < LocationTransferType > locationTransferTypes;

        private LocationTransferTypeConstraint(Builder builder) {
            this.locationTransferTypes = builder.locationTransferTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocationTransferTypeConstraint create() {
            return builder().build();
        }

        /**
         * @return locationTransferTypes
         */
        public java.util.List < LocationTransferType > getLocationTransferTypes() {
            return this.locationTransferTypes;
        }

        public static final class Builder {
            private java.util.List < LocationTransferType > locationTransferTypes; 

            /**
             * LocationTransferType.
             */
            public Builder locationTransferTypes(java.util.List < LocationTransferType > locationTransferTypes) {
                this.locationTransferTypes = locationTransferTypes;
                return this;
            }

            public LocationTransferTypeConstraint build() {
                return new LocationTransferTypeConstraint(this);
            } 

        } 

    }
}
