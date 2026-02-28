// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link PrintByTemplateRequest} extends {@link RequestModel}
 *
 * <p>PrintByTemplateRequest</p>
 */
public class PrintByTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HistoryPrintTopic")
    private Boolean historyPrintTopic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParamsJsonString")
    private String paramsJsonString;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateBizCode")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
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
         * <p>The device ID.</p>
         * <blockquote>
         * <p>If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. <strong>IotId</strong> specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        public Builder iotId(String iotId) {
            this.putBodyParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The template parameters. You can obtain the template of receipts in the Letter Sending Service console, and configure parameters in the template to create a custom receipt that you want to print.</p>
         */
        public Builder paramsJsonString(String paramsJsonString) {
            this.putBodyParameter("ParamsJsonString", paramsJsonString);
            this.paramsJsonString = paramsJsonString;
            return this;
        }

        /**
         * <p>The unique identifier of the product to which the device belongs.</p>
         * <blockquote>
         * <p>If you specify the <strong>ProductKey</strong> parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The template identifier. You can obtain the template identifier in the Letter Sending Service console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
