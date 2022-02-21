// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseEipAddressRequest} extends {@link RequestModel}
 *
 * <p>ReleaseEipAddressRequest</p>
 */
public class ReleaseEipAddressRequest extends Request {
    @Query
    @NameInMap("Eips")
    @Validation(required = true)
    private String eips;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private ReleaseEipAddressRequest(Builder builder) {
        super(builder);
        this.eips = builder.eips;
        this.ensRegionId = builder.ensRegionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eips
     */
    public String getEips() {
        return this.eips;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ReleaseEipAddressRequest, Builder> {
        private String eips; 
        private String ensRegionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseEipAddressRequest response) {
            super(response);
            this.eips = response.eips;
            this.ensRegionId = response.ensRegionId;
            this.version = response.version;
        } 

        /**
         * Eips.
         */
        public Builder eips(String eips) {
            this.putQueryParameter("Eips", eips);
            this.eips = eips;
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
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ReleaseEipAddressRequest build() {
            return new ReleaseEipAddressRequest(this);
        } 

    } 

}
