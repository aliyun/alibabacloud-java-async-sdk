// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetOssUploadTokenResult} extends {@link TeaModel}
 *
 * <p>GetOssUploadTokenResult</p>
 */
public class GetOssUploadTokenResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("uploadInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UploadInfo uploadInfo;

    private GetOssUploadTokenResult(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadInfo = builder.uploadInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUploadTokenResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadInfo
     */
    public UploadInfo getUploadInfo() {
        return this.uploadInfo;
    }

    public static final class Builder {
        private String requestId; 
        private UploadInfo uploadInfo; 

        private Builder() {
        } 

        private Builder(GetOssUploadTokenResult model) {
            this.requestId = model.requestId;
            this.uploadInfo = model.uploadInfo;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uploadInfo(UploadInfo uploadInfo) {
            this.uploadInfo = uploadInfo;
            return this;
        }

        public GetOssUploadTokenResult build() {
            return new GetOssUploadTokenResult(this);
        } 

    } 

}
