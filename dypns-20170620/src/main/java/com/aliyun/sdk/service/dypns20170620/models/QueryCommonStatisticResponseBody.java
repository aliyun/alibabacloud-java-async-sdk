// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCommonStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCommonStatisticResponseBody</p>
 */
public class QueryCommonStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    private QueryCommonStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommonStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private String data; 

        private Builder() {
        } 

        private Builder(QueryCommonStatisticResponseBody model) {
            this.requestId = model.requestId;
            this.code = model.code;
            this.data = model.data;
        } 

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
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        public QueryCommonStatisticResponseBody build() {
            return new QueryCommonStatisticResponseBody(this);
        } 

    } 

}
