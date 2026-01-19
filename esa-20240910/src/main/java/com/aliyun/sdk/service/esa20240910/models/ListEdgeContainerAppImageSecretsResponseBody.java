// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListEdgeContainerAppImageSecretsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEdgeContainerAppImageSecretsResponseBody</p>
 */
public class ListEdgeContainerAppImageSecretsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageSecretList")
    private java.util.List<ImageSecretList> imageSecretList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEdgeContainerAppImageSecretsResponseBody(Builder builder) {
        this.imageSecretList = builder.imageSecretList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeContainerAppImageSecretsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageSecretList
     */
    public java.util.List<ImageSecretList> getImageSecretList() {
        return this.imageSecretList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ImageSecretList> imageSecretList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListEdgeContainerAppImageSecretsResponseBody model) {
            this.imageSecretList = model.imageSecretList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of image secrets.</p>
         */
        public Builder imageSecretList(java.util.List<ImageSecretList> imageSecretList) {
            this.imageSecretList = imageSecretList;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3558df77-8a7a-4060-a900-2d7949403836</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEdgeContainerAppImageSecretsResponseBody build() {
            return new ListEdgeContainerAppImageSecretsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEdgeContainerAppImageSecretsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeContainerAppImageSecretsResponseBody</p>
     */
    public static class ImageSecretList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Registry")
        private String registry;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private ImageSecretList(Builder builder) {
            this.name = builder.name;
            this.registry = builder.registry;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageSecretList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return registry
         */
        public String getRegistry() {
            return this.registry;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String name; 
            private String registry; 
            private String username; 

            private Builder() {
            } 

            private Builder(ImageSecretList model) {
                this.name = model.name;
                this.registry = model.registry;
                this.username = model.username;
            } 

            /**
             * <p>Name of the image secret.</p>
             * 
             * <strong>example:</strong>
             * <p>reg-123****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Registry address.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder registry(String registry) {
                this.registry = registry;
                return this;
            }

            /**
             * <p>Username for the image repository</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public ImageSecretList build() {
                return new ImageSecretList(this);
            } 

        } 

    }
}
