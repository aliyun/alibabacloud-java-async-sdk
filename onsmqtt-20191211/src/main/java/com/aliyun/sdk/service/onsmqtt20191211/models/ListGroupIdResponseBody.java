// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20191211.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupIdResponseBody</p>
 */
public class ListGroupIdResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListGroupIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupIdResponseBody create() {
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGroupIdResponseBody build() {
            return new ListGroupIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.groupId = builder.groupId;
            this.independentNaming = builder.independentNaming;
            this.instanceId = builder.instanceId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return independentNaming
         */
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String groupId; 
            private Boolean independentNaming; 
            private String instanceId; 
            private Long updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * IndependentNaming.
             */
            public Builder independentNaming(Boolean independentNaming) {
                this.independentNaming = independentNaming;
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
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
