// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceInvokeRequest} extends {@link RequestModel}
 *
 * <p>ServiceInvokeRequest</p>
 */
public class ServiceInvokeRequest extends Request {
    @Query
    @NameInMap("ApplicationExternalId")
    @Validation(required = true)
    private String applicationExternalId;

    @Query
    @NameInMap("DoraemonAction")
    @Validation(required = true)
    private String doraemonAction;

    @Query
    @NameInMap("MobileExtendParamsJson")
    private String mobileExtendParamsJson;

    @Query
    @NameInMap("MobileExtendParamsJsonSign")
    private String mobileExtendParamsJsonSign;

    @Query
    @NameInMap("ServerExtendParamsJson")
    private String serverExtendParamsJson;

    @Query
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    @Query
    @NameInMap("TestModel")
    private Boolean testModel;

    @Query
    @NameInMap("XClientIp")
    private String xClientIp;

    private ServiceInvokeRequest(Builder builder) {
        super(builder);
        this.applicationExternalId = builder.applicationExternalId;
        this.doraemonAction = builder.doraemonAction;
        this.mobileExtendParamsJson = builder.mobileExtendParamsJson;
        this.mobileExtendParamsJsonSign = builder.mobileExtendParamsJsonSign;
        this.serverExtendParamsJson = builder.serverExtendParamsJson;
        this.serviceCode = builder.serviceCode;
        this.testModel = builder.testModel;
        this.xClientIp = builder.xClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceInvokeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationExternalId
     */
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    /**
     * @return doraemonAction
     */
    public String getDoraemonAction() {
        return this.doraemonAction;
    }

    /**
     * @return mobileExtendParamsJson
     */
    public String getMobileExtendParamsJson() {
        return this.mobileExtendParamsJson;
    }

    /**
     * @return mobileExtendParamsJsonSign
     */
    public String getMobileExtendParamsJsonSign() {
        return this.mobileExtendParamsJsonSign;
    }

    /**
     * @return serverExtendParamsJson
     */
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return testModel
     */
    public Boolean getTestModel() {
        return this.testModel;
    }

    /**
     * @return xClientIp
     */
    public String getXClientIp() {
        return this.xClientIp;
    }

    public static final class Builder extends Request.Builder<ServiceInvokeRequest, Builder> {
        private String applicationExternalId; 
        private String doraemonAction; 
        private String mobileExtendParamsJson; 
        private String mobileExtendParamsJsonSign; 
        private String serverExtendParamsJson; 
        private String serviceCode; 
        private Boolean testModel; 
        private String xClientIp; 

        private Builder() {
            super();
        } 

        private Builder(ServiceInvokeRequest request) {
            super(request);
            this.applicationExternalId = request.applicationExternalId;
            this.doraemonAction = request.doraemonAction;
            this.mobileExtendParamsJson = request.mobileExtendParamsJson;
            this.mobileExtendParamsJsonSign = request.mobileExtendParamsJsonSign;
            this.serverExtendParamsJson = request.serverExtendParamsJson;
            this.serviceCode = request.serviceCode;
            this.testModel = request.testModel;
            this.xClientIp = request.xClientIp;
        } 

        /**
         * ApplicationExternalId.
         */
        public Builder applicationExternalId(String applicationExternalId) {
            this.putQueryParameter("ApplicationExternalId", applicationExternalId);
            this.applicationExternalId = applicationExternalId;
            return this;
        }

        /**
         * DoraemonAction.
         */
        public Builder doraemonAction(String doraemonAction) {
            this.putQueryParameter("DoraemonAction", doraemonAction);
            this.doraemonAction = doraemonAction;
            return this;
        }

        /**
         * MobileExtendParamsJson.
         */
        public Builder mobileExtendParamsJson(String mobileExtendParamsJson) {
            this.putQueryParameter("MobileExtendParamsJson", mobileExtendParamsJson);
            this.mobileExtendParamsJson = mobileExtendParamsJson;
            return this;
        }

        /**
         * MobileExtendParamsJsonSign.
         */
        public Builder mobileExtendParamsJsonSign(String mobileExtendParamsJsonSign) {
            this.putQueryParameter("MobileExtendParamsJsonSign", mobileExtendParamsJsonSign);
            this.mobileExtendParamsJsonSign = mobileExtendParamsJsonSign;
            return this;
        }

        /**
         * ServerExtendParamsJson.
         */
        public Builder serverExtendParamsJson(String serverExtendParamsJson) {
            this.putQueryParameter("ServerExtendParamsJson", serverExtendParamsJson);
            this.serverExtendParamsJson = serverExtendParamsJson;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * TestModel.
         */
        public Builder testModel(Boolean testModel) {
            this.putQueryParameter("TestModel", testModel);
            this.testModel = testModel;
            return this;
        }

        /**
         * XClientIp.
         */
        public Builder xClientIp(String xClientIp) {
            this.putQueryParameter("XClientIp", xClientIp);
            this.xClientIp = xClientIp;
            return this;
        }

        @Override
        public ServiceInvokeRequest build() {
            return new ServiceInvokeRequest(this);
        } 

    } 

}
