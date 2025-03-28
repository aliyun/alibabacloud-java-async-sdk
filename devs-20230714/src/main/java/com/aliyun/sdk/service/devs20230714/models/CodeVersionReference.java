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
 * {@link CodeVersionReference} extends {@link TeaModel}
 *
 * <p>CodeVersionReference</p>
 */
public class CodeVersionReference extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("branch")
    private String branch;

    @com.aliyun.core.annotation.NameInMap("commitID")
    private String commitID;

    private CodeVersionReference(Builder builder) {
        this.branch = builder.branch;
        this.commitID = builder.commitID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CodeVersionReference create() {
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

    public static final class Builder {
        private String branch; 
        private String commitID; 

        private Builder() {
        } 

        private Builder(CodeVersionReference model) {
            this.branch = model.branch;
            this.commitID = model.commitID;
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

        public CodeVersionReference build() {
            return new CodeVersionReference(this);
        } 

    } 

}
