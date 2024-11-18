// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateResourceShareResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceShareResponseBody</p>
 */
public class CreateResourceShareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceShare")
    private ResourceShare resourceShare;

    private CreateResourceShareResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceShare = builder.resourceShare;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceShareResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C3FA051-61DC-4F3E-81E9-E4830524DF4B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resource share.</p>
         */
        public Builder resourceShare(ResourceShare resourceShare) {
            this.resourceShare = resourceShare;
            return this;
        }

        public CreateResourceShareResponseBody build() {
            return new CreateResourceShareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceShareResponseBody} extends {@link TeaModel}
     *
     * <p>CreateResourceShareResponseBody</p>
     */
    public static class ResourceShare extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowExternalTargets")
        private Boolean allowExternalTargets;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ResourceShareId")
        private String resourceShareId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareName")
        private String resourceShareName;

        @com.aliyun.core.annotation.NameInMap("ResourceShareOwner")
        private String resourceShareOwner;

        @com.aliyun.core.annotation.NameInMap("ResourceShareStatus")
        private String resourceShareStatus;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>Indicates whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
             * <ul>
             * <li>false: Resources in the resource share can be shared only with accounts in the resource directory.</li>
             * <li>true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowExternalTargets(Boolean allowExternalTargets) {
                this.allowExternalTargets = allowExternalTargets;
                return this;
            }

            /**
             * <p>The time when the resource share was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-03T08:02:22.413Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>rs-qSkW1HBY****</p>
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * <p>The name of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * <p>The owner of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>151266687691****</p>
             */
            public Builder resourceShareOwner(String resourceShareOwner) {
                this.resourceShareOwner = resourceShareOwner;
                return this;
            }

            /**
             * <p>The status of the resource share. Valid values:</p>
             * <ul>
             * <li>Active: The resource share is enabled.</li>
             * <li>Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.</li>
             * <li>Deleting: The resource share is being deleted.</li>
             * <li>Deleted: The resource share is deleted.</li>
             * </ul>
             * <blockquote>
             * <p> The system automatically deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder resourceShareStatus(String resourceShareStatus) {
                this.resourceShareStatus = resourceShareStatus;
                return this;
            }

            /**
             * <p>The time when the resource share was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-03T08:02:22.413Z</p>
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
