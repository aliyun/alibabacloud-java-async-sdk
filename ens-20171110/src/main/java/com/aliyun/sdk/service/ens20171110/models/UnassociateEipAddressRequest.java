// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateEipAddressRequest} extends {@link RequestModel}
 *
 * <p>UnassociateEipAddressRequest</p>
 */
public class UnassociateEipAddressRequest extends Request {
    @Query
    @NameInMap("Eip")
    @Validation(required = true)
    private String eip;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("InstanceIdInternetIp")
    @Validation(required = true)
    private String instanceIdInternetIp;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private UnassociateEipAddressRequest(Builder builder) {
        super(builder);
        this.eip = builder.eip;
        this.ensRegionId = builder.ensRegionId;
        this.instanceIdInternetIp = builder.instanceIdInternetIp;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociateEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eip
     */
    public String getEip() {
        return this.eip;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceIdInternetIp
     */
    public String getInstanceIdInternetIp() {
        return this.instanceIdInternetIp;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UnassociateEipAddressRequest, Builder> {
        private String eip; 
        private String ensRegionId; 
        private String instanceIdInternetIp; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UnassociateEipAddressRequest response) {
            super(response);
            this.eip = response.eip;
            this.ensRegionId = response.ensRegionId;
            this.instanceIdInternetIp = response.instanceIdInternetIp;
            this.version = response.version;
        } 

        /**
         * Eip.
         */
        public Builder eip(String eip) {
            this.putQueryParameter("Eip", eip);
            this.eip = eip;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * InstanceIdInternetIp.
         */
        public Builder instanceIdInternetIp(String instanceIdInternetIp) {
            this.putQueryParameter("InstanceIdInternetIp", instanceIdInternetIp);
            this.instanceIdInternetIp = instanceIdInternetIp;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public UnassociateEipAddressRequest build() {
            return new UnassociateEipAddressRequest(this);
        } 

    } 

}
