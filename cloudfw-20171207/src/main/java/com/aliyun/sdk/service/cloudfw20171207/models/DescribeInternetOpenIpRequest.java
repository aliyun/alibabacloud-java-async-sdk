// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInternetOpenIpRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetOpenIpRequest</p>
 */
public class DescribeInternetOpenIpRequest extends Request {
    @Query
    @NameInMap("AssetsInstanceId")
    private String assetsInstanceId;

    @Query
    @NameInMap("AssetsInstanceName")
    private String assetsInstanceName;

    @Query
    @NameInMap("AssetsType")
    private String assetsType;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private String currentPage;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("PublicIp")
    private String publicIp;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("RiskLevel")
    private String riskLevel;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeInternetOpenIpRequest(Builder builder) {
        super(builder);
        this.assetsInstanceId = builder.assetsInstanceId;
        this.assetsInstanceName = builder.assetsInstanceName;
        this.assetsType = builder.assetsType;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
        this.publicIp = builder.publicIp;
        this.regionNo = builder.regionNo;
        this.riskLevel = builder.riskLevel;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetOpenIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsInstanceId
     */
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    /**
     * @return assetsInstanceName
     */
    public String getAssetsInstanceName() {
        return this.assetsInstanceName;
    }

    /**
     * @return assetsType
     */
    public String getAssetsType() {
        return this.assetsType;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeInternetOpenIpRequest, Builder> {
        private String assetsInstanceId; 
        private String assetsInstanceName; 
        private String assetsType; 
        private String currentPage; 
        private String endTime; 
        private String lang; 
        private String pageSize; 
        private String port; 
        private String publicIp; 
        private String regionNo; 
        private String riskLevel; 
        private String serviceName; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInternetOpenIpRequest request) {
            super(request);
            this.assetsInstanceId = request.assetsInstanceId;
            this.assetsInstanceName = request.assetsInstanceName;
            this.assetsType = request.assetsType;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.port = request.port;
            this.publicIp = request.publicIp;
            this.regionNo = request.regionNo;
            this.riskLevel = request.riskLevel;
            this.serviceName = request.serviceName;
            this.startTime = request.startTime;
        } 

        /**
         * AssetsInstanceId.
         */
        public Builder assetsInstanceId(String assetsInstanceId) {
            this.putQueryParameter("AssetsInstanceId", assetsInstanceId);
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }

        /**
         * AssetsInstanceName.
         */
        public Builder assetsInstanceName(String assetsInstanceName) {
            this.putQueryParameter("AssetsInstanceName", assetsInstanceName);
            this.assetsInstanceName = assetsInstanceName;
            return this;
        }

        /**
         * AssetsType.
         */
        public Builder assetsType(String assetsType) {
            this.putQueryParameter("AssetsType", assetsType);
            this.assetsType = assetsType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * PublicIp.
         */
        public Builder publicIp(String publicIp) {
            this.putQueryParameter("PublicIp", publicIp);
            this.publicIp = publicIp;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeInternetOpenIpRequest build() {
            return new DescribeInternetOpenIpRequest(this);
        } 

    } 

}
