// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetOssBucketScanStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetOssBucketScanStatisticRequest</p>
 */
public class GetOssBucketScanStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketNameList")
    private java.util.List<String> bucketNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private GetOssBucketScanStatisticRequest(Builder builder) {
        super(builder);
        this.bucketNameList = builder.bucketNameList;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssBucketScanStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketNameList
     */
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetOssBucketScanStatisticRequest, Builder> {
        private java.util.List<String> bucketNameList; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetOssBucketScanStatisticRequest request) {
            super(request);
            this.bucketNameList = request.bucketNameList;
            this.source = request.source;
        } 

        /**
         * <p>The names of the buckets.</p>
         */
        public Builder bucketNameList(java.util.List<String> bucketNameList) {
            this.putQueryParameter("BucketNameList", bucketNameList);
            this.bucketNameList = bucketNameList;
            return this;
        }

        /**
         * <p>The data source. Valid values:</p>
         * <ul>
         * <li><strong>API</strong>: API operations.</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS) file check.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetOssBucketScanStatisticRequest build() {
            return new GetOssBucketScanStatisticRequest(this);
        } 

    } 

}
