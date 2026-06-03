// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link GetAuditCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditCountResponseBody</p>
 */
public class GetAuditCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskCount")
    private Long riskCount;

    @com.aliyun.core.annotation.NameInMap("SessionCount")
    private Long sessionCount;

    @com.aliyun.core.annotation.NameInMap("SqlCount")
    private Long sqlCount;

    private GetAuditCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskCount = builder.riskCount;
        this.sessionCount = builder.sessionCount;
        this.sqlCount = builder.sqlCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskCount
     */
    public Long getRiskCount() {
        return this.riskCount;
    }

    /**
     * @return sessionCount
     */
    public Long getSessionCount() {
        return this.sessionCount;
    }

    /**
     * @return sqlCount
     */
    public Long getSqlCount() {
        return this.sqlCount;
    }

    public static final class Builder {
        private String requestId; 
        private Long riskCount; 
        private Long sessionCount; 
        private Long sqlCount; 

        private Builder() {
        } 

        private Builder(GetAuditCountResponseBody model) {
            this.requestId = model.requestId;
            this.riskCount = model.riskCount;
            this.sessionCount = model.sessionCount;
            this.sqlCount = model.sqlCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskCount.
         */
        public Builder riskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }

        /**
         * SessionCount.
         */
        public Builder sessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }

        /**
         * SqlCount.
         */
        public Builder sqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }

        public GetAuditCountResponseBody build() {
            return new GetAuditCountResponseBody(this);
        } 

    } 

}
