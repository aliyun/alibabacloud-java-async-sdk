// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupStatesRequest} extends {@link RequestModel}
 *
 * <p>ListSkillGroupStatesRequest</p>
 */
public class ListSkillGroupStatesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SkillGroupIds")
    private String skillGroupIds;

    private ListSkillGroupStatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillGroupIds = builder.skillGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupStatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return skillGroupIds
     */
    public String getSkillGroupIds() {
        return this.skillGroupIds;
    }

    public static final class Builder extends Request.Builder<ListSkillGroupStatesRequest, Builder> {
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillGroupStatesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.skillGroupIds = response.skillGroupIds;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        /**
         * SkillGroupIds.
         */
        public Builder skillGroupIds(String skillGroupIds) {
            this.putQueryParameter("SkillGroupIds", skillGroupIds);
            this.skillGroupIds = skillGroupIds;
            return this;
        }

        @Override
        public ListSkillGroupStatesRequest build() {
            return new ListSkillGroupStatesRequest(this);
        } 

    } 

}
