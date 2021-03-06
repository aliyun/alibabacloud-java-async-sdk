// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteMultipleObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMultipleObjectsResponseBody</p>
 */
public class DeleteMultipleObjectsResponseBody extends TeaModel {
    @ParentIgnore("DeleteResult")
    @NameInMap("Deleted")
    private java.util.List < DeletedObject > deleted;

    @ParentIgnore("DeleteResult")
    @NameInMap("EncodingType")
    private String encodingType;

    private DeleteMultipleObjectsResponseBody(Builder builder) {
        this.deleted = builder.deleted;
        this.encodingType = builder.encodingType;
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

    /**
     * @return encodingType
     */
    public String getEncodingType() {
        return this.encodingType;
    }

    public static final class Builder {
        private java.util.List < DeletedObject > deleted; 
        private String encodingType; 

        /**
         * Deleted.
         */
        public Builder deleted(java.util.List < DeletedObject > deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * EncodingType.
         */
        public Builder encodingType(String encodingType) {
            this.encodingType = encodingType;
            return this;
        }

        public DeleteMultipleObjectsResponseBody build() {
            return new DeleteMultipleObjectsResponseBody(this);
        } 

    } 

}
