// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileSystemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileSystemResponseBody</p>
 */
public class CreateFileSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFileSystemResponseBody(Builder builder) {
        this.fileSystemId = builder.fileSystemId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileSystemResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fileSystemId; 
        private String requestId; 

        /**
         * The ID of the file system that is created.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFileSystemResponseBody build() {
            return new CreateFileSystemResponseBody(this);
        } 

    } 

}
