// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetValidateFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetValidateFileResponseBody</p>
 */
public class GetValidateFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetValidateFileResponseBody(Builder builder) {
        this.fileUrl = builder.fileUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetValidateFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fileUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetValidateFileResponseBody model) {
            this.fileUrl = model.fileUrl;
            this.requestId = model.requestId;
        } 

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetValidateFileResponseBody build() {
            return new GetValidateFileResponseBody(this);
        } 

    } 

}
