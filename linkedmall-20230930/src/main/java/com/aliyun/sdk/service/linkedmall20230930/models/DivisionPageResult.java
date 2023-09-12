// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DivisionPageResult} extends {@link TeaModel}
 *
 * <p>DivisionPageResult</p>
 */
public class DivisionPageResult extends TeaModel {
    @NameInMap("divisionList")
    private java.util.List < Division > divisionList;

    @NameInMap("requestId")
    private String requestId;

    private DivisionPageResult(Builder builder) {
        this.divisionList = builder.divisionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DivisionPageResult create() {
        return builder().build();
    }

    /**
     * @return divisionList
     */
    public java.util.List < Division > getDivisionList() {
        return this.divisionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Division > divisionList; 
        private String requestId; 

        /**
         * divisionList.
         */
        public Builder divisionList(java.util.List < Division > divisionList) {
            this.divisionList = divisionList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DivisionPageResult build() {
            return new DivisionPageResult(this);
        } 

    } 

}
