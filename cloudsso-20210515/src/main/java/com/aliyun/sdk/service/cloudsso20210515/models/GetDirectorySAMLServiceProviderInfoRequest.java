// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectorySAMLServiceProviderInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDirectorySAMLServiceProviderInfoRequest</p>
 */
public class GetDirectorySAMLServiceProviderInfoRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private GetDirectorySAMLServiceProviderInfoRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectorySAMLServiceProviderInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetDirectorySAMLServiceProviderInfoRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetDirectorySAMLServiceProviderInfoRequest request) {
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
        public GetDirectorySAMLServiceProviderInfoRequest build() {
            return new GetDirectorySAMLServiceProviderInfoRequest(this);
        } 

    } 

}
