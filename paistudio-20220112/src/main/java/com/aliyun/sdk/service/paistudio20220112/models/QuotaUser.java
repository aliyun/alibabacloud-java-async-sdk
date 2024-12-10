// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuotaUser} extends {@link TeaModel}
 *
 * <p>QuotaUser</p>
 */
public class QuotaUser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Resources")
    private Resources resources;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.NameInMap("WorkloadCount")
    private Integer workloadCount;

    private QuotaUser(Builder builder) {
        this.resources = builder.resources;
        this.userId = builder.userId;
        this.username = builder.username;
        this.workloadCount = builder.workloadCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaUser create() {
        return builder().build();
    }

    /**
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workloadCount
     */
    public Integer getWorkloadCount() {
        return this.workloadCount;
    }

    public static final class Builder {
        private Resources resources; 
        private String userId; 
        private String username; 
        private Integer workloadCount; 

        /**
         * Resources.
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * WorkloadCount.
         */
        public Builder workloadCount(Integer workloadCount) {
            this.workloadCount = workloadCount;
            return this;
        }

        public QuotaUser build() {
            return new QuotaUser(this);
        } 

    } 

    /**
     * 
     * {@link QuotaUser} extends {@link TeaModel}
     *
     * <p>QuotaUser</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Submitted")
        private ResourceAmount submitted;

        @com.aliyun.core.annotation.NameInMap("Used")
        private ResourceAmount used;

        private Resources(Builder builder) {
            this.submitted = builder.submitted;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return submitted
         */
        public ResourceAmount getSubmitted() {
            return this.submitted;
        }

        /**
         * @return used
         */
        public ResourceAmount getUsed() {
            return this.used;
        }

        public static final class Builder {
            private ResourceAmount submitted; 
            private ResourceAmount used; 

            /**
             * Submitted.
             */
            public Builder submitted(ResourceAmount submitted) {
                this.submitted = submitted;
                return this;
            }

            /**
             * Used.
             */
            public Builder used(ResourceAmount used) {
                this.used = used;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
