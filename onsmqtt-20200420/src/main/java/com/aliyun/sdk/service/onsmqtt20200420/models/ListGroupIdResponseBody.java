// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupIdResponseBody</p>
 */
public class ListGroupIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The details of a queried group.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>95996EEB-D894-44FA-A87C-940F5CD9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGroupIdResponseBody build() {
            return new ListGroupIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The time when the group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1564577317000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The queried group that belongs to the ApsaraMQ for MQTT instance.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test1</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether a separate namespace is configured for the ApsaraMQ for MQTT instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A separate namespace is configured for the ApsaraMQ for MQTT instance. Resource names must be unique within an ApsaraMQ for MQTT instance but can be the same across ApsaraMQ for MQTT instances.</li>
             * <li><strong>false</strong>: No separate namespace is configured for the ApsaraMQ for MQTT instance. Resource names must be globally unique within an ApsaraMQ for MQTT instance and across ApsaraMQ for MQTT instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder independentNaming(Boolean independentNaming) {
                this.independentNaming = independentNaming;
                return this;
            }

            /**
             * <p>The ID of the ApsaraMQ for MQTT instance to which the group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>post-cn-45910tj****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the group was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1564577317000</p>
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
