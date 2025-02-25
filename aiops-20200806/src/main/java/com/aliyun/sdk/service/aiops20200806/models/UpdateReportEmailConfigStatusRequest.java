// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateReportEmailConfigStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateReportEmailConfigStatusRequest</p>
 */
public class UpdateReportEmailConfigStatusRequest extends Request {
    @Body
    @NameInMap("ConfigStatus")
    private Integer configStatus;

    @Body
    @NameInMap("MailConfigId")
    private Long mailConfigId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private UpdateReportEmailConfigStatusRequest(Builder builder) {
        super(builder);
        this.configStatus = builder.configStatus;
        this.mailConfigId = builder.mailConfigId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateReportEmailConfigStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configStatus
     */
    public Integer getConfigStatus() {
        return this.configStatus;
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

    public static final class Builder extends Request.Builder<UpdateReportEmailConfigStatusRequest, Builder> {
        private Integer configStatus; 
        private Long mailConfigId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateReportEmailConfigStatusRequest request) {
            super(request);
            this.configStatus = request.configStatus;
            this.mailConfigId = request.mailConfigId;
            this.operaUid = request.operaUid;
        } 

        /**
         * ConfigStatus.
         */
        public Builder configStatus(Integer configStatus) {
            this.putBodyParameter("ConfigStatus", configStatus);
            this.configStatus = configStatus;
            return this;
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
        public UpdateReportEmailConfigStatusRequest build() {
            return new UpdateReportEmailConfigStatusRequest(this);
        } 

    } 

}
