// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetServiceLinkedRoleDeletionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceLinkedRoleDeletionStatusResponseBody</p>
 */
public class GetServiceLinkedRoleDeletionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Reason")
    private Reason reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The reason why the deletion task failed.</p>
         */
        public Builder reason(Reason reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>07194EB1-DB50-4513-A51D-99B30D635AEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li>SUCCEEDED</li>
         * <li>IN_PROGRESS</li>
         * <li>FAILED</li>
         * <li>NOT_STARTED</li>
         * <li>INTERNAL_ERROR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetServiceLinkedRoleDeletionStatusResponseBody build() {
            return new GetServiceLinkedRoleDeletionStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceLinkedRoleDeletionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLinkedRoleDeletionStatusResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List<String> resource;

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
        public java.util.List<String> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List<String> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List<String> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceLinkedRoleDeletionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLinkedRoleDeletionStatusResponseBody</p>
     */
    public static class RoleUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Resources")
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
             * <p>The IDs of the regions in which the resources are to be queried.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The returned resources.</p>
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
    /**
     * 
     * {@link GetServiceLinkedRoleDeletionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLinkedRoleDeletionStatusResponseBody</p>
     */
    public static class RoleUsages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleUsage")
        private java.util.List<RoleUsage> roleUsage;

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
        public java.util.List<RoleUsage> getRoleUsage() {
            return this.roleUsage;
        }

        public static final class Builder {
            private java.util.List<RoleUsage> roleUsage; 

            /**
             * RoleUsage.
             */
            public Builder roleUsage(java.util.List<RoleUsage> roleUsage) {
                this.roleUsage = roleUsage;
                return this;
            }

            public RoleUsages build() {
                return new RoleUsages(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceLinkedRoleDeletionStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLinkedRoleDeletionStatusResponseBody</p>
     */
    public static class Reason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RoleUsages")
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
             * <p>Failure information.</p>
             * 
             * <strong>example:</strong>
             * <p>Service-Linked Role acs:ram::196813227629****:role/aliyunserviceroleforhdr cannot be deleted as it is in use by hdr.aliyuncs.com.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Use resource information of the service linked role.</p>
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
