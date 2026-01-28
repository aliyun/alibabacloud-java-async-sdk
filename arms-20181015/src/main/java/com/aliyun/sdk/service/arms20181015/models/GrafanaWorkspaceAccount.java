// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20181015.models;

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
 * {@link GrafanaWorkspaceAccount} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceAccount</p>
 */
public class GrafanaWorkspaceAccount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private Long accountId;

    @com.aliyun.core.annotation.NameInMap("accountNotes")
    private String accountNotes;

    @com.aliyun.core.annotation.NameInMap("aliyunUid")
    private String aliyunUid;

    @com.aliyun.core.annotation.NameInMap("aliyunUserName")
    private String aliyunUserName;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Float gmtCreate;

    @com.aliyun.core.annotation.NameInMap("orgs")
    private java.util.List<GrafanaWorkspaceUserOrg> orgs;

    private GrafanaWorkspaceAccount(Builder builder) {
        this.accountId = builder.accountId;
        this.accountNotes = builder.accountNotes;
        this.aliyunUid = builder.aliyunUid;
        this.aliyunUserName = builder.aliyunUserName;
        this.gmtCreate = builder.gmtCreate;
        this.orgs = builder.orgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceAccount create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountNotes
     */
    public String getAccountNotes() {
        return this.accountNotes;
    }

    /**
     * @return aliyunUid
     */
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    /**
     * @return aliyunUserName
     */
    public String getAliyunUserName() {
        return this.aliyunUserName;
    }

    /**
     * @return gmtCreate
     */
    public Float getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return orgs
     */
    public java.util.List<GrafanaWorkspaceUserOrg> getOrgs() {
        return this.orgs;
    }

    public static final class Builder {
        private Long accountId; 
        private String accountNotes; 
        private String aliyunUid; 
        private String aliyunUserName; 
        private Float gmtCreate; 
        private java.util.List<GrafanaWorkspaceUserOrg> orgs; 

        private Builder() {
        } 

        private Builder(GrafanaWorkspaceAccount model) {
            this.accountId = model.accountId;
            this.accountNotes = model.accountNotes;
            this.aliyunUid = model.aliyunUid;
            this.aliyunUserName = model.aliyunUserName;
            this.gmtCreate = model.gmtCreate;
            this.orgs = model.orgs;
        } 

        /**
         * accountId.
         */
        public Builder accountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * accountNotes.
         */
        public Builder accountNotes(String accountNotes) {
            this.accountNotes = accountNotes;
            return this;
        }

        /**
         * aliyunUid.
         */
        public Builder aliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * aliyunUserName.
         */
        public Builder aliyunUserName(String aliyunUserName) {
            this.aliyunUserName = aliyunUserName;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(Float gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * orgs.
         */
        public Builder orgs(java.util.List<GrafanaWorkspaceUserOrg> orgs) {
            this.orgs = orgs;
            return this;
        }

        public GrafanaWorkspaceAccount build() {
            return new GrafanaWorkspaceAccount(this);
        } 

    } 

}
