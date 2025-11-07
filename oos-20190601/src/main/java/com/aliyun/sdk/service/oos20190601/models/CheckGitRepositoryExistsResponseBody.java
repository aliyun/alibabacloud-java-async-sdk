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
 * {@link CheckGitRepositoryExistsResponseBody} extends {@link TeaModel}
 *
 * <p>CheckGitRepositoryExistsResponseBody</p>
 */
public class CheckGitRepositoryExistsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RepoExists")
    private Boolean repoExists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckGitRepositoryExistsResponseBody(Builder builder) {
        this.repoExists = builder.repoExists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckGitRepositoryExistsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repoExists
     */
    public Boolean getRepoExists() {
        return this.repoExists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean repoExists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckGitRepositoryExistsResponseBody model) {
            this.repoExists = model.repoExists;
            this.requestId = model.requestId;
        } 

        /**
         * RepoExists.
         */
        public Builder repoExists(Boolean repoExists) {
            this.repoExists = repoExists;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckGitRepositoryExistsResponseBody build() {
            return new CheckGitRepositoryExistsResponseBody(this);
        } 

    } 

}
