// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListExternalSAMLIdPCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListExternalSAMLIdPCertificatesRequest</p>
 */
public class ListExternalSAMLIdPCertificatesRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
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

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder {
        private String directoryId; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        public ListExternalSAMLIdPCertificatesRequest build() {
            return new ListExternalSAMLIdPCertificatesRequest(this);
        } 

    } 

}
