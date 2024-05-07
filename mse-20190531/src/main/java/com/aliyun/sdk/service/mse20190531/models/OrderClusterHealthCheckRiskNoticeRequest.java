// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderClusterHealthCheckRiskNoticeRequest} extends {@link RequestModel}
 *
 * <p>OrderClusterHealthCheckRiskNoticeRequest</p>
 */
public class OrderClusterHealthCheckRiskNoticeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mute")
    private Boolean mute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoticeType")
    private String noticeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskCode")
    private String riskCode;

    private OrderClusterHealthCheckRiskNoticeRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.instanceId = builder.instanceId;
        this.mute = builder.mute;
        this.noticeType = builder.noticeType;
        this.regionId = builder.regionId;
        this.requestPars = builder.requestPars;
        this.riskCode = builder.riskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderClusterHealthCheckRiskNoticeRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mute
     */
    public Boolean getMute() {
        return this.mute;
    }

    /**
     * @return noticeType
     */
    public String getNoticeType() {
        return this.noticeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return riskCode
     */
    public String getRiskCode() {
        return this.riskCode;
    }

    public static final class Builder extends Request.Builder<OrderClusterHealthCheckRiskNoticeRequest, Builder> {
        private String acceptLanguage; 
        private String instanceId; 
        private Boolean mute; 
        private String noticeType; 
        private String regionId; 
        private String requestPars; 
        private String riskCode; 

        private Builder() {
            super();
        } 

        private Builder(OrderClusterHealthCheckRiskNoticeRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.instanceId = request.instanceId;
            this.mute = request.mute;
            this.noticeType = request.noticeType;
            this.regionId = request.regionId;
            this.requestPars = request.requestPars;
            this.riskCode = request.riskCode;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to disable the notification feature if the risk item occurs.
         * <p>
         * 
         * *   true: disabled
         * *   false: enabled
         */
        public Builder mute(Boolean mute) {
            this.putQueryParameter("Mute", mute);
            this.mute = mute;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder noticeType(String noticeType) {
            this.putQueryParameter("NoticeType", noticeType);
            this.noticeType = noticeType;
            return this;
        }

        /**
         * The region in which the cluster resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The extended request parameters in the JSON format.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * The ID of the risk item.
         */
        public Builder riskCode(String riskCode) {
            this.putQueryParameter("RiskCode", riskCode);
            this.riskCode = riskCode;
            return this;
        }

        @Override
        public OrderClusterHealthCheckRiskNoticeRequest build() {
            return new OrderClusterHealthCheckRiskNoticeRequest(this);
        } 

    } 

}
