// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudGtmMonitorTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmMonitorTemplateRequest</p>
 */
public class UpdateCloudGtmMonitorTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendInfo")
    private String extendInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailureRate")
    private Integer failureRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspCityNodes")
    private java.util.List < IspCityNodes> ispCityNodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    private UpdateCloudGtmMonitorTemplateRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.evaluationCount = builder.evaluationCount;
        this.extendInfo = builder.extendInfo;
        this.failureRate = builder.failureRate;
        this.interval = builder.interval;
        this.ispCityNodes = builder.ispCityNodes;
        this.name = builder.name;
        this.templateId = builder.templateId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmMonitorTemplateRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmMonitorTemplateRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private Integer evaluationCount; 
        private String extendInfo; 
        private Integer failureRate; 
        private Integer interval; 
        private java.util.List < IspCityNodes> ispCityNodes; 
        private String name; 
        private String templateId; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmMonitorTemplateRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.evaluationCount = request.evaluationCount;
            this.extendInfo = request.extendInfo;
            this.failureRate = request.failureRate;
            this.interval = request.interval;
            this.ispCityNodes = request.ispCityNodes;
            this.name = request.name;
            this.templateId = request.templateId;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
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
        public UpdateCloudGtmMonitorTemplateRequest build() {
            return new UpdateCloudGtmMonitorTemplateRequest(this);
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
