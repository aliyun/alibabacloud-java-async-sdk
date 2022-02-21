// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportQueryResultResponseBody} extends {@link TeaModel}
 *
 * <p>ExportQueryResultResponseBody</p>
 */
public class ExportQueryResultResponseBody extends TeaModel {
    @NameInMap("DownloadUrlList")
    private java.util.List < String > downloadUrlList;

    @NameInMap("IsReady")
    private Boolean isReady;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ExportQueryResultResponseBody(Builder builder) {
        this.downloadUrlList = builder.downloadUrlList;
        this.isReady = builder.isReady;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportQueryResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadUrlList
     */
    public java.util.List < String > getDownloadUrlList() {
        return this.downloadUrlList;
    }

    /**
     * @return isReady
     */
    public Boolean getIsReady() {
        return this.isReady;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < String > downloadUrlList; 
        private Boolean isReady; 
        private String requestId; 
        private Boolean success; 

        /**
         * DownloadUrlList.
         */
        public Builder downloadUrlList(java.util.List < String > downloadUrlList) {
            this.downloadUrlList = downloadUrlList;
            return this;
        }

        /**
         * IsReady.
         */
        public Builder isReady(Boolean isReady) {
            this.isReady = isReady;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExportQueryResultResponseBody build() {
            return new ExportQueryResultResponseBody(this);
        } 

    } 

}
