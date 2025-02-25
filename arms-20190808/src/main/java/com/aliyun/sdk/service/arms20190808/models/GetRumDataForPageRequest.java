// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetRumDataForPageRequest} extends {@link RequestModel}
 *
 * <p>GetRumDataForPageRequest</p>
 */
public class GetRumDataForPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppGroup")
    private String appGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private GetRumDataForPageRequest(Builder builder) {
        super(builder);
        this.appGroup = builder.appGroup;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumDataForPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroup
     */
    public String getAppGroup() {
        return this.appGroup;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetRumDataForPageRequest, Builder> {
        private String appGroup; 
        private Integer currentPage; 
        private Integer endTime; 
        private Integer pageSize; 
        private String pid; 
        private String query; 
        private String regionId; 
        private Integer startTime; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetRumDataForPageRequest request) {
            super(request);
            this.appGroup = request.appGroup;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.query = request.query;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The group to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder appGroup(String appGroup) {
            this.putQueryParameter("AppGroup", appGroup);
            this.appGroup = appGroup;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The time is accurate to seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713774233</p>
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iixxxjcnuk@582846f37******</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>A query statement that complies with the query syntax of Simple Log Service Logstore. For more information, see the parameters corresponding to this operation on the console page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>and app.id: xxxx@586810fbxxxx19f</li>
         * </ul>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The time is accurate to seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1713687833</p>
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetRumDataForPageRequest build() {
            return new GetRumDataForPageRequest(this);
        } 

    } 

}
