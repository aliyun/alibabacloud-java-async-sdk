// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLaboratoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetLaboratoryResponseBody</p>
 */
public class GetLaboratoryResponseBody extends TeaModel {
    @NameInMap("BucketCount")
    private Integer bucketCount;

    @NameInMap("BucketType")
    private String bucketType;

    @NameInMap("Buckets")
    private String buckets;

    @NameInMap("CrowdId")
    private String crowdId;

    @NameInMap("DebugCrowdId")
    private String debugCrowdId;

    @NameInMap("DebugUsers")
    private String debugUsers;

    @NameInMap("Description")
    private String description;

    @NameInMap("Environment")
    private String environment;

    @NameInMap("Filter")
    private String filter;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SceneId")
    private String sceneId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Type")
    private String type;

    private GetLaboratoryResponseBody(Builder builder) {
        this.bucketCount = builder.bucketCount;
        this.bucketType = builder.bucketType;
        this.buckets = builder.buckets;
        this.crowdId = builder.crowdId;
        this.debugCrowdId = builder.debugCrowdId;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.environment = builder.environment;
        this.filter = builder.filter;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLaboratoryResponseBody create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String name; 
        private String requestId; 
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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

        public GetLaboratoryResponseBody build() {
            return new GetLaboratoryResponseBody(this);
        } 

    } 

}
