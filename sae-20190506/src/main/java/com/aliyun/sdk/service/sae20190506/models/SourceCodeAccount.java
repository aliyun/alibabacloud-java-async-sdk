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
 * {@link SourceCodeAccount} extends {@link TeaModel}
 *
 * <p>SourceCodeAccount</p>
 */
public class SourceCodeAccount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvatarUrl")
    private String avatarUrl;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Organizations")
    private java.util.List<Organizations> organizations;

    private SourceCodeAccount(Builder builder) {
        this.avatarUrl = builder.avatarUrl;
        this.id = builder.id;
        this.name = builder.name;
        this.organizations = builder.organizations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceCodeAccount create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return organizations
     */
    public java.util.List<Organizations> getOrganizations() {
        return this.organizations;
    }

    public static final class Builder {
        private String avatarUrl; 
        private String id; 
        private String name; 
        private java.util.List<Organizations> organizations; 

        private Builder() {
        } 

        private Builder(SourceCodeAccount model) {
            this.avatarUrl = model.avatarUrl;
            this.id = model.id;
            this.name = model.name;
            this.organizations = model.organizations;
        } 

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

        /**
         * Organizations.
         */
        public Builder organizations(java.util.List<Organizations> organizations) {
            this.organizations = organizations;
            return this;
        }

        public SourceCodeAccount build() {
            return new SourceCodeAccount(this);
        } 

    } 

    /**
     * 
     * {@link SourceCodeAccount} extends {@link TeaModel}
     *
     * <p>SourceCodeAccount</p>
     */
    public static class Organizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Organizations(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organizations create() {
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

            private Builder() {
            } 

            private Builder(Organizations model) {
                this.avatarUrl = model.avatarUrl;
                this.id = model.id;
                this.name = model.name;
            } 

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

            public Organizations build() {
                return new Organizations(this);
            } 

        } 

    }
}
