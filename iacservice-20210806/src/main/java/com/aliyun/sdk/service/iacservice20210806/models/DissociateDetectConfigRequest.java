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
 * {@link DissociateDetectConfigRequest} extends {@link RequestModel}
 *
 * <p>DissociateDetectConfigRequest</p>
 */
public class DissociateDetectConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("detectConfigId")
    private String detectConfigId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private DissociateDetectConfigRequest(Builder builder) {
        super(builder);
        this.detectConfigId = builder.detectConfigId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateDetectConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DissociateDetectConfigRequest, Builder> {
        private String detectConfigId; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(DissociateDetectConfigRequest request) {
            super(request);
            this.detectConfigId = request.detectConfigId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * detectConfigId.
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
         * <p>stack-xxxx</p>
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
        public DissociateDetectConfigRequest build() {
            return new DissociateDetectConfigRequest(this);
        } 

    } 

}
