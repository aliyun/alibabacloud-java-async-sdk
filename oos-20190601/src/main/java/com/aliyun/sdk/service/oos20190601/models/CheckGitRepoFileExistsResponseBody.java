// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link CheckGitRepoFileExistsResponseBody} extends {@link TeaModel}
 *
 * <p>CheckGitRepoFileExistsResponseBody</p>
 */
public class CheckGitRepoFileExistsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileExists")
    private Boolean fileExists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckGitRepoFileExistsResponseBody(Builder builder) {
        this.fileExists = builder.fileExists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckGitRepoFileExistsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileExists
     */
    public Boolean getFileExists() {
        return this.fileExists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean fileExists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckGitRepoFileExistsResponseBody model) {
            this.fileExists = model.fileExists;
            this.requestId = model.requestId;
        } 

        /**
         * FileExists.
         */
        public Builder fileExists(Boolean fileExists) {
            this.fileExists = fileExists;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckGitRepoFileExistsResponseBody build() {
            return new CheckGitRepoFileExistsResponseBody(this);
        } 

    } 

}
