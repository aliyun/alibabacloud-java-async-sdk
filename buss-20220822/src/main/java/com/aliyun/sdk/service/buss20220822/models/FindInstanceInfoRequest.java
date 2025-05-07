// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link FindInstanceInfoRequest} extends {@link RequestModel}
 *
 * <p>FindInstanceInfoRequest</p>
 */
public class FindInstanceInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("businessCodes")
    private String businessCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bussinessCode")
    private String bussinessCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("extras")
    private java.util.Map<String, ?> extras;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("needDNS")
    private Boolean needDNS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private FindInstanceInfoRequest(Builder builder) {
        super(builder);
        this.businessCodes = builder.businessCodes;
        this.bussinessCode = builder.bussinessCode;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.extras = builder.extras;
        this.ip = builder.ip;
        this.needDNS = builder.needDNS;
        this.startTime = builder.startTime;
        this.url = builder.url;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindInstanceInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessCodes
     */
    public String getBusinessCodes() {
        return this.businessCodes;
    }

    /**
     * @return bussinessCode
     */
    public String getBussinessCode() {
        return this.bussinessCode;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return extras
     */
    public java.util.Map<String, ?> getExtras() {
        return this.extras;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return needDNS
     */
    public Boolean getNeedDNS() {
        return this.needDNS;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<FindInstanceInfoRequest, Builder> {
        private String businessCodes; 
        private String bussinessCode; 
        private String domain; 
        private Long endTime; 
        private java.util.Map<String, ?> extras; 
        private String ip; 
        private Boolean needDNS; 
        private Long startTime; 
        private String url; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(FindInstanceInfoRequest request) {
            super(request);
            this.businessCodes = request.businessCodes;
            this.bussinessCode = request.bussinessCode;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.extras = request.extras;
            this.ip = request.ip;
            this.needDNS = request.needDNS;
            this.startTime = request.startTime;
            this.url = request.url;
            this.userId = request.userId;
        } 

        /**
         * businessCodes.
         */
        public Builder businessCodes(String businessCodes) {
            this.putQueryParameter("businessCodes", businessCodes);
            this.businessCodes = businessCodes;
            return this;
        }

        /**
         * bussinessCode.
         */
        public Builder bussinessCode(String bussinessCode) {
            this.putQueryParameter("bussinessCode", bussinessCode);
            this.bussinessCode = bussinessCode;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * extras.
         */
        public Builder extras(java.util.Map<String, ?> extras) {
            String extrasShrink = shrink(extras, "extras", "json");
            this.putQueryParameter("extras", extrasShrink);
            this.extras = extras;
            return this;
        }

        /**
         * ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * needDNS.
         */
        public Builder needDNS(Boolean needDNS) {
            this.putQueryParameter("needDNS", needDNS);
            this.needDNS = needDNS;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.putQueryParameter("url", url);
            this.url = url;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public FindInstanceInfoRequest build() {
            return new FindInstanceInfoRequest(this);
        } 

    } 

}
