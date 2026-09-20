// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link QueryTrafficControlTaskDeployResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTrafficControlTaskDeployResultResponseBody</p>
 */
public class QueryTrafficControlTaskDeployResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeployMessage")
    private String deployMessage;

    @com.aliyun.core.annotation.NameInMap("DeployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.NameInMap("DraftMessage")
    private String draftMessage;

    @com.aliyun.core.annotation.NameInMap("DraftStatus")
    private String draftStatus;

    @com.aliyun.core.annotation.NameInMap("PrepareMessage")
    private String prepareMessage;

    @com.aliyun.core.annotation.NameInMap("PrepareStatus")
    private String prepareStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartMessage")
    private String startMessage;

    @com.aliyun.core.annotation.NameInMap("StartStatus")
    private String startStatus;

    @com.aliyun.core.annotation.NameInMap("StopMessage")
    private String stopMessage;

    @com.aliyun.core.annotation.NameInMap("StopStatus")
    private String stopStatus;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

    private QueryTrafficControlTaskDeployResultResponseBody(Builder builder) {
        this.deployMessage = builder.deployMessage;
        this.deployStatus = builder.deployStatus;
        this.draftMessage = builder.draftMessage;
        this.draftStatus = builder.draftStatus;
        this.prepareMessage = builder.prepareMessage;
        this.prepareStatus = builder.prepareStatus;
        this.requestId = builder.requestId;
        this.startMessage = builder.startMessage;
        this.startStatus = builder.startStatus;
        this.stopMessage = builder.stopMessage;
        this.stopStatus = builder.stopStatus;
        this.trafficControlTaskId = builder.trafficControlTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTrafficControlTaskDeployResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployMessage
     */
    public String getDeployMessage() {
        return this.deployMessage;
    }

    /**
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return draftMessage
     */
    public String getDraftMessage() {
        return this.draftMessage;
    }

    /**
     * @return draftStatus
     */
    public String getDraftStatus() {
        return this.draftStatus;
    }

    /**
     * @return prepareMessage
     */
    public String getPrepareMessage() {
        return this.prepareMessage;
    }

    /**
     * @return prepareStatus
     */
    public String getPrepareStatus() {
        return this.prepareStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startMessage
     */
    public String getStartMessage() {
        return this.startMessage;
    }

    /**
     * @return startStatus
     */
    public String getStartStatus() {
        return this.startStatus;
    }

    /**
     * @return stopMessage
     */
    public String getStopMessage() {
        return this.stopMessage;
    }

    /**
     * @return stopStatus
     */
    public String getStopStatus() {
        return this.stopStatus;
    }

    /**
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    public static final class Builder {
        private String deployMessage; 
        private String deployStatus; 
        private String draftMessage; 
        private String draftStatus; 
        private String prepareMessage; 
        private String prepareStatus; 
        private String requestId; 
        private String startMessage; 
        private String startStatus; 
        private String stopMessage; 
        private String stopStatus; 
        private String trafficControlTaskId; 

        private Builder() {
        } 

        private Builder(QueryTrafficControlTaskDeployResultResponseBody model) {
            this.deployMessage = model.deployMessage;
            this.deployStatus = model.deployStatus;
            this.draftMessage = model.draftMessage;
            this.draftStatus = model.draftStatus;
            this.prepareMessage = model.prepareMessage;
            this.prepareStatus = model.prepareStatus;
            this.requestId = model.requestId;
            this.startMessage = model.startMessage;
            this.startStatus = model.startStatus;
            this.stopMessage = model.stopMessage;
            this.stopStatus = model.stopStatus;
            this.trafficControlTaskId = model.trafficControlTaskId;
        } 

        /**
         * <p>The message returned for the Flink platform deployment operation.</p>
         * 
         * <strong>example:</strong>
         * <p>deploy job draft success</p>
         */
        public Builder deployMessage(String deployMessage) {
            this.deployMessage = deployMessage;
            return this;
        }

        /**
         * <p>The status of deploying the draft. Valid values:</p>
         * <ul>
         * <li>Failed: failed.</li>
         * <li>Running: running.</li>
         * <li>Success: succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * <p>The message returned for pushing the draft to Flink.</p>
         * 
         * <strong>example:</strong>
         * <p>push draft success</p>
         */
        public Builder draftMessage(String draftMessage) {
            this.draftMessage = draftMessage;
            return this;
        }

        /**
         * <p>The status of pushing the draft to Flink. Valid values:</p>
         * <ul>
         * <li>Failed: failed.</li>
         * <li>Running: running.</li>
         * <li>Success: succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder draftStatus(String draftStatus) {
            this.draftStatus = draftStatus;
            return this;
        }

        /**
         * <p>The message returned for the preparation phase.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder prepareMessage(String prepareMessage) {
            this.prepareMessage = prepareMessage;
            return this;
        }

        /**
         * <p>The status of the preparation phase. Valid values:</p>
         * <ul>
         * <li>Failed: failed.</li>
         * <li>Running: running.</li>
         * <li>Success: succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder prepareStatus(String prepareStatus) {
            this.prepareStatus = prepareStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The message returned for starting the Flink task.</p>
         * 
         * <strong>example:</strong>
         * <p>start job success</p>
         */
        public Builder startMessage(String startMessage) {
            this.startMessage = startMessage;
            return this;
        }

        /**
         * <p>The status of starting the Flink task. Valid values:</p>
         * <ul>
         * <li>Failed: failed.</li>
         * <li>Running: running.</li>
         * <li>Success: succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder startStatus(String startStatus) {
            this.startStatus = startStatus;
            return this;
        }

        /**
         * <p>The stop details.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder stopMessage(String stopMessage) {
            this.stopMessage = stopMessage;
            return this;
        }

        /**
         * <p>The stop status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder stopStatus(String stopStatus) {
            this.stopStatus = stopStatus;
            return this;
        }

        /**
         * <p>The traffic control task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }

        public QueryTrafficControlTaskDeployResultResponseBody build() {
            return new QueryTrafficControlTaskDeployResultResponseBody(this);
        } 

    } 

}
