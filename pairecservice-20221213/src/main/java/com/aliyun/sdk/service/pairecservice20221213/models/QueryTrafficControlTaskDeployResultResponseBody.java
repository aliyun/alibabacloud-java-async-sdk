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
            this.trafficControlTaskId = model.trafficControlTaskId;
        } 

        /**
         * DeployMessage.
         */
        public Builder deployMessage(String deployMessage) {
            this.deployMessage = deployMessage;
            return this;
        }

        /**
         * DeployStatus.
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * DraftMessage.
         */
        public Builder draftMessage(String draftMessage) {
            this.draftMessage = draftMessage;
            return this;
        }

        /**
         * DraftStatus.
         */
        public Builder draftStatus(String draftStatus) {
            this.draftStatus = draftStatus;
            return this;
        }

        /**
         * PrepareMessage.
         */
        public Builder prepareMessage(String prepareMessage) {
            this.prepareMessage = prepareMessage;
            return this;
        }

        /**
         * PrepareStatus.
         */
        public Builder prepareStatus(String prepareStatus) {
            this.prepareStatus = prepareStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartMessage.
         */
        public Builder startMessage(String startMessage) {
            this.startMessage = startMessage;
            return this;
        }

        /**
         * StartStatus.
         */
        public Builder startStatus(String startStatus) {
            this.startStatus = startStatus;
            return this;
        }

        /**
         * TrafficControlTaskId.
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
