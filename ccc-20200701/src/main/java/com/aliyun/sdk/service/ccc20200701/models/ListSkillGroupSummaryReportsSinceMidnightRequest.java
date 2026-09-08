// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSkillGroupSummaryReportsSinceMidnightRequest} extends {@link RequestModel}
 *
 * <p>ListSkillGroupSummaryReportsSinceMidnightRequest</p>
 */
public class ListSkillGroupSummaryReportsSinceMidnightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroups")
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
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number to return. The value must be in the range of 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. The value must be in the range of 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>A JSON-formatted string that contains the IDs of the skill groups to query. If this parameter is omitted, the query includes all skill groups.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;skillgroup1@ccc-test&quot;, &quot;skillgroup2@ccc-test2&quot;]</p>
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
