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
    @NameInMap("body")
    private Delete body;

    @Body
    @NameInMap("delete")
    private Delete delete;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;


    private DeleteMultipleObjectsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
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
     * @return body
     */
    public Delete getBody() {
        return this.body;
    }

    /**
     * @return delete
     */
    public Delete getDelete() {
        return this.delete;
    }

    /**
     * @return encodingType
     */
    public String getEncodingType() {
        return this.encodingType;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Delete body; 
        private Delete delete; 
        private String encodingType; 

        /**
         * <p>body.</p>
         */
        public Builder body(Delete body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

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
