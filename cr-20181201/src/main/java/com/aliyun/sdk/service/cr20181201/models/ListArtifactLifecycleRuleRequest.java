// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArtifactLifecycleRuleRequest} extends {@link RequestModel}
 *
 * <p>ListArtifactLifecycleRuleRequest</p>
 */
public class ListArtifactLifecycleRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EnableDeleteTag")
    private Boolean enableDeleteTag;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListArtifactLifecycleRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.enableDeleteTag = builder.enableDeleteTag;
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactLifecycleRuleRequest create() {
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
     * @return enableDeleteTag
     */
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListArtifactLifecycleRuleRequest, Builder> {
        private String regionId; 
        private Boolean enableDeleteTag; 
        private String instanceId; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListArtifactLifecycleRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enableDeleteTag = request.enableDeleteTag;
            this.instanceId = request.instanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
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
         * EnableDeleteTag.
         */
        public Builder enableDeleteTag(Boolean enableDeleteTag) {
            this.putQueryParameter("EnableDeleteTag", enableDeleteTag);
            this.enableDeleteTag = enableDeleteTag;
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListArtifactLifecycleRuleRequest build() {
            return new ListArtifactLifecycleRuleRequest(this);
        } 

    } 

}
