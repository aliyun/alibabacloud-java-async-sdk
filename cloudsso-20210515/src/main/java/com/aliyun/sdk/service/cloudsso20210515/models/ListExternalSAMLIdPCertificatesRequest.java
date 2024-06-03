// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExternalSAMLIdPCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListExternalSAMLIdPCertificatesRequest</p>
 */
public class ListExternalSAMLIdPCertificatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    private ListExternalSAMLIdPCertificatesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExternalSAMLIdPCertificatesRequest create() {
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

    public static final class Builder extends Request.Builder<ListExternalSAMLIdPCertificatesRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(ListExternalSAMLIdPCertificatesRequest request) {
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
        public ListExternalSAMLIdPCertificatesRequest build() {
            return new ListExternalSAMLIdPCertificatesRequest(this);
        } 

    } 

}
