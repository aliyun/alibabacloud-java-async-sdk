// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarRecordActionOutputListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarRecordActionOutputListResponseBody</p>
 */
public class DescribeSoarRecordActionOutputListResponseBody extends TeaModel {
    @NameInMap("ActionOutputs")
    private String actionOutputs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * The data that is returned when the component action is performed. The value is a JSON array.
         * <p>
         * 
         * >  The format of the output data is determined by the component that is configured when the playbook is written.
         */
        public Builder actionOutputs(String actionOutputs) {
            this.actionOutputs = actionOutputs;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of pages returned.
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
