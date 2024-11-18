// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSharedTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSharedTargetsResponseBody</p>
 */
public class ListSharedTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SharedTargets")
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04677DCA-7C33-464B-8811-1B1DA3C3D197</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the principals.</p>
         */
        public Builder sharedTargets(java.util.List < SharedTargets> sharedTargets) {
            this.sharedTargets = sharedTargets;
            return this;
        }

        public ListSharedTargetsResponseBody build() {
            return new ListSharedTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSharedTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSharedTargetsResponseBody</p>
     */
    public static class SharedTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("External")
        private Boolean external;

        @com.aliyun.core.annotation.NameInMap("ResourceShareId")
        private String resourceShareId;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetProperty")
        private String targetProperty;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private SharedTargets(Builder builder) {
            this.createTime = builder.createTime;
            this.external = builder.external;
            this.resourceShareId = builder.resourceShareId;
            this.targetId = builder.targetId;
            this.targetProperty = builder.targetProperty;
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
         * @return targetProperty
         */
        public String getTargetProperty() {
            return this.targetProperty;
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
            private String targetProperty; 
            private String updateTime; 

            /**
             * <p>The time when the principal was associated with the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-07T09:16:59.905Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the principal is outside the resource directory. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder external(Boolean external) {
                this.external = external;
                return this;
            }

            /**
             * <p>The ID of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>rs-6GRmdD3X****</p>
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * <p>The ID of the principal or resource owner.</p>
             * <ul>
             * <li>If the value of <code>ResourceOwner</code> is <code>Self</code>, the value of this parameter is the ID of a principal.</li>
             * <li>If the value of <code>ResourceOwner</code> is <code>OtherAccounts</code>, the value of this parameter is the ID of a resource owner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>114240524784****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The properties of the principal, such as the time range within which the resource is shared.</p>
             * <blockquote>
             * <p> This parameter is returned only if the principal is an Alibaba Cloud service.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;timeRange&quot;:{
             *         &quot;timeRangeType&quot;:&quot;timeRange&quot;,
             *         &quot;beginAtTime&quot;:&quot;00:00&quot;,
             *         &quot;timezone&quot;:&quot;UTC+8&quot;,
             *         &quot;endAtTime&quot;:&quot;19:59&quot;
             *     }
             * }</p>
             */
            public Builder targetProperty(String targetProperty) {
                this.targetProperty = targetProperty;
                return this;
            }

            /**
             * <p>The time when the association of the principal was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-07T09:16:59.905Z</p>
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
