// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AllocateEipAddressRequest</p>
 */
public class AllocateEipAddressRequest extends Request {
    @Query
    @NameInMap("Count")
    @Validation(required = true, minimum = 1)
    private Integer count;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("MinCount")
    private Integer minCount;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private AllocateEipAddressRequest(Builder builder) {
        super(builder);
        this.count = builder.count;
        this.ensRegionId = builder.ensRegionId;
        this.minCount = builder.minCount;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return minCount
     */
    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<AllocateEipAddressRequest, Builder> {
        private Integer count; 
        private String ensRegionId; 
        private Integer minCount; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(AllocateEipAddressRequest response) {
            super(response);
            this.count = response.count;
            this.ensRegionId = response.ensRegionId;
            this.minCount = response.minCount;
            this.version = response.version;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
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
         * MinCount.
         */
        public Builder minCount(Integer minCount) {
            this.putQueryParameter("MinCount", minCount);
            this.minCount = minCount;
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
        public AllocateEipAddressRequest build() {
            return new AllocateEipAddressRequest(this);
        } 

    } 

}
