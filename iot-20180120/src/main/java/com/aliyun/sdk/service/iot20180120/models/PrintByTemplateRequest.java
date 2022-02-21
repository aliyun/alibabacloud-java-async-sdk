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
    @NameInMap("ProjectCode")
    @Validation(required = true)
    private String projectCode;

    @Body
    @NameInMap("TemplateBizCode")
    @Validation(required = true)
    private String templateBizCode;

    private PrintByTemplateRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.paramsJsonString = builder.paramsJsonString;
        this.productKey = builder.productKey;
        this.projectCode = builder.projectCode;
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
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return templateBizCode
     */
    public String getTemplateBizCode() {
        return this.templateBizCode;
    }

    public static final class Builder extends Request.Builder<PrintByTemplateRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String paramsJsonString; 
        private String productKey; 
        private String projectCode; 
        private String templateBizCode; 

        private Builder() {
            super();
        } 

        private Builder(PrintByTemplateRequest response) {
            super(response);
            this.deviceName = response.deviceName;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.paramsJsonString = response.paramsJsonString;
            this.productKey = response.productKey;
            this.projectCode = response.projectCode;
            this.templateBizCode = response.templateBizCode;
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
         * ProjectCode.
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
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
