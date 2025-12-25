// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link DBVersionDetail} extends {@link TeaModel}
 *
 * <p>DBVersionDetail</p>
 */
public class DBVersionDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("specs")
    private java.util.List<Specs> specs;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private DBVersionDetail(Builder builder) {
        this.specs = builder.specs;
        this.status = builder.status;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DBVersionDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return specs
     */
    public java.util.List<Specs> getSpecs() {
        return this.specs;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<Specs> specs; 
        private String status; 
        private String version; 

        private Builder() {
        } 

        private Builder(DBVersionDetail model) {
            this.specs = model.specs;
            this.status = model.status;
            this.version = model.version;
        } 

        /**
         * specs.
         */
        public Builder specs(java.util.List<Specs> specs) {
            this.specs = specs;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DBVersionDetail build() {
            return new DBVersionDetail(this);
        } 

    } 

    /**
     * 
     * {@link DBVersionDetail} extends {@link TeaModel}
     *
     * <p>DBVersionDetail</p>
     */
    public static class ComponentSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultReplicas")
        private Integer defaultReplicas;

        @com.aliyun.core.annotation.NameInMap("maxReplicas")
        private Integer maxReplicas;

        @com.aliyun.core.annotation.NameInMap("minReplicas")
        private Integer minReplicas;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("specs")
        private java.util.List<String> specs;

        @com.aliyun.core.annotation.NameInMap("step")
        private Integer step;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ComponentSpecs(Builder builder) {
            this.defaultReplicas = builder.defaultReplicas;
            this.maxReplicas = builder.maxReplicas;
            this.minReplicas = builder.minReplicas;
            this.name = builder.name;
            this.specs = builder.specs;
            this.step = builder.step;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentSpecs create() {
            return builder().build();
        }

        /**
         * @return defaultReplicas
         */
        public Integer getDefaultReplicas() {
            return this.defaultReplicas;
        }

        /**
         * @return maxReplicas
         */
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        /**
         * @return minReplicas
         */
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return specs
         */
        public java.util.List<String> getSpecs() {
            return this.specs;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer defaultReplicas; 
            private Integer maxReplicas; 
            private Integer minReplicas; 
            private String name; 
            private java.util.List<String> specs; 
            private Integer step; 
            private String type; 

            private Builder() {
            } 

            private Builder(ComponentSpecs model) {
                this.defaultReplicas = model.defaultReplicas;
                this.maxReplicas = model.maxReplicas;
                this.minReplicas = model.minReplicas;
                this.name = model.name;
                this.specs = model.specs;
                this.step = model.step;
                this.type = model.type;
            } 

            /**
             * defaultReplicas.
             */
            public Builder defaultReplicas(Integer defaultReplicas) {
                this.defaultReplicas = defaultReplicas;
                return this;
            }

            /**
             * maxReplicas.
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * minReplicas.
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * specs.
             */
            public Builder specs(java.util.List<String> specs) {
                this.specs = specs;
                return this;
            }

            /**
             * step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ComponentSpecs build() {
                return new ComponentSpecs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DBVersionDetail} extends {@link TeaModel}
     *
     * <p>DBVersionDetail</p>
     */
    public static class Specs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentSpecs")
        private java.util.List<ComponentSpecs> componentSpecs;

        @com.aliyun.core.annotation.NameInMap("isHA")
        private Boolean isHA;

        @com.aliyun.core.annotation.NameInMap("isStandalone")
        private Boolean isStandalone;

        @com.aliyun.core.annotation.NameInMap("zoneMode")
        private String zoneMode;

        private Specs(Builder builder) {
            this.componentSpecs = builder.componentSpecs;
            this.isHA = builder.isHA;
            this.isStandalone = builder.isStandalone;
            this.zoneMode = builder.zoneMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specs create() {
            return builder().build();
        }

        /**
         * @return componentSpecs
         */
        public java.util.List<ComponentSpecs> getComponentSpecs() {
            return this.componentSpecs;
        }

        /**
         * @return isHA
         */
        public Boolean getIsHA() {
            return this.isHA;
        }

        /**
         * @return isStandalone
         */
        public Boolean getIsStandalone() {
            return this.isStandalone;
        }

        /**
         * @return zoneMode
         */
        public String getZoneMode() {
            return this.zoneMode;
        }

        public static final class Builder {
            private java.util.List<ComponentSpecs> componentSpecs; 
            private Boolean isHA; 
            private Boolean isStandalone; 
            private String zoneMode; 

            private Builder() {
            } 

            private Builder(Specs model) {
                this.componentSpecs = model.componentSpecs;
                this.isHA = model.isHA;
                this.isStandalone = model.isStandalone;
                this.zoneMode = model.zoneMode;
            } 

            /**
             * componentSpecs.
             */
            public Builder componentSpecs(java.util.List<ComponentSpecs> componentSpecs) {
                this.componentSpecs = componentSpecs;
                return this;
            }

            /**
             * isHA.
             */
            public Builder isHA(Boolean isHA) {
                this.isHA = isHA;
                return this;
            }

            /**
             * isStandalone.
             */
            public Builder isStandalone(Boolean isStandalone) {
                this.isStandalone = isStandalone;
                return this;
            }

            /**
             * zoneMode.
             */
            public Builder zoneMode(String zoneMode) {
                this.zoneMode = zoneMode;
                return this;
            }

            public Specs build() {
                return new Specs(this);
            } 

        } 

    }
}
