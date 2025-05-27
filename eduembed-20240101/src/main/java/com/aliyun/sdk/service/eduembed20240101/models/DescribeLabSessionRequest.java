// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link DescribeLabSessionRequest} extends {@link RequestModel}
 *
 * <p>DescribeLabSessionRequest</p>
 */
public class DescribeLabSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabSessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ramAccountId;

    private DescribeLabSessionRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.labSessionId = builder.labSessionId;
        this.ramAccountId = builder.ramAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLabSessionRequest create() {
        return builder().build();
    }

@Override
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
     * @return labSessionId
     */
    public String getLabSessionId() {
        return this.labSessionId;
    }

    /**
     * @return ramAccountId
     */
    public Long getRamAccountId() {
        return this.ramAccountId;
    }

    public static final class Builder extends Request.Builder<DescribeLabSessionRequest, Builder> {
        private Long accountId; 
        private String labSessionId; 
        private Long ramAccountId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLabSessionRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.labSessionId = request.labSessionId;
            this.ramAccountId = request.ramAccountId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder labSessionId(String labSessionId) {
            this.putQueryParameter("LabSessionId", labSessionId);
            this.labSessionId = labSessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder ramAccountId(Long ramAccountId) {
            this.putQueryParameter("RamAccountId", ramAccountId);
            this.ramAccountId = ramAccountId;
            return this;
        }

        @Override
        public DescribeLabSessionRequest build() {
            return new DescribeLabSessionRequest(this);
        } 

    } 

}
