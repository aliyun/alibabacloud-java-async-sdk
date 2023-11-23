// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGroupInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGroupInfoListResponseBody</p>
 */
public class QueryGroupInfoListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Boolean data;

    private QueryGroupInfoListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupInfoListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Boolean data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        public QueryGroupInfoListResponseBody build() {
            return new QueryGroupInfoListResponseBody(this);
        } 

    } 

}
