// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyProductRequest} extends {@link RequestModel}
 *
 * <p>CopyProductRequest</p>
 */
public class CopyProductRequest extends Request {
    @Body
    @NameInMap("SourceProductArn")
    @Validation(required = true)
    private String sourceProductArn;

    @Body
    @NameInMap("TargetProductName")
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
         * The Alibaba Cloud Resource Name (ARN) of the source product.
         * <p>
         * 
         * > The source product can belong to the current account or belong to a product portfolio that is shared by another account.
         */
        public Builder sourceProductArn(String sourceProductArn) {
            this.putBodyParameter("SourceProductArn", sourceProductArn);
            this.sourceProductArn = sourceProductArn;
            return this;
        }

        /**
         * The name of the destination product.
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
