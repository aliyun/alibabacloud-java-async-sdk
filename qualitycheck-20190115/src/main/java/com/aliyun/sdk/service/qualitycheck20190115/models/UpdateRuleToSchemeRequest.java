// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleToSchemeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleToSchemeRequest</p>
 */
public class UpdateRuleToSchemeRequest extends Request {
    @Query
    @NameInMap("jsonStr")
    private String jsonStr;

    private UpdateRuleToSchemeRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleToSchemeRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateRuleToSchemeRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleToSchemeRequest request) {
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
        public UpdateRuleToSchemeRequest build() {
            return new UpdateRuleToSchemeRequest(this);
        } 

    } 

}
