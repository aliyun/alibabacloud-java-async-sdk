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
 * {@link DeleteConnectorClientRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnectorClientRequest</p>
 */
public class DeleteConnectorClientRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devTag;

    private DeleteConnectorClientRequest(Builder builder) {
        super(builder);
        this.connectorId = builder.connectorId;
        this.devTag = builder.devTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnectorClientRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteConnectorClientRequest, Builder> {
        private String connectorId; 
        private String devTag; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnectorClientRequest request) {
            super(request);
            this.connectorId = request.connectorId;
            this.devTag = request.devTag;
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
         * <p>E4BD65C4-58F6-5127-AD2F-319CF020F549</p>
         */
        public Builder devTag(String devTag) {
            this.putBodyParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        @Override
        public DeleteConnectorClientRequest build() {
            return new DeleteConnectorClientRequest(this);
        } 

    } 

}
