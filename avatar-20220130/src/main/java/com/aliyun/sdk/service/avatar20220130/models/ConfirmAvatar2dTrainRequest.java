// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmAvatar2dTrainRequest} extends {@link RequestModel}
 *
 * <p>ConfirmAvatar2dTrainRequest</p>
 */
public class ConfirmAvatar2dTrainRequest extends Request {
    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Query
    @NameInMap("Confirm")
    @Validation(required = true)
    private String confirm;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private ConfirmAvatar2dTrainRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.confirm = builder.confirm;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmAvatar2dTrainRequest create() {
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
     * @return confirm
     */
    public String getConfirm() {
        return this.confirm;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ConfirmAvatar2dTrainRequest, Builder> {
        private String code; 
        private String confirm; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmAvatar2dTrainRequest request) {
            super(request);
            this.code = request.code;
            this.confirm = request.confirm;
            this.tenantId = request.tenantId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * Confirm.
         */
        public Builder confirm(String confirm) {
            this.putQueryParameter("Confirm", confirm);
            this.confirm = confirm;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ConfirmAvatar2dTrainRequest build() {
            return new ConfirmAvatar2dTrainRequest(this);
        } 

    } 

}
