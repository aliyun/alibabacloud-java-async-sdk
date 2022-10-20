// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSchemeTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateSchemeTaskConfigRequest</p>
 */
public class UpdateSchemeTaskConfigRequest extends Request {
    @Query
    @NameInMap("jsonStr")
    private String jsonStr;

    private UpdateSchemeTaskConfigRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSchemeTaskConfigRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateSchemeTaskConfigRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSchemeTaskConfigRequest request) {
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
        public UpdateSchemeTaskConfigRequest build() {
            return new UpdateSchemeTaskConfigRequest(this);
        } 

    } 

}
