// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowEntitySnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowEntitySnapshotResponseBody</p>
 */
public class DescribeFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("Active")
    private Boolean active;

    @NameInMap("CommitterId")
    private String committerId;

    @NameInMap("Data")
    private String data;

    @NameInMap("EntityGroupId")
    private String entityGroupId;

    @NameInMap("EntityId")
    private String entityId;

    @NameInMap("EntityType")
    private String entityType;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Revision")
    private String revision;

    @NameInMap("UserId")
    private String userId;

    private DescribeFlowEntitySnapshotResponseBody(Builder builder) {
        this.active = builder.active;
        this.committerId = builder.committerId;
        this.data = builder.data;
        this.entityGroupId = builder.entityGroupId;
        this.entityId = builder.entityId;
        this.entityType = builder.entityType;
        this.gmtCreate = builder.gmtCreate;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.revision = builder.revision;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowEntitySnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return committerId
     */
    public String getCommitterId() {
        return this.committerId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return entityGroupId
     */
    public String getEntityGroupId() {
        return this.entityGroupId;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revision
     */
    public String getRevision() {
        return this.revision;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Boolean active; 
        private String committerId; 
        private String data; 
        private String entityGroupId; 
        private String entityId; 
        private String entityType; 
        private Long gmtCreate; 
        private String message; 
        private String requestId; 
        private String revision; 
        private String userId; 

        /**
         * Active.
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * CommitterId.
         */
        public Builder committerId(String committerId) {
            this.committerId = committerId;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * EntityGroupId.
         */
        public Builder entityGroupId(String entityGroupId) {
            this.entityGroupId = entityGroupId;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
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
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Revision.
         */
        public Builder revision(String revision) {
            this.revision = revision;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public DescribeFlowEntitySnapshotResponseBody build() {
            return new DescribeFlowEntitySnapshotResponseBody(this);
        } 

    } 

}
