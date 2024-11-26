// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApiRouteConflictInfo} extends {@link TeaModel}
 *
 * <p>ApiRouteConflictInfo</p>
 */
public class ApiRouteConflictInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conflicts")
    private java.util.List < Conflicts> conflicts;

    @com.aliyun.core.annotation.NameInMap("domainInfo")
    private DomainInfo domainInfo;

    private ApiRouteConflictInfo(Builder builder) {
        this.conflicts = builder.conflicts;
        this.domainInfo = builder.domainInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiRouteConflictInfo create() {
        return builder().build();
    }

    /**
     * @return conflicts
     */
    public java.util.List < Conflicts> getConflicts() {
        return this.conflicts;
    }

    /**
     * @return domainInfo
     */
    public DomainInfo getDomainInfo() {
        return this.domainInfo;
    }

    public static final class Builder {
        private java.util.List < Conflicts> conflicts; 
        private DomainInfo domainInfo; 

        /**
         * conflicts.
         */
        public Builder conflicts(java.util.List < Conflicts> conflicts) {
            this.conflicts = conflicts;
            return this;
        }

        /**
         * domainInfo.
         */
        public Builder domainInfo(DomainInfo domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }

        public ApiRouteConflictInfo build() {
            return new ApiRouteConflictInfo(this);
        } 

    } 

    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class OperationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("operationId")
        private String operationId;

        private OperationInfo(Builder builder) {
            this.name = builder.name;
            this.operationId = builder.operationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        public static final class Builder {
            private String name; 
            private String operationId; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * operationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            public OperationInfo build() {
                return new OperationInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class ConflictingMatch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("match")
        private HttpRouteMatch match;

        @com.aliyun.core.annotation.NameInMap("operationInfo")
        private OperationInfo operationInfo;

        private ConflictingMatch(Builder builder) {
            this.match = builder.match;
            this.operationInfo = builder.operationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConflictingMatch create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        /**
         * @return operationInfo
         */
        public OperationInfo getOperationInfo() {
            return this.operationInfo;
        }

        public static final class Builder {
            private HttpRouteMatch match; 
            private OperationInfo operationInfo; 

            /**
             * match.
             */
            public Builder match(HttpRouteMatch match) {
                this.match = match;
                return this;
            }

            /**
             * operationInfo.
             */
            public Builder operationInfo(OperationInfo operationInfo) {
                this.operationInfo = operationInfo;
                return this;
            }

            public ConflictingMatch build() {
                return new ConflictingMatch(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class DetectedMatchOperationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("operationId")
        private String operationId;

        private DetectedMatchOperationInfo(Builder builder) {
            this.name = builder.name;
            this.operationId = builder.operationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectedMatchOperationInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        public static final class Builder {
            private String name; 
            private String operationId; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * operationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            public DetectedMatchOperationInfo build() {
                return new DetectedMatchOperationInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class DetectedMatch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("match")
        private HttpRouteMatch match;

        @com.aliyun.core.annotation.NameInMap("operationInfo")
        private DetectedMatchOperationInfo operationInfo;

        private DetectedMatch(Builder builder) {
            this.match = builder.match;
            this.operationInfo = builder.operationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectedMatch create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        /**
         * @return operationInfo
         */
        public DetectedMatchOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

        public static final class Builder {
            private HttpRouteMatch match; 
            private DetectedMatchOperationInfo operationInfo; 

            /**
             * match.
             */
            public Builder match(HttpRouteMatch match) {
                this.match = match;
                return this;
            }

            /**
             * operationInfo.
             */
            public Builder operationInfo(DetectedMatchOperationInfo operationInfo) {
                this.operationInfo = operationInfo;
                return this;
            }

            public DetectedMatch build() {
                return new DetectedMatch(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conflictingMatch")
        private ConflictingMatch conflictingMatch;

        @com.aliyun.core.annotation.NameInMap("detectedMatch")
        private DetectedMatch detectedMatch;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        private Details(Builder builder) {
            this.conflictingMatch = builder.conflictingMatch;
            this.detectedMatch = builder.detectedMatch;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return conflictingMatch
         */
        public ConflictingMatch getConflictingMatch() {
            return this.conflictingMatch;
        }

        /**
         * @return detectedMatch
         */
        public DetectedMatch getDetectedMatch() {
            return this.detectedMatch;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private ConflictingMatch conflictingMatch; 
            private DetectedMatch detectedMatch; 
            private String level; 

            /**
             * conflictingMatch.
             */
            public Builder conflictingMatch(ConflictingMatch conflictingMatch) {
                this.conflictingMatch = conflictingMatch;
                return this;
            }

            /**
             * detectedMatch.
             */
            public Builder detectedMatch(DetectedMatch detectedMatch) {
                this.detectedMatch = detectedMatch;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class EnvironmentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private EnvironmentInfo(Builder builder) {
            this.environmentId = builder.environmentId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentInfo create() {
            return builder().build();
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String environmentId; 
            private String name; 

            /**
             * environmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EnvironmentInfo build() {
                return new EnvironmentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class RouteInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("routeId")
        private String routeId;

        private RouteInfo(Builder builder) {
            this.name = builder.name;
            this.routeId = builder.routeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return routeId
         */
        public String getRouteId() {
            return this.routeId;
        }

        public static final class Builder {
            private String name; 
            private String routeId; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * routeId.
             */
            public Builder routeId(String routeId) {
                this.routeId = routeId;
                return this;
            }

            public RouteInfo build() {
                return new RouteInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class Conflicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("details")
        private java.util.List < Details> details;

        @com.aliyun.core.annotation.NameInMap("environmentInfo")
        private EnvironmentInfo environmentInfo;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("routeInfo")
        private RouteInfo routeInfo;

        private Conflicts(Builder builder) {
            this.details = builder.details;
            this.environmentInfo = builder.environmentInfo;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.routeInfo = builder.routeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conflicts create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return environmentInfo
         */
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return routeInfo
         */
        public RouteInfo getRouteInfo() {
            return this.routeInfo;
        }

        public static final class Builder {
            private java.util.List < Details> details; 
            private EnvironmentInfo environmentInfo; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private RouteInfo routeInfo; 

            /**
             * details.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * environmentInfo.
             */
            public Builder environmentInfo(EnvironmentInfo environmentInfo) {
                this.environmentInfo = environmentInfo;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * resourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * routeInfo.
             */
            public Builder routeInfo(RouteInfo routeInfo) {
                this.routeInfo = routeInfo;
                return this;
            }

            public Conflicts build() {
                return new Conflicts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApiRouteConflictInfo} extends {@link TeaModel}
     *
     * <p>ApiRouteConflictInfo</p>
     */
    public static class DomainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private DomainInfo(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfo create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String domainId; 
            private String name; 

            /**
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
}
