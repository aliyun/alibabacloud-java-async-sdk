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
 * {@link GitEventSnapshot} extends {@link TeaModel}
 *
 * <p>GitEventSnapshot</p>
 */
public class GitEventSnapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("branch")
    private String branch;

    @com.aliyun.core.annotation.NameInMap("commitID")
    private String commitID;

    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    private GitEventSnapshot(Builder builder) {
        this.branch = builder.branch;
        this.commitID = builder.commitID;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GitEventSnapshot create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return commitID
     */
    public String getCommitID() {
        return this.commitID;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String branch; 
        private String commitID; 
        private String tag; 

        private Builder() {
        } 

        private Builder(GitEventSnapshot model) {
            this.branch = model.branch;
            this.commitID = model.commitID;
            this.tag = model.tag;
        } 

        /**
         * branch.
         */
        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        /**
         * commitID.
         */
        public Builder commitID(String commitID) {
            this.commitID = commitID;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public GitEventSnapshot build() {
            return new GitEventSnapshot(this);
        } 

    } 

}
