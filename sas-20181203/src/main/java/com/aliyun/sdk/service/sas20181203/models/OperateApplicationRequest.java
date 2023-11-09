// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateApplicationRequest} extends {@link RequestModel}
 *
 * <p>OperateApplicationRequest</p>
 */
public class OperateApplicationRequest extends Request {
    @Query
    @NameInMap("ContainerWebDefenseApplicationDTOS")
    @Validation(required = true)
    private java.util.List < ContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
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
    public java.util.List < ContainerWebDefenseApplicationDTOS> getContainerWebDefenseApplicationDTOS() {
        return this.containerWebDefenseApplicationDTOS;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<OperateApplicationRequest, Builder> {
        private java.util.List < ContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS; 
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
         * ContainerWebDefenseApplicationDTOS.
         */
        public Builder containerWebDefenseApplicationDTOS(java.util.List < ContainerWebDefenseApplicationDTOS> containerWebDefenseApplicationDTOS) {
            this.putQueryParameter("ContainerWebDefenseApplicationDTOS", containerWebDefenseApplicationDTOS);
            this.containerWebDefenseApplicationDTOS = containerWebDefenseApplicationDTOS;
            return this;
        }

        /**
         * RuleId.
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

    public static class ContainerWebDefenseApplicationDTOS extends TeaModel {
        @NameInMap("ClusterId")
        @Validation(required = true)
        private String clusterId;

        @NameInMap("Flag")
        @Validation(required = true)
        private String flag;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Tag")
        @Validation(required = true)
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

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Flag.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Tag.
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
