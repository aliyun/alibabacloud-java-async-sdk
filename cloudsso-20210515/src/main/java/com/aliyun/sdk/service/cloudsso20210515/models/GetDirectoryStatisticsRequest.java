// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectoryStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetDirectoryStatisticsRequest</p>
 */
public class GetDirectoryStatisticsRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private GetDirectoryStatisticsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectoryStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<GetDirectoryStatisticsRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetDirectoryStatisticsRequest request) {
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
        public GetDirectoryStatisticsRequest build() {
            return new GetDirectoryStatisticsRequest(this);
        } 

    } 

}
