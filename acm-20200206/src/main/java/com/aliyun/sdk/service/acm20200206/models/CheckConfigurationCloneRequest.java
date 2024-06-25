// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckConfigurationCloneRequest} extends {@link RequestModel}
 *
 * <p>CheckConfigurationCloneRequest</p>
 */
public class CheckConfigurationCloneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamespaceFrom")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamespaceTo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceTo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    private CheckConfigurationCloneRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.namespaceFrom = builder.namespaceFrom;
        this.namespaceTo = builder.namespaceTo;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckConfigurationCloneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return namespaceFrom
     */
    public String getNamespaceFrom() {
        return this.namespaceFrom;
    }

    /**
     * @return namespaceTo
     */
    public String getNamespaceTo() {
        return this.namespaceTo;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    public static final class Builder extends Request.Builder<CheckConfigurationCloneRequest, Builder> {
        private String data; 
        private String namespaceFrom; 
        private String namespaceTo; 
        private String policy; 

        private Builder() {
            super();
        } 

        private Builder(CheckConfigurationCloneRequest request) {
            super(request);
            this.data = request.data;
            this.namespaceFrom = request.namespaceFrom;
            this.namespaceTo = request.namespaceTo;
            this.policy = request.policy;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * NamespaceFrom.
         */
        public Builder namespaceFrom(String namespaceFrom) {
            this.putBodyParameter("NamespaceFrom", namespaceFrom);
            this.namespaceFrom = namespaceFrom;
            return this;
        }

        /**
         * NamespaceTo.
         */
        public Builder namespaceTo(String namespaceTo) {
            this.putBodyParameter("NamespaceTo", namespaceTo);
            this.namespaceTo = namespaceTo;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        @Override
        public CheckConfigurationCloneRequest build() {
            return new CheckConfigurationCloneRequest(this);
        } 

    } 

}
