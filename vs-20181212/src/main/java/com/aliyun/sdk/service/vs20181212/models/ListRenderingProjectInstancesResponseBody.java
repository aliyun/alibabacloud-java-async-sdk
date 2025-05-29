// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRenderingProjectInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRenderingProjectInstancesResponseBody</p>
 */
public class ListRenderingProjectInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RenderingInstances")
    private java.util.List<RenderingInstances> renderingInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRenderingProjectInstancesResponseBody(Builder builder) {
        this.renderingInstances = builder.renderingInstances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingProjectInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return renderingInstances
     */
    public java.util.List<RenderingInstances> getRenderingInstances() {
        return this.renderingInstances;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<RenderingInstances> renderingInstances; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRenderingProjectInstancesResponseBody model) {
            this.renderingInstances = model.renderingInstances;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * RenderingInstances.
         */
        public Builder renderingInstances(java.util.List<RenderingInstances> renderingInstances) {
            this.renderingInstances = renderingInstances;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRenderingProjectInstancesResponseBody build() {
            return new ListRenderingProjectInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRenderingProjectInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingProjectInstancesResponseBody</p>
     */
    public static class StateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private StateInfo(Builder builder) {
            this.comment = builder.comment;
            this.state = builder.state;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateInfo create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String comment; 
            private String state; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(StateInfo model) {
                this.comment = model.comment;
                this.state = model.state;
                this.updateTime = model.updateTime;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public StateInfo build() {
                return new StateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRenderingProjectInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingProjectInstancesResponseBody</p>
     */
    public static class RenderingInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationTime")
        private String associationTime;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        @com.aliyun.core.annotation.NameInMap("StateInfo")
        private StateInfo stateInfo;

        private RenderingInstances(Builder builder) {
            this.associationTime = builder.associationTime;
            this.renderingInstanceId = builder.renderingInstanceId;
            this.stateInfo = builder.stateInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderingInstances create() {
            return builder().build();
        }

        /**
         * @return associationTime
         */
        public String getAssociationTime() {
            return this.associationTime;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        /**
         * @return stateInfo
         */
        public StateInfo getStateInfo() {
            return this.stateInfo;
        }

        public static final class Builder {
            private String associationTime; 
            private String renderingInstanceId; 
            private StateInfo stateInfo; 

            private Builder() {
            } 

            private Builder(RenderingInstances model) {
                this.associationTime = model.associationTime;
                this.renderingInstanceId = model.renderingInstanceId;
                this.stateInfo = model.stateInfo;
            } 

            /**
             * AssociationTime.
             */
            public Builder associationTime(String associationTime) {
                this.associationTime = associationTime;
                return this;
            }

            /**
             * RenderingInstanceId.
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            /**
             * StateInfo.
             */
            public Builder stateInfo(StateInfo stateInfo) {
                this.stateInfo = stateInfo;
                return this;
            }

            public RenderingInstances build() {
                return new RenderingInstances(this);
            } 

        } 

    }
}
