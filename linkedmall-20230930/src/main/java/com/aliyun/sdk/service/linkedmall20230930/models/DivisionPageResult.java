// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link DivisionPageResult} extends {@link TeaModel}
 *
 * <p>DivisionPageResult</p>
 */
public class DivisionPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("divisionList")
    private java.util.List<Division> divisionList;

    @com.aliyun.core.annotation.NameInMap("requestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return divisionList
     */
    public java.util.List<Division> getDivisionList() {
        return this.divisionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Division> divisionList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DivisionPageResult model) {
            this.divisionList = model.divisionList;
            this.requestId = model.requestId;
        } 

        /**
         * divisionList.
         */
        public Builder divisionList(java.util.List<Division> divisionList) {
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
