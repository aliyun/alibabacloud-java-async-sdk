// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSignatureRequest} extends {@link RequestModel}
 *
 * <p>CreateSignatureRequest</p>
 */
public class CreateSignatureRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateSignatureRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSignatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateSignatureRequest, Builder> {
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateSignatureRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * 申请说明。
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 签名名称。
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateSignatureRequest build() {
            return new CreateSignatureRequest(this);
        } 

    } 

}
