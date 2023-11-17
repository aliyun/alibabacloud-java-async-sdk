// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPartitionsHeatmapRequest} extends {@link RequestModel}
 *
 * <p>GetPartitionsHeatmapRequest</p>
 */
public class GetPartitionsHeatmapRequest extends Request {
    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("TimeRange")
    private String timeRange;

    @Query
    @NameInMap("Type")
    private String type;

    private GetPartitionsHeatmapRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceId = builder.instanceId;
        this.timeRange = builder.timeRange;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPartitionsHeatmapRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetPartitionsHeatmapRequest, Builder> {
        private String consoleContext; 
        private String instanceId; 
        private String timeRange; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetPartitionsHeatmapRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.instanceId = request.instanceId;
            this.timeRange = request.timeRange;
            this.type = request.type;
        } 

        /**
         * The reserved parameter.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The time range to be queried. Valid values:
         * <p>
         * 
         * *   **LAST_ONE_HOURS**: the last hour.
         * *   **LAST_SIX_HOURS**: the last six hours.
         * *   **LAST_ONE_DAYS**: the last day.
         * *   **LAST_THREE_DAYS**: the last three days.
         * *   **LAST_SEVEN_DAYS**: the last seven days.
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        /**
         * The type of the data to be queried. Valid values:
         * <p>
         * 
         * *   **READ_ROWS**: the read rows.
         * *   **WRITTEN_ROWS**: the written rows.
         * *   **READ_WRITTEN_ROWS**: the read and written rows.
         * *   **UPDATE_ROWS**: the updated rows.
         * *   **INSERTED_ROWS**: the inserted rows.
         * *   **DELETED_ROWS**: the deleted rows.
         * *   **READ_ROWS_WITH_DN**: the read rows returned from a data node.
         * *   **WRITTEN_ROWS_WITH_DN**: the written rows returned from a data node.
         * *   **READ_WRITTEN_ROWS_WITH_DN**: the read and written rows returned from a data node.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetPartitionsHeatmapRequest build() {
            return new GetPartitionsHeatmapRequest(this);
        } 

    } 

}
