// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevicePropertyRequest} extends {@link RequestModel}
 *
 * <p>CreateDevicePropertyRequest</p>
 */
public class CreateDevicePropertyRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("DeviceFormId")
    @Validation(required = true)
    private String deviceFormId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("PropertyContent")
    @Validation(required = true)
    private String propertyContent;

    @Body
    @NameInMap("PropertyFormat")
    @Validation(required = true)
    private String propertyFormat;

    @Body
    @NameInMap("PropertyKey")
    @Validation(required = true)
    private String propertyKey;

    @Body
    @NameInMap("PropertyName")
    @Validation(required = true)
    private String propertyName;

    private CreateDevicePropertyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.deviceFormId = builder.deviceFormId;
        this.instanceId = builder.instanceId;
        this.propertyContent = builder.propertyContent;
        this.propertyFormat = builder.propertyFormat;
        this.propertyKey = builder.propertyKey;
        this.propertyName = builder.propertyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevicePropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deviceFormId
     */
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return propertyContent
     */
    public String getPropertyContent() {
        return this.propertyContent;
    }

    /**
     * @return propertyFormat
     */
    public String getPropertyFormat() {
        return this.propertyFormat;
    }

    /**
     * @return propertyKey
     */
    public String getPropertyKey() {
        return this.propertyKey;
    }

    /**
     * @return propertyName
     */
    public String getPropertyName() {
        return this.propertyName;
    }

    public static final class Builder extends Request.Builder<CreateDevicePropertyRequest, Builder> {
        private String clientToken; 
        private String deviceFormId; 
        private String instanceId; 
        private String propertyContent; 
        private String propertyFormat; 
        private String propertyKey; 
        private String propertyName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDevicePropertyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.deviceFormId = request.deviceFormId;
            this.instanceId = request.instanceId;
            this.propertyContent = request.propertyContent;
            this.propertyFormat = request.propertyFormat;
            this.propertyKey = request.propertyKey;
            this.propertyName = request.propertyName;
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
         * DeviceFormId.
         */
        public Builder deviceFormId(String deviceFormId) {
            this.putBodyParameter("DeviceFormId", deviceFormId);
            this.deviceFormId = deviceFormId;
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
         * PropertyContent.
         */
        public Builder propertyContent(String propertyContent) {
            this.putBodyParameter("PropertyContent", propertyContent);
            this.propertyContent = propertyContent;
            return this;
        }

        /**
         * PropertyFormat.
         */
        public Builder propertyFormat(String propertyFormat) {
            this.putBodyParameter("PropertyFormat", propertyFormat);
            this.propertyFormat = propertyFormat;
            return this;
        }

        /**
         * PropertyKey.
         */
        public Builder propertyKey(String propertyKey) {
            this.putBodyParameter("PropertyKey", propertyKey);
            this.propertyKey = propertyKey;
            return this;
        }

        /**
         * PropertyName.
         */
        public Builder propertyName(String propertyName) {
            this.putBodyParameter("PropertyName", propertyName);
            this.propertyName = propertyName;
            return this;
        }

        @Override
        public CreateDevicePropertyRequest build() {
            return new CreateDevicePropertyRequest(this);
        } 

    } 

}
