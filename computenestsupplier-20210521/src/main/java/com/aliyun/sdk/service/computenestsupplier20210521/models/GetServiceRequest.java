// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceRequest} extends {@link RequestModel}
 *
 * <p>GetServiceRequest</p>
 */
public class GetServiceRequest extends Request {
    @Query
    @NameInMap("FilterAliUid")
    private Boolean filterAliUid;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Query
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    @Query
    @NameInMap("SharedAccountType")
    private String sharedAccountType;

    @Query
    @NameInMap("ShowDetail")
    private java.util.List < String > showDetail;

    private GetServiceRequest(Builder builder) {
        super(builder);
        this.filterAliUid = builder.filterAliUid;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
        this.sharedAccountType = builder.sharedAccountType;
        this.showDetail = builder.showDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterAliUid
     */
    public Boolean getFilterAliUid() {
        return this.filterAliUid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return sharedAccountType
     */
    public String getSharedAccountType() {
        return this.sharedAccountType;
    }

    /**
     * @return showDetail
     */
    public java.util.List < String > getShowDetail() {
        return this.showDetail;
    }

    public static final class Builder extends Request.Builder<GetServiceRequest, Builder> {
        private Boolean filterAliUid; 
        private String regionId; 
        private String serviceId; 
        private String serviceVersion; 
        private String sharedAccountType; 
        private java.util.List < String > showDetail; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceRequest request) {
            super(request);
            this.filterAliUid = request.filterAliUid;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
            this.sharedAccountType = request.sharedAccountType;
            this.showDetail = request.showDetail;
        } 

        /**
         * FilterAliUid.
         */
        public Builder filterAliUid(Boolean filterAliUid) {
            this.putQueryParameter("FilterAliUid", filterAliUid);
            this.filterAliUid = filterAliUid;
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
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * SharedAccountType.
         */
        public Builder sharedAccountType(String sharedAccountType) {
            this.putQueryParameter("SharedAccountType", sharedAccountType);
            this.sharedAccountType = sharedAccountType;
            return this;
        }

        /**
         * ShowDetail.
         */
        public Builder showDetail(java.util.List < String > showDetail) {
            this.putQueryParameter("ShowDetail", showDetail);
            this.showDetail = showDetail;
            return this;
        }

        @Override
        public GetServiceRequest build() {
            return new GetServiceRequest(this);
        } 

    } 

}
