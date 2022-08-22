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
    @NameInMap("HashKeyContextList")
    private java.util.List < HashKeyContextList> hashKeyContextList;

    @Query
    @NameInMap("HashKeyList")
    private java.util.List < String > hashKeyList;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    private CreateFileDetectUploadUrlRequest(Builder builder) {
        super(builder);
        this.hashKeyContextList = builder.hashKeyContextList;
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
     * @return hashKeyContextList
     */
    public java.util.List < HashKeyContextList> getHashKeyContextList() {
        return this.hashKeyContextList;
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
        private java.util.List < HashKeyContextList> hashKeyContextList; 
        private java.util.List < String > hashKeyList; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileDetectUploadUrlRequest request) {
            super(request);
            this.hashKeyContextList = request.hashKeyContextList;
            this.hashKeyList = request.hashKeyList;
            this.type = request.type;
        } 

        /**
         * HashKeyContextList.
         */
        public Builder hashKeyContextList(java.util.List < HashKeyContextList> hashKeyContextList) {
            this.putQueryParameter("HashKeyContextList", hashKeyContextList);
            this.hashKeyContextList = hashKeyContextList;
            return this;
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

    public static class HashKeyContextList extends TeaModel {
        @NameInMap("FileSize")
        private Integer fileSize;

        @NameInMap("HashKey")
        private String hashKey;

        private HashKeyContextList(Builder builder) {
            this.fileSize = builder.fileSize;
            this.hashKey = builder.hashKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HashKeyContextList create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return hashKey
         */
        public String getHashKey() {
            return this.hashKey;
        }

        public static final class Builder {
            private Integer fileSize; 
            private String hashKey; 

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * HashKey.
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            public HashKeyContextList build() {
                return new HashKeyContextList(this);
            } 

        } 

    }
}
