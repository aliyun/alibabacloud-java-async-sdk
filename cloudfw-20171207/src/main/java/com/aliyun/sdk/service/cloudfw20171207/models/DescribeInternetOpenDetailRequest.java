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
         * ServiceNameFuzzy.
         */
        public Builder serviceNameFuzzy(String serviceNameFuzzy) {
            this.putQueryParameter("ServiceNameFuzzy", serviceNameFuzzy);
            this.serviceNameFuzzy = serviceNameFuzzy;
            return this;
        }

        /**
         * SortList.
         */
        public Builder sortList(java.util.List<SortList> sortList) {
            this.putQueryParameter("SortList", sortList);
            this.sortList = sortList;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
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

        /**
         * SuggestLevel.
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
             * Dir.
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * SortKey.
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
