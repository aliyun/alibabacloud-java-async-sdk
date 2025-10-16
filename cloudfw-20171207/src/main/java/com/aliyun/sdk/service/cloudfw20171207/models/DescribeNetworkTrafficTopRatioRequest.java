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
 * {@link DescribeNetworkTrafficTopRatioRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkTrafficTopRatioRequest</p>
 */
public class DescribeNetworkTrafficTopRatioRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetIP")
    private String assetIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetRegion")
    private String assetRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIP")
    private String dstIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstPort")
    private String dstPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProperty")
    private String ipProperty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleResult")
    private String ruleResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIP")
    private String srcIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeNetworkTrafficTopRatioRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.assetIP = builder.assetIP;
        this.assetRegion = builder.assetRegion;
        this.dataType = builder.dataType;
        this.direction = builder.direction;
        this.dstIP = builder.dstIP;
        this.dstPort = builder.dstPort;
        this.endTime = builder.endTime;
        this.ipProperty = builder.ipProperty;
        this.isp = builder.isp;
        this.lang = builder.lang;
        this.location = builder.location;
        this.ruleResult = builder.ruleResult;
        this.sort = builder.sort;
        this.sourceCode = builder.sourceCode;
        this.sourceIp = builder.sourceIp;
        this.srcIP = builder.srcIP;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkTrafficTopRatioRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return assetIP
     */
    public String getAssetIP() {
        return this.assetIP;
    }

    /**
     * @return assetRegion
     */
    public String getAssetRegion() {
        return this.assetRegion;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return dstIP
     */
    public String getDstIP() {
        return this.dstIP;
    }

    /**
     * @return dstPort
     */
    public String getDstPort() {
        return this.dstPort;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ipProperty
     */
    public String getIpProperty() {
        return this.ipProperty;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return ruleResult
     */
    public String getRuleResult() {
        return this.ruleResult;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sourceCode
     */
    public String getSourceCode() {
        return this.sourceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return srcIP
     */
    public String getSrcIP() {
        return this.srcIP;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkTrafficTopRatioRequest, Builder> {
        private String appName; 
        private String assetIP; 
        private String assetRegion; 
        private String dataType; 
        private String direction; 
        private String dstIP; 
        private String dstPort; 
        private String endTime; 
        private String ipProperty; 
        private String isp; 
        private String lang; 
        private String location; 
        private String ruleResult; 
        private String sort; 
        private String sourceCode; 
        private String sourceIp; 
        private String srcIP; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkTrafficTopRatioRequest request) {
            super(request);
            this.appName = request.appName;
            this.assetIP = request.assetIP;
            this.assetRegion = request.assetRegion;
            this.dataType = request.dataType;
            this.direction = request.direction;
            this.dstIP = request.dstIP;
            this.dstPort = request.dstPort;
            this.endTime = request.endTime;
            this.ipProperty = request.ipProperty;
            this.isp = request.isp;
            this.lang = request.lang;
            this.location = request.location;
            this.ruleResult = request.ruleResult;
            this.sort = request.sort;
            this.sourceCode = request.sourceCode;
            this.sourceIp = request.sourceIp;
            this.srcIP = request.srcIP;
            this.startTime = request.startTime;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AssetIP.
         */
        public Builder assetIP(String assetIP) {
            this.putQueryParameter("AssetIP", assetIP);
            this.assetIP = assetIP;
            return this;
        }

        /**
         * AssetRegion.
         */
        public Builder assetRegion(String assetRegion) {
            this.putQueryParameter("AssetRegion", assetRegion);
            this.assetRegion = assetRegion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>in_src_ip</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * DstIP.
         */
        public Builder dstIP(String dstIP) {
            this.putQueryParameter("DstIP", dstIP);
            this.dstIP = dstIP;
            return this;
        }

        /**
         * DstPort.
         */
        public Builder dstPort(String dstPort) {
            this.putQueryParameter("DstPort", dstPort);
            this.dstPort = dstPort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1757433863</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IpProperty.
         */
        public Builder ipProperty(String ipProperty) {
            this.putQueryParameter("IpProperty", ipProperty);
            this.ipProperty = ipProperty;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
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
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * RuleResult.
         */
        public Builder ruleResult(String ruleResult) {
            this.putQueryParameter("RuleResult", ruleResult);
            this.ruleResult = ruleResult;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun</p>
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
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
         * SrcIP.
         */
        public Builder srcIP(String srcIP) {
            this.putQueryParameter("SrcIP", srcIP);
            this.srcIP = srcIP;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1749176793</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeNetworkTrafficTopRatioRequest build() {
            return new DescribeNetworkTrafficTopRatioRequest(this);
        } 

    } 

}
