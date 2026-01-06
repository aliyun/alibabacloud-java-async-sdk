// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link QueryRobotUnsubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRobotUnsubscriptionResponseBody</p>
 */
public class QueryRobotUnsubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("unsubscribedStaffIds")
    private java.util.List<String> unsubscribedStaffIds;

    private QueryRobotUnsubscriptionResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.unsubscribedStaffIds = builder.unsubscribedStaffIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotUnsubscriptionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return unsubscribedStaffIds
     */
    public java.util.List<String> getUnsubscribedStaffIds() {
        return this.unsubscribedStaffIds;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<String> unsubscribedStaffIds; 

        private Builder() {
        } 

        private Builder(QueryRobotUnsubscriptionResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.unsubscribedStaffIds = model.unsubscribedStaffIds;
        } 

        /**
         * pageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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
         * unsubscribedStaffIds.
         */
        public Builder unsubscribedStaffIds(java.util.List<String> unsubscribedStaffIds) {
            this.unsubscribedStaffIds = unsubscribedStaffIds;
            return this;
        }

        public QueryRobotUnsubscriptionResponseBody build() {
            return new QueryRobotUnsubscriptionResponseBody(this);
        } 

    } 

}
