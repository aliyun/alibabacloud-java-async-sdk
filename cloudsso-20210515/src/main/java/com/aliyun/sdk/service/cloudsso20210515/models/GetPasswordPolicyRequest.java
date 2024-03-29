// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetPasswordPolicyRequest</p>
 */
public class GetPasswordPolicyRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private GetPasswordPolicyRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPasswordPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<GetPasswordPolicyRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetPasswordPolicyRequest request) {
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
        public GetPasswordPolicyRequest build() {
            return new GetPasswordPolicyRequest(this);
        } 

    } 

}
