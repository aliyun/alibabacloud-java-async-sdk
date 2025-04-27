// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ValidateTransferableNodesRequest} extends {@link RequestModel}
 *
 * <p>ValidateTransferableNodesRequest</p>
 */
public class ValidateTransferableNodesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<ValidateTransferableNodesRequestBody> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeType;

    private ValidateTransferableNodesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.nodeType = builder.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTransferableNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return body
     */
    public java.util.List<ValidateTransferableNodesRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    public static final class Builder extends Request.Builder<ValidateTransferableNodesRequest, Builder> {
        private String instanceId; 
        private java.util.List<ValidateTransferableNodesRequestBody> body; 
        private String nodeType; 

        private Builder() {
            super();
        } 

        private Builder(ValidateTransferableNodesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.nodeType = request.nodeType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q9o8r0008****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List<ValidateTransferableNodesRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        @Override
        public ValidateTransferableNodesRequest build() {
            return new ValidateTransferableNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ValidateTransferableNodesRequest} extends {@link TeaModel}
     *
     * <p>ValidateTransferableNodesRequest</p>
     */
    public static class ValidateTransferableNodesRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private ValidateTransferableNodesRequestBody(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidateTransferableNodesRequestBody create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String host; 
            private Integer port; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ValidateTransferableNodesRequestBody model) {
                this.host = model.host;
                this.port = model.port;
                this.zoneId = model.zoneId;
            } 

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ValidateTransferableNodesRequestBody build() {
                return new ValidateTransferableNodesRequestBody(this);
            } 

        } 

    }
}
