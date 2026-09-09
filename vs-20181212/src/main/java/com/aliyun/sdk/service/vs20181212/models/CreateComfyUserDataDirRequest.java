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
 * {@link CreateComfyUserDataDirRequest} extends {@link RequestModel}
 *
 * <p>CreateComfyUserDataDirRequest</p>
 */
public class CreateComfyUserDataDirRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    private CreateComfyUserDataDirRequest(Builder builder) {
        super(builder);
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComfyUserDataDirRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<CreateComfyUserDataDirRequest, Builder> {
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(CreateComfyUserDataDirRequest request) {
            super(request);
            this.path = request.path;
        } 

        /**
         * <p>The path of the directory to create. Use /dir1/ for a single-level directory, or /dir1/dir2/ for a multi-level directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/userdir1</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public CreateComfyUserDataDirRequest build() {
            return new CreateComfyUserDataDirRequest(this);
        } 

    } 

}
