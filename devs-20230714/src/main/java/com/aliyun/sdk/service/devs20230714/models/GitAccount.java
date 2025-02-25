// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GitAccount} extends {@link TeaModel}
 *
 * <p>GitAccount</p>
 */
public class GitAccount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("uri")
    private String uri;

    private GitAccount(Builder builder) {
        this.avatar = builder.avatar;
        this.displayName = builder.displayName;
        this.id = builder.id;
        this.name = builder.name;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GitAccount create() {
        return builder().build();
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String avatar; 
        private String displayName; 
        private String id; 
        private String name; 
        private String uri; 

        /**
         * avatar.
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GitAccount build() {
            return new GitAccount(this);
        } 

    } 

}
