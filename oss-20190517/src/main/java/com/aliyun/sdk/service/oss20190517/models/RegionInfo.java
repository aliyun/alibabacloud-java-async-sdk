// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link RegionInfo} extends {@link TeaModel}
 *
 * <p>RegionInfo</p>
 */
public class RegionInfo extends TeaModel {
    @NameInMap("AccelerateEndpoint")
    private String accelerateEndpoint;

    @NameInMap("InternalEndpoint")
    private String internalEndpoint;

    @NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @NameInMap("Region")
    private String region;

    private RegionInfo(Builder builder) {
        this.accelerateEndpoint = builder.accelerateEndpoint;
        this.internalEndpoint = builder.internalEndpoint;
        this.internetEndpoint = builder.internetEndpoint;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegionInfo create() {
        return builder().build();
    }

    /**
     * @return accelerateEndpoint
     */
    public String getAccelerateEndpoint() {
        return this.accelerateEndpoint;
    }

    /**
     * @return internalEndpoint
     */
    public String getInternalEndpoint() {
        return this.internalEndpoint;
    }

    /**
     * @return internetEndpoint
     */
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder {
        private String accelerateEndpoint; 
        private String internalEndpoint; 
        private String internetEndpoint; 
        private String region; 

        /**
         * accelerate endpoint
         */
        public Builder accelerateEndpoint(String accelerateEndpoint) {
            this.accelerateEndpoint = accelerateEndpoint;
            return this;
        }

        /**
         * internal endpoint
         */
        public Builder internalEndpoint(String internalEndpoint) {
            this.internalEndpoint = internalEndpoint;
            return this;
        }

        /**
         * internet endpoint
         */
        public Builder internetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }

        /**
         * region
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public RegionInfo build() {
            return new RegionInfo(this);
        } 

    } 

}
