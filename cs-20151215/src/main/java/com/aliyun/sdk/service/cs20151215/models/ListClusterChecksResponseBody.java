// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterChecksResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterChecksResponseBody</p>
 */
public class ListClusterChecksResponseBody extends TeaModel {
    @NameInMap("checks")
    private java.util.List < Checks> checks;

    private ListClusterChecksResponseBody(Builder builder) {
        this.checks = builder.checks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterChecksResponseBody create() {
        return builder().build();
    }

    /**
     * @return checks
     */
    public java.util.List < Checks> getChecks() {
        return this.checks;
    }

    public static final class Builder {
        private java.util.List < Checks> checks; 

        /**
         * checks.
         */
        public Builder checks(java.util.List < Checks> checks) {
            this.checks = checks;
            return this;
        }

        public ListClusterChecksResponseBody build() {
            return new ListClusterChecksResponseBody(this);
        } 

    } 

    public static class Checks extends TeaModel {
        @NameInMap("check_id")
        private String checkId;

        @NameInMap("created_at")
        private String createdAt;

        @NameInMap("finished_at")
        private String finishedAt;

        @NameInMap("message")
        private String message;

        @NameInMap("status")
        private String status;

        @NameInMap("type")
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

            /**
             * check_id.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * created_at.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * finished_at.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * type.
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
