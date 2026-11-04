// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link SendPredefinedShortMessageRequest} extends {@link RequestModel}
 *
 * <p>SendPredefinedShortMessageRequest</p>
 */
public class SendPredefinedShortMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateParam")
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

        private Builder(SendPredefinedShortMessageRequest request) {
            super(request);
            this.configId = request.configId;
            this.instanceId = request.instanceId;
            this.phoneNumbers = request.phoneNumbers;
            this.templateParam = request.templateParam;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
