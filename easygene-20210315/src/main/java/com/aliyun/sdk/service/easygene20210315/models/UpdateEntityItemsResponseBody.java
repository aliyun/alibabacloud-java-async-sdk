// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateEntityItemsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEntityItemsResponseBody</p>
 */
public class UpdateEntityItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private UpdateEntityItemsResponseBody(Builder builder) {
        this.entityType = builder.entityType;
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEntityItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String entityType; 
        private String hostId; 
        private String requestId; 
        private String workspace; 

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public UpdateEntityItemsResponseBody build() {
            return new UpdateEntityItemsResponseBody(this);
        } 

    } 

}
