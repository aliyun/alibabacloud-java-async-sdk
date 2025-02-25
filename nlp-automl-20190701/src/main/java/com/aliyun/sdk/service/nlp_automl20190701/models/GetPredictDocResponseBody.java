// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20190701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPredictDocResponseBody} extends {@link TeaModel}
 *
 * <p>GetPredictDocResponseBody</p>
 */
public class GetPredictDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private String resultContent;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("XLIFFInfo")
    private String XLIFFInfo;

    private GetPredictDocResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultContent = builder.resultContent;
        this.status = builder.status;
        this.XLIFFInfo = builder.XLIFFInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPredictDocResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultContent
     */
    public String getResultContent() {
        return this.resultContent;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return XLIFFInfo
     */
    public String getXLIFFInfo() {
        return this.XLIFFInfo;
    }

    public static final class Builder {
        private String requestId; 
        private String resultContent; 
        private Integer status; 
        private String XLIFFInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(String resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * XLIFFInfo.
         */
        public Builder XLIFFInfo(String XLIFFInfo) {
            this.XLIFFInfo = XLIFFInfo;
            return this;
        }

        public GetPredictDocResponseBody build() {
            return new GetPredictDocResponseBody(this);
        } 

    } 

}
