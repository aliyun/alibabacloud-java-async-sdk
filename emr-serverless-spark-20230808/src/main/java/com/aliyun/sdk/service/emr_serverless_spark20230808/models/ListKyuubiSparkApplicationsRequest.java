// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListKyuubiSparkApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListKyuubiSparkApplicationsRequest</p>
 */
public class ListKyuubiSparkApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("kyuubiServiceId")
    private String kyuubiServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applicationName")
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private StartTime startTime;

    private ListKyuubiSparkApplicationsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.kyuubiServiceId = builder.kyuubiServiceId;
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKyuubiSparkApplicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return kyuubiServiceId
     */
    public String getKyuubiServiceId() {
        return this.kyuubiServiceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startTime
     */
    public StartTime getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListKyuubiSparkApplicationsRequest, Builder> {
        private String workspaceId; 
        private String kyuubiServiceId; 
        private String applicationId; 
        private String applicationName; 
        private Integer maxResults; 
        private String nextToken; 
        private StartTime startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListKyuubiSparkApplicationsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.kyuubiServiceId = request.kyuubiServiceId;
            this.applicationId = request.applicationId;
            this.applicationName = request.applicationName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the Kyuubi service.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-c7141f10c3f549fc9f8b8ae562b8****</p>
         */
        public Builder kyuubiServiceId(String kyuubiServiceId) {
            this.putPathParameter("kyuubiServiceId", kyuubiServiceId);
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }

        /**
         * <p>The ID of the application that is submitted by using a Kyuubi gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-339f844005b6404c95f9f7c7a13b****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The name of the Spark application that is submitted by using a Kyuubi gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>kyuubi-connection-spark-sql-anonymous-fa9a5e73-b4b1-474a-b****</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("applicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The range of start time.</p>
         */
        public Builder startTime(StartTime startTime) {
            String startTimeShrink = shrink(startTime, "startTime", "json");
            this.putQueryParameter("startTime", startTimeShrink);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListKyuubiSparkApplicationsRequest build() {
            return new ListKyuubiSparkApplicationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListKyuubiSparkApplicationsRequest} extends {@link TeaModel}
     *
     * <p>ListKyuubiSparkApplicationsRequest</p>
     */
    public static class StartTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        private StartTime(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartTime create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(StartTime model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end of the start time range.</p>
             * 
             * <strong>example:</strong>
             * <p>1710432000000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The beginning of the start time range.</p>
             * 
             * <strong>example:</strong>
             * <p>1709740800000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public StartTime build() {
                return new StartTime(this);
            } 

        } 

    }
}
