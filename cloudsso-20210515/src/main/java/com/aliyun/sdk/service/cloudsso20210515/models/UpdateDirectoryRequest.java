// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDirectoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateDirectoryRequest</p>
 */
public class UpdateDirectoryRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("NewDirectoryName")
    private String newDirectoryName;

    private UpdateDirectoryRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.newDirectoryName = builder.newDirectoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDirectoryRequest create() {
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

    /**
     * @return newDirectoryName
     */
    public String getNewDirectoryName() {
        return this.newDirectoryName;
    }

    public static final class Builder extends Request.Builder<UpdateDirectoryRequest, Builder> {
        private String directoryId; 
        private String newDirectoryName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDirectoryRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.newDirectoryName = request.newDirectoryName;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * NewDirectoryName.
         */
        public Builder newDirectoryName(String newDirectoryName) {
            this.putQueryParameter("NewDirectoryName", newDirectoryName);
            this.newDirectoryName = newDirectoryName;
            return this;
        }

        @Override
        public UpdateDirectoryRequest build() {
            return new UpdateDirectoryRequest(this);
        } 

    } 

}
