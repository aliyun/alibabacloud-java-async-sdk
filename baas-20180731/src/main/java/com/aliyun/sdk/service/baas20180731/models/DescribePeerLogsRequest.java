// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePeerLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribePeerLogsRequest</p>
 */
public class DescribePeerLogsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private DescribePeerLogsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lines = builder.lines;
        this.organizationId = builder.organizationId;
        this.peerName = builder.peerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePeerLogsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePeerLogsRequest, Builder> {
        private String regionId; 
        private String lines; 
        private String organizationId; 
        private String peerName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePeerLogsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lines = request.lines;
            this.organizationId = request.organizationId;
            this.peerName = request.peerName;
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

        @Override
        public DescribePeerLogsRequest build() {
            return new DescribePeerLogsRequest(this);
        } 

    } 

}
