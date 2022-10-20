// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityCheckSchemeRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityCheckSchemeRequest</p>
 */
public class CreateQualityCheckSchemeRequest extends Request {
    @Query
    @NameInMap("jsonStr")
    @Validation(required = true)
    private String jsonStr;

    private CreateQualityCheckSchemeRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQualityCheckSchemeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonStr
     */
    public String getJsonStr() {
        return this.jsonStr;
    }

    public static final class Builder extends Request.Builder<CreateQualityCheckSchemeRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityCheckSchemeRequest request) {
            super(request);
            this.jsonStr = request.jsonStr;
        } 

        /**
         * jsonStr.
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("jsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public CreateQualityCheckSchemeRequest build() {
            return new CreateQualityCheckSchemeRequest(this);
        } 

    } 

}
