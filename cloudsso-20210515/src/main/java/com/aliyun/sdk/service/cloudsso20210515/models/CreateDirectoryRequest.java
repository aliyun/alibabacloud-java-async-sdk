// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateDirectoryRequest</p>
 */
public class CreateDirectoryRequest extends Request {
    @Query
    @NameInMap("DirectoryName")
    private String directoryName;

    private CreateDirectoryRequest(Builder builder) {
        super(builder);
        this.directoryName = builder.directoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryName
     */
    public String getDirectoryName() {
        return this.directoryName;
    }

    public static final class Builder extends Request.Builder<CreateDirectoryRequest, Builder> {
        private String directoryName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDirectoryRequest response) {
            super(response);
            this.directoryName = response.directoryName;
        } 

        /**
         * DirectoryName.
         */
        public Builder directoryName(String directoryName) {
            this.putQueryParameter("DirectoryName", directoryName);
            this.directoryName = directoryName;
            return this;
        }

        @Override
        public CreateDirectoryRequest build() {
            return new CreateDirectoryRequest(this);
        } 

    } 

}
