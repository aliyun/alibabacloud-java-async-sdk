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
 * {@link ListQueueResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueueResponseBody</p>
 */
public class ListQueueResponseBody extends TeaModel {
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

    private ListQueueResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueueResponseBody create() {
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

        private Builder(ListQueueResponseBody model) {
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

        public ListQueueResponseBody build() {
            return new ListQueueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueResponseBody</p>
     */
    public static class QueueVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccumulationCount")
        private Long accumulationCount;

        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.Map<String, ?> attributes;

        @com.aliyun.core.annotation.NameInMap("AutoDelete")
        private Boolean autoDelete;

        @com.aliyun.core.annotation.NameInMap("CanDelete")
        private Boolean canDelete;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Durable")
        private Boolean durable;

        @com.aliyun.core.annotation.NameInMap("Exclusive")
        private Boolean exclusive;

        @com.aliyun.core.annotation.NameInMap("LastConsumeTime")
        private Long lastConsumeTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("VhostName")
        private String vhostName;

        private QueueVO(Builder builder) {
            this.accumulationCount = builder.accumulationCount;
            this.attributes = builder.attributes;
            this.autoDelete = builder.autoDelete;
            this.canDelete = builder.canDelete;
            this.createTime = builder.createTime;
            this.durable = builder.durable;
            this.exclusive = builder.exclusive;
            this.lastConsumeTime = builder.lastConsumeTime;
            this.name = builder.name;
            this.vhostName = builder.vhostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueVO create() {
            return builder().build();
        }

        /**
         * @return accumulationCount
         */
        public Long getAccumulationCount() {
            return this.accumulationCount;
        }

        /**
         * @return attributes
         */
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        /**
         * @return autoDelete
         */
        public Boolean getAutoDelete() {
            return this.autoDelete;
        }

        /**
         * @return canDelete
         */
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return durable
         */
        public Boolean getDurable() {
            return this.durable;
        }

        /**
         * @return exclusive
         */
        public Boolean getExclusive() {
            return this.exclusive;
        }

        /**
         * @return lastConsumeTime
         */
        public Long getLastConsumeTime() {
            return this.lastConsumeTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vhostName
         */
        public String getVhostName() {
            return this.vhostName;
        }

        public static final class Builder {
            private Long accumulationCount; 
            private java.util.Map<String, ?> attributes; 
            private Boolean autoDelete; 
            private Boolean canDelete; 
            private Long createTime; 
            private Boolean durable; 
            private Boolean exclusive; 
            private Long lastConsumeTime; 
            private String name; 
            private String vhostName; 

            private Builder() {
            } 

            private Builder(QueueVO model) {
                this.accumulationCount = model.accumulationCount;
                this.attributes = model.attributes;
                this.autoDelete = model.autoDelete;
                this.canDelete = model.canDelete;
                this.createTime = model.createTime;
                this.durable = model.durable;
                this.exclusive = model.exclusive;
                this.lastConsumeTime = model.lastConsumeTime;
                this.name = model.name;
                this.vhostName = model.vhostName;
            } 

            /**
             * AccumulationCount.
             */
            public Builder accumulationCount(Long accumulationCount) {
                this.accumulationCount = accumulationCount;
                return this;
            }

            /**
             * Attributes.
             */
            public Builder attributes(java.util.Map<String, ?> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * AutoDelete.
             */
            public Builder autoDelete(Boolean autoDelete) {
                this.autoDelete = autoDelete;
                return this;
            }

            /**
             * CanDelete.
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * Exclusive.
             */
            public Builder exclusive(Boolean exclusive) {
                this.exclusive = exclusive;
                return this;
            }

            /**
             * LastConsumeTime.
             */
            public Builder lastConsumeTime(Long lastConsumeTime) {
                this.lastConsumeTime = lastConsumeTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VhostName.
             */
            public Builder vhostName(String vhostName) {
                this.vhostName = vhostName;
                return this;
            }

            public QueueVO build() {
                return new QueueVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueueVO")
        private java.util.List<QueueVO> queueVO;

        private VoList(Builder builder) {
            this.queueVO = builder.queueVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return queueVO
         */
        public java.util.List<QueueVO> getQueueVO() {
            return this.queueVO;
        }

        public static final class Builder {
            private java.util.List<QueueVO> queueVO; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.queueVO = model.queueVO;
            } 

            /**
             * QueueVO.
             */
            public Builder queueVO(java.util.List<QueueVO> queueVO) {
                this.queueVO = queueVO;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueueResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueResponseBody</p>
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
