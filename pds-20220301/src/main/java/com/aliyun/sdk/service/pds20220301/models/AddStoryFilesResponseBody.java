// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddStoryFilesResponseBody} extends {@link TeaModel}
 *
 * <p>AddStoryFilesResponseBody</p>
 */
public class AddStoryFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<AddStoryFile> files;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("story_id")
    private String storyId;

    private AddStoryFilesResponseBody(Builder builder) {
        this.driveId = builder.driveId;
        this.files = builder.files;
        this.requestId = builder.requestId;
        this.storyId = builder.storyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddStoryFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return files
     */
    public java.util.List<AddStoryFile> getFiles() {
        return this.files;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
    }

    public static final class Builder {
        private String driveId; 
        private java.util.List<AddStoryFile> files; 
        private String requestId; 
        private String storyId; 

        private Builder() {
        } 

        private Builder(AddStoryFilesResponseBody model) {
            this.driveId = model.driveId;
            this.files = model.files;
            this.requestId = model.requestId;
            this.storyId = model.storyId;
        } 

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List<AddStoryFile> files) {
            this.files = files;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * story_id.
         */
        public Builder storyId(String storyId) {
            this.storyId = storyId;
            return this;
        }

        public AddStoryFilesResponseBody build() {
            return new AddStoryFilesResponseBody(this);
        } 

    } 

}
