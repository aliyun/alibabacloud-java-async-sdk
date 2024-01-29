// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadEntityResponseBody} extends {@link TeaModel}
 *
 * <p>UploadEntityResponseBody</p>
 */
public class UploadEntityResponseBody extends TeaModel {
    @NameInMap("EntityType")
    private String entityType;

    @NameInMap("HostId")
    private String hostId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Workspace")
    private String workspace;

    private UploadEntityResponseBody(Builder builder) {
        this.entityType = builder.entityType;
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadEntityResponseBody create() {
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

        public UploadEntityResponseBody build() {
            return new UploadEntityResponseBody(this);
        } 

    } 

}
