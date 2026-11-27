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
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc********</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The effective page number. If pagination parameters are not provided, the default value 1 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The effective number of entries per page. If pagination parameters are not provided, the default value 10 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sample UID.</p>
         * 
         * <strong>example:</strong>
         * <p>3afcfbdf-3956-4ab2-b9cb-f9c204b8fc9c</p>
         */
        public Builder promptUid(String promptUid) {
            this.promptUid = promptUid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of trajectories under this UID before pagination. This is an exact value, and represents a lower bound only when Truncated is true.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of trajectories on the current page, sorted in ascending order by SampleIndex.</p>
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
