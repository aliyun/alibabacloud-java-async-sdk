// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ReplicationSourceSelectionCriteria} extends {@link TeaModel}
 *
 * <p>ReplicationSourceSelectionCriteria</p>
 */
public class ReplicationSourceSelectionCriteria extends TeaModel {
    @NameInMap("SseKmsEncryptedObjects")
    private SseKmsEncryptedObjects sseKmsEncryptedObjects;

    private ReplicationSourceSelectionCriteria(Builder builder) {
        this.sseKmsEncryptedObjects = builder.sseKmsEncryptedObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationSourceSelectionCriteria create() {
        return builder().build();
    }

    /**
     * @return sseKmsEncryptedObjects
     */
    public SseKmsEncryptedObjects getSseKmsEncryptedObjects() {
        return this.sseKmsEncryptedObjects;
    }

    public static final class Builder {
        private SseKmsEncryptedObjects sseKmsEncryptedObjects; 

        /**
         * A short description of SseKmsEncryptedObjects
         */
        public Builder sseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }

        public ReplicationSourceSelectionCriteria build() {
            return new ReplicationSourceSelectionCriteria(this);
        } 

    } 

    public static class SseKmsEncryptedObjects extends TeaModel {
        @NameInMap("Status")
        private String status;

        private SseKmsEncryptedObjects(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SseKmsEncryptedObjects create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            /**
             * A short description of Status
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SseKmsEncryptedObjects build() {
                return new SseKmsEncryptedObjects(this);
            } 

        } 

    }
}
