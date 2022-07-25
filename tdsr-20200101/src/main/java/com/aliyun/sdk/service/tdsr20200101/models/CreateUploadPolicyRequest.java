// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadPolicyRequest</p>
 */
public class CreateUploadPolicyRequest extends Request {
    @Query
    @NameInMap("Option")
    @Validation(required = true)
    private String option;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateUploadPolicyRequest(Builder builder) {
        super(builder);
        this.option = builder.option;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateUploadPolicyRequest, Builder> {
        private String option; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadPolicyRequest request) {
            super(request);
            this.option = request.option;
            this.type = request.type;
        } 

        /**
         * 不同类型对应的参数
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * 上传类型，值为：scene（场景）、subScene（子场景）、rooms（rooms文件）、hotspot（后处理相关）
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateUploadPolicyRequest build() {
            return new CreateUploadPolicyRequest(this);
        } 

    } 

}
