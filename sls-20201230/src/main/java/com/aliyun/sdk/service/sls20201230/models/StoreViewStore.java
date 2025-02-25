// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link StoreViewStore} extends {@link TeaModel}
 *
 * <p>StoreViewStore</p>
 */
public class StoreViewStore extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("storeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeName;

    private StoreViewStore(Builder builder) {
        this.project = builder.project;
        this.query = builder.query;
        this.storeName = builder.storeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StoreViewStore create() {
        return builder().build();
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return storeName
     */
    public String getStoreName() {
        return this.storeName;
    }

    public static final class Builder {
        private String project; 
        private String query; 
        private String storeName; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder storeName(String storeName) {
            this.storeName = storeName;
            return this;
        }

        public StoreViewStore build() {
            return new StoreViewStore(this);
        } 

    } 

}
