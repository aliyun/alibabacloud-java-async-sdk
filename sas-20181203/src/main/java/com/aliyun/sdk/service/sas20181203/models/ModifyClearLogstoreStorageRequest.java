// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the Logstore that stores logs.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_sls_storage</p>
         */
        public Builder userLogStore(String userLogStore) {
            this.putQueryParameter("UserLogStore", userLogStore);
            this.userLogStore = userLogStore;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-log-1234(uid)-cn-hangzhou</p>
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
