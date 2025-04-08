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
 * {@link GetCuHoursRequest} extends {@link RequestModel}
 *
 * <p>GetCuHoursRequest</p>
 */
public class GetCuHoursRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private GetCuHoursRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.queue = builder.queue;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCuHoursRequest create() {
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
     * @return queue
     */
    public String getQueue() {
        return this.queue;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetCuHoursRequest, Builder> {
        private String workspaceId; 
        private String queue; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetCuHoursRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.queue = request.queue;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-dsa23*****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the queue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        public Builder queue(String queue) {
            this.putPathParameter("queue", queue);
            this.queue = queue;
            return this;
        }

        /**
         * <p>The end time of the query time range.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 00:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start time of the query time range.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetCuHoursRequest build() {
            return new GetCuHoursRequest(this);
        } 

    } 

}
