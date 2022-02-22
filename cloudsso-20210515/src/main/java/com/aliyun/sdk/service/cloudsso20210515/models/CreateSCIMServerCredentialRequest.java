// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSCIMServerCredentialRequest} extends {@link RequestModel}
 *
 * <p>CreateSCIMServerCredentialRequest</p>
 */
public class CreateSCIMServerCredentialRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private CreateSCIMServerCredentialRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSCIMServerCredentialRequest create() {
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

    public static final class Builder extends Request.Builder<CreateSCIMServerCredentialRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSCIMServerCredentialRequest response) {
            super(response);
            this.directoryId = response.directoryId;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public CreateSCIMServerCredentialRequest build() {
            return new CreateSCIMServerCredentialRequest(this);
        } 

    } 

}
