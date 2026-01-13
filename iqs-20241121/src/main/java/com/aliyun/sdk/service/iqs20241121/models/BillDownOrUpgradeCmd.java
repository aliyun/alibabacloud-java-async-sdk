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
 * {@link BillDownOrUpgradeCmd} extends {@link TeaModel}
 *
 * <p>BillDownOrUpgradeCmd</p>
 */
public class BillDownOrUpgradeCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("activeDate")
    private String activeDate;

    @com.aliyun.core.annotation.NameInMap("codeType")
    private String codeType;

    @com.aliyun.core.annotation.NameInMap("operateTypEnum")
    private String operateTypEnum;

    @com.aliyun.core.annotation.NameInMap("qps")
    private Integer qps;

    private BillDownOrUpgradeCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.activeDate = builder.activeDate;
        this.codeType = builder.codeType;
        this.operateTypEnum = builder.operateTypEnum;
        this.qps = builder.qps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillDownOrUpgradeCmd create() {
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
     * @return activeDate
     */
    public String getActiveDate() {
        return this.activeDate;
    }

    /**
     * @return codeType
     */
    public String getCodeType() {
        return this.codeType;
    }

    /**
     * @return operateTypEnum
     */
    public String getOperateTypEnum() {
        return this.operateTypEnum;
    }

    /**
     * @return qps
     */
    public Integer getQps() {
        return this.qps;
    }

    public static final class Builder {
        private String accountId; 
        private String activeDate; 
        private String codeType; 
        private String operateTypEnum; 
        private Integer qps; 

        private Builder() {
        } 

        private Builder(BillDownOrUpgradeCmd model) {
            this.accountId = model.accountId;
            this.activeDate = model.activeDate;
            this.codeType = model.codeType;
            this.operateTypEnum = model.operateTypEnum;
            this.qps = model.qps;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * activeDate.
         */
        public Builder activeDate(String activeDate) {
            this.activeDate = activeDate;
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
         * operateTypEnum.
         */
        public Builder operateTypEnum(String operateTypEnum) {
            this.operateTypEnum = operateTypEnum;
            return this;
        }

        /**
         * qps.
         */
        public Builder qps(Integer qps) {
            this.qps = qps;
            return this;
        }

        public BillDownOrUpgradeCmd build() {
            return new BillDownOrUpgradeCmd(this);
        } 

    } 

}
