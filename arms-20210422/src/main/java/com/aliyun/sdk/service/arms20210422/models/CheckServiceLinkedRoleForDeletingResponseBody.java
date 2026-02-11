// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link CheckServiceLinkedRoleForDeletingResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleForDeletingResponseBody</p>
 */
public class CheckServiceLinkedRoleForDeletingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Deletable")
    private Boolean deletable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleUsages")
    private java.util.List<RoleUsages> roleUsages;

    private CheckServiceLinkedRoleForDeletingResponseBody(Builder builder) {
        this.deletable = builder.deletable;
        this.requestId = builder.requestId;
        this.roleUsages = builder.roleUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleForDeletingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletable
     */
    public Boolean getDeletable() {
        return this.deletable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleUsages
     */
    public java.util.List<RoleUsages> getRoleUsages() {
        return this.roleUsages;
    }

    public static final class Builder {
        private Boolean deletable; 
        private String requestId; 
        private java.util.List<RoleUsages> roleUsages; 

        private Builder() {
        } 

        private Builder(CheckServiceLinkedRoleForDeletingResponseBody model) {
            this.deletable = model.deletable;
            this.requestId = model.requestId;
            this.roleUsages = model.roleUsages;
        } 

        /**
         * Deletable.
         */
        public Builder deletable(Boolean deletable) {
            this.deletable = deletable;
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
         * RoleUsages.
         */
        public Builder roleUsages(java.util.List<RoleUsages> roleUsages) {
            this.roleUsages = roleUsages;
            return this;
        }

        public CheckServiceLinkedRoleForDeletingResponseBody build() {
            return new CheckServiceLinkedRoleForDeletingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckServiceLinkedRoleForDeletingResponseBody} extends {@link TeaModel}
     *
     * <p>CheckServiceLinkedRoleForDeletingResponseBody</p>
     */
    public static class RoleUsages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List<String> resources;

        private RoleUsages(Builder builder) {
            this.region = builder.region;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleUsages create() {
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
        public java.util.List<String> getResources() {
            return this.resources;
        }

        public static final class Builder {
            private String region; 
            private java.util.List<String> resources; 

            private Builder() {
            } 

            private Builder(RoleUsages model) {
                this.region = model.region;
                this.resources = model.resources;
            } 

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
            public Builder resources(java.util.List<String> resources) {
                this.resources = resources;
                return this;
            }

            public RoleUsages build() {
                return new RoleUsages(this);
            } 

        } 

    }
}
