// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopIdsByVulNamesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopIdsByVulNamesRequest</p>
 */
public class DescribeDesktopIdsByVulNamesRequest extends Request {
    @Query
    @NameInMap("Necessity")
    private String necessity;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("VulName")
    @Validation(required = true)
    private java.util.List < String > vulName;

    private DescribeDesktopIdsByVulNamesRequest(Builder builder) {
        super(builder);
        this.necessity = builder.necessity;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.vulName = builder.vulName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopIdsByVulNamesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vulName
     */
    public java.util.List < String > getVulName() {
        return this.vulName;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopIdsByVulNamesRequest, Builder> {
        private String necessity; 
        private String officeSiteId; 
        private String regionId; 
        private String type; 
        private java.util.List < String > vulName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopIdsByVulNamesRequest request) {
            super(request);
            this.necessity = request.necessity;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.type = request.type;
            this.vulName = request.vulName;
        } 

        /**
         * Necessity.
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VulName.
         */
        public Builder vulName(java.util.List < String > vulName) {
            this.putQueryParameter("VulName", vulName);
            this.vulName = vulName;
            return this;
        }

        @Override
        public DescribeDesktopIdsByVulNamesRequest build() {
            return new DescribeDesktopIdsByVulNamesRequest(this);
        } 

    } 

}
