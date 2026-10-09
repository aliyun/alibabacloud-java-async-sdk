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
 * {@link DescribeInternetOpenServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetOpenServiceRequest</p>
 */
public class DescribeInternetOpenServiceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceNameFuzzy")
    private String serviceNameFuzzy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuggestLevel")
    private String suggestLevel;

    private DescribeInternetOpenServiceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
        this.riskLevel = builder.riskLevel;
        this.serviceName = builder.serviceName;
        this.serviceNameFuzzy = builder.serviceNameFuzzy;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
        this.suggestLevel = builder.suggestLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetOpenServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeInternetOpenServiceRequest, Builder> {
        private String currentPage; 
        private String endTime; 
        private String lang; 
        private String pageSize; 
        private String port; 
        private String riskLevel; 
        private String serviceName; 
        private String serviceNameFuzzy; 
        private String sourceIp; 
        private String startTime; 
        private String suggestLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInternetOpenServiceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.port = request.port;
            this.riskLevel = request.riskLevel;
            this.serviceName = request.serviceName;
            this.serviceNameFuzzy = request.serviceNameFuzzy;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
            this.suggestLevel = request.suggestLevel;
        } 

        /**
         * <p>The page number.</p>
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
         * <p>The end of the time range to query. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1753804800</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the response.</p>
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
         * <p>3389</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The risk level.</p>
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
         * <p>The name of the application for an exact match. If you do not specify this parameter, all applications are queried.</p>
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
         * <p>The name of the application for a fuzzy match. If you do not specify this parameter, all applications are queried.</p>
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
         * <p>The source IP address of the visitor.</p>
         * 
         * <strong>example:</strong>
         * <p>122.200.64.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The start of the time range to query. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1755742107</p>
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
        public DescribeInternetOpenServiceRequest build() {
            return new DescribeInternetOpenServiceRequest(this);
        } 

    } 

}
