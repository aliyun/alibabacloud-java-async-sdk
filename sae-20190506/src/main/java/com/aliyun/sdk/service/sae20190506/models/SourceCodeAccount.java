// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceCodeAccount} extends {@link TeaModel}
 *
 * <p>SourceCodeAccount</p>
 */
public class SourceCodeAccount extends TeaModel {
    @NameInMap("AvatarUrl")
    private String avatarUrl;

    @NameInMap("Id")
    private String id;

    @NameInMap("Name")
    private String name;

    private SourceCodeAccount(Builder builder) {
        this.avatarUrl = builder.avatarUrl;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceCodeAccount create() {
        return builder().build();
    }

    /**
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String avatarUrl; 
        private String id; 
        private String name; 

        /**
         * AvatarUrl.
         */
        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public SourceCodeAccount build() {
            return new SourceCodeAccount(this);
        } 

    } 

}
