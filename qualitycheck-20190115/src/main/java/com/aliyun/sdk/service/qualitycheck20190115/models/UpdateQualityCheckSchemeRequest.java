// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQualityCheckSchemeRequest} extends {@link RequestModel}
 *
 * <p>UpdateQualityCheckSchemeRequest</p>
 */
public class UpdateQualityCheckSchemeRequest extends Request {
    @Query
    @NameInMap("jsonStr")
    private String jsonStr;

    private UpdateQualityCheckSchemeRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQualityCheckSchemeRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateQualityCheckSchemeRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQualityCheckSchemeRequest request) {
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
        public UpdateQualityCheckSchemeRequest build() {
            return new UpdateQualityCheckSchemeRequest(this);
        } 

    } 

}
