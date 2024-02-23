// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVirtualNumberResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVirtualNumberResponseBody</p>
 */
public class QueryVirtualNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryVirtualNumberResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVirtualNumberResponseBody create() {
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
         * The response code. The value 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the numbers associated with the virtual numbers. The following fields are returned:
         * <p>
         * 
         * *   createTime: the time when the number was activated.
         * *   qualificationCount: the number of qualifications.
         * *   cityCount: the number of cities.
         * *   phoneNumCount: the number of virtual numbers.
         * *   remark: the additional information.
         * *   phoneNum: the virtual number.
         * *   routeType: the route type.
         * *   canCancel: indicates whether the number can be deactivated.
         * *   specCount: the number of Internet service providers (ISPs).
         * *   status: the number state. Valid values: **1**, **0**, and **-1**. The value 1 indicates that the number is valid. The value 0 indicates that the number is invalid. The value -1 indicates that the number was deactivated.
         * *   pageNo: the page number.
         * *   pageSize: the number of entries per page.
         * *   total: the total number of virtual numbers.
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

        public QueryVirtualNumberResponseBody build() {
            return new QueryVirtualNumberResponseBody(this);
        } 

    } 

}
