// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteBucketReplicationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBucketReplicationResponseBody</p>
 */
public class DeleteBucketReplicationResponseBody extends TeaModel {
    @ParentIgnore("ReplicationRules")
    @NameInMap("ID")
    private String ID;


    private DeleteBucketReplicationResponseBody(Builder builder) {
        this.ID = builder.ID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBucketReplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return ID
     */
    public String ID() {
        return this.ID;
    }

    public static final class Builder {
        private String ID; 

        /**
         * <p>ID.</p>
         */
        public Builder ID(String ID) {
            this.ID = ID;
            return this;
        }

        public DeleteBucketReplicationResponseBody build() {
            return new DeleteBucketReplicationResponseBody(this);
        } 

    } 

}
