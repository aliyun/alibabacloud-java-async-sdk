// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpsecServerLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpsecServerLogsResponseBody</p>
 */
public class ListIpsecServerLogsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < String > data;

    @NameInMap("IsCompleted")
    private Boolean isCompleted;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    private ListIpsecServerLogsResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.isCompleted = builder.isCompleted;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpsecServerLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < String > getData() {
        return this.data;
    }

    /**
     * @return isCompleted
     */
    public Boolean getIsCompleted() {
        return this.isCompleted;
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

    public static final class Builder {
        private Integer count; 
        private java.util.List < String > data; 
        private Boolean isCompleted; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        /**
         * The number of entries on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * An array of strings.
         * <p>
         * 
         * Each item in the array is a log entry.
         */
        public Builder data(java.util.List < String > data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the log is accurate. Valid values:
         * <p>
         * 
         * *   **true**: accurate
         * *   **false**: inaccurate
         */
        public Builder isCompleted(Boolean isCompleted) {
            this.isCompleted = isCompleted;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIpsecServerLogsResponseBody build() {
            return new ListIpsecServerLogsResponseBody(this);
        } 

    } 

}
