// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link PrepaidRecord} extends {@link TeaModel}
 *
 * <p>PrepaidRecord</p>
 */
public class PrepaidRecord extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("accountName")
    private String accountName;

    @com.aliyun.core.annotation.NameInMap("codeType")
    private String codeType;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("remainQuota")
    private Long remainQuota;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("totalQuota")
    private Long totalQuota;

    @com.aliyun.core.annotation.NameInMap("usedQuota")
    private Long usedQuota;

    private PrepaidRecord(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.codeType = builder.codeType;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.remainQuota = builder.remainQuota;
        this.status = builder.status;
        this.totalQuota = builder.totalQuota;
        this.usedQuota = builder.usedQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrepaidRecord create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return codeType
     */
    public String getCodeType() {
        return this.codeType;
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
     * @return remainQuota
     */
    public Long getRemainQuota() {
        return this.remainQuota;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalQuota
     */
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    /**
     * @return usedQuota
     */
    public Long getUsedQuota() {
        return this.usedQuota;
    }

    public static final class Builder {
        private String accountId; 
        private String accountName; 
        private String codeType; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private Long remainQuota; 
        private String status; 
        private Long totalQuota; 
        private Long usedQuota; 

        private Builder() {
        } 

        private Builder(PrepaidRecord model) {
            this.accountId = model.accountId;
            this.accountName = model.accountName;
            this.codeType = model.codeType;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.remainQuota = model.remainQuota;
            this.status = model.status;
            this.totalQuota = model.totalQuota;
            this.usedQuota = model.usedQuota;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * accountName.
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * codeType.
         */
        public Builder codeType(String codeType) {
            this.codeType = codeType;
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
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * remainQuota.
         */
        public Builder remainQuota(Long remainQuota) {
            this.remainQuota = remainQuota;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * totalQuota.
         */
        public Builder totalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * usedQuota.
         */
        public Builder usedQuota(Long usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        public PrepaidRecord build() {
            return new PrepaidRecord(this);
        } 

    } 

}
