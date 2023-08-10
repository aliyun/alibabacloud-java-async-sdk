// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceSharesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceSharesResponseBody</p>
 */
public class ListResourceSharesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceShares")
    private java.util.List < ResourceShares> resourceShares;

    private ListResourceSharesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceShares = builder.resourceShares;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceSharesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceShares
     */
    public java.util.List < ResourceShares> getResourceShares() {
        return this.resourceShares;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceShares> resourceShares; 

        /**
         * The `token` that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the resource shares.
         */
        public Builder resourceShares(java.util.List < ResourceShares> resourceShares) {
            this.resourceShares = resourceShares;
            return this;
        }

        public ListResourceSharesResponseBody build() {
            return new ListResourceSharesResponseBody(this);
        } 

    } 

    public static class ResourceShares extends TeaModel {
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

        private ResourceShares(Builder builder) {
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

        public static ResourceShares create() {
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
             * Indicates whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:
             * <p>
             * 
             * *   false: Resources in the resource share can be shared only with accounts in the resource directory.
             * *   true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.
             */
            public Builder allowExternalTargets(Boolean allowExternalTargets) {
                this.allowExternalTargets = allowExternalTargets;
                return this;
            }

            /**
             * The time when the resource share was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the resource share.
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * The name of the resource share.
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * The owner of the resource share.
             */
            public Builder resourceShareOwner(String resourceShareOwner) {
                this.resourceShareOwner = resourceShareOwner;
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
            public Builder resourceShareStatus(String resourceShareStatus) {
                this.resourceShareStatus = resourceShareStatus;
                return this;
            }

            /**
             * The time when the resource share was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResourceShares build() {
                return new ResourceShares(this);
            } 

        } 

    }
}
