// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetMFAAuthenticationStatusRequest} extends {@link RequestModel}
 *
 * <p>GetMFAAuthenticationStatusRequest</p>
 */
public class GetMFAAuthenticationStatusRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;


    private GetMFAAuthenticationStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMFAAuthenticationStatusRequest create() {
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

        public GetMFAAuthenticationStatusRequest build() {
            return new GetMFAAuthenticationStatusRequest(this);
        } 

    } 

}
