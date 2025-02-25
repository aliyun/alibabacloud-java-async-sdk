// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptInvitationRequest} extends {@link RequestModel}
 *
 * <p>AcceptInvitationRequest</p>
 */
public class AcceptInvitationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsAccepted")
    private Boolean isAccepted;

    private AcceptInvitationRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.isAccepted = builder.isAccepted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptInvitationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isAccepted
     */
    public Boolean getIsAccepted() {
        return this.isAccepted;
    }

    public static final class Builder extends Request.Builder<AcceptInvitationRequest, Builder> {
        private String code; 
        private Boolean isAccepted; 

        private Builder() {
            super();
        } 

        private Builder(AcceptInvitationRequest request) {
            super(request);
            this.code = request.code;
            this.isAccepted = request.isAccepted;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * IsAccepted.
         */
        public Builder isAccepted(Boolean isAccepted) {
            this.putBodyParameter("IsAccepted", isAccepted);
            this.isAccepted = isAccepted;
            return this;
        }

        @Override
        public AcceptInvitationRequest build() {
            return new AcceptInvitationRequest(this);
        } 

    } 

}
