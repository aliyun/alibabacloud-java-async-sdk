// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBizTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBizTypesResponseBody</p>
 */
public class DescribeBizTypesResponseBody extends TeaModel {
    @NameInMap("BizTypeList")
    private java.util.List < String > bizTypeList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBizTypesResponseBody(Builder builder) {
        this.bizTypeList = builder.bizTypeList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizTypeList
     */
    public java.util.List < String > getBizTypeList() {
        return this.bizTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > bizTypeList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * BizTypeList.
         */
        public Builder bizTypeList(java.util.List < String > bizTypeList) {
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBizTypesResponseBody build() {
            return new DescribeBizTypesResponseBody(this);
        } 

    } 

}
