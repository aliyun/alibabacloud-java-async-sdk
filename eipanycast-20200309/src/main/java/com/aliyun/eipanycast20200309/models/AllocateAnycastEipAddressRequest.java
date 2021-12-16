// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AllocateAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AllocateAnycastEipAddressRequest</p>
 */
public class AllocateAnycastEipAddressRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    private String bandwidth;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ServiceLocation")
    private String serviceLocation;


    private AllocateAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.name = builder.name;
        this.serviceLocation = builder.serviceLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateAnycastEipAddressRequest create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String bandwidth; 
        private String clientToken; 
        private String description; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private String name; 
        private String serviceLocation; 

        /**
         * <p>Bandwidth.</p>
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>InstanceChargeType.</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>InternetChargeType.</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>Name.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>ServiceLocation.</p>
         */
        public Builder serviceLocation(String serviceLocation) {
            this.putQueryParameter("ServiceLocation", serviceLocation);
            this.serviceLocation = serviceLocation;
            return this;
        }

        public AllocateAnycastEipAddressRequest build() {
            return new AllocateAnycastEipAddressRequest(this);
        } 

    } 

}
