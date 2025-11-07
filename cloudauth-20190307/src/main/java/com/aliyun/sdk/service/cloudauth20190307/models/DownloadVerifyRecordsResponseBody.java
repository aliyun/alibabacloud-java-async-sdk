// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DownloadVerifyRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadVerifyRecordsResponseBody</p>
 */
public class DownloadVerifyRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private String resultObject;

    private DownloadVerifyRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadVerifyRecordsResponseBody create() {
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
     * @return resultObject
     */
    public String getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private String resultObject; 

        private Builder() {
        } 

        private Builder(DownloadVerifyRecordsResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>OSS link for file download.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/invoke_download/0E30CD55-DCD4-5363-AA98-XXXXXXX">https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/invoke_download/0E30CD55-DCD4-5363-AA98-XXXXXXX</a></p>
         */
        public Builder resultObject(String resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DownloadVerifyRecordsResponseBody build() {
            return new DownloadVerifyRecordsResponseBody(this);
        } 

    } 

}
