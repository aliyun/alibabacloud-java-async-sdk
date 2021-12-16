// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteMultipleObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMultipleObjectsResponseBody</p>
 */
public class DeleteMultipleObjectsResponseBody extends TeaModel {
    @ParentIgnore("DeleteResult")
    @NameInMap("Deleted")
    private java.util.List < DeletedObject > deleted;


    private DeleteMultipleObjectsResponseBody(Builder builder) {
        this.deleted = builder.deleted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultipleObjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return deleted
     */
    public java.util.List < DeletedObject > getDeleted() {
        return this.deleted;
    }

    public static final class Builder {
        private java.util.List < DeletedObject > deleted; 

        /**
         * <p>Deleted.</p>
         */
        public Builder deleted(java.util.List < DeletedObject > deleted) {
            this.deleted = deleted;
            return this;
        }

        public DeleteMultipleObjectsResponseBody build() {
            return new DeleteMultipleObjectsResponseBody(this);
        } 

    } 

}
