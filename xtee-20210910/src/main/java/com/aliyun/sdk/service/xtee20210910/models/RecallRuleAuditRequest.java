// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecallRuleAuditRequest} extends {@link RequestModel}
 *
 * <p>RecallRuleAuditRequest</p>
 */
public class RecallRuleAuditRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private RecallRuleAuditRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecallRuleAuditRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<RecallRuleAuditRequest, Builder> {
        private Long id; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(RecallRuleAuditRequest request) {
            super(request);
            this.id = request.id;
            this.regId = request.regId;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public RecallRuleAuditRequest build() {
            return new RecallRuleAuditRequest(this);
        } 

    } 

}
