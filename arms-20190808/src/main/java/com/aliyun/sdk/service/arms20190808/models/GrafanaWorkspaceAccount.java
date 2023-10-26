// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceAccount} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceAccount</p>
 */
public class GrafanaWorkspaceAccount extends TeaModel {
    @NameInMap("accountId")
    private Long accountId;

    @NameInMap("accountNotes")
    private String accountNotes;

    @NameInMap("aliyunUid")
    private String aliyunUid;

    @NameInMap("aliyunUserName")
    private String aliyunUserName;

    @NameInMap("gmtCreate")
    private Float gmtCreate;

    @NameInMap("orgs")
    private java.util.List < GrafanaWorkspaceUserOrg > orgs;

    @NameInMap("type")
    private String type;

    private GrafanaWorkspaceAccount(Builder builder) {
        this.accountId = builder.accountId;
        this.accountNotes = builder.accountNotes;
        this.aliyunUid = builder.aliyunUid;
        this.aliyunUserName = builder.aliyunUserName;
        this.gmtCreate = builder.gmtCreate;
        this.orgs = builder.orgs;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceAccount create() {
        return builder().build();
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
    public java.util.List < GrafanaWorkspaceUserOrg > getOrgs() {
        return this.orgs;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long accountId; 
        private String accountNotes; 
        private String aliyunUid; 
        private String aliyunUserName; 
        private Float gmtCreate; 
        private java.util.List < GrafanaWorkspaceUserOrg > orgs; 
        private String type; 

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
        public Builder orgs(java.util.List < GrafanaWorkspaceUserOrg > orgs) {
            this.orgs = orgs;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GrafanaWorkspaceAccount build() {
            return new GrafanaWorkspaceAccount(this);
        } 

    } 

}
