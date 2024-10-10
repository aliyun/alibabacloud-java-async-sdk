// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFileDetectUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateFileDetectUploadUrlRequest</p>
 */
public class CreateFileDetectUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HashKeyContextList")
    private java.util.List < HashKeyContextList> hashKeyContextList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HashKeyList")
    private java.util.List < String > hashKeyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The hash values of files.</p>
         * <blockquote>
         * <p>You must specify at least one of the <strong>HashKeyList</strong> and <strong>HashKeyContextList</strong> parameters.</p>
         * </blockquote>
         */
        public Builder hashKeyContextList(java.util.List < HashKeyContextList> hashKeyContextList) {
            this.putQueryParameter("HashKeyContextList", hashKeyContextList);
            this.hashKeyContextList = hashKeyContextList;
            return this;
        }

        /**
         * <p>The identifiers of files. Only MD5 hash values are supported.</p>
         * <blockquote>
         * <p>You must specify at least one of the <strong>HashKeyList</strong> and <strong>HashKeyContextList</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CreateFileDetectUploadUrl</p>
         */
        public Builder hashKeyList(java.util.List < String > hashKeyList) {
            this.putQueryParameter("HashKeyList", hashKeyList);
            this.hashKeyList = hashKeyList;
            return this;
        }

        /**
         * <p>The type of the file. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unknown file</li>
         * <li><strong>1</strong>: binary file</li>
         * <li><strong>2</strong>: webshell file</li>
         * <li><strong>4</strong>: script file</li>
         * </ul>
         * <blockquote>
         * <p>If you do not know the type of the file, set this parameter to <strong>0</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

    /**
     * 
     * {@link CreateFileDetectUploadUrlRequest} extends {@link TeaModel}
     *
     * <p>CreateFileDetectUploadUrlRequest</p>
     */
    public static class HashKeyContextList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("HashKey")
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
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2698557</p>
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The hash value of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>30319dd5cee8f894766e479cac170da0</p>
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
