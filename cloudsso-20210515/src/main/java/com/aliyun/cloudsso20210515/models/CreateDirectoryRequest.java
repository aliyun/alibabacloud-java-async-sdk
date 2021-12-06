// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateDirectoryRequest</p>
 */
public class CreateDirectoryRequest extends Request {
    @Query
    @NameInMap("DirectoryName")
    private String directoryName;


    private CreateDirectoryRequest(Builder builder) {
        super(builder);
        this.directoryName = builder.directoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDirectoryRequest create() {
        return builder().build();
    }

    /**
     * @return directoryName
     */
    public String getDirectoryName() {
        return this.directoryName;
    }

    public static final class Builder extends Request.Builder {
        private String directoryName; 

        /**
         * <p>DirectoryName.</p>
         */
        public Builder directoryName(String directoryName) {
            this.putQueryParameter("DirectoryName", directoryName);
            this.directoryName = directoryName;
            return this;
        }

        public CreateDirectoryRequest build() {
            return new CreateDirectoryRequest(this);
        } 

    } 

}
