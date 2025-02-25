// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateYydDataSetRequest} extends {@link RequestModel}
 *
 * <p>CreateYydDataSetRequest</p>
 */
public class CreateYydDataSetRequest extends Request {
    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ossFileName")
    @Validation(required = true)
    private String ossFileName;

    private CreateYydDataSetRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.ossFileName = builder.ossFileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYydDataSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossFileName
     */
    public String getOssFileName() {
        return this.ossFileName;
    }

    public static final class Builder extends Request.Builder<CreateYydDataSetRequest, Builder> {
        private String name; 
        private String ossFileName; 

        private Builder() {
            super();
        } 

        private Builder(CreateYydDataSetRequest request) {
            super(request);
            this.name = request.name;
            this.ossFileName = request.ossFileName;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * ossFileName.
         */
        public Builder ossFileName(String ossFileName) {
            this.putBodyParameter("ossFileName", ossFileName);
            this.ossFileName = ossFileName;
            return this;
        }

        @Override
        public CreateYydDataSetRequest build() {
            return new CreateYydDataSetRequest(this);
        } 

    } 

}
