// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwimLaneDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSwimLaneDetailResponseBody</p>
 */
public class GetSwimLaneDetailResponseBody extends TeaModel {
    @NameInMap("IngressRule")
    private String ingressRule;

    @NameInMap("IngressService")
    private String ingressService;

    @NameInMap("LabelSelectorKey")
    private String labelSelectorKey;

    @NameInMap("LabelSelectorValue")
    private String labelSelectorValue;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServicesList")
    private String servicesList;

    private GetSwimLaneDetailResponseBody(Builder builder) {
        this.ingressRule = builder.ingressRule;
        this.ingressService = builder.ingressService;
        this.labelSelectorKey = builder.labelSelectorKey;
        this.labelSelectorValue = builder.labelSelectorValue;
        this.requestId = builder.requestId;
        this.servicesList = builder.servicesList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwimLaneDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return ingressRule
     */
    public String getIngressRule() {
        return this.ingressRule;
    }

    /**
     * @return ingressService
     */
    public String getIngressService() {
        return this.ingressService;
    }

    /**
     * @return labelSelectorKey
     */
    public String getLabelSelectorKey() {
        return this.labelSelectorKey;
    }

    /**
     * @return labelSelectorValue
     */
    public String getLabelSelectorValue() {
        return this.labelSelectorValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return servicesList
     */
    public String getServicesList() {
        return this.servicesList;
    }

    public static final class Builder {
        private String ingressRule; 
        private String ingressService; 
        private String labelSelectorKey; 
        private String labelSelectorValue; 
        private String requestId; 
        private String servicesList; 

        /**
         * The traffic routing rule that routes traffic to the lane by using the ingress gateway. The traffic routing rule contains one or more custom routes.
         */
        public Builder ingressRule(String ingressRule) {
            this.ingressRule = ingressRule;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder ingressService(String ingressService) {
            this.ingressService = ingressService;
            return this;
        }

        /**
         * Fixed value: **ASM_TRAFFIC_TAG**.
         */
        public Builder labelSelectorKey(String labelSelectorKey) {
            this.labelSelectorKey = labelSelectorKey;
            return this;
        }

        /**
         * The value of ASM_TRAFFIC_TAG.
         */
        public Builder labelSelectorValue(String labelSelectorValue) {
            this.labelSelectorValue = labelSelectorValue;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of services associated with the lane.
         */
        public Builder servicesList(String servicesList) {
            this.servicesList = servicesList;
            return this;
        }

        public GetSwimLaneDetailResponseBody build() {
            return new GetSwimLaneDetailResponseBody(this);
        } 

    } 

}
