// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteMultipleObjectsRequest} extends {@link RequestModel}
 *
 * <p>DeleteMultipleObjectsRequest</p>
 */
public class DeleteMultipleObjectsRequest extends Request {
    @Body
    @NameInMap("delete")
    private Delete delete;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;


    private DeleteMultipleObjectsRequest(Builder builder) {
        super(builder);
        this.delete = builder.delete;
        this.encodingType = builder.encodingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultipleObjectsRequest create() {
        return builder().build();
    }

    /**
     * @return delete
     */
    public Delete delete() {
        return this.delete;
    }

    /**
     * @return encodingType
     */
    public String encodingType() {
        return this.encodingType;
    }

    public static final class Builder extends Request.Builder<DeleteMultipleObjectsRequest.Builder> {
        private Delete delete; 
        private String encodingType; 

        /**
         * <p>delete.</p>
         */
        public Builder delete(Delete delete) {
            this.putBodyParameter("delete", delete);
            this.delete = delete;
            return this;
        }

        /**
         * <p>encoding-type.</p>
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        public DeleteMultipleObjectsRequest build() {
            return new DeleteMultipleObjectsRequest(this);
        } 

    } 

}
