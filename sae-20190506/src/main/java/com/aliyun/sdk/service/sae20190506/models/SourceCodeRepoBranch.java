// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link SourceCodeRepoBranch} extends {@link TeaModel}
 *
 * <p>SourceCodeRepoBranch</p>
 */
public class SourceCodeRepoBranch extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommitId")
    private String commitId;

    @com.aliyun.core.annotation.NameInMap("Name")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SourceCodeRepoBranch model) {
            this.commitId = model.commitId;
            this.name = model.name;
        } 

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
