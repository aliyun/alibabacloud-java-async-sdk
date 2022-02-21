// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShowListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShowListResponseBody</p>
 */
public class DescribeShowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowList")
    private String showList;

    private DescribeShowListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.showList = builder.showList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShowListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showList
     */
    public String getShowList() {
        return this.showList;
    }

    public static final class Builder {
        private String requestId; 
        private String showList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowList.
         */
        public Builder showList(String showList) {
            this.showList = showList;
            return this;
        }

        public DescribeShowListResponseBody build() {
            return new DescribeShowListResponseBody(this);
        } 

    } 

}
