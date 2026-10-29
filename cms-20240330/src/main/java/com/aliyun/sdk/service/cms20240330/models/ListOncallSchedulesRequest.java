// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListOncallSchedulesRequest} extends {@link RequestModel}
 *
 * <p>ListOncallSchedulesRequest</p>
 */
public class ListOncallSchedulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("oncallScheduleIds")
    private java.util.List<String> oncallScheduleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("oncallScheduleName")
    private String oncallScheduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ListOncallSchedulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.oncallScheduleIds = builder.oncallScheduleIds;
        this.oncallScheduleName = builder.oncallScheduleName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOncallSchedulesRequest create() {
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
     * @return oncallScheduleIds
     */
    public java.util.List<String> getOncallScheduleIds() {
        return this.oncallScheduleIds;
    }

    /**
     * @return oncallScheduleName
     */
    public String getOncallScheduleName() {
        return this.oncallScheduleName;
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListOncallSchedulesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> oncallScheduleIds; 
        private String oncallScheduleName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListOncallSchedulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.oncallScheduleIds = request.oncallScheduleIds;
            this.oncallScheduleName = request.oncallScheduleName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.workspace = request.workspace;
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
         * oncallScheduleIds.
         */
        public Builder oncallScheduleIds(java.util.List<String> oncallScheduleIds) {
            String oncallScheduleIdsShrink = shrink(oncallScheduleIds, "oncallScheduleIds", "json");
            this.putQueryParameter("oncallScheduleIds", oncallScheduleIdsShrink);
            this.oncallScheduleIds = oncallScheduleIds;
            return this;
        }

        /**
         * oncallScheduleName.
         */
        public Builder oncallScheduleName(String oncallScheduleName) {
            this.putQueryParameter("oncallScheduleName", oncallScheduleName);
            this.oncallScheduleName = oncallScheduleName;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListOncallSchedulesRequest build() {
            return new ListOncallSchedulesRequest(this);
        } 

    } 

}
