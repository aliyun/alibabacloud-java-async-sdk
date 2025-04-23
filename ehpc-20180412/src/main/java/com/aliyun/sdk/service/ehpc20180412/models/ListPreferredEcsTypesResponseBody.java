// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListPreferredEcsTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPreferredEcsTypesResponseBody</p>
 */
public class ListPreferredEcsTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Series")
    private Series series;

    @com.aliyun.core.annotation.NameInMap("SupportSpotInstance")
    private Boolean supportSpotInstance;

    private ListPreferredEcsTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.series = builder.series;
        this.supportSpotInstance = builder.supportSpotInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPreferredEcsTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return series
     */
    public Series getSeries() {
        return this.series;
    }

    /**
     * @return supportSpotInstance
     */
    public Boolean getSupportSpotInstance() {
        return this.supportSpotInstance;
    }

    public static final class Builder {
        private String requestId; 
        private Series series; 
        private Boolean supportSpotInstance; 

        private Builder() {
        } 

        private Builder(ListPreferredEcsTypesResponseBody model) {
            this.requestId = model.requestId;
            this.series = model.series;
            this.supportSpotInstance = model.supportSpotInstance;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of recommended ECS instances. Each SeriesInfo element contains the recommended ECS instance types for various nodes in the E-HPC cluster.</p>
         */
        public Builder series(Series series) {
            this.series = series;
            return this;
        }

        /**
         * <p>Indicates whether preemptible instances are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportSpotInstance(Boolean supportSpotInstance) {
            this.supportSpotInstance = supportSpotInstance;
            return this;
        }

        public ListPreferredEcsTypesResponseBody build() {
            return new ListPreferredEcsTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPreferredEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPreferredEcsTypesResponseBody</p>
     */
    public static class Compute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private java.util.List<String> instanceTypeId;

        private Compute(Builder builder) {
            this.instanceTypeId = builder.instanceTypeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Compute create() {
            return builder().build();
        }

        /**
         * @return instanceTypeId
         */
        public java.util.List<String> getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public static final class Builder {
            private java.util.List<String> instanceTypeId; 

            private Builder() {
            } 

            private Builder(Compute model) {
                this.instanceTypeId = model.instanceTypeId;
            } 

            /**
             * InstanceTypeId.
             */
            public Builder instanceTypeId(java.util.List<String> instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            public Compute build() {
                return new Compute(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPreferredEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPreferredEcsTypesResponseBody</p>
     */
    public static class Login extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private java.util.List<String> instanceTypeId;

        private Login(Builder builder) {
            this.instanceTypeId = builder.instanceTypeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Login create() {
            return builder().build();
        }

        /**
         * @return instanceTypeId
         */
        public java.util.List<String> getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public static final class Builder {
            private java.util.List<String> instanceTypeId; 

            private Builder() {
            } 

            private Builder(Login model) {
                this.instanceTypeId = model.instanceTypeId;
            } 

            /**
             * InstanceTypeId.
             */
            public Builder instanceTypeId(java.util.List<String> instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            public Login build() {
                return new Login(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPreferredEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPreferredEcsTypesResponseBody</p>
     */
    public static class Manager extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private java.util.List<String> instanceTypeId;

        private Manager(Builder builder) {
            this.instanceTypeId = builder.instanceTypeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manager create() {
            return builder().build();
        }

        /**
         * @return instanceTypeId
         */
        public java.util.List<String> getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public static final class Builder {
            private java.util.List<String> instanceTypeId; 

            private Builder() {
            } 

            private Builder(Manager model) {
                this.instanceTypeId = model.instanceTypeId;
            } 

            /**
             * InstanceTypeId.
             */
            public Builder instanceTypeId(java.util.List<String> instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            public Manager build() {
                return new Manager(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPreferredEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPreferredEcsTypesResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compute")
        private Compute compute;

        @com.aliyun.core.annotation.NameInMap("Login")
        private Login login;

        @com.aliyun.core.annotation.NameInMap("Manager")
        private Manager manager;

        private Roles(Builder builder) {
            this.compute = builder.compute;
            this.login = builder.login;
            this.manager = builder.manager;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return compute
         */
        public Compute getCompute() {
            return this.compute;
        }

        /**
         * @return login
         */
        public Login getLogin() {
            return this.login;
        }

        /**
         * @return manager
         */
        public Manager getManager() {
            return this.manager;
        }

        public static final class Builder {
            private Compute compute; 
            private Login login; 
            private Manager manager; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.compute = model.compute;
                this.login = model.login;
                this.manager = model.manager;
            } 

            /**
             * <p>The list of recommended ECS instance types for compute nodes.</p>
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * <p>The list of recommended ECS instance types for logon nodes.</p>
             */
            public Builder login(Login login) {
                this.login = login;
                return this;
            }

            /**
             * <p>The list of recommended ECS instance types for management nodes.</p>
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPreferredEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPreferredEcsTypesResponseBody</p>
     */
    public static class SeriesInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Roles")
        private Roles roles;

        @com.aliyun.core.annotation.NameInMap("SeriesId")
        private String seriesId;

        @com.aliyun.core.annotation.NameInMap("SeriesName")
        private String seriesName;

        private SeriesInfo(Builder builder) {
            this.roles = builder.roles;
            this.seriesId = builder.seriesId;
            this.seriesName = builder.seriesName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeriesInfo create() {
            return builder().build();
        }

        /**
         * @return roles
         */
        public Roles getRoles() {
            return this.roles;
        }

        /**
         * @return seriesId
         */
        public String getSeriesId() {
            return this.seriesId;
        }

        /**
         * @return seriesName
         */
        public String getSeriesName() {
            return this.seriesName;
        }

        public static final class Builder {
            private Roles roles; 
            private String seriesId; 
            private String seriesName; 

            private Builder() {
            } 

            private Builder(SeriesInfo model) {
                this.roles = model.roles;
                this.seriesId = model.seriesId;
                this.seriesName = model.seriesName;
            } 

            /**
             * <p>Recommended instance types for nodes in an E-HPC cluser.</p>
             */
            public Builder roles(Roles roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The ID of the ECS instance series. Valid values:</p>
             * <ul>
             * <li>HighCompute: compute-optimized instance families</li>
             * <li>HighMem: memory-optimized instance families</li>
             * <li>GPU: GPU-accelerated instance families</li>
             * <li>All: all instance families</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder seriesId(String seriesId) {
                this.seriesId = seriesId;
                return this;
            }

            /**
             * <p>The name of the instance series. Valid values:</p>
             * <ul>
             * <li>SeriesHighCompute</li>
             * <li>SeriesHighMem</li>
             * <li>SeriesGPU</li>
             * <li>SeriesAll</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SeriesAll</p>
             */
            public Builder seriesName(String seriesName) {
                this.seriesName = seriesName;
                return this;
            }

            public SeriesInfo build() {
                return new SeriesInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPreferredEcsTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPreferredEcsTypesResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SeriesInfo")
        private java.util.List<SeriesInfo> seriesInfo;

        private Series(Builder builder) {
            this.seriesInfo = builder.seriesInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return seriesInfo
         */
        public java.util.List<SeriesInfo> getSeriesInfo() {
            return this.seriesInfo;
        }

        public static final class Builder {
            private java.util.List<SeriesInfo> seriesInfo; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.seriesInfo = model.seriesInfo;
            } 

            /**
             * SeriesInfo.
             */
            public Builder seriesInfo(java.util.List<SeriesInfo> seriesInfo) {
                this.seriesInfo = seriesInfo;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
}
