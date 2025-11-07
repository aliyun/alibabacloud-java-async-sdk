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
 * {@link QueryVerifyDownloadTaskResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVerifyDownloadTaskResponseBody</p>
 */
public class QueryVerifyDownloadTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Finish")
    private Boolean finish;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private QueryVerifyDownloadTaskResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.finish = builder.finish;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVerifyDownloadTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return finish
     */
    public Boolean getFinish() {
        return this.finish;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String errorCode; 
        private Boolean finish; 
        private String requestId; 
        private Integer status; 
        private String url; 

        private Builder() {
        } 

        private Builder(QueryVerifyDownloadTaskResponseBody model) {
            this.errorCode = model.errorCode;
            this.finish = model.finish;
            this.requestId = model.requestId;
            this.status = model.status;
            this.url = model.url;
        } 

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>Whether the download task is completed:</p>
         * <ul>
         * <li><strong>true</strong>: Completed</li>
         * <li><strong>false</strong>: Not completed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder finish(Boolean finish) {
            this.finish = finish;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Task status:</p>
         * <ul>
         * <li><strong>1</strong>: File generation in progress</li>
         * <li><strong>2</strong>: File generation completed</li>
         * <li><strong>3</strong>: File generation failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.csv">http://xxx/xxx.csv</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public QueryVerifyDownloadTaskResponseBody build() {
            return new QueryVerifyDownloadTaskResponseBody(this);
        } 

    } 

}
