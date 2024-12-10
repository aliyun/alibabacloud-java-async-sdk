// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Location} extends {@link TeaModel}
 *
 * <p>Location</p>
 */
public class Location extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LocationType")
    private String locationType;

    @com.aliyun.core.annotation.NameInMap("LocationValue")
    private java.util.Map < String, ? > locationValue;

    private Location(Builder builder) {
        this.locationType = builder.locationType;
        this.locationValue = builder.locationValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Location create() {
        return builder().build();
    }

    /**
     * @return locationType
     */
    public String getLocationType() {
        return this.locationType;
    }

    /**
     * @return locationValue
     */
    public java.util.Map < String, ? > getLocationValue() {
        return this.locationValue;
    }

    public static final class Builder {
        private String locationType; 
        private java.util.Map < String, ? > locationValue; 

        /**
         * LocationType.
         */
        public Builder locationType(String locationType) {
            this.locationType = locationType;
            return this;
        }

        /**
         * LocationValue.
         */
        public Builder locationValue(java.util.Map < String, ? > locationValue) {
            this.locationValue = locationValue;
            return this;
        }

        public Location build() {
            return new Location(this);
        } 

    } 

}
