// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamTranscodeInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamTranscodeInfoRequest</p>
 */
public class DescribeLiveStreamTranscodeInfoRequest extends Request {
    @Query
    @NameInMap("DomainTranscodeName")
    @Validation(required = true)
    private String domainTranscodeName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeLiveStreamTranscodeInfoRequest(Builder builder) {
        super(builder);
        this.domainTranscodeName = builder.domainTranscodeName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamTranscodeInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainTranscodeName
     */
    public String getDomainTranscodeName() {
        return this.domainTranscodeName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeLiveStreamTranscodeInfoRequest, Builder> {
        private String domainTranscodeName; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamTranscodeInfoRequest response) {
            super(response);
            this.domainTranscodeName = response.domainTranscodeName;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * DomainTranscodeName.
         */
        public Builder domainTranscodeName(String domainTranscodeName) {
            this.putQueryParameter("DomainTranscodeName", domainTranscodeName);
            this.domainTranscodeName = domainTranscodeName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeLiveStreamTranscodeInfoRequest build() {
            return new DescribeLiveStreamTranscodeInfoRequest(this);
        } 

    } 

}
