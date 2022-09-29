// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReceiverByParamResponseBody} extends {@link TeaModel}
 *
 * <p>QueryReceiverByParamResponseBody</p>
 */
public class QueryReceiverByParamResponseBody extends TeaModel {
    @NameInMap("NextStart")
    private String nextStart;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("data")
    private Data data;

    private QueryReceiverByParamResponseBody(Builder builder) {
        this.nextStart = builder.nextStart;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReceiverByParamResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextStart
     */
    public String getNextStart() {
        return this.nextStart;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String nextStart; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

        /**
         * NextStart.
         */
        public Builder nextStart(String nextStart) {
            this.nextStart = nextStart;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryReceiverByParamResponseBody build() {
            return new QueryReceiverByParamResponseBody(this);
        } 

    } 

    public static class Receiver extends TeaModel {
        @NameInMap("Count")
        private String count;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("ReceiverId")
        private String receiverId;

        @NameInMap("ReceiversAlias")
        private String receiversAlias;

        @NameInMap("ReceiversName")
        private String receiversName;

        @NameInMap("ReceiversStatus")
        private String receiversStatus;

        @NameInMap("UtcCreateTime")
        private Long utcCreateTime;

        private Receiver(Builder builder) {
            this.count = builder.count;
            this.createTime = builder.createTime;
            this.desc = builder.desc;
            this.receiverId = builder.receiverId;
            this.receiversAlias = builder.receiversAlias;
            this.receiversName = builder.receiversName;
            this.receiversStatus = builder.receiversStatus;
            this.utcCreateTime = builder.utcCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Receiver create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return receiverId
         */
        public String getReceiverId() {
            return this.receiverId;
        }

        /**
         * @return receiversAlias
         */
        public String getReceiversAlias() {
            return this.receiversAlias;
        }

        /**
         * @return receiversName
         */
        public String getReceiversName() {
            return this.receiversName;
        }

        /**
         * @return receiversStatus
         */
        public String getReceiversStatus() {
            return this.receiversStatus;
        }

        /**
         * @return utcCreateTime
         */
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public static final class Builder {
            private String count; 
            private String createTime; 
            private String desc; 
            private String receiverId; 
            private String receiversAlias; 
            private String receiversName; 
            private String receiversStatus; 
            private Long utcCreateTime; 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * ReceiverId.
             */
            public Builder receiverId(String receiverId) {
                this.receiverId = receiverId;
                return this;
            }

            /**
             * ReceiversAlias.
             */
            public Builder receiversAlias(String receiversAlias) {
                this.receiversAlias = receiversAlias;
                return this;
            }

            /**
             * ReceiversName.
             */
            public Builder receiversName(String receiversName) {
                this.receiversName = receiversName;
                return this;
            }

            /**
             * ReceiversStatus.
             */
            public Builder receiversStatus(String receiversStatus) {
                this.receiversStatus = receiversStatus;
                return this;
            }

            /**
             * UtcCreateTime.
             */
            public Builder utcCreateTime(Long utcCreateTime) {
                this.utcCreateTime = utcCreateTime;
                return this;
            }

            public Receiver build() {
                return new Receiver(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("receiver")
        private java.util.List < Receiver> receiver;

        private Data(Builder builder) {
            this.receiver = builder.receiver;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return receiver
         */
        public java.util.List < Receiver> getReceiver() {
            return this.receiver;
        }

        public static final class Builder {
            private java.util.List < Receiver> receiver; 

            /**
             * receiver.
             */
            public Builder receiver(java.util.List < Receiver> receiver) {
                this.receiver = receiver;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
