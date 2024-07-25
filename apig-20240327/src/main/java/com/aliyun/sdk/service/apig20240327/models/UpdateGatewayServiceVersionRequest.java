// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayServiceVersionRequest</p>
 */
public class UpdateGatewayServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
    private String gatewayServiceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List < Labels> labels;

    private UpdateGatewayServiceVersionRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayServiceId = builder.gatewayServiceId;
        this.name = builder.name;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayServiceVersionRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayServiceVersionRequest, Builder> {
        private String gatewayId; 
        private String gatewayServiceId; 
        private String name; 
        private java.util.List < Labels> labels; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayServiceVersionRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayServiceId = request.gatewayServiceId;
            this.name = request.name;
            this.labels = request.labels;
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
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
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

        @Override
        public UpdateGatewayServiceVersionRequest build() {
            return new UpdateGatewayServiceVersionRequest(this);
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
