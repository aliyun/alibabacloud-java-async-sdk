// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRulesRequest} extends {@link RequestModel}
 *
 * <p>ListRulesRequest</p>
 */
public class ListRulesRequest extends Request {
    @Query
    @NameInMap("JsonStr")
    @Validation(required = true)
    private String jsonStr;

    private ListRulesRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRulesRequest create() {
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

    public static final class Builder extends Request.Builder<ListRulesRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(ListRulesRequest request) {
            super(request);
            this.jsonStr = request.jsonStr;
        } 

        /**
         * JsonStr.
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public ListRulesRequest build() {
            return new ListRulesRequest(this);
        } 

    } 

}
