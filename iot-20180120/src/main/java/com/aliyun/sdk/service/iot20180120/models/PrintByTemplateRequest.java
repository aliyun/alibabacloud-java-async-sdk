// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrintByTemplateRequest} extends {@link RequestModel}
 *
 * <p>PrintByTemplateRequest</p>
 */
public class PrintByTemplateRequest extends Request {
    @Body
    @NameInMap("DeviceName")
    private String deviceName;

    @Body
    @NameInMap("HistoryPrintTopic")
    private Boolean historyPrintTopic;

    @Body
    @NameInMap("IotId")
    private String iotId;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ParamsJsonString")
    private String paramsJsonString;

    @Body
    @NameInMap("ProductKey")
    private String productKey;

    @Body
    @NameInMap("TemplateBizCode")
    @Validation(required = true)
    private String templateBizCode;

    private PrintByTemplateRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.historyPrintTopic = builder.historyPrintTopic;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.paramsJsonString = builder.paramsJsonString;
        this.productKey = builder.productKey;
        this.templateBizCode = builder.templateBizCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrintByTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return historyPrintTopic
     */
    public Boolean getHistoryPrintTopic() {
        return this.historyPrintTopic;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return paramsJsonString
     */
    public String getParamsJsonString() {
        return this.paramsJsonString;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return templateBizCode
     */
    public String getTemplateBizCode() {
        return this.templateBizCode;
    }

    public static final class Builder extends Request.Builder<PrintByTemplateRequest, Builder> {
        private String deviceName; 
        private Boolean historyPrintTopic; 
        private String iotId; 
        private String iotInstanceId; 
        private String paramsJsonString; 
        private String productKey; 
        private String templateBizCode; 

        private Builder() {
            super();
        } 

        private Builder(PrintByTemplateRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.historyPrintTopic = request.historyPrintTopic;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.paramsJsonString = request.paramsJsonString;
            this.productKey = request.productKey;
            this.templateBizCode = request.templateBizCode;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * HistoryPrintTopic.
         */
        public Builder historyPrintTopic(Boolean historyPrintTopic) {
            this.putBodyParameter("HistoryPrintTopic", historyPrintTopic);
            this.historyPrintTopic = historyPrintTopic;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putBodyParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ParamsJsonString.
         */
        public Builder paramsJsonString(String paramsJsonString) {
            this.putBodyParameter("ParamsJsonString", paramsJsonString);
            this.paramsJsonString = paramsJsonString;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * TemplateBizCode.
         */
        public Builder templateBizCode(String templateBizCode) {
            this.putBodyParameter("TemplateBizCode", templateBizCode);
            this.templateBizCode = templateBizCode;
            return this;
        }

        @Override
        public PrintByTemplateRequest build() {
            return new PrintByTemplateRequest(this);
        } 

    } 

}
