// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTerraformProviderVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTerraformProviderVersionsResponseBody</p>
 */
public class ListTerraformProviderVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("verisonList")
    private java.util.List < String > verisonList;

    private ListTerraformProviderVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.verisonList = builder.verisonList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTerraformProviderVersionsResponseBody create() {
        return builder().build();
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

    /**
     * @return verisonList
     */
    public java.util.List < String > getVerisonList() {
        return this.verisonList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < String > verisonList; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * verisonList.
         */
        public Builder verisonList(java.util.List < String > verisonList) {
            this.verisonList = verisonList;
            return this;
        }

        public ListTerraformProviderVersionsResponseBody build() {
            return new ListTerraformProviderVersionsResponseBody(this);
        } 

    } 

}
