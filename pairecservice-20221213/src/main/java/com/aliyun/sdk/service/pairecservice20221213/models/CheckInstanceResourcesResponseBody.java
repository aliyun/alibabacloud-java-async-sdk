// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CheckInstanceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>CheckInstanceResourcesResponseBody</p>
 */
public class CheckInstanceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    private CheckInstanceResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Resources> resources; 

        private Builder() {
        } 

        private Builder(CheckInstanceResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9763624B-5FBB-5E3A-9193-B1ADB554CEAE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        public CheckInstanceResourcesResponseBody build() {
            return new CheckInstanceResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckInstanceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>CheckInstanceResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Resources(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String status; 
            private String type; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.status = model.status;
                this.type = model.type;
                this.uri = model.uri;
            } 

            /**
             * <p>The access status. Valid values:</p>
             * <ul>
             * <li><p>Success</p>
             * </li>
             * <li><p>Failure</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li><p>Hologres</p>
             * </li>
             * <li><p>EAS</p>
             * </li>
             * <li><p>BE</p>
             * </li>
             * <li><p>Rec</p>
             * </li>
             * <li><p>Platform</p>
             * </li>
             * <li><p>SLS</p>
             * </li>
             * <li><p>DataHub</p>
             * </li>
             * <li><p>Kafka</p>
             * </li>
             * <li><p>Flinkvvp</p>
             * </li>
             * <li><p>ACR</p>
             * </li>
             * <li><p>OSS</p>
             * </li>
             * <li><p>DataWorks</p>
             * </li>
             * <li><p>PAI</p>
             * </li>
             * <li><p>MaxCompute</p>
             * </li>
             * <li><p>GraphCompute</p>
             * </li>
             * <li><p>Redis</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The resource URI.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-test-123</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
