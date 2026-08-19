// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateConnectorClientRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnectorClientRequest</p>
 */
public class UpdateConnectorClientRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateConnectorClientRequest(Builder builder) {
        super(builder);
        this.connectorId = builder.connectorId;
        this.devTag = builder.devTag;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectorClientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateConnectorClientRequest, Builder> {
        private String connectorId; 
        private String devTag; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnectorClientRequest request) {
            super(request);
            this.connectorId = request.connectorId;
            this.devTag = request.devTag;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-94db94e06b98****</p>
         */
        public Builder connectorId(String connectorId) {
            this.putBodyParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>672ECBEE-727B-5F43-8D22-90F2BD9E38A7</p>
         */
        public Builder devTag(String devTag) {
            this.putBodyParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateConnectorClientRequest build() {
            return new UpdateConnectorClientRequest(this);
        } 

    } 

}
