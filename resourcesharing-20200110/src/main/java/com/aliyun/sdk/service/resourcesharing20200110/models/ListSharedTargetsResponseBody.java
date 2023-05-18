// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSharedTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSharedTargetsResponseBody</p>
 */
public class ListSharedTargetsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SharedTargets")
    private java.util.List < SharedTargets> sharedTargets;

    private ListSharedTargetsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.sharedTargets = builder.sharedTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSharedTargetsResponseBody create() {
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
     * @return sharedTargets
     */
    public java.util.List < SharedTargets> getSharedTargets() {
        return this.sharedTargets;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < SharedTargets> sharedTargets; 

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
         * The information of the principals.
         */
        public Builder sharedTargets(java.util.List < SharedTargets> sharedTargets) {
            this.sharedTargets = sharedTargets;
            return this;
        }

        public ListSharedTargetsResponseBody build() {
            return new ListSharedTargetsResponseBody(this);
        } 

    } 

    public static class SharedTargets extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("External")
        private Boolean external;

        @NameInMap("ResourceShareId")
        private String resourceShareId;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("UpdateTime")
        private String updateTime;

        private SharedTargets(Builder builder) {
            this.createTime = builder.createTime;
            this.external = builder.external;
            this.resourceShareId = builder.resourceShareId;
            this.targetId = builder.targetId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharedTargets create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return external
         */
        public Boolean getExternal() {
            return this.external;
        }

        /**
         * @return resourceShareId
         */
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean external; 
            private String resourceShareId; 
            private String targetId; 
            private String updateTime; 

            /**
             * The time when the principal was associated with the resource share.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether the principal is outside the resource directory. Valid values:
             * <p>
             * 
             * *   true: The principal is outside the resource directory.
             * *   false: The principal is in the resource directory.
             */
            public Builder external(Boolean external) {
                this.external = external;
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
             * The ID of the principal or resource owner.
             * <p>
             * 
             * *   If the value of `ResourceOwner` is `Self`, the value of this parameter is the ID of a principal.
             * *   If the value of `ResourceOwner` is `OtherAccounts`, the value of this parameter is the ID of a resource owner.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The time when the association of the principal was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SharedTargets build() {
                return new SharedTargets(this);
            } 

        } 

    }
}
