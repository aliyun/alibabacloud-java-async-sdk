// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInternetTrafficTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetTrafficTrendRequest</p>
 */
public class DescribeInternetTrafficTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPrivateIP")
    private String srcPrivateIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPublicIP")
    private String srcPublicIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficType")
    private String trafficType;

    private DescribeInternetTrafficTrendRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.sourceCode = builder.sourceCode;
        this.sourceIp = builder.sourceIp;
        this.srcPrivateIP = builder.srcPrivateIP;
        this.srcPublicIP = builder.srcPublicIP;
        this.startTime = builder.startTime;
        this.trafficType = builder.trafficType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetTrafficTrendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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
     * @return srcPrivateIP
     */
    public String getSrcPrivateIP() {
        return this.srcPrivateIP;
    }

    /**
     * @return srcPublicIP
     */
    public String getSrcPublicIP() {
        return this.srcPublicIP;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return trafficType
     */
    public String getTrafficType() {
        return this.trafficType;
    }

    public static final class Builder extends Request.Builder<DescribeInternetTrafficTrendRequest, Builder> {
        private String direction; 
        private String endTime; 
        private String lang; 
        private String sourceCode; 
        private String sourceIp; 
        private String srcPrivateIP; 
        private String srcPublicIP; 
        private String startTime; 
        private String trafficType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInternetTrafficTrendRequest request) {
            super(request);
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.sourceCode = request.sourceCode;
            this.sourceIp = request.sourceIp;
            this.srcPrivateIP = request.srcPrivateIP;
            this.srcPublicIP = request.srcPublicIP;
            this.startTime = request.startTime;
            this.trafficType = request.trafficType;
        } 

        /**
         * The direction of the internet traffic.
         * <p>
         * 
         * Valid values:
         * 
         * *   **in**: inbound traffic
         * *   **out**: outbound traffic
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language of the content in the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source code.
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
            return this;
        }

        /**
         * The IP address of the access source.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The private IP address of the source.
         */
        public Builder srcPrivateIP(String srcPrivateIP) {
            this.putQueryParameter("SrcPrivateIP", srcPrivateIP);
            this.srcPrivateIP = srcPrivateIP;
            return this;
        }

        /**
         * The public IP address of the source.
         */
        public Builder srcPublicIP(String srcPublicIP) {
            this.putQueryParameter("SrcPublicIP", srcPublicIP);
            this.srcPublicIP = srcPublicIP;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The type of the traffic that is captured. Valid values:
         * <p>
         * 
         * *   **max** (default): peak traffic
         * *   **avg**: average traffic
         */
        public Builder trafficType(String trafficType) {
            this.putQueryParameter("TrafficType", trafficType);
            this.trafficType = trafficType;
            return this;
        }

        @Override
        public DescribeInternetTrafficTrendRequest build() {
            return new DescribeInternetTrafficTrendRequest(this);
        } 

    } 

}
