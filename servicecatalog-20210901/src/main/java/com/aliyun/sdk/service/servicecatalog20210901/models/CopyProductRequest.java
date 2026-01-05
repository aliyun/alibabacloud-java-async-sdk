// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link CopyProductRequest} extends {@link RequestModel}
 *
 * <p>CopyProductRequest</p>
 */
public class CopyProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceProductArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceProductArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetProductName")
    private String targetProductName;

    private CopyProductRequest(Builder builder) {
        super(builder);
        this.sourceProductArn = builder.sourceProductArn;
        this.targetProductName = builder.targetProductName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceProductArn
     */
    public String getSourceProductArn() {
        return this.sourceProductArn;
    }

    /**
     * @return targetProductName
     */
    public String getTargetProductName() {
        return this.targetProductName;
    }

    public static final class Builder extends Request.Builder<CopyProductRequest, Builder> {
        private String sourceProductArn; 
        private String targetProductName; 

        private Builder() {
            super();
        } 

        private Builder(CopyProductRequest request) {
            super(request);
            this.sourceProductArn = request.sourceProductArn;
            this.targetProductName = request.targetProductName;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the source product.</p>
         * <blockquote>
         * <p>The source product can belong to the current account or belong to a product portfolio that is shared by another account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:servicecatalog:cn-hangzhou:146611588617****:product/prod-bp18r7q127****</p>
         */
        public Builder sourceProductArn(String sourceProductArn) {
            this.putBodyParameter("SourceProductArn", sourceProductArn);
            this.sourceProductArn = sourceProductArn;
            return this;
        }

        /**
         * <p>The name of the destination product.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO-ECS</p>
         */
        public Builder targetProductName(String targetProductName) {
            this.putBodyParameter("TargetProductName", targetProductName);
            this.targetProductName = targetProductName;
            return this;
        }

        @Override
        public CopyProductRequest build() {
            return new CopyProductRequest(this);
        } 

    } 

}
