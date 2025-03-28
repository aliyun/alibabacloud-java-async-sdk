// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link PullRequestFilter} extends {@link TeaModel}
 *
 * <p>PullRequestFilter</p>
 */
public class PullRequestFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("sourceBranch")
    private String sourceBranch;

    @com.aliyun.core.annotation.NameInMap("targetBranch")
    private String targetBranch;

    @com.aliyun.core.annotation.NameInMap("types")
    private java.util.List<String> types;

    private PullRequestFilter(Builder builder) {
        this.sourceBranch = builder.sourceBranch;
        this.targetBranch = builder.targetBranch;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PullRequestFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    /**
     * @return targetBranch
     */
    public String getTargetBranch() {
        return this.targetBranch;
    }

    /**
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder {
        private String sourceBranch; 
        private String targetBranch; 
        private java.util.List<String> types; 

        private Builder() {
        } 

        private Builder(PullRequestFilter model) {
            this.sourceBranch = model.sourceBranch;
            this.targetBranch = model.targetBranch;
            this.types = model.types;
        } 

        /**
         * sourceBranch.
         */
        public Builder sourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }

        /**
         * targetBranch.
         */
        public Builder targetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }

        /**
         * types.
         */
        public Builder types(java.util.List<String> types) {
            this.types = types;
            return this;
        }

        public PullRequestFilter build() {
            return new PullRequestFilter(this);
        } 

    } 

}
