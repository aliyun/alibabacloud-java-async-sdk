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
 * {@link OperateBucketScanTaskRequest} extends {@link RequestModel}
 *
 * <p>OperateBucketScanTaskRequest</p>
 */
public class OperateBucketScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateCode")
    private Integer operateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private OperateBucketScanTaskRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.operateCode = builder.operateCode;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateBucketScanTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return operateCode
     */
    public Integer getOperateCode() {
        return this.operateCode;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<OperateBucketScanTaskRequest, Builder> {
        private String bucketName; 
        private Integer operateCode; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(OperateBucketScanTaskRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.operateCode = request.operateCode;
            this.source = request.source;
        } 

        /**
         * <p>The bucket name.</p>
         * <blockquote>
         * <p>Note: This parameter is required. If this parameter is not specified, the API returns the InvalidBucketName (400) error.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>iboxpublic****</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The operation to perform on the bucket. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Cancel the scan task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder operateCode(Integer operateCode) {
            this.putQueryParameter("OperateCode", operateCode);
            this.operateCode = operateCode;
            return this;
        }

        /**
         * <p>The business source. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS</li>
         * <li><strong>NAS</strong>: NAS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public OperateBucketScanTaskRequest build() {
            return new OperateBucketScanTaskRequest(this);
        } 

    } 

}
