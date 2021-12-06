// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateDirectoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateDirectoryRequest</p>
 */
public class UpdateDirectoryRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("NewDirectoryName")
    private String newDirectoryName;


    private UpdateDirectoryRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.newDirectoryName = builder.newDirectoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDirectoryRequest create() {
        return builder().build();
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return newDirectoryName
     */
    public String getNewDirectoryName() {
        return this.newDirectoryName;
    }

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String newDirectoryName; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>NewDirectoryName.</p>
         */
        public Builder newDirectoryName(String newDirectoryName) {
            this.putQueryParameter("NewDirectoryName", newDirectoryName);
            this.newDirectoryName = newDirectoryName;
            return this;
        }

        public UpdateDirectoryRequest build() {
            return new UpdateDirectoryRequest(this);
        } 

    } 

}
