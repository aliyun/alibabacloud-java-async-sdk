// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ManualRunMailTaskRequest} extends {@link RequestModel}
 *
 * <p>ManualRunMailTaskRequest</p>
 */
public class ManualRunMailTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MailId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mailId;

    private ManualRunMailTaskRequest(Builder builder) {
        super(builder);
        this.mailId = builder.mailId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManualRunMailTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mailId
     */
    public String getMailId() {
        return this.mailId;
    }

    public static final class Builder extends Request.Builder<ManualRunMailTaskRequest, Builder> {
        private String mailId; 

        private Builder() {
            super();
        } 

        private Builder(ManualRunMailTaskRequest request) {
            super(request);
            this.mailId = request.mailId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3423423sdfa****sdadw</p>
         */
        public Builder mailId(String mailId) {
            this.putQueryParameter("MailId", mailId);
            this.mailId = mailId;
            return this;
        }

        @Override
        public ManualRunMailTaskRequest build() {
            return new ManualRunMailTaskRequest(this);
        } 

    } 

}
