// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveSnapshotNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveSnapshotNotifyConfigRequest</p>
 */
public class DescribeLiveSnapshotNotifyConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeLiveSnapshotNotifyConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveSnapshotNotifyConfigRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeLiveSnapshotNotifyConfigRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveSnapshotNotifyConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
        public DescribeLiveSnapshotNotifyConfigRequest build() {
            return new DescribeLiveSnapshotNotifyConfigRequest(this);
        } 

    } 

}
