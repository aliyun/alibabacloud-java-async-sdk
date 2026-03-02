// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ReposFork} extends {@link TeaModel}
 *
 * <p>ReposFork</p>
 */
public class ReposFork extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("gitGroup")
    private String gitGroup;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("isOrigin")
    private Boolean isOrigin;

    @com.aliyun.core.annotation.NameInMap("pbcRepoItems")
    private java.util.List<RepoItem> pbcRepoItems;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("usage")
    private String usage;

    private ReposFork(Builder builder) {
        this.gitGroup = builder.gitGroup;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.isOrigin = builder.isOrigin;
        this.pbcRepoItems = builder.pbcRepoItems;
        this.requestId = builder.requestId;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReposFork create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gitGroup
     */
    public String getGitGroup() {
        return this.gitGroup;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isOrigin
     */
    public Boolean getIsOrigin() {
        return this.isOrigin;
    }

    /**
     * @return pbcRepoItems
     */
    public java.util.List<RepoItem> getPbcRepoItems() {
        return this.pbcRepoItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private String gitGroup; 
        private String gmtCreate; 
        private Long id; 
        private Boolean isOrigin; 
        private java.util.List<RepoItem> pbcRepoItems; 
        private String requestId; 
        private String usage; 

        private Builder() {
        } 

        private Builder(ReposFork model) {
            this.gitGroup = model.gitGroup;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.isOrigin = model.isOrigin;
            this.pbcRepoItems = model.pbcRepoItems;
            this.requestId = model.requestId;
            this.usage = model.usage;
        } 

        /**
         * gitGroup.
         */
        public Builder gitGroup(String gitGroup) {
            this.gitGroup = gitGroup;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
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
         * isOrigin.
         */
        public Builder isOrigin(Boolean isOrigin) {
            this.isOrigin = isOrigin;
            return this;
        }

        /**
         * pbcRepoItems.
         */
        public Builder pbcRepoItems(java.util.List<RepoItem> pbcRepoItems) {
            this.pbcRepoItems = pbcRepoItems;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        public ReposFork build() {
            return new ReposFork(this);
        } 

    } 

}
