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
 * {@link ListQuotaActiveUserUsagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaActiveUserUsagesResponseBody</p>
 */
public class ListQuotaActiveUserUsagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QuotaUserUsage")
    private java.util.List<QuotaUser> quotaUserUsage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListQuotaActiveUserUsagesResponseBody(Builder builder) {
        this.quotaUserUsage = builder.quotaUserUsage;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaActiveUserUsagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaUserUsage
     */
    public java.util.List<QuotaUser> getQuotaUserUsage() {
        return this.quotaUserUsage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<QuotaUser> quotaUserUsage; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListQuotaActiveUserUsagesResponseBody model) {
            this.quotaUserUsage = model.quotaUserUsage;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * QuotaUserUsage.
         */
        public Builder quotaUserUsage(java.util.List<QuotaUser> quotaUserUsage) {
            this.quotaUserUsage = quotaUserUsage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaActiveUserUsagesResponseBody build() {
            return new ListQuotaActiveUserUsagesResponseBody(this);
        } 

    } 

}
