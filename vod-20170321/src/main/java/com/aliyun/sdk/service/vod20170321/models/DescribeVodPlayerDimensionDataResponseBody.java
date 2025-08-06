// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodPlayerDimensionDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodPlayerDimensionDataResponseBody</p>
 */
public class DescribeVodPlayerDimensionDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<String> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodPlayerDimensionDataResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodPlayerDimensionDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<String> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> dataList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVodPlayerDimensionDataResponseBody model) {
            this.dataList = model.dataList;
            this.requestId = model.requestId;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<String> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodPlayerDimensionDataResponseBody build() {
            return new DescribeVodPlayerDimensionDataResponseBody(this);
        } 

    } 

}
