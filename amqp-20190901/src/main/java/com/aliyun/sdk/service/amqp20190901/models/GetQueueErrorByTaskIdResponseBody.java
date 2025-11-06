// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetQueueErrorByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueueErrorByTaskIdResponseBody</p>
 */
public class GetQueueErrorByTaskIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQueueErrorByTaskIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueueErrorByTaskIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQueueErrorByTaskIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQueueErrorByTaskIdResponseBody build() {
            return new GetQueueErrorByTaskIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQueueErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueueErrorByTaskIdResponseBody</p>
     */
    public static class QueueErrorDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDelete")
        private Boolean autoDelete;

        @com.aliyun.core.annotation.NameInMap("Durable")
        private Boolean durable;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private Integer errorMessage;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("VhostName")
        private String vhostName;

        private QueueErrorDO(Builder builder) {
            this.autoDelete = builder.autoDelete;
            this.durable = builder.durable;
            this.errorMessage = builder.errorMessage;
            this.queueName = builder.queueName;
            this.taskId = builder.taskId;
            this.vhostName = builder.vhostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueErrorDO create() {
            return builder().build();
        }

        /**
         * @return autoDelete
         */
        public Boolean getAutoDelete() {
            return this.autoDelete;
        }

        /**
         * @return durable
         */
        public Boolean getDurable() {
            return this.durable;
        }

        /**
         * @return errorMessage
         */
        public Integer getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return vhostName
         */
        public String getVhostName() {
            return this.vhostName;
        }

        public static final class Builder {
            private Boolean autoDelete; 
            private Boolean durable; 
            private Integer errorMessage; 
            private String queueName; 
            private Long taskId; 
            private String vhostName; 

            private Builder() {
            } 

            private Builder(QueueErrorDO model) {
                this.autoDelete = model.autoDelete;
                this.durable = model.durable;
                this.errorMessage = model.errorMessage;
                this.queueName = model.queueName;
                this.taskId = model.taskId;
                this.vhostName = model.vhostName;
            } 

            /**
             * AutoDelete.
             */
            public Builder autoDelete(Boolean autoDelete) {
                this.autoDelete = autoDelete;
                return this;
            }

            /**
             * Durable.
             */
            public Builder durable(Boolean durable) {
                this.durable = durable;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(Integer errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * VhostName.
             */
            public Builder vhostName(String vhostName) {
                this.vhostName = vhostName;
                return this;
            }

            public QueueErrorDO build() {
                return new QueueErrorDO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQueueErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueueErrorByTaskIdResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueueErrorDO")
        private java.util.List<QueueErrorDO> queueErrorDO;

        private VoList(Builder builder) {
            this.queueErrorDO = builder.queueErrorDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return queueErrorDO
         */
        public java.util.List<QueueErrorDO> getQueueErrorDO() {
            return this.queueErrorDO;
        }

        public static final class Builder {
            private java.util.List<QueueErrorDO> queueErrorDO; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.queueErrorDO = model.queueErrorDO;
            } 

            /**
             * QueueErrorDO.
             */
            public Builder queueErrorDO(java.util.List<QueueErrorDO> queueErrorDO) {
                this.queueErrorDO = queueErrorDO;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQueueErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetQueueErrorByTaskIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("VoList")
        private VoList voList;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.voList = builder.voList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return voList
         */
        public VoList getVoList() {
            return this.voList;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 
            private VoList voList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.voList = model.voList;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * VoList.
             */
            public Builder voList(VoList voList) {
                this.voList = voList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
