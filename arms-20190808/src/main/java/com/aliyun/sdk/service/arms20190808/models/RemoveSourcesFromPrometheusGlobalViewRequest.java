// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSourcesFromPrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>RemoveSourcesFromPrometheusGlobalViewRequest</p>
 */
public class RemoveSourcesFromPrometheusGlobalViewRequest extends Request {
    @Query
    @NameInMap("GlobalViewClusterId")
    @Validation(required = true)
    private String globalViewClusterId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SourceNames")
    @Validation(required = true)
    private String sourceNames;

    private RemoveSourcesFromPrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.globalViewClusterId = builder.globalViewClusterId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
        this.sourceNames = builder.sourceNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSourcesFromPrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalViewClusterId
     */
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceNames
     */
    public String getSourceNames() {
        return this.sourceNames;
    }

    public static final class Builder extends Request.Builder<RemoveSourcesFromPrometheusGlobalViewRequest, Builder> {
        private String globalViewClusterId; 
        private String groupName; 
        private String regionId; 
        private String sourceNames; 

        private Builder() {
            super();
        } 

        private Builder(RemoveSourcesFromPrometheusGlobalViewRequest request) {
            super(request);
            this.globalViewClusterId = request.globalViewClusterId;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
            this.sourceNames = request.sourceNames;
        } 

        /**
         * GlobalViewClusterId.
         */
        public Builder globalViewClusterId(String globalViewClusterId) {
            this.putQueryParameter("GlobalViewClusterId", globalViewClusterId);
            this.globalViewClusterId = globalViewClusterId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceNames.
         */
        public Builder sourceNames(String sourceNames) {
            this.putQueryParameter("SourceNames", sourceNames);
            this.sourceNames = sourceNames;
            return this;
        }

        @Override
        public RemoveSourcesFromPrometheusGlobalViewRequest build() {
            return new RemoveSourcesFromPrometheusGlobalViewRequest(this);
        } 

    } 

}
