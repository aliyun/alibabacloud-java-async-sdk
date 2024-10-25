// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetServiceRequest} extends {@link RequestModel}
 *
 * <p>GetServiceRequest</p>
 */
public class GetServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterAliUid")
    private Boolean filterAliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharedAccountType")
    private String sharedAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowDetail")
    private java.util.List < String > showDetail;

    private GetServiceRequest(Builder builder) {
        super(builder);
        this.filterAliUid = builder.filterAliUid;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.serviceName = builder.serviceName;
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
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
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
        private String serviceInstanceId; 
        private String serviceName; 
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
            this.serviceInstanceId = request.serviceInstanceId;
            this.serviceName = request.serviceName;
            this.serviceVersion = request.serviceVersion;
            this.sharedAccountType = request.sharedAccountType;
            this.showDetail = request.showDetail;
        } 

        /**
         * <p>Specifies whether to filter information based on Alibaba Cloud account IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder filterAliUid(Boolean filterAliUid) {
            this.putQueryParameter("FilterAliUid", filterAliUid);
            this.filterAliUid = filterAliUid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-4ee86df83fd948******</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The share type of the service. Default value: SharedAccount. Valid values:</p>
         * <ul>
         * <li>SharedAccount: The service is shared by multiple accounts.</li>
         * <li>Resell: The service is distributed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SharedAccount</p>
         */
        public Builder sharedAccountType(String sharedAccountType) {
            this.putQueryParameter("SharedAccountType", sharedAccountType);
            this.sharedAccountType = sharedAccountType;
            return this;
        }

        /**
         * <p>The information that you want to query.</p>
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
