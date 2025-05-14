// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListFeatureEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureEntitiesResponseBody</p>
 */
public class ListFeatureEntitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureEntities")
    private java.util.List<FeatureEntities> featureEntities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListFeatureEntitiesResponseBody(Builder builder) {
        this.featureEntities = builder.featureEntities;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureEntitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureEntities
     */
    public java.util.List<FeatureEntities> getFeatureEntities() {
        return this.featureEntities;
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

    public static final class Builder {
        private java.util.List<FeatureEntities> featureEntities; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListFeatureEntitiesResponseBody model) {
            this.featureEntities = model.featureEntities;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * FeatureEntities.
         */
        public Builder featureEntities(java.util.List<FeatureEntities> featureEntities) {
            this.featureEntities = featureEntities;
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

        public ListFeatureEntitiesResponseBody build() {
            return new ListFeatureEntitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFeatureEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFeatureEntitiesResponseBody</p>
     */
    public static class FeatureEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureEntityId")
        private String featureEntityId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("JoinId")
        private String joinId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private FeatureEntities(Builder builder) {
            this.featureEntityId = builder.featureEntityId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.joinId = builder.joinId;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureEntities create() {
            return builder().build();
        }

        /**
         * @return featureEntityId
         */
        public String getFeatureEntityId() {
            return this.featureEntityId;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return joinId
         */
        public String getJoinId() {
            return this.joinId;
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
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String featureEntityId; 
            private String gmtCreateTime; 
            private String joinId; 
            private String name; 
            private String owner; 
            private String projectId; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(FeatureEntities model) {
                this.featureEntityId = model.featureEntityId;
                this.gmtCreateTime = model.gmtCreateTime;
                this.joinId = model.joinId;
                this.name = model.name;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
            } 

            /**
             * FeatureEntityId.
             */
            public Builder featureEntityId(String featureEntityId) {
                this.featureEntityId = featureEntityId;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * JoinId.
             */
            public Builder joinId(String joinId) {
                this.joinId = joinId;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public FeatureEntities build() {
                return new FeatureEntities(this);
            } 

        } 

    }
}
