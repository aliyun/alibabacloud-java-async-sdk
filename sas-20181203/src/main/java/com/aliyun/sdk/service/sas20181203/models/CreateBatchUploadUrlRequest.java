// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateBatchUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateBatchUploadUrlRequest</p>
 */
public class CreateBatchUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5List")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> md5List;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private CreateBatchUploadUrlRequest(Builder builder) {
        super(builder);
        this.md5List = builder.md5List;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchUploadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return md5List
     */
    public java.util.List<String> getMd5List() {
        return this.md5List;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateBatchUploadUrlRequest, Builder> {
        private java.util.List<String> md5List; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateBatchUploadUrlRequest request) {
            super(request);
            this.md5List = request.md5List;
            this.type = request.type;
        } 

        /**
         * <p>The identifiers of files. Only MD5 hash values are supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder md5List(java.util.List<String> md5List) {
            this.putQueryParameter("Md5List", md5List);
            this.md5List = md5List;
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
        public CreateBatchUploadUrlRequest build() {
            return new CreateBatchUploadUrlRequest(this);
        } 

    } 

}
