// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyClearLogstoreStorageRequest} extends {@link RequestModel}
 *
 * <p>ModifyClearLogstoreStorageRequest</p>
 */
public class ModifyClearLogstoreStorageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserLogStore")
    private String userLogStore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserProject")
    private String userProject;

    private ModifyClearLogstoreStorageRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.lang = builder.lang;
        this.userLogStore = builder.userLogStore;
        this.userProject = builder.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClearLogstoreStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userLogStore
     */
    public String getUserLogStore() {
        return this.userLogStore;
    }

    /**
     * @return userProject
     */
    public String getUserProject() {
        return this.userProject;
    }

    public static final class Builder extends Request.Builder<ModifyClearLogstoreStorageRequest, Builder> {
        private String from; 
        private String lang; 
        private String userLogStore; 
        private String userProject; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClearLogstoreStorageRequest request) {
            super(request);
            this.from = request.from;
            this.lang = request.lang;
            this.userLogStore = request.userLogStore;
            this.userProject = request.userProject;
        } 

        /**
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * UserLogStore.
         */
        public Builder userLogStore(String userLogStore) {
            this.putQueryParameter("UserLogStore", userLogStore);
            this.userLogStore = userLogStore;
            return this;
        }

        /**
         * UserProject.
         */
        public Builder userProject(String userProject) {
            this.putQueryParameter("UserProject", userProject);
            this.userProject = userProject;
            return this;
        }

        @Override
        public ModifyClearLogstoreStorageRequest build() {
            return new ModifyClearLogstoreStorageRequest(this);
        } 

    } 

}
