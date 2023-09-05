// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBandwidthPackageResponseBody</p>
 */
public class UpdateBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("BandwidthPackage")
    private String bandwidthPackage;

    @NameInMap("Description")
    private String description;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateBandwidthPackageResponseBody(Builder builder) {
        this.bandwidthPackage = builder.bandwidthPackage;
        this.description = builder.description;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBandwidthPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthPackage
     */
    public String getBandwidthPackage() {
        return this.bandwidthPackage;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bandwidthPackage; 
        private String description; 
        private String name; 
        private String requestId; 

        /**
         * The bandwidth plan ID.
         */
        public Builder bandwidthPackage(String bandwidthPackage) {
            this.bandwidthPackage = bandwidthPackage;
            return this;
        }

        /**
         * The description of the bandwidth plan.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The name of the bandwidth plan.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateBandwidthPackageResponseBody build() {
            return new UpdateBandwidthPackageResponseBody(this);
        } 

    } 

}
