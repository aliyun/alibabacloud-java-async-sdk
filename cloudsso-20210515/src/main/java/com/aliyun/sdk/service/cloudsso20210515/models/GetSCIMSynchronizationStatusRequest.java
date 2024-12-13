// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSCIMSynchronizationStatusRequest} extends {@link RequestModel}
 *
 * <p>GetSCIMSynchronizationStatusRequest</p>
 */
public class GetSCIMSynchronizationStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    private GetSCIMSynchronizationStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSCIMSynchronizationStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetSCIMSynchronizationStatusRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetSCIMSynchronizationStatusRequest request) {
            super(request);
            this.directoryId = request.directoryId;
        } 

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public GetSCIMSynchronizationStatusRequest build() {
            return new GetSCIMSynchronizationStatusRequest(this);
        } 

    } 

}
