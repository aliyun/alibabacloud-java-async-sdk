// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentVersionResponseBody</p>
 */
public class GetExperimentVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Buckets")
    private String buckets;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("CrowdIds")
    private String crowdIds;

    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.NameInMap("ExperimentVersionId")
    private String experimentVersionId;

    @com.aliyun.core.annotation.NameInMap("Flow")
    private Integer flow;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetExperimentVersionResponseBody(Builder builder) {
        this.buckets = builder.buckets;
        this.config = builder.config;
        this.crowdIds = builder.crowdIds;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.experimentId = builder.experimentId;
        this.experimentVersionId = builder.experimentVersionId;
        this.flow = builder.flow;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return buckets
     */
    public String getBuckets() {
        return this.buckets;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return crowdIds
     */
    public String getCrowdIds() {
        return this.crowdIds;
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
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return experimentVersionId
     */
    public String getExperimentVersionId() {
        return this.experimentVersionId;
    }

    /**
     * @return flow
     */
    public Integer getFlow() {
        return this.flow;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String buckets; 
        private String config; 
        private String crowdIds; 
        private String debugUsers; 
        private String description; 
        private String experimentId; 
        private String experimentVersionId; 
        private Integer flow; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String name; 
        private String requestId; 
        private String type; 

        /**
         * Buckets.
         */
        public Builder buckets(String buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * CrowdIds.
         */
        public Builder crowdIds(String crowdIds) {
            this.crowdIds = crowdIds;
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
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * ExperimentVersionId.
         */
        public Builder experimentVersionId(String experimentVersionId) {
            this.experimentVersionId = experimentVersionId;
            return this;
        }

        /**
         * Flow.
         */
        public Builder flow(Integer flow) {
            this.flow = flow;
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
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetExperimentVersionResponseBody build() {
            return new GetExperimentVersionResponseBody(this);
        } 

    } 

}
