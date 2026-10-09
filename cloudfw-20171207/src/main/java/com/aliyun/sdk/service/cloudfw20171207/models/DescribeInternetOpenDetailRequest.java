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
 * {@link DescribeInternetOpenDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetOpenDetailRequest</p>
 */
public class DescribeInternetOpenDetailRequest extends Request {
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
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
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
    @com.aliyun.core.annotation.NameInMap("ServiceNameFuzzy")
    private String serviceNameFuzzy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortList")
    private java.util.List<SortList> sortList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuggestLevel")
    private String suggestLevel;

    private DescribeInternetOpenDetailRequest(Builder builder) {
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
        this.serviceNameFuzzy = builder.serviceNameFuzzy;
        this.sortList = builder.sortList;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
        this.suggestLevel = builder.suggestLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetOpenDetailRequest create() {
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
     * @return serviceNameFuzzy
     */
    public String getServiceNameFuzzy() {
        return this.serviceNameFuzzy;
    }

    /**
     * @return sortList
     */
    public java.util.List<SortList> getSortList() {
        return this.sortList;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return suggestLevel
     */
    public String getSuggestLevel() {
        return this.suggestLevel;
    }

    public static final class Builder extends Request.Builder<DescribeInternetOpenDetailRequest, Builder> {
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
        private String serviceNameFuzzy; 
        private java.util.List<SortList> sortList; 
        private String sourceIp; 
        private String startTime; 
        private String suggestLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInternetOpenDetailRequest request) {
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
            this.serviceNameFuzzy = request.serviceNameFuzzy;
            this.sortList = request.sortList;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
            this.suggestLevel = request.suggestLevel;
        } 

        /**
         * <p>The ID of the asset. Fuzzy search is supported.</p>
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
         * <p>The name of the asset. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_test</p>
         */
        public Builder assetsInstanceName(String assetsInstanceName) {
            this.putQueryParameter("AssetsInstanceName", assetsInstanceName);
            this.assetsInstanceName = assetsInstanceName;
            return this;
        }

        /**
         * <p>The type of the asset for an exact match. If you leave this parameter empty, all asset types are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsPublicIP</p>
         */
        public Builder assetsType(String assetsType) {
            this.putQueryParameter("AssetsType", assetsType);
            this.assetsType = assetsType;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>1745251200</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the content.</p>
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
         * <p>The number of the page to return.</p>
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
         * <p>The port for an exact match. The value must be an integer from 1 to 65535. If you leave this parameter empty, all ports are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>9100</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The public IP address for an exact match. If you leave this parameter empty, all public IP addresses are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.13.XX</p>
         */
        public Builder publicIp(String publicIp) {
            this.putQueryParameter("PublicIp", publicIp);
            this.publicIp = publicIp;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The risk level. If you leave this parameter empty, all risk levels are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The name of the application for an exact match. If you leave this parameter empty, all applications are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>SMB</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The name of the application for a fuzzy match. If you leave this parameter empty, all applications are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>SMB</p>
         */
        public Builder serviceNameFuzzy(String serviceNameFuzzy) {
            this.putQueryParameter("ServiceNameFuzzy", serviceNameFuzzy);
            this.serviceNameFuzzy = serviceNameFuzzy;
            return this;
        }

        /**
         * <p>The sorting conditions.</p>
         */
        public Builder sortList(java.util.List<SortList> sortList) {
            this.putQueryParameter("SortList", sortList);
            this.sortList = sortList;
            return this;
        }

        /**
         * <p>The source IP address of the access request.</p>
         * 
         * <strong>example:</strong>
         * <p>222.212.86.7XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The start of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1656837360</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The recommended policy level.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder suggestLevel(String suggestLevel) {
            this.putQueryParameter("SuggestLevel", suggestLevel);
            this.suggestLevel = suggestLevel;
            return this;
        }

        @Override
        public DescribeInternetOpenDetailRequest build() {
            return new DescribeInternetOpenDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInternetOpenDetailRequest} extends {@link TeaModel}
     *
     * <p>DescribeInternetOpenDetailRequest</p>
     */
    public static class SortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dir")
        private String dir;

        @com.aliyun.core.annotation.NameInMap("SortKey")
        private String sortKey;

        private SortList(Builder builder) {
            this.dir = builder.dir;
            this.sortKey = builder.sortKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SortList create() {
            return builder().build();
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return sortKey
         */
        public String getSortKey() {
            return this.sortKey;
        }

        public static final class Builder {
            private String dir; 
            private String sortKey; 

            private Builder() {
            } 

            private Builder(SortList model) {
                this.dir = model.dir;
                this.sortKey = model.sortKey;
            } 

            /**
             * <p>The sort order.</p>
             * 
             * <strong>example:</strong>
             * <p>asc</p>
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * <p>The sorting key.</p>
             * 
             * <strong>example:</strong>
             * <p>ServiceName</p>
             */
            public Builder sortKey(String sortKey) {
                this.sortKey = sortKey;
                return this;
            }

            public SortList build() {
                return new SortList(this);
            } 

        } 

    }
}
