// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListABMetricGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListABMetricGroupsResponseBody</p>
 */
public class ListABMetricGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ABMetricGroups")
    private java.util.List<ABMetricGroups> ABMetricGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListABMetricGroupsResponseBody(Builder builder) {
        this.ABMetricGroups = builder.ABMetricGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListABMetricGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ABMetricGroups
     */
    public java.util.List<ABMetricGroups> getABMetricGroups() {
        return this.ABMetricGroups;
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
        private java.util.List<ABMetricGroups> ABMetricGroups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * ABMetricGroups.
         */
        public Builder ABMetricGroups(java.util.List<ABMetricGroups> ABMetricGroups) {
            this.ABMetricGroups = ABMetricGroups;
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

        public ListABMetricGroupsResponseBody build() {
            return new ListABMetricGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListABMetricGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListABMetricGroupsResponseBody</p>
     */
    public static class ABMetricGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ABMetricGroupId")
        private String ABMetricGroupId;

        @com.aliyun.core.annotation.NameInMap("ABMetricIds")
        private String ABMetricIds;

        @com.aliyun.core.annotation.NameInMap("ABMetricNames")
        private String ABMetricNames;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Realtime")
        private Boolean realtime;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        private ABMetricGroups(Builder builder) {
            this.ABMetricGroupId = builder.ABMetricGroupId;
            this.ABMetricIds = builder.ABMetricIds;
            this.ABMetricNames = builder.ABMetricNames;
            this.description = builder.description;
            this.name = builder.name;
            this.owner = builder.owner;
            this.realtime = builder.realtime;
            this.sceneId = builder.sceneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ABMetricGroups create() {
            return builder().build();
        }

        /**
         * @return ABMetricGroupId
         */
        public String getABMetricGroupId() {
            return this.ABMetricGroupId;
        }

        /**
         * @return ABMetricIds
         */
        public String getABMetricIds() {
            return this.ABMetricIds;
        }

        /**
         * @return ABMetricNames
         */
        public String getABMetricNames() {
            return this.ABMetricNames;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return realtime
         */
        public Boolean getRealtime() {
            return this.realtime;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        public static final class Builder {
            private String ABMetricGroupId; 
            private String ABMetricIds; 
            private String ABMetricNames; 
            private String description; 
            private String name; 
            private String owner; 
            private Boolean realtime; 
            private String sceneId; 

            /**
             * ABMetricGroupId.
             */
            public Builder ABMetricGroupId(String ABMetricGroupId) {
                this.ABMetricGroupId = ABMetricGroupId;
                return this;
            }

            /**
             * ABMetricIds.
             */
            public Builder ABMetricIds(String ABMetricIds) {
                this.ABMetricIds = ABMetricIds;
                return this;
            }

            /**
             * ABMetricNames.
             */
            public Builder ABMetricNames(String ABMetricNames) {
                this.ABMetricNames = ABMetricNames;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Realtime.
             */
            public Builder realtime(Boolean realtime) {
                this.realtime = realtime;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            public ABMetricGroups build() {
                return new ABMetricGroups(this);
            } 

        } 

    }
}
