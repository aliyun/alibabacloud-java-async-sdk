// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayServiceVersionRequest</p>
 */
public class CreateGatewayServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
    private String gatewayServiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List < Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private CreateGatewayServiceVersionRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayServiceId = builder.gatewayServiceId;
        this.labels = builder.labels;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayServiceVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayServiceId
     */
    public String getGatewayServiceId() {
        return this.gatewayServiceId;
    }

    /**
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateGatewayServiceVersionRequest, Builder> {
        private String gatewayId; 
        private String gatewayServiceId; 
        private java.util.List < Labels> labels; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayServiceVersionRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayServiceId = request.gatewayServiceId;
            this.labels = request.labels;
            this.name = request.name;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * gatewayServiceId.
         */
        public Builder gatewayServiceId(String gatewayServiceId) {
            this.putPathParameter("gatewayServiceId", gatewayServiceId);
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.putBodyParameter("labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateGatewayServiceVersionRequest build() {
            return new CreateGatewayServiceVersionRequest(this);
        } 

    } 

    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
