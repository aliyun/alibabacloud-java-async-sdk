// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceVersionRequest</p>
 */
public class CreateServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("labels")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateServiceVersionRequest(Builder builder) {
        super(builder);
        this.serviceId = builder.serviceId;
        this.labels = builder.labels;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateServiceVersionRequest, Builder> {
        private String serviceId; 
        private java.util.List<Labels> labels; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceVersionRequest request) {
            super(request);
            this.serviceId = request.serviceId;
            this.labels = request.labels;
            this.name = request.name;
        } 

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gs-cpvj7dtlh******</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service tags.</p>
         * <p>This parameter is required.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The version name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateServiceVersionRequest build() {
            return new CreateServiceVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceVersionRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceVersionRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>topology.kubernetes.io/zone</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
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
