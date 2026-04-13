// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link AssociateDetectConfigRequest} extends {@link RequestModel}
 *
 * <p>AssociateDetectConfigRequest</p>
 */
public class AssociateDetectConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("detectConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String detectConfigId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private AssociateDetectConfigRequest(Builder builder) {
        super(builder);
        this.detectConfigId = builder.detectConfigId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateDetectConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectConfigId
     */
    public String getDetectConfigId() {
        return this.detectConfigId;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<AssociateDetectConfigRequest, Builder> {
        private String detectConfigId; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(AssociateDetectConfigRequest request) {
            super(request);
            this.detectConfigId = request.detectConfigId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-xxxx</p>
         */
        public Builder detectConfigId(String detectConfigId) {
            this.putBodyParameter("detectConfigId", detectConfigId);
            this.detectConfigId = detectConfigId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-xxxxx</p>
         */
        public Builder targetId(String targetId) {
            this.putBodyParameter("targetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Stack</p>
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public AssociateDetectConfigRequest build() {
            return new AssociateDetectConfigRequest(this);
        } 

    } 

}
