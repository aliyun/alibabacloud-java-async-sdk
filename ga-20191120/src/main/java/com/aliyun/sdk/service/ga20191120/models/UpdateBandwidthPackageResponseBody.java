// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link UpdateBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBandwidthPackageResponseBody</p>
 */
public class UpdateBandwidthPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthPackage")
    private String bandwidthPackage;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateBandwidthPackageResponseBody model) {
            this.bandwidthPackage = model.bandwidthPackage;
            this.description = model.description;
            this.name = model.name;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The bandwidth plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1eo4f57z1kbbcmn****</p>
         */
        public Builder bandwidthPackage(String bandwidthPackage) {
            this.bandwidthPackage = bandwidthPackage;
            return this;
        }

        /**
         * <p>The description of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1DF3A3CB-B621-44F8-9870-C20D034D7AB</p>
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
