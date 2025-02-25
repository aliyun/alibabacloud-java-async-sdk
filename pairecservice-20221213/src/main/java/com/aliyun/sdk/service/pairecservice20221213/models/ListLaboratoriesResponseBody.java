// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLaboratoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLaboratoriesResponseBody</p>
 */
public class ListLaboratoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Laboratories")
    private java.util.List < Laboratories> laboratories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListLaboratoriesResponseBody(Builder builder) {
        this.laboratories = builder.laboratories;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLaboratoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return laboratories
     */
    public java.util.List < Laboratories> getLaboratories() {
        return this.laboratories;
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
        private java.util.List < Laboratories> laboratories; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Laboratories.
         */
        public Builder laboratories(java.util.List < Laboratories> laboratories) {
            this.laboratories = laboratories;
            return this;
        }

        /**
         * Id of the request
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

        public ListLaboratoriesResponseBody build() {
            return new ListLaboratoriesResponseBody(this);
        } 

    } 

    public static class Laboratories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketCount")
        private Integer bucketCount;

        @com.aliyun.core.annotation.NameInMap("BucketType")
        private String bucketType;

        @com.aliyun.core.annotation.NameInMap("Buckets")
        private String buckets;

        @com.aliyun.core.annotation.NameInMap("CrowdId")
        private String crowdId;

        @com.aliyun.core.annotation.NameInMap("DebugCrowdId")
        private String debugCrowdId;

        @com.aliyun.core.annotation.NameInMap("DebugUsers")
        private String debugUsers;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Environment")
        private String environment;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private String filter;

        @com.aliyun.core.annotation.NameInMap("LaboratoryId")
        private String laboratoryId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Laboratories(Builder builder) {
            this.bucketCount = builder.bucketCount;
            this.bucketType = builder.bucketType;
            this.buckets = builder.buckets;
            this.crowdId = builder.crowdId;
            this.debugCrowdId = builder.debugCrowdId;
            this.debugUsers = builder.debugUsers;
            this.description = builder.description;
            this.environment = builder.environment;
            this.filter = builder.filter;
            this.laboratoryId = builder.laboratoryId;
            this.name = builder.name;
            this.sceneId = builder.sceneId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Laboratories create() {
            return builder().build();
        }

        /**
         * @return bucketCount
         */
        public Integer getBucketCount() {
            return this.bucketCount;
        }

        /**
         * @return bucketType
         */
        public String getBucketType() {
            return this.bucketType;
        }

        /**
         * @return buckets
         */
        public String getBuckets() {
            return this.buckets;
        }

        /**
         * @return crowdId
         */
        public String getCrowdId() {
            return this.crowdId;
        }

        /**
         * @return debugCrowdId
         */
        public String getDebugCrowdId() {
            return this.debugCrowdId;
        }

        /**
         * @return debugUsers
         */
        public String getDebugUsers() {
            return this.debugUsers;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environment
         */
        public String getEnvironment() {
            return this.environment;
        }

        /**
         * @return filter
         */
        public String getFilter() {
            return this.filter;
        }

        /**
         * @return laboratoryId
         */
        public String getLaboratoryId() {
            return this.laboratoryId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer bucketCount; 
            private String bucketType; 
            private String buckets; 
            private String crowdId; 
            private String debugCrowdId; 
            private String debugUsers; 
            private String description; 
            private String environment; 
            private String filter; 
            private String laboratoryId; 
            private String name; 
            private String sceneId; 
            private String status; 
            private String type; 

            /**
             * BucketCount.
             */
            public Builder bucketCount(Integer bucketCount) {
                this.bucketCount = bucketCount;
                return this;
            }

            /**
             * BucketType.
             */
            public Builder bucketType(String bucketType) {
                this.bucketType = bucketType;
                return this;
            }

            /**
             * Buckets.
             */
            public Builder buckets(String buckets) {
                this.buckets = buckets;
                return this;
            }

            /**
             * CrowdId.
             */
            public Builder crowdId(String crowdId) {
                this.crowdId = crowdId;
                return this;
            }

            /**
             * DebugCrowdId.
             */
            public Builder debugCrowdId(String debugCrowdId) {
                this.debugCrowdId = debugCrowdId;
                return this;
            }

            /**
             * DebugUsers.
             */
            public Builder debugUsers(String debugUsers) {
                this.debugUsers = debugUsers;
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
             * Environment.
             */
            public Builder environment(String environment) {
                this.environment = environment;
                return this;
            }

            /**
             * Filter.
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * LaboratoryId.
             */
            public Builder laboratoryId(String laboratoryId) {
                this.laboratoryId = laboratoryId;
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
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Laboratories build() {
                return new Laboratories(this);
            } 

        } 

    }
}
