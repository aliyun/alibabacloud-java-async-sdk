// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutReportEmailConfigRequest} extends {@link RequestModel}
 *
 * <p>PutReportEmailConfigRequest</p>
 */
public class PutReportEmailConfigRequest extends Request {
    @Body
    @NameInMap("Email")
    private String email;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private PutReportEmailConfigRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutReportEmailConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<PutReportEmailConfigRequest, Builder> {
        private String email; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(PutReportEmailConfigRequest request) {
            super(request);
            this.email = request.email;
            this.operaUid = request.operaUid;
        } 

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
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
        public PutReportEmailConfigRequest build() {
            return new PutReportEmailConfigRequest(this);
        } 

    } 

}
