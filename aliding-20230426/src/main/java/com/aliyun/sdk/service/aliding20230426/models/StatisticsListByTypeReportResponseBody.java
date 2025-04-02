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
 * {@link StatisticsListByTypeReportResponseBody} extends {@link TeaModel}
 *
 * <p>StatisticsListByTypeReportResponseBody</p>
 */
public class StatisticsListByTypeReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private Long nextCursor;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("useridList")
    private java.util.List<String> useridList;

    private StatisticsListByTypeReportResponseBody(Builder builder) {
        this.hasMore = builder.hasMore;
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
        this.useridList = builder.useridList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatisticsListByTypeReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextCursor
     */
    public Long getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return useridList
     */
    public java.util.List<String> getUseridList() {
        return this.useridList;
    }

    public static final class Builder {
        private Boolean hasMore; 
        private Long nextCursor; 
        private String requestId; 
        private java.util.List<String> useridList; 

        private Builder() {
        } 

        private Builder(StatisticsListByTypeReportResponseBody model) {
            this.hasMore = model.hasMore;
            this.nextCursor = model.nextCursor;
            this.requestId = model.requestId;
            this.useridList = model.useridList;
        } 

        /**
         * hasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * nextCursor.
         */
        public Builder nextCursor(Long nextCursor) {
            this.nextCursor = nextCursor;
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
         * useridList.
         */
        public Builder useridList(java.util.List<String> useridList) {
            this.useridList = useridList;
            return this;
        }

        public StatisticsListByTypeReportResponseBody build() {
            return new StatisticsListByTypeReportResponseBody(this);
        } 

    } 

}
