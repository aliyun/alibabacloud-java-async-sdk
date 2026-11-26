// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListRLTrajectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRLTrajectoriesResponseBody</p>
 */
public class ListRLTrajectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PromptUid")
    private String promptUid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Trajectories")
    private java.util.List<RLTrajectory> trajectories;

    private ListRLTrajectoriesResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.promptUid = builder.promptUid;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trajectories = builder.trajectories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRLTrajectoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return promptUid
     */
    public String getPromptUid() {
        return this.promptUid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trajectories
     */
    public java.util.List<RLTrajectory> getTrajectories() {
        return this.trajectories;
    }

    public static final class Builder {
        private String jobId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String promptUid; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<RLTrajectory> trajectories; 

        private Builder() {
        } 

        private Builder(ListRLTrajectoriesResponseBody model) {
            this.jobId = model.jobId;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.promptUid = model.promptUid;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trajectories = model.trajectories;
        } 

        /**
         * <p>作业 ID</p>
         * 
         * <strong>example:</strong>
         * <p>dlc********</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>生效的页码；未传分页参数时为默认值 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>生效的每页条数；未传分页参数时为默认值 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>样本 uid</p>
         * 
         * <strong>example:</strong>
         * <p>3afcfbdf-3956-4ab2-b9cb-f9c204b8fc9c</p>
         */
        public Builder promptUid(String promptUid) {
            this.promptUid = promptUid;
            return this;
        }

        /**
         * <p>请求 ID</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>指定 PromptUid 下分页前的轨迹总数，不是当前页条数。查询规模受限时可能仅为下界，不保证是精确总数。</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>轨迹列表（当前页，按 SampleIndex 数值升序）</p>
         */
        public Builder trajectories(java.util.List<RLTrajectory> trajectories) {
            this.trajectories = trajectories;
            return this;
        }

        public ListRLTrajectoriesResponseBody build() {
            return new ListRLTrajectoriesResponseBody(this);
        } 

    } 

}
