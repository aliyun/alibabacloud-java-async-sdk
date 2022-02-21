// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProvisionConfigsResponseBody</p>
 */
public class ListProvisionConfigsResponseBody extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("provisionConfigs")
    private java.util.List < ProvisionConfigs> provisionConfigs;

    private ListProvisionConfigsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.provisionConfigs = builder.provisionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return provisionConfigs
     */
    public java.util.List < ProvisionConfigs> getProvisionConfigs() {
        return this.provisionConfigs;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < ProvisionConfigs> provisionConfigs; 

        /**
         * 下次查询的起始token	
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 预留实例列表
         */
        public Builder provisionConfigs(java.util.List < ProvisionConfigs> provisionConfigs) {
            this.provisionConfigs = provisionConfigs;
            return this;
        }

        public ListProvisionConfigsResponseBody build() {
            return new ListProvisionConfigsResponseBody(this);
        } 

    } 

    public static class ProvisionConfigs extends TeaModel {
        @NameInMap("current")
        private Long current;

        @NameInMap("currentError")
        private String currentError;

        @NameInMap("resource")
        private String resource;

        @NameInMap("scheduledActions")
        private java.util.List < ScheduledActions > scheduledActions;

        @NameInMap("target")
        private Long target;

        @NameInMap("targetTrackingPolicies")
        private java.util.List < TargetTrackingPolicies > targetTrackingPolicies;

        private ProvisionConfigs(Builder builder) {
            this.current = builder.current;
            this.currentError = builder.currentError;
            this.resource = builder.resource;
            this.scheduledActions = builder.scheduledActions;
            this.target = builder.target;
            this.targetTrackingPolicies = builder.targetTrackingPolicies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProvisionConfigs create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Long getCurrent() {
            return this.current;
        }

        /**
         * @return currentError
         */
        public String getCurrentError() {
            return this.currentError;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return scheduledActions
         */
        public java.util.List < ScheduledActions > getScheduledActions() {
            return this.scheduledActions;
        }

        /**
         * @return target
         */
        public Long getTarget() {
            return this.target;
        }

        /**
         * @return targetTrackingPolicies
         */
        public java.util.List < TargetTrackingPolicies > getTargetTrackingPolicies() {
            return this.targetTrackingPolicies;
        }

        public static final class Builder {
            private Long current; 
            private String currentError; 
            private String resource; 
            private java.util.List < ScheduledActions > scheduledActions; 
            private Long target; 
            private java.util.List < TargetTrackingPolicies > targetTrackingPolicies; 

            /**
             * 实际资源个数
             */
            public Builder current(Long current) {
                this.current = current;
                return this;
            }

            /**
             * 预留实例创建失败时的错误信息
             */
            public Builder currentError(String currentError) {
                this.currentError = currentError;
                return this;
            }

            /**
             * 资源描述
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * 定时策略配置
             */
            public Builder scheduledActions(java.util.List < ScheduledActions > scheduledActions) {
                this.scheduledActions = scheduledActions;
                return this;
            }

            /**
             * 目标资源个数
             */
            public Builder target(Long target) {
                this.target = target;
                return this;
            }

            /**
             * 指标追踪伸缩策略配置
             */
            public Builder targetTrackingPolicies(java.util.List < TargetTrackingPolicies > targetTrackingPolicies) {
                this.targetTrackingPolicies = targetTrackingPolicies;
                return this;
            }

            public ProvisionConfigs build() {
                return new ProvisionConfigs(this);
            } 

        } 

    }
}
