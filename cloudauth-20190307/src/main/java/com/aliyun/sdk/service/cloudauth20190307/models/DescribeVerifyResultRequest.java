// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifyResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifyResultRequest</p>
 */
public class DescribeVerifyResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    private DescribeVerifyResultRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    public static final class Builder extends Request.Builder<DescribeVerifyResultRequest, Builder> {
        private String bizId; 
        private String bizType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifyResultRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
        } 

        /**
         * <p>The verification ID. A unique ID that identifies a verification task. The value can be up to 64 characters in length. For a single verification task, the system supports unlimited submissions until the verification is passed and the task is completed.</p>
         * <blockquote>
         * <p>Use a different BizId for each verification task.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39ecf51e-2f81-4dc5-90ee-ff86125b****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The business scenario identifier of the ID Verification service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FVBioOnlyTest</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        @Override
        public DescribeVerifyResultRequest build() {
            return new DescribeVerifyResultRequest(this);
        } 

    } 

}
