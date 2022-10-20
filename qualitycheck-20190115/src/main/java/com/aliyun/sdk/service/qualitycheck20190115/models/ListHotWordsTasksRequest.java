// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotWordsTasksRequest} extends {@link RequestModel}
 *
 * <p>ListHotWordsTasksRequest</p>
 */
public class ListHotWordsTasksRequest extends Request {
    @Query
    @NameInMap("JsonStr")
    @Validation(required = true)
    private String jsonStr;

    private ListHotWordsTasksRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotWordsTasksRequest create() {
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

    public static final class Builder extends Request.Builder<ListHotWordsTasksRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(ListHotWordsTasksRequest request) {
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
        public ListHotWordsTasksRequest build() {
            return new ListHotWordsTasksRequest(this);
        } 

    } 

}
