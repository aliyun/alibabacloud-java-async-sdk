// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConvertOfficeFormatResponseBody} extends {@link TeaModel}
 *
 * <p>ConvertOfficeFormatResponseBody</p>
 */
public class ConvertOfficeFormatResponseBody extends TeaModel {
    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("RequestId")
    private String requestId;

    private ConvertOfficeFormatResponseBody(Builder builder) {
        this.pageCount = builder.pageCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertOfficeFormatResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer pageCount; 
        private String requestId; 

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ConvertOfficeFormatResponseBody build() {
            return new ConvertOfficeFormatResponseBody(this);
        } 

    } 

}
