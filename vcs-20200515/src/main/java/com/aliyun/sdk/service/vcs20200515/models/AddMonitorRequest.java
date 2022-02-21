// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMonitorRequest} extends {@link RequestModel}
 *
 * <p>AddMonitorRequest</p>
 */
public class AddMonitorRequest extends Request {
    @Body
    @NameInMap("AlgorithmVendor")
    @Validation(required = true, maximum = 20, minimum = 1)
    private String algorithmVendor;

    @Body
    @NameInMap("BatchIndicator")
    private Integer batchIndicator;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true, maximum = 50, minimum = 1)
    private String corpId;

    @Body
    @NameInMap("Description")
    @Validation(maximum = 100, minimum = 1)
    private String description;

    @Body
    @NameInMap("MonitorType")
    @Validation(required = true, maximum = 20, minimum = 1)
    private String monitorType;

    @Body
    @NameInMap("NotifierAppSecret")
    @Validation(maximum = 200, minimum = 1)
    private String notifierAppSecret;

    @Body
    @NameInMap("NotifierExtendValues")
    @Validation(maximum = 200)
    private String notifierExtendValues;

    @Body
    @NameInMap("NotifierTimeOut")
    @Validation(maximum = 3000, minimum = 10)
    private Integer notifierTimeOut;

    @Body
    @NameInMap("NotifierType")
    @Validation(maximum = 20, minimum = 1)
    private String notifierType;

    @Body
    @NameInMap("NotifierUrl")
    @Validation(maximum = 200, minimum = 1)
    private String notifierUrl;

    private AddMonitorRequest(Builder builder) {
        super(builder);
        this.algorithmVendor = builder.algorithmVendor;
        this.batchIndicator = builder.batchIndicator;
        this.corpId = builder.corpId;
        this.description = builder.description;
        this.monitorType = builder.monitorType;
        this.notifierAppSecret = builder.notifierAppSecret;
        this.notifierExtendValues = builder.notifierExtendValues;
        this.notifierTimeOut = builder.notifierTimeOut;
        this.notifierType = builder.notifierType;
        this.notifierUrl = builder.notifierUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmVendor
     */
    public String getAlgorithmVendor() {
        return this.algorithmVendor;
    }

    /**
     * @return batchIndicator
     */
    public Integer getBatchIndicator() {
        return this.batchIndicator;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return monitorType
     */
    public String getMonitorType() {
        return this.monitorType;
    }

    /**
     * @return notifierAppSecret
     */
    public String getNotifierAppSecret() {
        return this.notifierAppSecret;
    }

    /**
     * @return notifierExtendValues
     */
    public String getNotifierExtendValues() {
        return this.notifierExtendValues;
    }

    /**
     * @return notifierTimeOut
     */
    public Integer getNotifierTimeOut() {
        return this.notifierTimeOut;
    }

    /**
     * @return notifierType
     */
    public String getNotifierType() {
        return this.notifierType;
    }

    /**
     * @return notifierUrl
     */
    public String getNotifierUrl() {
        return this.notifierUrl;
    }

    public static final class Builder extends Request.Builder<AddMonitorRequest, Builder> {
        private String algorithmVendor; 
        private Integer batchIndicator; 
        private String corpId; 
        private String description; 
        private String monitorType; 
        private String notifierAppSecret; 
        private String notifierExtendValues; 
        private Integer notifierTimeOut; 
        private String notifierType; 
        private String notifierUrl; 

        private Builder() {
            super();
        } 

        private Builder(AddMonitorRequest response) {
            super(response);
            this.algorithmVendor = response.algorithmVendor;
            this.batchIndicator = response.batchIndicator;
            this.corpId = response.corpId;
            this.description = response.description;
            this.monitorType = response.monitorType;
            this.notifierAppSecret = response.notifierAppSecret;
            this.notifierExtendValues = response.notifierExtendValues;
            this.notifierTimeOut = response.notifierTimeOut;
            this.notifierType = response.notifierType;
            this.notifierUrl = response.notifierUrl;
        } 

        /**
         * AlgorithmVendor.
         */
        public Builder algorithmVendor(String algorithmVendor) {
            this.putBodyParameter("AlgorithmVendor", algorithmVendor);
            this.algorithmVendor = algorithmVendor;
            return this;
        }

        /**
         * BatchIndicator.
         */
        public Builder batchIndicator(Integer batchIndicator) {
            this.putBodyParameter("BatchIndicator", batchIndicator);
            this.batchIndicator = batchIndicator;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MonitorType.
         */
        public Builder monitorType(String monitorType) {
            this.putBodyParameter("MonitorType", monitorType);
            this.monitorType = monitorType;
            return this;
        }

        /**
         * NotifierAppSecret.
         */
        public Builder notifierAppSecret(String notifierAppSecret) {
            this.putBodyParameter("NotifierAppSecret", notifierAppSecret);
            this.notifierAppSecret = notifierAppSecret;
            return this;
        }

        /**
         * NotifierExtendValues.
         */
        public Builder notifierExtendValues(String notifierExtendValues) {
            this.putBodyParameter("NotifierExtendValues", notifierExtendValues);
            this.notifierExtendValues = notifierExtendValues;
            return this;
        }

        /**
         * NotifierTimeOut.
         */
        public Builder notifierTimeOut(Integer notifierTimeOut) {
            this.putBodyParameter("NotifierTimeOut", notifierTimeOut);
            this.notifierTimeOut = notifierTimeOut;
            return this;
        }

        /**
         * NotifierType.
         */
        public Builder notifierType(String notifierType) {
            this.putBodyParameter("NotifierType", notifierType);
            this.notifierType = notifierType;
            return this;
        }

        /**
         * NotifierUrl.
         */
        public Builder notifierUrl(String notifierUrl) {
            this.putBodyParameter("NotifierUrl", notifierUrl);
            this.notifierUrl = notifierUrl;
            return this;
        }

        @Override
        public AddMonitorRequest build() {
            return new AddMonitorRequest(this);
        } 

    } 

}
