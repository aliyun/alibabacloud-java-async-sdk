// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPreferredEcsTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPreferredEcsTypesResponseBody</p>
 */
public class ListPreferredEcsTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Series")
    private Series series;

    @NameInMap("SupportSpotInstance")
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Series.
         */
        public Builder series(Series series) {
            this.series = series;
            return this;
        }

        /**
         * SupportSpotInstance.
         */
        public Builder supportSpotInstance(Boolean supportSpotInstance) {
            this.supportSpotInstance = supportSpotInstance;
            return this;
        }

        public ListPreferredEcsTypesResponseBody build() {
            return new ListPreferredEcsTypesResponseBody(this);
        } 

    } 

    public static class Compute extends TeaModel {
        @NameInMap("InstanceTypeId")
        private java.util.List < String > instanceTypeId;

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
        public java.util.List < String > getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public static final class Builder {
            private java.util.List < String > instanceTypeId; 

            /**
             * InstanceTypeId.
             */
            public Builder instanceTypeId(java.util.List < String > instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            public Compute build() {
                return new Compute(this);
            } 

        } 

    }
    public static class Login extends TeaModel {
        @NameInMap("InstanceTypeId")
        private java.util.List < String > instanceTypeId;

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
        public java.util.List < String > getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public static final class Builder {
            private java.util.List < String > instanceTypeId; 

            /**
             * InstanceTypeId.
             */
            public Builder instanceTypeId(java.util.List < String > instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            public Login build() {
                return new Login(this);
            } 

        } 

    }
    public static class Manager extends TeaModel {
        @NameInMap("InstanceTypeId")
        private java.util.List < String > instanceTypeId;

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
        public java.util.List < String > getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public static final class Builder {
            private java.util.List < String > instanceTypeId; 

            /**
             * InstanceTypeId.
             */
            public Builder instanceTypeId(java.util.List < String > instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            public Manager build() {
                return new Manager(this);
            } 

        } 

    }
    public static class Roles extends TeaModel {
        @NameInMap("Compute")
        private Compute compute;

        @NameInMap("Login")
        private Login login;

        @NameInMap("Manager")
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

            /**
             * Compute.
             */
            public Builder compute(Compute compute) {
                this.compute = compute;
                return this;
            }

            /**
             * Login.
             */
            public Builder login(Login login) {
                this.login = login;
                return this;
            }

            /**
             * Manager.
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
    public static class SeriesInfo extends TeaModel {
        @NameInMap("Roles")
        private Roles roles;

        @NameInMap("SeriesId")
        private String seriesId;

        @NameInMap("SeriesName")
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

            /**
             * Roles.
             */
            public Builder roles(Roles roles) {
                this.roles = roles;
                return this;
            }

            /**
             * SeriesId.
             */
            public Builder seriesId(String seriesId) {
                this.seriesId = seriesId;
                return this;
            }

            /**
             * SeriesName.
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
    public static class Series extends TeaModel {
        @NameInMap("SeriesInfo")
        private java.util.List < SeriesInfo> seriesInfo;

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
        public java.util.List < SeriesInfo> getSeriesInfo() {
            return this.seriesInfo;
        }

        public static final class Builder {
            private java.util.List < SeriesInfo> seriesInfo; 

            /**
             * SeriesInfo.
             */
            public Builder seriesInfo(java.util.List < SeriesInfo> seriesInfo) {
                this.seriesInfo = seriesInfo;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
}
