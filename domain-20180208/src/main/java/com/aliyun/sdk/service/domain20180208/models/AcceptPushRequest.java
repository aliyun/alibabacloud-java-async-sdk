// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link AcceptPushRequest} extends {@link RequestModel}
 *
 * <p>AcceptPushRequest</p>
 */
public class AcceptPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushNo;

    private AcceptPushRequest(Builder builder) {
        super(builder);
        this.contactTemplateId = builder.contactTemplateId;
        this.pushNo = builder.pushNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptPushRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactTemplateId
     */
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    /**
     * @return pushNo
     */
    public String getPushNo() {
        return this.pushNo;
    }

    public static final class Builder extends Request.Builder<AcceptPushRequest, Builder> {
        private Long contactTemplateId; 
        private String pushNo; 

        private Builder() {
            super();
        } 

        private Builder(AcceptPushRequest request) {
            super(request);
            this.contactTemplateId = request.contactTemplateId;
            this.pushNo = request.pushNo;
        } 

        /**
         * <p>实名认证通过的模板，域名过户时用于WHOIS信息变更</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13862458</p>
         */
        public Builder contactTemplateId(Long contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
            return this;
        }

        /**
         * <p>Push编号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>push_20250101_abc123</p>
         */
        public Builder pushNo(String pushNo) {
            this.putQueryParameter("PushNo", pushNo);
            this.pushNo = pushNo;
            return this;
        }

        @Override
        public AcceptPushRequest build() {
            return new AcceptPushRequest(this);
        } 

    } 

}
