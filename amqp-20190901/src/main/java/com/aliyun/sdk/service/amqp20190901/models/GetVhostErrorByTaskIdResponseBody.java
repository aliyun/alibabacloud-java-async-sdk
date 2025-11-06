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
 * {@link GetVhostErrorByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetVhostErrorByTaskIdResponseBody</p>
 */
public class GetVhostErrorByTaskIdResponseBody extends TeaModel {
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

    private GetVhostErrorByTaskIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVhostErrorByTaskIdResponseBody create() {
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

        private Builder(GetVhostErrorByTaskIdResponseBody model) {
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

        public GetVhostErrorByTaskIdResponseBody build() {
            return new GetVhostErrorByTaskIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVhostErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVhostErrorByTaskIdResponseBody</p>
     */
    public static class VhostErrorDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private Integer errorMessage;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("VhostName")
        private String vhostName;

        private VhostErrorDO(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.taskId = builder.taskId;
            this.vhostName = builder.vhostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VhostErrorDO create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public Integer getErrorMessage() {
            return this.errorMessage;
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
            private Integer errorMessage; 
            private Long taskId; 
            private String vhostName; 

            private Builder() {
            } 

            private Builder(VhostErrorDO model) {
                this.errorMessage = model.errorMessage;
                this.taskId = model.taskId;
                this.vhostName = model.vhostName;
            } 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(Integer errorMessage) {
                this.errorMessage = errorMessage;
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

            public VhostErrorDO build() {
                return new VhostErrorDO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVhostErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVhostErrorByTaskIdResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VhostErrorDO")
        private java.util.List<VhostErrorDO> vhostErrorDO;

        private VoList(Builder builder) {
            this.vhostErrorDO = builder.vhostErrorDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return vhostErrorDO
         */
        public java.util.List<VhostErrorDO> getVhostErrorDO() {
            return this.vhostErrorDO;
        }

        public static final class Builder {
            private java.util.List<VhostErrorDO> vhostErrorDO; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.vhostErrorDO = model.vhostErrorDO;
            } 

            /**
             * VhostErrorDO.
             */
            public Builder vhostErrorDO(java.util.List<VhostErrorDO> vhostErrorDO) {
                this.vhostErrorDO = vhostErrorDO;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVhostErrorByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVhostErrorByTaskIdResponseBody</p>
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
