// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteReportEmailConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteReportEmailConfigRequest</p>
 */
public class DeleteReportEmailConfigRequest extends Request {
    @Body
    @NameInMap("MailConfigId")
    private Long mailConfigId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private DeleteReportEmailConfigRequest(Builder builder) {
        super(builder);
        this.mailConfigId = builder.mailConfigId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteReportEmailConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mailConfigId
     */
    public Long getMailConfigId() {
        return this.mailConfigId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DeleteReportEmailConfigRequest, Builder> {
        private Long mailConfigId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteReportEmailConfigRequest request) {
            super(request);
            this.mailConfigId = request.mailConfigId;
            this.operaUid = request.operaUid;
        } 

        /**
         * MailConfigId.
         */
        public Builder mailConfigId(Long mailConfigId) {
            this.putBodyParameter("MailConfigId", mailConfigId);
            this.mailConfigId = mailConfigId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public DeleteReportEmailConfigRequest build() {
            return new DeleteReportEmailConfigRequest(this);
        } 

    } 

}
