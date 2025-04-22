// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateFileSystemResponseBody model) {
            this.fileSystemId = model.fileSystemId;
            this.requestId = model.requestId;
        } 

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * RequestId.
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
