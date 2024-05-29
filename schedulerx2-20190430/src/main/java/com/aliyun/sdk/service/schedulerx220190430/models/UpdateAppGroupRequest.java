// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppGroupRequest</p>
 */
public class UpdateAppGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    private Integer maxConcurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    private UpdateAppGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.maxConcurrency = builder.maxConcurrency;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpdateAppGroupRequest, Builder> {
        private String description; 
        private String groupId; 
        private Integer maxConcurrency; 
        private String namespace; 
        private String regionId; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppGroupRequest request) {
            super(request);
            this.description = request.description;
            this.groupId = request.groupId;
            this.maxConcurrency = request.maxConcurrency;
            this.namespace = request.namespace;
            this.regionId = request.regionId;
            this.version = request.version;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MaxConcurrency.
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putQueryParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
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
         * Version.
         */
        public Builder version(Integer version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpdateAppGroupRequest build() {
            return new UpdateAppGroupRequest(this);
        } 

    } 

}
