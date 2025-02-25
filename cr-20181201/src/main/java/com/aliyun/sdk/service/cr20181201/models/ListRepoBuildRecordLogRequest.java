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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    @Query
    @NameInMap("RepoId")
    private String repoId;

    private ListRepoBuildRecordLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildRecordId = builder.buildRecordId;
        this.instanceId = builder.instanceId;
        this.offset = builder.offset;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    public static final class Builder extends Request.Builder<ListRepoBuildRecordLogRequest, Builder> {
        private String regionId; 
        private String buildRecordId; 
        private String instanceId; 
        private Integer offset; 
        private String repoId; 

        private Builder() {
            super();
        } 

        private Builder(ListRepoBuildRecordLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buildRecordId = request.buildRecordId;
            this.instanceId = request.instanceId;
            this.offset = request.offset;
            this.repoId = request.repoId;
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
         * The ID of the image building record.
         */
        public Builder buildRecordId(String buildRecordId) {
            this.putQueryParameter("BuildRecordId", buildRecordId);
            this.buildRecordId = buildRecordId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The offset of log lines.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The ID of the image repository.
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
