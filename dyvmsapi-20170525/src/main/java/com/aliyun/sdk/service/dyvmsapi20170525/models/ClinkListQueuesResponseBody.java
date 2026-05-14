// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkListQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkListQueuesResponseBody</p>
 */
public class ClinkListQueuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkListQueuesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListQueuesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkListQueuesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
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

        public ClinkListQueuesResponseBody build() {
            return new ClinkListQueuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListQueuesResponseBody</p>
     */
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallClientNum")
        private Long callClientNum;

        @com.aliyun.core.annotation.NameInMap("ChatClientNum")
        private Long chatClientNum;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OmniClientNum")
        private Long omniClientNum;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        private Queues(Builder builder) {
            this.callClientNum = builder.callClientNum;
            this.chatClientNum = builder.chatClientNum;
            this.id = builder.id;
            this.name = builder.name;
            this.omniClientNum = builder.omniClientNum;
            this.qno = builder.qno;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queues create() {
            return builder().build();
        }

        /**
         * @return callClientNum
         */
        public Long getCallClientNum() {
            return this.callClientNum;
        }

        /**
         * @return chatClientNum
         */
        public Long getChatClientNum() {
            return this.chatClientNum;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return omniClientNum
         */
        public Long getOmniClientNum() {
            return this.omniClientNum;
        }

        /**
         * @return qno
         */
        public String getQno() {
            return this.qno;
        }

        public static final class Builder {
            private Long callClientNum; 
            private Long chatClientNum; 
            private Long id; 
            private String name; 
            private Long omniClientNum; 
            private String qno; 

            private Builder() {
            } 

            private Builder(Queues model) {
                this.callClientNum = model.callClientNum;
                this.chatClientNum = model.chatClientNum;
                this.id = model.id;
                this.name = model.name;
                this.omniClientNum = model.omniClientNum;
                this.qno = model.qno;
            } 

            /**
             * <p>呼叫中心座席数</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder callClientNum(Long callClientNum) {
                this.callClientNum = callClientNum;
                return this;
            }

            /**
             * <p>在线客服数</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder chatClientNum(Long chatClientNum) {
                this.chatClientNum = chatClientNum;
                return this;
            }

            /**
             * <p>队列 Id</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>队列名</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>全渠道座席数</p>
             * 
             * <strong>example:</strong>
             * <p>87</p>
             */
            public Builder omniClientNum(Long omniClientNum) {
                this.omniClientNum = omniClientNum;
                return this;
            }

            /**
             * <p>队列号</p>
             * 
             * <strong>example:</strong>
             * <p>1221</p>
             */
            public Builder qno(String qno) {
                this.qno = qno;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListQueuesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Queues")
        private java.util.List<Queues> queues;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.clinkRequestId = builder.clinkRequestId;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.queues = builder.queues;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return queues
         */
        public java.util.List<Queues> getQueues() {
            return this.queues;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String clinkRequestId; 
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List<Queues> queues; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clinkRequestId = model.clinkRequestId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.queues = model.queues;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>本次请求id</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>分页大小</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>queues</p>
             */
            public Builder queues(java.util.List<Queues> queues) {
                this.queues = queues;
                return this;
            }

            /**
             * <p>总数</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
