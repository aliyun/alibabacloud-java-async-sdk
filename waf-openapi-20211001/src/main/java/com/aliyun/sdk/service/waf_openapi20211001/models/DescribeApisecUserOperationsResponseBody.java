// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApisecUserOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecUserOperationsResponseBody</p>
 */
public class DescribeApisecUserOperationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApisecUserOperationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecUserOperationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * <p>The operation records.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C9825654-327B-5156-A570-847054B4CF10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApisecUserOperationsResponseBody build() {
            return new DescribeApisecUserOperationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecUserOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecUserOperationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromStatus")
        private String fromStatus;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("ToStatus")
        private String toStatus;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.fromStatus = builder.fromStatus;
            this.note = builder.note;
            this.objectId = builder.objectId;
            this.time = builder.time;
            this.toStatus = builder.toStatus;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fromStatus
         */
        public String getFromStatus() {
            return this.fromStatus;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return toStatus
         */
        public String getToStatus() {
            return this.toStatus;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String fromStatus; 
            private String note; 
            private String objectId; 
            private Long time; 
            private String toStatus; 
            private String type; 
            private String userId; 

            /**
             * <p>The state before the operation.</p>
             * <p>Valid values of the risk state:</p>
             * <ul>
             * <li><strong>toBeConfirmed</strong></li>
             * <li><strong>confirmed</strong></li>
             * <li><strong>toBeFixed</strong></li>
             * <li><strong>fixed</strong></li>
             * <li><strong>ignored</strong></li>
             * </ul>
             * <p>Valid values of the event state:</p>
             * <ul>
             * <li><strong>toBeConfirmed</strong></li>
             * <li><strong>confirmed</strong></li>
             * <li><strong>ignored</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ignored</p>
             */
            public Builder fromStatus(String fromStatus) {
                this.fromStatus = fromStatus;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Handled</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The object ID of the operation record.</p>
             * 
             * <strong>example:</strong>
             * <p>24d997acc48a67a01e09b9c5ad861287</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The time at which the operation was performed. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1685072214</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The state after the operation.</p>
             * <p>Valid values of the risk state:</p>
             * <ul>
             * <li><strong>toBeConfirmed</strong></li>
             * <li><strong>confirmed</strong></li>
             * <li><strong>toBeFixed</strong></li>
             * <li><strong>fixed</strong></li>
             * <li><strong>ignored</strong></li>
             * </ul>
             * <p>Valid values of the event state:</p>
             * <ul>
             * <li><strong>toBeConfirmed</strong></li>
             * <li><strong>confirmed</strong></li>
             * <li><strong>ignored</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Confirmed</p>
             */
            public Builder toStatus(String toStatus) {
                this.toStatus = toStatus;
                return this;
            }

            /**
             * <p>The type of the operation record. Valid values:</p>
             * <ul>
             * <li><strong>abnormal</strong>: risk detection</li>
             * <li><strong>event</strong>: security event</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>abnormal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1610954****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
