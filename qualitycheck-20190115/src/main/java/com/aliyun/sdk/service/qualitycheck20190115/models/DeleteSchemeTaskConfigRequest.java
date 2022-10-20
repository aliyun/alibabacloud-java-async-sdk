// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSchemeTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteSchemeTaskConfigRequest</p>
 */
public class DeleteSchemeTaskConfigRequest extends Request {
    @Query
    @NameInMap("jsonStr")
    private String jsonStr;

    private DeleteSchemeTaskConfigRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSchemeTaskConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSchemeTaskConfigRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSchemeTaskConfigRequest request) {
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
        public DeleteSchemeTaskConfigRequest build() {
            return new DeleteSchemeTaskConfigRequest(this);
        } 

    } 

}
