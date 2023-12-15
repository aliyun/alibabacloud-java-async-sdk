// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChaincodeLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricChaincodeLogsRequest</p>
 */
public class DescribeFabricChaincodeLogsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ChaincodeId")
    private String chaincodeId;

    @Query
    @NameInMap("Lines")
    private String lines;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("PeerName")
    @Validation(required = true)
    private String peerName;

    private DescribeFabricChaincodeLogsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chaincodeId = builder.chaincodeId;
        this.lines = builder.lines;
        this.offset = builder.offset;
        this.organizationId = builder.organizationId;
        this.peerName = builder.peerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChaincodeLogsRequest create() {
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
     * @return chaincodeId
     */
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    /**
     * @return lines
     */
    public String getLines() {
        return this.lines;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
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

    public static final class Builder extends Request.Builder<DescribeFabricChaincodeLogsRequest, Builder> {
        private String regionId; 
        private String chaincodeId; 
        private String lines; 
        private Integer offset; 
        private String organizationId; 
        private String peerName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricChaincodeLogsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chaincodeId = request.chaincodeId;
            this.lines = request.lines;
            this.offset = request.offset;
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
         * ChaincodeId.
         */
        public Builder chaincodeId(String chaincodeId) {
            this.putQueryParameter("ChaincodeId", chaincodeId);
            this.chaincodeId = chaincodeId;
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
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
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
        public DescribeFabricChaincodeLogsRequest build() {
            return new DescribeFabricChaincodeLogsRequest(this);
        } 

    } 

}
