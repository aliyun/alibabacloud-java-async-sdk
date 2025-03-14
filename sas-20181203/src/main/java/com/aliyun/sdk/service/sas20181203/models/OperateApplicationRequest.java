// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link OperateApplicationRequest} extends {@link RequestModel}
 *
 * <p>OperateApplicationRequest</p>
 */
public class OperateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerWebDefenseApplicationDTOS")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private OperateApplicationRequest(Builder builder) {
        super(builder);
        this.containerWebDefenseApplicationDTOS = builder.containerWebDefenseApplicationDTOS;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerWebDefenseApplicationDTOS
     */
    public java.util.List<ContainerWebDefenseApplicationDTOS> getContainerWebDefenseApplicationDTOS() {
        return this.containerWebDefenseApplicationDTOS;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<OperateApplicationRequest, Builder> {
        private java.util.List<ContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(OperateApplicationRequest request) {
            super(request);
            this.containerWebDefenseApplicationDTOS = request.containerWebDefenseApplicationDTOS;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The container application that is protected from being tampered with.</p>
         * <p>This parameter is required.</p>
         */
        public Builder containerWebDefenseApplicationDTOS(java.util.List<ContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS) {
            this.putQueryParameter("ContainerWebDefenseApplicationDTOS", containerWebDefenseApplicationDTOS);
            this.containerWebDefenseApplicationDTOS = containerWebDefenseApplicationDTOS;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300566</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public OperateApplicationRequest build() {
            return new OperateApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link OperateApplicationRequest} extends {@link TeaModel}
     *
     * <p>OperateApplicationRequest</p>
     */
    public static class ContainerWebDefenseApplicationDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Flag")
        @com.aliyun.core.annotation.Validation(required = true)
        private String flag;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Tag")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tag;

        private ContainerWebDefenseApplicationDTOS(Builder builder) {
            this.clusterId = builder.clusterId;
            this.flag = builder.flag;
            this.id = builder.id;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerWebDefenseApplicationDTOS create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String clusterId; 
            private String flag; 
            private Long id; 
            private String tag; 

            private Builder() {
            } 

            private Builder(ContainerWebDefenseApplicationDTOS model) {
                this.clusterId = model.clusterId;
                this.flag = model.flag;
                this.id = model.id;
                this.tag = model.tag;
            } 

            /**
             * <p>The ID of the cluster to which the container belongs.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the cluster ID.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ceb68cc58234141828677e383bd21ff0c</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Specifies whether to apply the configuration to the asset. Valid values:</p>
             * <ul>
             * <li><strong>add</strong>: applied</li>
             * <li><strong>del</strong>: not applied</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The application ID. If the application is newly added, you do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>196</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The value of the application tag.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>app:app-003</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public ContainerWebDefenseApplicationDTOS build() {
                return new ContainerWebDefenseApplicationDTOS(this);
            } 

        } 

    }
}
