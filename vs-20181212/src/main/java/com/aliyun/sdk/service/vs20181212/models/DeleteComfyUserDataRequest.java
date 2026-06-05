// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DeleteComfyUserDataRequest} extends {@link RequestModel}
 *
 * <p>DeleteComfyUserDataRequest</p>
 */
public class DeleteComfyUserDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    private DeleteComfyUserDataRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteComfyUserDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<DeleteComfyUserDataRequest, Builder> {
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteComfyUserDataRequest request) {
            super(request);
            this.fileName = request.fileName;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public DeleteComfyUserDataRequest build() {
            return new DeleteComfyUserDataRequest(this);
        } 

    } 

}
