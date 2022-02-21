// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendPredefinedShortMessageRequest} extends {@link RequestModel}
 *
 * <p>SendPredefinedShortMessageRequest</p>
 */
public class SendPredefinedShortMessageRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    @Validation(required = true)
    private Long configId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhoneNumbers")
    @Validation(required = true)
    private String phoneNumbers;

    @Query
    @NameInMap("TemplateParam")
    private String templateParam;

    private SendPredefinedShortMessageRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.instanceId = builder.instanceId;
        this.phoneNumbers = builder.phoneNumbers;
        this.templateParam = builder.templateParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendPredefinedShortMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNumbers
     */
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * @return templateParam
     */
    public String getTemplateParam() {
        return this.templateParam;
    }

    public static final class Builder extends Request.Builder<SendPredefinedShortMessageRequest, Builder> {
        private Long configId; 
        private String instanceId; 
        private String phoneNumbers; 
        private String templateParam; 

        private Builder() {
            super();
        } 

        private Builder(SendPredefinedShortMessageRequest response) {
            super(response);
            this.configId = response.configId;
            this.instanceId = response.instanceId;
            this.phoneNumbers = response.phoneNumbers;
            this.templateParam = response.templateParam;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
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
         * PhoneNumbers.
         */
        public Builder phoneNumbers(String phoneNumbers) {
            this.putQueryParameter("PhoneNumbers", phoneNumbers);
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * TemplateParam.
         */
        public Builder templateParam(String templateParam) {
            this.putQueryParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        @Override
        public SendPredefinedShortMessageRequest build() {
            return new SendPredefinedShortMessageRequest(this);
        } 

    } 

}
