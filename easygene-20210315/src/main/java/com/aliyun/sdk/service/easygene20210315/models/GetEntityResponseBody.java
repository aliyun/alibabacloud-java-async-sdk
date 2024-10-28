// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetEntityResponseBody</p>
 */
public class GetEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.List < String > attributes;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private GetEntityResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.entityType = builder.entityType;
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.List < String > getAttributes() {
        return this.attributes;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private java.util.List < String > attributes; 
        private String entityType; 
        private String hostId; 
        private String requestId; 
        private Integer totalCount; 
        private String workspace; 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.List < String > attributes) {
            this.attributes = attributes;
            return this;
        }

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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetEntityResponseBody build() {
            return new GetEntityResponseBody(this);
        } 

    } 

}
