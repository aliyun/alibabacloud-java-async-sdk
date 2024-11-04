// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleDataSource} extends {@link TeaModel}
 *
 * <p>AlertRuleDataSource</p>
 */
public class AlertRuleDataSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dsList")
    private java.util.List < DsList> dsList;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AlertRuleDataSource(Builder builder) {
        this.dsList = builder.dsList;
        this.instanceId = builder.instanceId;
        this.namespace = builder.namespace;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleDataSource create() {
        return builder().build();
    }

    /**
     * @return dsList
     */
    public java.util.List < DsList> getDsList() {
        return this.dsList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < DsList> dsList; 
        private String instanceId; 
        private String namespace; 
        private String type; 

        /**
         * dsList.
         */
        public Builder dsList(java.util.List < DsList> dsList) {
            this.dsList = dsList;
            return this;
        }

        /**
         * <p>实例id，当type=PROMETHEUS_DS/ENTERPRISE_DS时必填，为prometheus实例的clusterId或指标仓库名称</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>数据源类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AlertRuleDataSource build() {
            return new AlertRuleDataSource(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleDataSource} extends {@link TeaModel}
     *
     * <p>AlertRuleDataSource</p>
     */
    public static class DsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("store")
        private String store;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DsList(Builder builder) {
            this.project = builder.project;
            this.regionId = builder.regionId;
            this.store = builder.store;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DsList create() {
            return builder().build();
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return store
         */
        public String getStore() {
            return this.store;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String project; 
            private String regionId; 
            private String store; 
            private String type; 

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * store.
             */
            public Builder store(String store) {
                this.store = store;
                return this;
            }

            /**
             * <p>数据源类型</p>
             * <p>This parameter is required.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DsList build() {
                return new DsList(this);
            } 

        } 

    }
}
