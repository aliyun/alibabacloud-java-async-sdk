// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link AccessControlEntry} extends {@link TeaModel}
 *
 * <p>AccessControlEntry</p>
 */
public class AccessControlEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("Entry")
    private String entry;

    private AccessControlEntry(Builder builder) {
        this.comment = builder.comment;
        this.entry = builder.entry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessControlEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return entry
     */
    public String getEntry() {
        return this.entry;
    }

    public static final class Builder {
        private String comment; 
        private String entry; 

        private Builder() {
        } 

        private Builder(AccessControlEntry model) {
            this.comment = model.comment;
            this.entry = model.entry;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Entry.
         */
        public Builder entry(String entry) {
            this.entry = entry;
            return this;
        }

        public AccessControlEntry build() {
            return new AccessControlEntry(this);
        } 

    } 

}
