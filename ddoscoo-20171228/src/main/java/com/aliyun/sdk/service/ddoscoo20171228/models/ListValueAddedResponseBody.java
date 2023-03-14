// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListValueAddedResponseBody} extends {@link TeaModel}
 *
 * <p>ListValueAddedResponseBody</p>
 */
public class ListValueAddedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ValueAddedList")
    private java.util.List < ValueAddedList> valueAddedList;

    private ListValueAddedResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.valueAddedList = builder.valueAddedList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListValueAddedResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return valueAddedList
     */
    public java.util.List < ValueAddedList> getValueAddedList() {
        return this.valueAddedList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ValueAddedList> valueAddedList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ValueAddedList.
         */
        public Builder valueAddedList(java.util.List < ValueAddedList> valueAddedList) {
            this.valueAddedList = valueAddedList;
            return this;
        }

        public ListValueAddedResponseBody build() {
            return new ListValueAddedResponseBody(this);
        } 

    } 

    public static class ValueAddedList extends TeaModel {
        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LogSize")
        private Long logSize;

        @NameInMap("Status")
        private Integer status;

        private ValueAddedList(Builder builder) {
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.instanceId = builder.instanceId;
            this.logSize = builder.logSize;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueAddedList create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logSize
         */
        public Long getLogSize() {
            return this.logSize;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long expireTime; 
            private Long gmtCreate; 
            private String instanceId; 
            private Long logSize; 
            private Integer status; 

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LogSize.
             */
            public Builder logSize(Long logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ValueAddedList build() {
                return new ValueAddedList(this);
            } 

        } 

    }
}
