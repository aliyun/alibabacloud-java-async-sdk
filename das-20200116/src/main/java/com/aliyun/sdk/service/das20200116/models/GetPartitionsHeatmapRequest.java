// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPartitionsHeatmapRequest} extends {@link RequestModel}
 *
 * <p>GetPartitionsHeatmapRequest</p>
 */
public class GetPartitionsHeatmapRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private String timeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzrciqy62c****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The time range to be queried. Valid values:</p>
         * <ul>
         * <li><strong>LAST_ONE_HOURS</strong>: the last hour.</li>
         * <li><strong>LAST_SIX_HOURS</strong>: the last six hours.</li>
         * <li><strong>LAST_ONE_DAYS</strong>: the last day.</li>
         * <li><strong>LAST_THREE_DAYS</strong>: the last three days.</li>
         * <li><strong>LAST_SEVEN_DAYS</strong>: the last seven days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LAST_SIX_HOURS</p>
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        /**
         * <p>The type of the data to be queried. Valid values:</p>
         * <ul>
         * <li><strong>READ_ROWS</strong>: the read rows.</li>
         * <li><strong>WRITTEN_ROWS</strong>: the written rows.</li>
         * <li><strong>READ_WRITTEN_ROWS</strong>: the read and written rows.</li>
         * <li><strong>UPDATE_ROWS</strong>: the updated rows.</li>
         * <li><strong>INSERTED_ROWS</strong>: the inserted rows.</li>
         * <li><strong>DELETED_ROWS</strong>: the deleted rows.</li>
         * <li><strong>READ_ROWS_WITH_DN</strong>: the read rows returned from a data node.</li>
         * <li><strong>WRITTEN_ROWS_WITH_DN</strong>: the written rows returned from a data node.</li>
         * <li><strong>READ_WRITTEN_ROWS_WITH_DN</strong>: the read and written rows returned from a data node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WRITTEN_ROWS_WITH_DN</p>
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
