// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInternetOpenIpRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetOpenIpRequest</p>
 */
public class DescribeInternetOpenIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetsInstanceId")
    private String assetsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetsInstanceName")
    private String assetsInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetsType")
    private String assetsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIp")
    private String publicIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6faknmuby7ezht****</p>
         */
        public Builder assetsInstanceId(String assetsInstanceId) {
            this.putQueryParameter("AssetsInstanceId", assetsInstanceId);
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>launch-advisor-2023****</p>
         */
        public Builder assetsInstanceName(String assetsInstanceName) {
            this.putQueryParameter("AssetsInstanceName", assetsInstanceName);
            this.assetsInstanceName = assetsInstanceName;
            return this;
        }

        /**
         * <p>The asset type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsEIP</p>
         */
        public Builder assetsType(String assetsType) {
            this.putQueryParameter("AssetsType", assetsType);
            this.assetsType = assetsType;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663640336</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.1</p>
         */
        public Builder publicIp(String publicIp) {
            this.putQueryParameter("PublicIp", publicIp);
            this.publicIp = publicIp;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The risk level. If you leave this parameter empty, all risk levels are queried. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: high risk</li>
         * <li><strong>2</strong>: medium risk</li>
         * <li><strong>1</strong>: low risk</li>
         * <li><strong>0</strong>: no risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The application.</p>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681957629</p>
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
