// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInternetTrafficTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetTrafficTrendRequest</p>
 */
public class DescribeInternetTrafficTrendRequest extends Request {
    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceCode")
    @Validation(required = true)
    private String sourceCode;

    @Query
    @NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @Query
    @NameInMap("SrcPrivateIP")
    private String srcPrivateIP;

    @Query
    @NameInMap("SrcPublicIP")
    private String srcPublicIP;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("TrafficType")
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
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
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
         * SourceCode.
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
         * SrcPrivateIP.
         */
        public Builder srcPrivateIP(String srcPrivateIP) {
            this.putQueryParameter("SrcPrivateIP", srcPrivateIP);
            this.srcPrivateIP = srcPrivateIP;
            return this;
        }

        /**
         * SrcPublicIP.
         */
        public Builder srcPublicIP(String srcPublicIP) {
            this.putQueryParameter("SrcPublicIP", srcPublicIP);
            this.srcPublicIP = srcPublicIP;
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
         * TrafficType.
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
