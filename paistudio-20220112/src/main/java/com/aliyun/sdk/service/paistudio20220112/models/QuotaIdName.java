// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QuotaIdName} extends {@link TeaModel}
 *
 * <p>QuotaIdName</p>
 */
public class QuotaIdName extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    private QuotaIdName(Builder builder) {
        this.quotaId = builder.quotaId;
        this.quotaName = builder.quotaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaIdName create() {
        return builder().build();
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    public static final class Builder {
        private String quotaId; 
        private String quotaName; 

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        public QuotaIdName build() {
            return new QuotaIdName(this);
        } 

    } 

}
