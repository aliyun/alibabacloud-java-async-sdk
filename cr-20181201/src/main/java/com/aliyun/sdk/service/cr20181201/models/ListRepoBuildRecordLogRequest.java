// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoBuildRecordLogRequest} extends {@link RequestModel}
 *
 * <p>ListRepoBuildRecordLogRequest</p>
 */
public class ListRepoBuildRecordLogRequest extends Request {
    @Query
    @NameInMap("BuildRecordId")
    @Validation(required = true)
    private String buildRecordId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    private ListRepoBuildRecordLogRequest(Builder builder) {
        super(builder);
        this.buildRecordId = builder.buildRecordId;
        this.instanceId = builder.instanceId;
        this.offset = builder.offset;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoBuildRecordLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<ListRepoBuildRecordLogRequest, Builder> {
        private String buildRecordId; 
        private String instanceId; 
        private Integer offset; 
        private String regionId; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(ListRepoBuildRecordLogRequest response) {
            super(response);
            this.buildRecordId = response.buildRecordId;
            this.instanceId = response.instanceId;
            this.offset = response.offset;
            this.regionId = response.regionId;
            this.repoId = response.repoId;
        } 

        /**
         * BuildRecordId.
         */
        public Builder buildRecordId(String buildRecordId) {
            this.putQueryParameter("BuildRecordId", buildRecordId);
            this.buildRecordId = buildRecordId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        @Override
        public ListRepoBuildRecordLogRequest build() {
            return new ListRepoBuildRecordLogRequest(this);
        } 

    } 

}
