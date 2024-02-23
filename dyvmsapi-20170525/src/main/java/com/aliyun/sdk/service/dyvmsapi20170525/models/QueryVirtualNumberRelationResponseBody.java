// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVirtualNumberRelationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVirtualNumberRelationResponseBody</p>
 */
public class QueryVirtualNumberRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryVirtualNumberRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVirtualNumberRelationResponseBody create() {
        return builder().build();
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value 200 indicates that the request was successful.
         * *   For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The list of associations between virtual numbers and real numbers. The following fields are returned:
         * <p>
         * 
         * *   **relatedNum**: the real number.
         * *   **createTime**: the time when the number was activated.
         * *   **pageNo**: the page number.
         * *   **pageSize**: the number of entries per page.
         * *   **total**: the total number of entries returned.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryVirtualNumberRelationResponseBody build() {
            return new QueryVirtualNumberRelationResponseBody(this);
        } 

    } 

}
