// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudGtmMonitorTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudGtmMonitorTemplateRequest</p>
 */
public class CreateCloudGtmMonitorTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer evaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendInfo")
    private String extendInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailureRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer failureRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspCityNodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < IspCityNodes> ispCityNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeout;

    private CreateCloudGtmMonitorTemplateRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.evaluationCount = builder.evaluationCount;
        this.extendInfo = builder.extendInfo;
        this.failureRate = builder.failureRate;
        this.interval = builder.interval;
        this.ipVersion = builder.ipVersion;
        this.ispCityNodes = builder.ispCityNodes;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudGtmMonitorTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return evaluationCount
     */
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    /**
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return failureRate
     */
    public Integer getFailureRate() {
        return this.failureRate;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return ispCityNodes
     */
    public java.util.List < IspCityNodes> getIspCityNodes() {
        return this.ispCityNodes;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CreateCloudGtmMonitorTemplateRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private Integer evaluationCount; 
        private String extendInfo; 
        private Integer failureRate; 
        private Integer interval; 
        private String ipVersion; 
        private java.util.List < IspCityNodes> ispCityNodes; 
        private String name; 
        private String protocol; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudGtmMonitorTemplateRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.evaluationCount = request.evaluationCount;
            this.extendInfo = request.extendInfo;
            this.failureRate = request.failureRate;
            this.interval = request.interval;
            this.ipVersion = request.ipVersion;
            this.ispCityNodes = request.ispCityNodes;
            this.name = request.name;
            this.protocol = request.protocol;
            this.timeout = request.timeout;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EvaluationCount.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * ExtendInfo.
         */
        public Builder extendInfo(String extendInfo) {
            this.putQueryParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * FailureRate.
         */
        public Builder failureRate(Integer failureRate) {
            this.putQueryParameter("FailureRate", failureRate);
            this.failureRate = failureRate;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * IspCityNodes.
         */
        public Builder ispCityNodes(java.util.List < IspCityNodes> ispCityNodes) {
            String ispCityNodesShrink = shrink(ispCityNodes, "IspCityNodes", "json");
            this.putQueryParameter("IspCityNodes", ispCityNodesShrink);
            this.ispCityNodes = ispCityNodes;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CreateCloudGtmMonitorTemplateRequest build() {
            return new CreateCloudGtmMonitorTemplateRequest(this);
        } 

    } 

    public static class IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        private IspCityNodes(Builder builder) {
            this.cityCode = builder.cityCode;
            this.ispCode = builder.ispCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityNodes create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return ispCode
         */
        public String getIspCode() {
            return this.ispCode;
        }

        public static final class Builder {
            private String cityCode; 
            private String ispCode; 

            /**
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * IspCode.
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            public IspCityNodes build() {
                return new IspCityNodes(this);
            } 

        } 

    }
}
