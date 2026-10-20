// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ListClusterChecksResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterChecksResponseBody</p>
 */
public class ListClusterChecksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checks")
    private java.util.List<Checks> checks;

    private ListClusterChecksResponseBody(Builder builder) {
        this.checks = builder.checks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterChecksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checks
     */
    public java.util.List<Checks> getChecks() {
        return this.checks;
    }

    public static final class Builder {
        private java.util.List<Checks> checks; 

        private Builder() {
        } 

        private Builder(ListClusterChecksResponseBody model) {
            this.checks = model.checks;
        } 

        /**
         * <p>The list of checks.</p>
         */
        public Builder checks(java.util.List<Checks> checks) {
            this.checks = checks;
            return this;
        }

        public ListClusterChecksResponseBody build() {
            return new ListClusterChecksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterChecksResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterChecksResponseBody</p>
     */
    public static class Checks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("check_id")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("created_at")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("finished_at")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Checks(Builder builder) {
            this.checkId = builder.checkId;
            this.createdAt = builder.createdAt;
            this.finishedAt = builder.finishedAt;
            this.message = builder.message;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Checks create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkId; 
            private String createdAt; 
            private String finishedAt; 
            private String message; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Checks model) {
                this.checkId = model.checkId;
                this.createdAt = model.createdAt;
                this.finishedAt = model.finishedAt;
                this.message = model.message;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The check ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1697100584236600453-ce0da5a1d627e4e9e9f96cae8ad07****-clustercheck-lboto</p>
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The creation time in ISO 8601 format, including time zone information.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-11T02:56:02.565982623Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-11T02:56:18.881054031Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The check status message.</p>
             * 
             * <strong>example:</strong>
             * <p>task succeed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The check status.</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The check type.</p>
             * 
             * <strong>example:</strong>
             * <p>ClusterUpgrade</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Checks build() {
                return new Checks(this);
            } 

        } 

    }
}
