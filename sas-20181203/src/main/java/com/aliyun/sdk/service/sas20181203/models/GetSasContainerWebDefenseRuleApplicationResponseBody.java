// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSasContainerWebDefenseRuleApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetSasContainerWebDefenseRuleApplicationResponseBody</p>
 */
public class GetSasContainerWebDefenseRuleApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerWebDefenseAppList")
    private java.util.List < ContainerWebDefenseAppList> containerWebDefenseAppList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The applications.</p>
         */
        public Builder containerWebDefenseAppList(java.util.List < ContainerWebDefenseAppList> containerWebDefenseAppList) {
            this.containerWebDefenseAppList = containerWebDefenseAppList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSasContainerWebDefenseRuleApplicationResponseBody build() {
            return new GetSasContainerWebDefenseRuleApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSasContainerWebDefenseRuleApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetSasContainerWebDefenseRuleApplicationResponseBody</p>
     */
    public static class ContainerWebDefenseAppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("Tag")
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
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5944922169365****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the container cluster.</p>
             * <blockquote>
             * <p> The IDs of clusters can be obtained by using the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cfb41a869c71e4678a97021582dd8****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the application was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1677839038000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1667891185000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>143761</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>403327</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The value of the application label.</p>
             * 
             * <strong>example:</strong>
             * <p>app:test</p>
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
