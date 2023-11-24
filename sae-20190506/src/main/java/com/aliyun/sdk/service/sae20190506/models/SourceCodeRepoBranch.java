// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceCodeRepoBranch} extends {@link TeaModel}
 *
 * <p>SourceCodeRepoBranch</p>
 */
public class SourceCodeRepoBranch extends TeaModel {
    @NameInMap("CommitId")
    private String commitId;

    @NameInMap("Name")
    private String name;

    private SourceCodeRepoBranch(Builder builder) {
        this.commitId = builder.commitId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceCodeRepoBranch create() {
        return builder().build();
    }

    /**
     * @return commitId
     */
    public String getCommitId() {
        return this.commitId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String commitId; 
        private String name; 

        /**
         * CommitId.
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public SourceCodeRepoBranch build() {
            return new SourceCodeRepoBranch(this);
        } 

    } 

}
