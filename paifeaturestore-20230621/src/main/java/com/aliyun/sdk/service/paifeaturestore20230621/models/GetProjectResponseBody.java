// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectResponseBody</p>
 */
public class GetProjectResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("FeatureEntityCount")
    private Integer featureEntityCount;

    @NameInMap("FeatureViewCount")
    private Integer featureViewCount;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("ModelCount")
    private Integer modelCount;

    @NameInMap("Name")
    private String name;

    @NameInMap("OfflineDatasourceId")
    private String offlineDatasourceId;

    @NameInMap("OfflineDatasourceName")
    private String offlineDatasourceName;

    @NameInMap("OfflineDatasourceType")
    private String offlineDatasourceType;

    @NameInMap("OfflineLifecycle")
    private Integer offlineLifecycle;

    @NameInMap("OnlineDatasourceId")
    private String onlineDatasourceId;

    @NameInMap("OnlineDatasourceName")
    private String onlineDatasourceName;

    @NameInMap("OnlineDatasourceType")
    private String onlineDatasourceType;

    @NameInMap("Owner")
    private String owner;

    @NameInMap("RequestId")
    private String requestId;

    private GetProjectResponseBody(Builder builder) {
        this.description = builder.description;
        this.featureEntityCount = builder.featureEntityCount;
        this.featureViewCount = builder.featureViewCount;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.modelCount = builder.modelCount;
        this.name = builder.name;
        this.offlineDatasourceId = builder.offlineDatasourceId;
        this.offlineDatasourceName = builder.offlineDatasourceName;
        this.offlineDatasourceType = builder.offlineDatasourceType;
        this.offlineLifecycle = builder.offlineLifecycle;
        this.onlineDatasourceId = builder.onlineDatasourceId;
        this.onlineDatasourceName = builder.onlineDatasourceName;
        this.onlineDatasourceType = builder.onlineDatasourceType;
        this.owner = builder.owner;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return featureEntityCount
     */
    public Integer getFeatureEntityCount() {
        return this.featureEntityCount;
    }

    /**
     * @return featureViewCount
     */
    public Integer getFeatureViewCount() {
        return this.featureViewCount;
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
     * @return modelCount
     */
    public Integer getModelCount() {
        return this.modelCount;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return offlineDatasourceId
     */
    public String getOfflineDatasourceId() {
        return this.offlineDatasourceId;
    }

    /**
     * @return offlineDatasourceName
     */
    public String getOfflineDatasourceName() {
        return this.offlineDatasourceName;
    }

    /**
     * @return offlineDatasourceType
     */
    public String getOfflineDatasourceType() {
        return this.offlineDatasourceType;
    }

    /**
     * @return offlineLifecycle
     */
    public Integer getOfflineLifecycle() {
        return this.offlineLifecycle;
    }

    /**
     * @return onlineDatasourceId
     */
    public String getOnlineDatasourceId() {
        return this.onlineDatasourceId;
    }

    /**
     * @return onlineDatasourceName
     */
    public String getOnlineDatasourceName() {
        return this.onlineDatasourceName;
    }

    /**
     * @return onlineDatasourceType
     */
    public String getOnlineDatasourceType() {
        return this.onlineDatasourceType;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String description; 
        private Integer featureEntityCount; 
        private Integer featureViewCount; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Integer modelCount; 
        private String name; 
        private String offlineDatasourceId; 
        private String offlineDatasourceName; 
        private String offlineDatasourceType; 
        private Integer offlineLifecycle; 
        private String onlineDatasourceId; 
        private String onlineDatasourceName; 
        private String onlineDatasourceType; 
        private String owner; 
        private String requestId; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * FeatureEntityCount.
         */
        public Builder featureEntityCount(Integer featureEntityCount) {
            this.featureEntityCount = featureEntityCount;
            return this;
        }

        /**
         * FeatureViewCount.
         */
        public Builder featureViewCount(Integer featureViewCount) {
            this.featureViewCount = featureViewCount;
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
         * ModelCount.
         */
        public Builder modelCount(Integer modelCount) {
            this.modelCount = modelCount;
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
         * OfflineDatasourceId.
         */
        public Builder offlineDatasourceId(String offlineDatasourceId) {
            this.offlineDatasourceId = offlineDatasourceId;
            return this;
        }

        /**
         * OfflineDatasourceName.
         */
        public Builder offlineDatasourceName(String offlineDatasourceName) {
            this.offlineDatasourceName = offlineDatasourceName;
            return this;
        }

        /**
         * OfflineDatasourceType.
         */
        public Builder offlineDatasourceType(String offlineDatasourceType) {
            this.offlineDatasourceType = offlineDatasourceType;
            return this;
        }

        /**
         * OfflineLifecycle.
         */
        public Builder offlineLifecycle(Integer offlineLifecycle) {
            this.offlineLifecycle = offlineLifecycle;
            return this;
        }

        /**
         * OnlineDatasourceId.
         */
        public Builder onlineDatasourceId(String onlineDatasourceId) {
            this.onlineDatasourceId = onlineDatasourceId;
            return this;
        }

        /**
         * OnlineDatasourceName.
         */
        public Builder onlineDatasourceName(String onlineDatasourceName) {
            this.onlineDatasourceName = onlineDatasourceName;
            return this;
        }

        /**
         * OnlineDatasourceType.
         */
        public Builder onlineDatasourceType(String onlineDatasourceType) {
            this.onlineDatasourceType = onlineDatasourceType;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

}
