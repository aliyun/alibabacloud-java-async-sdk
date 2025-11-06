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
 * {@link GetBindingErrorByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetBindingErrorByTaskIdResponseBody</p>
 */
public class GetBindingErrorByTaskIdResponseBody extends TeaModel {
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

    private GetBindingErrorByTaskIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBindingErrorByTaskIdResponseBody create() {
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

        private Builder(GetBindingErrorByTaskIdResponseBody model) {
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

        public GetBindingErrorByTaskIdResponseBody build() {
            return new GetBindingErrorByTaskIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBindingErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetBindingErrorByTaskIdResponseBody</p>
     */
    public static class BindingErrorDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("RoutingKey")
        private String routingKey;

        @com.aliyun.core.annotation.NameInMap("Src")
        private String src;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("VhostName")
        private String vhostName;

        private BindingErrorDO(Builder builder) {
            this.destination = builder.destination;
            this.destinationType = builder.destinationType;
            this.errorMessage = builder.errorMessage;
            this.routingKey = builder.routingKey;
            this.src = builder.src;
            this.taskId = builder.taskId;
            this.vhostName = builder.vhostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindingErrorDO create() {
            return builder().build();
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return routingKey
         */
        public String getRoutingKey() {
            return this.routingKey;
        }

        /**
         * @return src
         */
        public String getSrc() {
            return this.src;
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
            private String destination; 
            private String destinationType; 
            private String errorMessage; 
            private String routingKey; 
            private String src; 
            private Long taskId; 
            private String vhostName; 

            private Builder() {
            } 

            private Builder(BindingErrorDO model) {
                this.destination = model.destination;
                this.destinationType = model.destinationType;
                this.errorMessage = model.errorMessage;
                this.routingKey = model.routingKey;
                this.src = model.src;
                this.taskId = model.taskId;
                this.vhostName = model.vhostName;
            } 

            /**
             * Destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * DestinationType.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * RoutingKey.
             */
            public Builder routingKey(String routingKey) {
                this.routingKey = routingKey;
                return this;
            }

            /**
             * Src.
             */
            public Builder src(String src) {
                this.src = src;
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

            public BindingErrorDO build() {
                return new BindingErrorDO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBindingErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetBindingErrorByTaskIdResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingErrorDO")
        private java.util.List<BindingErrorDO> bindingErrorDO;

        private VoList(Builder builder) {
            this.bindingErrorDO = builder.bindingErrorDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return bindingErrorDO
         */
        public java.util.List<BindingErrorDO> getBindingErrorDO() {
            return this.bindingErrorDO;
        }

        public static final class Builder {
            private java.util.List<BindingErrorDO> bindingErrorDO; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.bindingErrorDO = model.bindingErrorDO;
            } 

            /**
             * BindingErrorDO.
             */
            public Builder bindingErrorDO(java.util.List<BindingErrorDO> bindingErrorDO) {
                this.bindingErrorDO = bindingErrorDO;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBindingErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetBindingErrorByTaskIdResponseBody</p>
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
