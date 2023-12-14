// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCredentialReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetCredentialReportResponseBody</p>
 */
public class GetCredentialReportResponseBody extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("GeneratedTime")
    private String generatedTime;

    @NameInMap("IsTruncated")
    private String isTruncated;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private GetCredentialReportResponseBody(Builder builder) {
        this.content = builder.content;
        this.generatedTime = builder.generatedTime;
        this.isTruncated = builder.isTruncated;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return generatedTime
     */
    public String getGeneratedTime() {
        return this.generatedTime;
    }

    /**
     * @return isTruncated
     */
    public String getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String generatedTime; 
        private String isTruncated; 
        private String nextToken; 
        private String requestId; 

        /**
         * The content of the user credential report.
         * <p>
         * 
         * The report is Base64-encoded. After you decode the report, the credential report is in the CSV format.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * The time when the user credential report was generated.
         */
        public Builder generatedTime(String generatedTime) {
            this.generatedTime = generatedTime;
            return this;
        }

        /**
         * Indicates whether the response is truncated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isTruncated(String isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The parameter that is used to obtain the truncated part. This parameter takes effect only when `IsTruncated` is set to true.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCredentialReportResponseBody build() {
            return new GetCredentialReportResponseBody(this);
        } 

    } 

}
