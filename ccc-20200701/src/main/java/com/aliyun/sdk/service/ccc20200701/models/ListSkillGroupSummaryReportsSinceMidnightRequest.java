// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupSummaryReportsSinceMidnightRequest} extends {@link RequestModel}
 *
 * <p>ListSkillGroupSummaryReportsSinceMidnightRequest</p>
 */
public class ListSkillGroupSummaryReportsSinceMidnightRequest extends Request {
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
    @NameInMap("SkillGroups")
    private String skillGroups;

    private ListSkillGroupSummaryReportsSinceMidnightRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillGroups = builder.skillGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupSummaryReportsSinceMidnightRequest create() {
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
     * @return skillGroups
     */
    public String getSkillGroups() {
        return this.skillGroups;
    }

    public static final class Builder extends Request.Builder<ListSkillGroupSummaryReportsSinceMidnightRequest, Builder> {
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillGroups; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillGroupSummaryReportsSinceMidnightRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skillGroups = request.skillGroups;
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
         * SkillGroups.
         */
        public Builder skillGroups(String skillGroups) {
            this.putQueryParameter("SkillGroups", skillGroups);
            this.skillGroups = skillGroups;
            return this;
        }

        @Override
        public ListSkillGroupSummaryReportsSinceMidnightRequest build() {
            return new ListSkillGroupSummaryReportsSinceMidnightRequest(this);
        } 

    } 

}
