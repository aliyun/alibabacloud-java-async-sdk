// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link QueryCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallbackResponseBody</p>
 */
public class QueryCallbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CryptType")
    private String cryptType;

    @com.aliyun.core.annotation.NameInMap("ExistsOssCheckTask")
    private Boolean existsOssCheckTask;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("Seed")
    private String seed;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private QueryCallbackResponseBody(Builder builder) {
        this.cryptType = builder.cryptType;
        this.existsOssCheckTask = builder.existsOssCheckTask;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.seed = builder.seed;
        this.uid = builder.uid;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallbackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cryptType
     */
    public String getCryptType() {
        return this.cryptType;
    }

    /**
     * @return existsOssCheckTask
     */
    public Boolean getExistsOssCheckTask() {
        return this.existsOssCheckTask;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return seed
     */
    public String getSeed() {
        return this.seed;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String cryptType; 
        private Boolean existsOssCheckTask; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String name; 
        private String requestId; 
        private String scope; 
        private String seed; 
        private String uid; 
        private String url; 

        private Builder() {
        } 

        private Builder(QueryCallbackResponseBody model) {
            this.cryptType = model.cryptType;
            this.existsOssCheckTask = model.existsOssCheckTask;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.seed = model.seed;
            this.uid = model.uid;
            this.url = model.url;
        } 

        /**
         * CryptType.
         */
        public Builder cryptType(String cryptType) {
            this.cryptType = cryptType;
            return this;
        }

        /**
         * ExistsOssCheckTask.
         */
        public Builder existsOssCheckTask(Boolean existsOssCheckTask) {
            this.existsOssCheckTask = existsOssCheckTask;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>Seed。</p>
         * 
         * <strong>example:</strong>
         * <p>cb2MysbJTAAIf6gB3u4vpIEU-1ySnnf</p>
         */
        public Builder seed(String seed) {
            this.seed = seed;
            return this;
        }

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>19964*****086772</p>
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public QueryCallbackResponseBody build() {
            return new QueryCallbackResponseBody(this);
        } 

    } 

}
