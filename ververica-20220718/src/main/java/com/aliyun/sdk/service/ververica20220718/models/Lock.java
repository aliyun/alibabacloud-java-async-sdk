// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Lock} extends {@link TeaModel}
 *
 * <p>Lock</p>
 */
public class Lock extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("holderId")
    private String holderId;

    @com.aliyun.core.annotation.NameInMap("holderName")
    private String holderName;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private Lock(Builder builder) {
        this.holderId = builder.holderId;
        this.holderName = builder.holderName;
        this.id = builder.id;
        this.namespace = builder.namespace;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Lock create() {
        return builder().build();
    }

    /**
     * @return holderId
     */
    public String getHolderId() {
        return this.holderId;
    }

    /**
     * @return holderName
     */
    public String getHolderName() {
        return this.holderName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String holderId; 
        private String holderName; 
        private String id; 
        private String namespace; 
        private String workspace; 

        /**
         * holderId.
         */
        public Builder holderId(String holderId) {
            this.holderId = holderId;
            return this;
        }

        /**
         * holderName.
         */
        public Builder holderName(String holderName) {
            this.holderName = holderName;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public Lock build() {
            return new Lock(this);
        } 

    } 

}
