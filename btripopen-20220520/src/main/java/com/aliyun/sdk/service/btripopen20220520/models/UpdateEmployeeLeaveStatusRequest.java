// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateEmployeeLeaveStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateEmployeeLeaveStatusRequest</p>
 */
public class UpdateEmployeeLeaveStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_leave")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isLeave;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private UpdateEmployeeLeaveStatusRequest(Builder builder) {
        super(builder);
        this.isLeave = builder.isLeave;
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEmployeeLeaveStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isLeave
     */
    public Boolean getIsLeave() {
        return this.isLeave;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<UpdateEmployeeLeaveStatusRequest, Builder> {
        private Boolean isLeave; 
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEmployeeLeaveStatusRequest request) {
            super(request);
            this.isLeave = request.isLeave;
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isLeave(Boolean isLeave) {
            this.putBodyParameter("is_leave", isLeave);
            this.isLeave = isLeave;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public UpdateEmployeeLeaveStatusRequest build() {
            return new UpdateEmployeeLeaveStatusRequest(this);
        } 

    } 

}
