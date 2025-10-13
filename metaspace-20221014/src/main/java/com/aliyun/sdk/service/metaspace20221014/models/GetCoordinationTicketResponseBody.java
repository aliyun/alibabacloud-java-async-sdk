// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20221014.models;

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
 * {@link GetCoordinationTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetCoordinationTicketResponseBody</p>
 */
public class GetCoordinationTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CoordinateTicketModel")
    private CoordinateTicketModel coordinateTicketModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCoordinationTicketResponseBody(Builder builder) {
        this.coordinateTicketModel = builder.coordinateTicketModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCoordinationTicketResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coordinateTicketModel
     */
    public CoordinateTicketModel getCoordinateTicketModel() {
        return this.coordinateTicketModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CoordinateTicketModel coordinateTicketModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCoordinationTicketResponseBody model) {
            this.coordinateTicketModel = model.coordinateTicketModel;
            this.requestId = model.requestId;
        } 

        /**
         * CoordinateTicketModel.
         */
        public Builder coordinateTicketModel(CoordinateTicketModel coordinateTicketModel) {
            this.coordinateTicketModel = coordinateTicketModel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCoordinationTicketResponseBody build() {
            return new GetCoordinationTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCoordinationTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetCoordinationTicketResponseBody</p>
     */
    public static class CoordinateTicketModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoId")
        private String coId;

        @com.aliyun.core.annotation.NameInMap("CoordinateTicket")
        private String coordinateTicket;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private CoordinateTicketModel(Builder builder) {
            this.coId = builder.coId;
            this.coordinateTicket = builder.coordinateTicket;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoordinateTicketModel create() {
            return builder().build();
        }

        /**
         * @return coId
         */
        public String getCoId() {
            return this.coId;
        }

        /**
         * @return coordinateTicket
         */
        public String getCoordinateTicket() {
            return this.coordinateTicket;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String coId; 
            private String coordinateTicket; 
            private String taskId; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(CoordinateTicketModel model) {
                this.coId = model.coId;
                this.coordinateTicket = model.coordinateTicket;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * CoId.
             */
            public Builder coId(String coId) {
                this.coId = coId;
                return this;
            }

            /**
             * CoordinateTicket.
             */
            public Builder coordinateTicket(String coordinateTicket) {
                this.coordinateTicket = coordinateTicket;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public CoordinateTicketModel build() {
                return new CoordinateTicketModel(this);
            } 

        } 

    }
}
