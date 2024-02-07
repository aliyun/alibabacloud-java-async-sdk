// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginPreferenceRequest} extends {@link RequestModel}
 *
 * <p>GetLoginPreferenceRequest</p>
 */
public class GetLoginPreferenceRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private GetLoginPreferenceRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginPreferenceRequest create() {
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

    public static final class Builder extends Request.Builder<GetLoginPreferenceRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetLoginPreferenceRequest request) {
            super(request);
            this.directoryId = request.directoryId;
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
        public GetLoginPreferenceRequest build() {
            return new GetLoginPreferenceRequest(this);
        } 

    } 

}
