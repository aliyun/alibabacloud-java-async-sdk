// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceFormRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceFormRequest</p>
 */
public class CreateDeviceFormRequest extends Request {
    @Body
    @NameInMap("AccountConfig")
    private Boolean accountConfig;

    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("ConfigCompare")
    private Boolean configCompare;

    @Body
    @NameInMap("DetailDisplay")
    private Boolean detailDisplay;

    @Body
    @NameInMap("DeviceFormName")
    @Validation(required = true)
    private String deviceFormName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("RelatedDeviceFormId")
    private String relatedDeviceFormId;

    @Body
    @NameInMap("ResourceUse")
    private String resourceUse;

    @Body
    @NameInMap("Script")
    private String script;

    @Body
    @NameInMap("UniqueKey")
    private String uniqueKey;

    private CreateDeviceFormRequest(Builder builder) {
        super(builder);
        this.accountConfig = builder.accountConfig;
        this.clientToken = builder.clientToken;
        this.configCompare = builder.configCompare;
        this.detailDisplay = builder.detailDisplay;
        this.deviceFormName = builder.deviceFormName;
        this.instanceId = builder.instanceId;
        this.relatedDeviceFormId = builder.relatedDeviceFormId;
        this.resourceUse = builder.resourceUse;
        this.script = builder.script;
        this.uniqueKey = builder.uniqueKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceFormRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountConfig
     */
    public Boolean getAccountConfig() {
        return this.accountConfig;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configCompare
     */
    public Boolean getConfigCompare() {
        return this.configCompare;
    }

    /**
     * @return detailDisplay
     */
    public Boolean getDetailDisplay() {
        return this.detailDisplay;
    }

    /**
     * @return deviceFormName
     */
    public String getDeviceFormName() {
        return this.deviceFormName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return relatedDeviceFormId
     */
    public String getRelatedDeviceFormId() {
        return this.relatedDeviceFormId;
    }

    /**
     * @return resourceUse
     */
    public String getResourceUse() {
        return this.resourceUse;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return uniqueKey
     */
    public String getUniqueKey() {
        return this.uniqueKey;
    }

    public static final class Builder extends Request.Builder<CreateDeviceFormRequest, Builder> {
        private Boolean accountConfig; 
        private String clientToken; 
        private Boolean configCompare; 
        private Boolean detailDisplay; 
        private String deviceFormName; 
        private String instanceId; 
        private String relatedDeviceFormId; 
        private String resourceUse; 
        private String script; 
        private String uniqueKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceFormRequest request) {
            super(request);
            this.accountConfig = request.accountConfig;
            this.clientToken = request.clientToken;
            this.configCompare = request.configCompare;
            this.detailDisplay = request.detailDisplay;
            this.deviceFormName = request.deviceFormName;
            this.instanceId = request.instanceId;
            this.relatedDeviceFormId = request.relatedDeviceFormId;
            this.resourceUse = request.resourceUse;
            this.script = request.script;
            this.uniqueKey = request.uniqueKey;
        } 

        /**
         * 是否需要账号配置
         */
        public Builder accountConfig(Boolean accountConfig) {
            this.putBodyParameter("AccountConfig", accountConfig);
            this.accountConfig = accountConfig;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 是否支持配置生成
         */
        public Builder configCompare(Boolean configCompare) {
            this.putBodyParameter("ConfigCompare", configCompare);
            this.configCompare = configCompare;
            return this;
        }

        /**
         * DetailDisplay.
         */
        public Builder detailDisplay(Boolean detailDisplay) {
            this.putBodyParameter("DetailDisplay", detailDisplay);
            this.detailDisplay = detailDisplay;
            return this;
        }

        /**
         * 设备形态名称
         */
        public Builder deviceFormName(String deviceFormName) {
            this.putBodyParameter("DeviceFormName", deviceFormName);
            this.deviceFormName = deviceFormName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RelatedDeviceFormId.
         */
        public Builder relatedDeviceFormId(String relatedDeviceFormId) {
            this.putBodyParameter("RelatedDeviceFormId", relatedDeviceFormId);
            this.relatedDeviceFormId = relatedDeviceFormId;
            return this;
        }

        /**
         * ResourceUse.
         */
        public Builder resourceUse(String resourceUse) {
            this.putBodyParameter("ResourceUse", resourceUse);
            this.resourceUse = resourceUse;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.putBodyParameter("Script", script);
            this.script = script;
            return this;
        }

        /**
         * UniqueKey.
         */
        public Builder uniqueKey(String uniqueKey) {
            this.putBodyParameter("UniqueKey", uniqueKey);
            this.uniqueKey = uniqueKey;
            return this;
        }

        @Override
        public CreateDeviceFormRequest build() {
            return new CreateDeviceFormRequest(this);
        } 

    } 

}
