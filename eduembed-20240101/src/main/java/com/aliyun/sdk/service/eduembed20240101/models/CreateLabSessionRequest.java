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
 * {@link CreateLabSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateLabSessionRequest</p>
 */
public class CreateLabSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long labId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RamAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ramAccountId;

    private CreateLabSessionRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.labId = builder.labId;
        this.ramAccountId = builder.ramAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLabSessionRequest create() {
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
     * @return labId
     */
    public Long getLabId() {
        return this.labId;
    }

    /**
     * @return ramAccountId
     */
    public Long getRamAccountId() {
        return this.ramAccountId;
    }

    public static final class Builder extends Request.Builder<CreateLabSessionRequest, Builder> {
        private Long accountId; 
        private Long labId; 
        private Long ramAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLabSessionRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.labId = request.labId;
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
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>875</p>
         */
        public Builder labId(Long labId) {
            this.putBodyParameter("LabId", labId);
            this.labId = labId;
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
            this.putBodyParameter("RamAccountId", ramAccountId);
            this.ramAccountId = ramAccountId;
            return this;
        }

        @Override
        public CreateLabSessionRequest build() {
            return new CreateLabSessionRequest(this);
        } 

    } 

}
