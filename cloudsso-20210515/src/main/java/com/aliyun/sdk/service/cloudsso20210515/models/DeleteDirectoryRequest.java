// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDirectoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteDirectoryRequest</p>
 */
public class DeleteDirectoryRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private DeleteDirectoryRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder<DeleteDirectoryRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDirectoryRequest request) {
            super(request);
            this.directoryId = request.directoryId;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public DeleteDirectoryRequest build() {
            return new DeleteDirectoryRequest(this);
        } 

    } 

}
