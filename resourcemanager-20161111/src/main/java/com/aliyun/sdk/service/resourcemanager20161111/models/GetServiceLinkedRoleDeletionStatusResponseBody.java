// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceLinkedRoleDeletionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceLinkedRoleDeletionStatusResponseBody</p>
 */
public class GetServiceLinkedRoleDeletionStatusResponseBody extends TeaModel {
    @NameInMap("Reason")
    private Reason reason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetServiceLinkedRoleDeletionStatusResponseBody(Builder builder) {
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLinkedRoleDeletionStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return reason
     */
    public Reason getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Reason reason; 
        private String requestId; 
        private String status; 

        /**
         * Reason.
         */
        public Builder reason(Reason reason) {
            this.reason = reason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetServiceLinkedRoleDeletionStatusResponseBody build() {
            return new GetServiceLinkedRoleDeletionStatusResponseBody(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < String > resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < String > getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < String > resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < String > resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class RoleUsage extends TeaModel {
        @NameInMap("Region")
        private String region;

        @NameInMap("Resources")
        private Resources resources;

        private RoleUsage(Builder builder) {
            this.region = builder.region;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleUsage create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resources
         */
        public Resources getResources() {
            return this.resources;
        }

        public static final class Builder {
            private String region; 
            private Resources resources; 

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            public RoleUsage build() {
                return new RoleUsage(this);
            } 

        } 

    }
    public static class RoleUsages extends TeaModel {
        @NameInMap("RoleUsage")
        private java.util.List < RoleUsage> roleUsage;

        private RoleUsages(Builder builder) {
            this.roleUsage = builder.roleUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleUsages create() {
            return builder().build();
        }

        /**
         * @return roleUsage
         */
        public java.util.List < RoleUsage> getRoleUsage() {
            return this.roleUsage;
        }

        public static final class Builder {
            private java.util.List < RoleUsage> roleUsage; 

            /**
             * RoleUsage.
             */
            public Builder roleUsage(java.util.List < RoleUsage> roleUsage) {
                this.roleUsage = roleUsage;
                return this;
            }

            public RoleUsages build() {
                return new RoleUsages(this);
            } 

        } 

    }
    public static class Reason extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("RoleUsages")
        private RoleUsages roleUsages;

        private Reason(Builder builder) {
            this.message = builder.message;
            this.roleUsages = builder.roleUsages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reason create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return roleUsages
         */
        public RoleUsages getRoleUsages() {
            return this.roleUsages;
        }

        public static final class Builder {
            private String message; 
            private RoleUsages roleUsages; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RoleUsages.
             */
            public Builder roleUsages(RoleUsages roleUsages) {
                this.roleUsages = roleUsages;
                return this;
            }

            public Reason build() {
                return new Reason(this);
            } 

        } 

    }
}
