// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetMqttTicketRequest} extends {@link RequestModel}
 *
 * <p>GetMqttTicketRequest</p>
 */
public class GetMqttTicketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientOS;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private GetMqttTicketRequest(Builder builder) {
        super(builder);
        this.clientOS = builder.clientOS;
        this.clientType = builder.clientType;
        this.clientVersion = builder.clientVersion;
        this.properties = builder.properties;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMqttTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientOS
     */
    public String getClientOS() {
        return this.clientOS;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetMqttTicketRequest, Builder> {
        private String clientOS; 
        private Integer clientType; 
        private String clientVersion; 
        private java.util.Map<String, ?> properties; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetMqttTicketRequest request) {
            super(request);
            this.clientOS = request.clientOS;
            this.clientType = request.clientType;
            this.clientVersion = request.clientVersion;
            this.properties = request.properties;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The client operating system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows 10</p>
         */
        public Builder clientOS(String clientOS) {
            this.putBodyParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The client type. Valid values: 0: hardware terminal; 1: Windows software terminal; 2: macOS software terminal; 3: iOS client; 4: Android client; 5: web client; 6: tenant console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The client version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putBodyParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The extended properties of the client, represented as a JSON object where both keys and values are strings. Example: <code>{&quot;a&quot;:&quot;1&quot;,&quot;b&quot;:&quot;2&quot;}</code>. If this parameter is not specified, it is processed as an empty property set.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;:&quot;1&quot;,&quot;b&quot;:&quot;2&quot;}</p>
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            String propertiesShrink = shrink(properties, "Properties", "json");
            this.putBodyParameter("Properties", propertiesShrink);
            this.properties = properties;
            return this;
        }

        /**
         * <p>The device UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetMqttTicketRequest build() {
            return new GetMqttTicketRequest(this);
        } 

    } 

}
