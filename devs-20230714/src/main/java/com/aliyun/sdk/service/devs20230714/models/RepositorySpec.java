// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RepositorySpec} extends {@link TeaModel}
 *
 * <p>RepositorySpec</p>
 */
public class RepositorySpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cloneUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloneUrl;

    @com.aliyun.core.annotation.NameInMap("connectionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionName;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.NameInMap("webUrl")
    private String webUrl;

    private RepositorySpec(Builder builder) {
        this.cloneUrl = builder.cloneUrl;
        this.connectionName = builder.connectionName;
        this.displayName = builder.displayName;
        this.id = builder.id;
        this.owner = builder.owner;
        this.platform = builder.platform;
        this.webUrl = builder.webUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepositorySpec create() {
        return builder().build();
    }

    /**
     * @return cloneUrl
     */
    public String getCloneUrl() {
        return this.cloneUrl;
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
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
    public Long getId() {
        return this.id;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return webUrl
     */
    public String getWebUrl() {
        return this.webUrl;
    }

    public static final class Builder {
        private String cloneUrl; 
        private String connectionName; 
        private String displayName; 
        private Long id; 
        private String owner; 
        private String platform; 
        private String webUrl; 

        /**
         * cloneUrl.
         */
        public Builder cloneUrl(String cloneUrl) {
            this.cloneUrl = cloneUrl;
            return this;
        }

        /**
         * connectionName.
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
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
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.platform = platform;
            return this;
        }

        /**
         * webUrl.
         */
        public Builder webUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }

        public RepositorySpec build() {
            return new RepositorySpec(this);
        } 

    } 

}
