// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link GetAttackTargetRequest} extends {@link RequestModel}
 *
 * <p>GetAttackTargetRequest</p>
 */
public class GetAttackTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetId;

    private GetAttackTargetRequest(Builder builder) {
        super(builder);
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttackTargetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<GetAttackTargetRequest, Builder> {
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(GetAttackTargetRequest request) {
            super(request);
            this.targetId = request.targetId;
        } 

        /**
         * <p>The unique identifier of the scan target. If the target does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>target-abc123def4567</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public GetAttackTargetRequest build() {
            return new GetAttackTargetRequest(this);
        } 

    } 

}
