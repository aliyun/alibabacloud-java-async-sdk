// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    public java.util.List < String > locations() {
        return this.locations;
    }

    /**
     * @return locationTransferTypeConstraint
     */
    public LocationTransferTypeConstraint locationTransferTypeConstraint() {
        return this.locationTransferTypeConstraint;
    }

    public static final class Builder {
        private java.util.List < String > locations; 
        private LocationTransferTypeConstraint locationTransferTypeConstraint; 

        /**
         * <p>Location.</p>
         */
        public Builder locations(java.util.List < String > locations) {
            this.locations = locations;
            return this;
        }

        /**
         * <p>LocationTransferTypeConstraint.</p>
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
        public java.util.List < LocationTransferType > locationTransferTypes() {
            return this.locationTransferTypes;
        }

        public static final class Builder {
            private java.util.List < LocationTransferType > locationTransferTypes; 

            /**
             * <p>LocationTransferType.</p>
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
