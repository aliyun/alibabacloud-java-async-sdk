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
 * {@link PushFilter} extends {@link TeaModel}
 *
 * <p>PushFilter</p>
 */
public class PushFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("branch")
    private String branch;

    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    private PushFilter(Builder builder) {
        this.branch = builder.branch;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushFilter create() {
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
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String branch; 
        private String tag; 

        private Builder() {
        } 

        private Builder(PushFilter model) {
            this.branch = model.branch;
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
         * tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public PushFilter build() {
            return new PushFilter(this);
        } 

    } 

}
