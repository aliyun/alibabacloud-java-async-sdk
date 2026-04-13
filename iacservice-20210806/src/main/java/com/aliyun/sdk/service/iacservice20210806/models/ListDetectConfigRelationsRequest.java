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
 * {@link ListDetectConfigRelationsRequest} extends {@link RequestModel}
 *
 * <p>ListDetectConfigRelationsRequest</p>
 */
public class ListDetectConfigRelationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("detectConfigId")
    private String detectConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("targetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("targetType")
    private String targetType;

    private ListDetectConfigRelationsRequest(Builder builder) {
        super(builder);
        this.detectConfigId = builder.detectConfigId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDetectConfigRelationsRequest create() {
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

    public static final class Builder extends Request.Builder<ListDetectConfigRelationsRequest, Builder> {
        private String detectConfigId; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListDetectConfigRelationsRequest request) {
            super(request);
            this.detectConfigId = request.detectConfigId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * detectConfigId.
         */
        public Builder detectConfigId(String detectConfigId) {
            this.putQueryParameter("detectConfigId", detectConfigId);
            this.detectConfigId = detectConfigId;
            return this;
        }

        /**
         * targetId.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("targetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * targetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListDetectConfigRelationsRequest build() {
            return new ListDetectConfigRelationsRequest(this);
        } 

    } 

}
