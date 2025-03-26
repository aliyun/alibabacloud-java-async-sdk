// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DeleteBackupFileResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBackupFileResponseBody</p>
 */
public class DeleteBackupFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeletedBaksetIds")
    private DeletedBaksetIds deletedBaksetIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteBackupFileResponseBody model) {
            this.deletedBaksetIds = model.deletedBaksetIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the IDs of deleted backup sets.</p>
         */
        public Builder deletedBaksetIds(DeletedBaksetIds deletedBaksetIds) {
            this.deletedBaksetIds = deletedBaksetIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7B3A91C-0ACD-4948-ACAE-xxxxxxxD4069</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBackupFileResponseBody build() {
            return new DeleteBackupFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteBackupFileResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteBackupFileResponseBody</p>
     */
    public static class DeletedBaksetIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeletedBaksetIds")
        private java.util.List<Integer> deletedBaksetIds;

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
        public java.util.List<Integer> getDeletedBaksetIds() {
            return this.deletedBaksetIds;
        }

        public static final class Builder {
            private java.util.List<Integer> deletedBaksetIds; 

            private Builder() {
            } 

            private Builder(DeletedBaksetIds model) {
                this.deletedBaksetIds = model.deletedBaksetIds;
            } 

            /**
             * <p>An array that consists of the IDs of deleted backup sets.</p>
             */
            public Builder deletedBaksetIds(java.util.List<Integer> deletedBaksetIds) {
                this.deletedBaksetIds = deletedBaksetIds;
                return this;
            }

            public DeletedBaksetIds build() {
                return new DeletedBaksetIds(this);
            } 

        } 

    }
}
