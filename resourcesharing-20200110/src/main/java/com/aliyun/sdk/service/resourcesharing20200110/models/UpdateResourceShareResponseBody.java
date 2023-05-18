// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceShareResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourceShareResponseBody</p>
 */
public class UpdateResourceShareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceShare")
    private ResourceShare resourceShare;

    private UpdateResourceShareResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceShare = builder.resourceShare;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceShareResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceShare
     */
    public ResourceShare getResourceShare() {
        return this.resourceShare;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceShare resourceShare; 

        /**
         * The time when the resource share was updated.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the resource share.
         */
        public Builder resourceShare(ResourceShare resourceShare) {
            this.resourceShare = resourceShare;
            return this;
        }

        public UpdateResourceShareResponseBody build() {
            return new UpdateResourceShareResponseBody(this);
        } 

    } 

    public static class ResourceShare extends TeaModel {
        @NameInMap("AllowExternalTargets")
        private Boolean allowExternalTargets;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ResourceShareId")
        private String resourceShareId;

        @NameInMap("ResourceShareName")
        private String resourceShareName;

        @NameInMap("ResourceShareOwner")
        private String resourceShareOwner;

        @NameInMap("ResourceShareStatus")
        private String resourceShareStatus;

        @NameInMap("UpdateTime")
        private String updateTime;

        private ResourceShare(Builder builder) {
            this.allowExternalTargets = builder.allowExternalTargets;
            this.createTime = builder.createTime;
            this.resourceShareId = builder.resourceShareId;
            this.resourceShareName = builder.resourceShareName;
            this.resourceShareOwner = builder.resourceShareOwner;
            this.resourceShareStatus = builder.resourceShareStatus;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceShare create() {
            return builder().build();
        }

        /**
         * @return allowExternalTargets
         */
        public Boolean getAllowExternalTargets() {
            return this.allowExternalTargets;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return resourceShareId
         */
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        /**
         * @return resourceShareName
         */
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        /**
         * @return resourceShareOwner
         */
        public String getResourceShareOwner() {
            return this.resourceShareOwner;
        }

        /**
         * @return resourceShareStatus
         */
        public String getResourceShareStatus() {
            return this.resourceShareStatus;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Boolean allowExternalTargets; 
            private String createTime; 
            private String resourceShareId; 
            private String resourceShareName; 
            private String resourceShareOwner; 
            private String resourceShareStatus; 
            private String updateTime; 

            /**
             * AllowExternalTargets.
             */
            public Builder allowExternalTargets(Boolean allowExternalTargets) {
                this.allowExternalTargets = allowExternalTargets;
                return this;
            }

            /**
             * The status of the resource share. Valid values:
             * <p>
             * 
             * *   Active: The resource share is enabled.
             * *   Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.
             * *   Deleting: The resource share is being deleted.
             * *   Deleted: The resource share is deleted.
             * 
             * >  The system deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:
             * <p>
             * 
             * *   false: Resources in the resource share can be shared only with accounts in the resource directory.
             * *   true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * The time when the resource share was created.
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * The ID of the resource share.
             */
            public Builder resourceShareOwner(String resourceShareOwner) {
                this.resourceShareOwner = resourceShareOwner;
                return this;
            }

            /**
             * ResourceShareStatus.
             */
            public Builder resourceShareStatus(String resourceShareStatus) {
                this.resourceShareStatus = resourceShareStatus;
                return this;
            }

            /**
             * The owner of the resource share.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResourceShare build() {
                return new ResourceShare(this);
            } 

        } 

    }
}
