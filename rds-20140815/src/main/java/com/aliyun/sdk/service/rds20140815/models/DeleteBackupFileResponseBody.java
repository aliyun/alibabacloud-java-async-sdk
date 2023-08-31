// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupFileResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBackupFileResponseBody</p>
 */
public class DeleteBackupFileResponseBody extends TeaModel {
    @NameInMap("DeletedBaksetIds")
    private DeletedBaksetIds deletedBaksetIds;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteBackupFileResponseBody(Builder builder) {
        this.deletedBaksetIds = builder.deletedBaksetIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return deletedBaksetIds
     */
    public DeletedBaksetIds getDeletedBaksetIds() {
        return this.deletedBaksetIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeletedBaksetIds deletedBaksetIds; 
        private String requestId; 

        /**
         * An array that consists of the IDs of deleted backup sets.
         */
        public Builder deletedBaksetIds(DeletedBaksetIds deletedBaksetIds) {
            this.deletedBaksetIds = deletedBaksetIds;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBackupFileResponseBody build() {
            return new DeleteBackupFileResponseBody(this);
        } 

    } 

    public static class DeletedBaksetIds extends TeaModel {
        @NameInMap("DeletedBaksetIds")
        private java.util.List < Integer > deletedBaksetIds;

        private DeletedBaksetIds(Builder builder) {
            this.deletedBaksetIds = builder.deletedBaksetIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeletedBaksetIds create() {
            return builder().build();
        }

        /**
         * @return deletedBaksetIds
         */
        public java.util.List < Integer > getDeletedBaksetIds() {
            return this.deletedBaksetIds;
        }

        public static final class Builder {
            private java.util.List < Integer > deletedBaksetIds; 

            /**
             * An array that consists of the IDs of deleted backup sets.
             */
            public Builder deletedBaksetIds(java.util.List < Integer > deletedBaksetIds) {
                this.deletedBaksetIds = deletedBaksetIds;
                return this;
            }

            public DeletedBaksetIds build() {
                return new DeletedBaksetIds(this);
            } 

        } 

    }
}
