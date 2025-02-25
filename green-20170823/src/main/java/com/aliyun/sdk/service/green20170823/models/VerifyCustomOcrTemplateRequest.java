// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCustomOcrTemplateRequest} extends {@link RequestModel}
 *
 * <p>VerifyCustomOcrTemplateRequest</p>
 */
public class VerifyCustomOcrTemplateRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("TestImgUrl")
    @Validation(required = true)
    private String testImgUrl;

    private VerifyCustomOcrTemplateRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.testImgUrl = builder.testImgUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCustomOcrTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return testImgUrl
     */
    public String getTestImgUrl() {
        return this.testImgUrl;
    }

    public static final class Builder extends Request.Builder<VerifyCustomOcrTemplateRequest, Builder> {
        private Long id; 
        private String testImgUrl; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCustomOcrTemplateRequest request) {
            super(request);
            this.id = request.id;
            this.testImgUrl = request.testImgUrl;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * TestImgUrl.
         */
        public Builder testImgUrl(String testImgUrl) {
            this.putQueryParameter("TestImgUrl", testImgUrl);
            this.testImgUrl = testImgUrl;
            return this;
        }

        @Override
        public VerifyCustomOcrTemplateRequest build() {
            return new VerifyCustomOcrTemplateRequest(this);
        } 

    } 

}
