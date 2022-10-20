// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSetRequest} extends {@link RequestModel}
 *
 * <p>ListDataSetRequest</p>
 */
public class ListDataSetRequest extends Request {
    @Query
    @NameInMap("JsonStr")
    private String jsonStr;

    private ListDataSetRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSetRequest create() {
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

    public static final class Builder extends Request.Builder<ListDataSetRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSetRequest request) {
            super(request);
            this.jsonStr = request.jsonStr;
        } 

        /**
         * 入参json字符串
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public ListDataSetRequest build() {
            return new ListDataSetRequest(this);
        } 

    } 

}
