// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeSoarRecordActionOutputListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarRecordActionOutputListResponseBody</p>
 */
public class DescribeSoarRecordActionOutputListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionOutputs")
    private String actionOutputs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSoarRecordActionOutputListResponseBody(Builder builder) {
        this.actionOutputs = builder.actionOutputs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarRecordActionOutputListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionOutputs
     */
    public String getActionOutputs() {
        return this.actionOutputs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public static final class Builder {
        private String actionOutputs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSoarRecordActionOutputListResponseBody model) {
            this.actionOutputs = model.actionOutputs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The data that is returned when the component action is performed. The value is a JSON array.</p>
         * <blockquote>
         * <p> The format of the output data is determined by the component that is configured when the playbook is written.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;a&quot;: &quot;a&quot;,
         *         &quot;taskname&quot;: &quot;92af3c79-1754-4646-9366-9ddbd1e45536_xxxx&quot;,
         *         &quot;log_time&quot;: 1699868849000
         *     }
         * ]</p>
         */
        public Builder actionOutputs(String actionOutputs) {
            this.actionOutputs = actionOutputs;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A2BF9CF-3E32-5E45-A79B-8F67E0A4FE90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSoarRecordActionOutputListResponseBody build() {
            return new DescribeSoarRecordActionOutputListResponseBody(this);
        } 

    } 

}
