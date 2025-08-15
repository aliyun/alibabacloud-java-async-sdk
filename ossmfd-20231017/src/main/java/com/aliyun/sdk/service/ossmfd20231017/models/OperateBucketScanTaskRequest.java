// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossmfd20231017.models;

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

    private OperateBucketScanTaskRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.operateCode = builder.operateCode;
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

    public static final class Builder extends Request.Builder<OperateBucketScanTaskRequest, Builder> {
        private String bucketName; 
        private Integer operateCode; 

        private Builder() {
            super();
        } 

        private Builder(OperateBucketScanTaskRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.operateCode = request.operateCode;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * OperateCode.
         */
        public Builder operateCode(Integer operateCode) {
            this.putQueryParameter("OperateCode", operateCode);
            this.operateCode = operateCode;
            return this;
        }

        @Override
        public OperateBucketScanTaskRequest build() {
            return new OperateBucketScanTaskRequest(this);
        } 

    } 

}
