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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainTranscodeName")
    @Validation(required = true)
    private String domainTranscodeName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeLiveStreamTranscodeInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainTranscodeName = builder.domainTranscodeName;
        this.ownerId = builder.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeLiveStreamTranscodeInfoRequest, Builder> {
        private String regionId; 
        private String domainTranscodeName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamTranscodeInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainTranscodeName = request.domainTranscodeName;
            this.ownerId = request.ownerId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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

        @Override
        public DescribeLiveStreamTranscodeInfoRequest build() {
            return new DescribeLiveStreamTranscodeInfoRequest(this);
        } 

    } 

}
