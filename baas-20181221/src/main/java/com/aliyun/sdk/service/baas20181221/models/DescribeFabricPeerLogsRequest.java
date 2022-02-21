// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricPeerLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricPeerLogsRequest</p>
 */
public class DescribeFabricPeerLogsRequest extends Request {
    @Query
    @NameInMap("Lines")
    private String lines;

    @Query
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("PeerName")
    @Validation(required = true)
    private String peerName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricPeerLogsRequest(Builder builder) {
        super(builder);
        this.lines = builder.lines;
        this.organizationId = builder.organizationId;
        this.peerName = builder.peerName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricPeerLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lines
     */
    public String getLines() {
        return this.lines;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return peerName
     */
    public String getPeerName() {
        return this.peerName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricPeerLogsRequest, Builder> {
        private String lines; 
        private String organizationId; 
        private String peerName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricPeerLogsRequest response) {
            super(response);
            this.lines = response.lines;
            this.organizationId = response.organizationId;
            this.peerName = response.peerName;
            this.regionId = response.regionId;
        } 

        /**
         * Lines.
         */
        public Builder lines(String lines) {
            this.putQueryParameter("Lines", lines);
            this.lines = lines;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * PeerName.
         */
        public Builder peerName(String peerName) {
            this.putQueryParameter("PeerName", peerName);
            this.peerName = peerName;
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
        public DescribeFabricPeerLogsRequest build() {
            return new DescribeFabricPeerLogsRequest(this);
        } 

    } 

}
