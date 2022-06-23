// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileDetectUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateFileDetectUploadUrlRequest</p>
 */
public class CreateFileDetectUploadUrlRequest extends Request {
    @Query
    @NameInMap("HashKeyList")
    @Validation(required = true)
    private java.util.List < String > hashKeyList;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    private CreateFileDetectUploadUrlRequest(Builder builder) {
        super(builder);
        this.hashKeyList = builder.hashKeyList;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileDetectUploadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hashKeyList
     */
    public java.util.List < String > getHashKeyList() {
        return this.hashKeyList;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateFileDetectUploadUrlRequest, Builder> {
        private java.util.List < String > hashKeyList; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileDetectUploadUrlRequest request) {
            super(request);
            this.hashKeyList = request.hashKeyList;
            this.type = request.type;
        } 

        /**
         * HashKeyList.
         */
        public Builder hashKeyList(java.util.List < String > hashKeyList) {
            this.putQueryParameter("HashKeyList", hashKeyList);
            this.hashKeyList = hashKeyList;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateFileDetectUploadUrlRequest build() {
            return new CreateFileDetectUploadUrlRequest(this);
        } 

    } 

}
