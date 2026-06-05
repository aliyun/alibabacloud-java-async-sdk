// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeComfyProductionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComfyProductionsResponseBody</p>
 */
public class DescribeComfyProductionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Productions")
    private java.util.List<Productions> productions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeComfyProductionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productions = builder.productions;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComfyProductionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productions
     */
    public java.util.List<Productions> getProductions() {
        return this.productions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<Productions> productions; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeComfyProductionsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.productions = model.productions;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * Productions.
         */
        public Builder productions(java.util.List<Productions> productions) {
            this.productions = productions;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeComfyProductionsResponseBody build() {
            return new DescribeComfyProductionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeComfyProductionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeComfyProductionsResponseBody</p>
     */
    public static class Productions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComfyTaskId")
        private String comfyTaskId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("ProductionId")
        private String productionId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private String updatedTime;

        private Productions(Builder builder) {
            this.comfyTaskId = builder.comfyTaskId;
            this.creationTime = builder.creationTime;
            this.fileName = builder.fileName;
            this.productionId = builder.productionId;
            this.state = builder.state;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Productions create() {
            return builder().build();
        }

        /**
         * @return comfyTaskId
         */
        public String getComfyTaskId() {
            return this.comfyTaskId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return productionId
         */
        public String getProductionId() {
            return this.productionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String comfyTaskId; 
            private String creationTime; 
            private String fileName; 
            private String productionId; 
            private String state; 
            private String updatedTime; 

            private Builder() {
            } 

            private Builder(Productions model) {
                this.comfyTaskId = model.comfyTaskId;
                this.creationTime = model.creationTime;
                this.fileName = model.fileName;
                this.productionId = model.productionId;
                this.state = model.state;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * ComfyTaskId.
             */
            public Builder comfyTaskId(String comfyTaskId) {
                this.comfyTaskId = comfyTaskId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * ProductionId.
             */
            public Builder productionId(String productionId) {
                this.productionId = productionId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Productions build() {
                return new Productions(this);
            } 

        } 

    }
}
