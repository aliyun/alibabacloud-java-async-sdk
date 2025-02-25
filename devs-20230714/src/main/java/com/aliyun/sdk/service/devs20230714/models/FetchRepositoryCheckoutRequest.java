// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchRepositoryCheckoutRequest} extends {@link RequestModel}
 *
 * <p>FetchRepositoryCheckoutRequest</p>
 */
public class FetchRepositoryCheckoutRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("branch")
    private String branch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("commit")
    private String commit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    private FetchRepositoryCheckoutRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.branch = builder.branch;
        this.commit = builder.commit;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchRepositoryCheckoutRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return commit
     */
    public String getCommit() {
        return this.commit;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<FetchRepositoryCheckoutRequest, Builder> {
        private String name; 
        private String branch; 
        private String commit; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(FetchRepositoryCheckoutRequest request) {
            super(request);
            this.name = request.name;
            this.branch = request.branch;
            this.commit = request.commit;
            this.tag = request.tag;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * branch.
         */
        public Builder branch(String branch) {
            this.putQueryParameter("branch", branch);
            this.branch = branch;
            return this;
        }

        /**
         * commit.
         */
        public Builder commit(String commit) {
            this.putQueryParameter("commit", commit);
            this.commit = commit;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public FetchRepositoryCheckoutRequest build() {
            return new FetchRepositoryCheckoutRequest(this);
        } 

    } 

}
