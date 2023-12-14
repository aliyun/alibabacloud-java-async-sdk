// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSasContainerWebDefenseRuleApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetSasContainerWebDefenseRuleApplicationResponseBody</p>
 */
public class GetSasContainerWebDefenseRuleApplicationResponseBody extends TeaModel {
    @NameInMap("ContainerWebDefenseAppList")
    private java.util.List < ContainerWebDefenseAppList> containerWebDefenseAppList;

    @NameInMap("RequestId")
    private String requestId;

    private GetSasContainerWebDefenseRuleApplicationResponseBody(Builder builder) {
        this.containerWebDefenseAppList = builder.containerWebDefenseAppList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSasContainerWebDefenseRuleApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerWebDefenseAppList
     */
    public java.util.List < ContainerWebDefenseAppList> getContainerWebDefenseAppList() {
        return this.containerWebDefenseAppList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ContainerWebDefenseAppList> containerWebDefenseAppList; 
        private String requestId; 

        /**
         * The applications.
         */
        public Builder containerWebDefenseAppList(java.util.List < ContainerWebDefenseAppList> containerWebDefenseAppList) {
            this.containerWebDefenseAppList = containerWebDefenseAppList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBody build() {
            return new GetSasContainerWebDefenseRuleApplicationResponseBody(this);
        } 

    } 

    public static class ContainerWebDefenseAppList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("Tag")
        private String tag;

        private ContainerWebDefenseAppList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.clusterId = builder.clusterId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ruleId = builder.ruleId;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerWebDefenseAppList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Long aliUid; 
            private String clusterId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Long ruleId; 
            private String tag; 

            /**
             * The user ID.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The ID of the container cluster.
             * <p>
             * 
             * >  The IDs of clusters can be obtained by using the [DescribeGroupedContainerInstances](~~182997~~) operation.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The time when the application was created. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The last modification time. Unit: milliseconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The value of the application label.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public ContainerWebDefenseAppList build() {
                return new ContainerWebDefenseAppList(this);
            } 

        } 

    }
}
