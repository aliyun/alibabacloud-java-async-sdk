// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link CheckServiceLinkedRoleEfloCnpForDeletingResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleEfloCnpForDeletingResponseBody</p>
 */
public class CheckServiceLinkedRoleEfloCnpForDeletingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Deletable")
    private Boolean deletable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    private CheckServiceLinkedRoleEfloCnpForDeletingResponseBody(Builder builder) {
        this.deletable = builder.deletable;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleEfloCnpForDeletingResponseBody create() {
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
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private Boolean deletable; 
        private String requestId; 
        private java.util.List<Resources> resources; 

        private Builder() {
        } 

        private Builder(CheckServiceLinkedRoleEfloCnpForDeletingResponseBody model) {
            this.deletable = model.deletable;
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * <p>Indicates whether the SLR can be deleted. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The SLR can be deleted.</li>
         * <li><code>false</code>: The SLR cannot be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder deletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>6C212C4A-2CB3-56E6-BA2F-1CE2B03C5C94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        public CheckServiceLinkedRoleEfloCnpForDeletingResponseBody build() {
            return new CheckServiceLinkedRoleEfloCnpForDeletingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckServiceLinkedRoleEfloCnpForDeletingResponseBody} extends {@link TeaModel}
     *
     * <p>CheckServiceLinkedRoleEfloCnpForDeletingResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List<String> resources;

        private Resources(Builder builder) {
            this.region = builder.region;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
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

            private Builder(Resources model) {
                this.region = model.region;
                this.resources = model.resources;
            } 

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The resources.</p>
             */
            public Builder resources(java.util.List<String> resources) {
                this.resources = resources;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
