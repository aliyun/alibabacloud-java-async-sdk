// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetCredentialReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetCredentialReportResponseBody</p>
 */
public class GetCredentialReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("GeneratedTime")
    private String generatedTime;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private String isTruncated;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The content of the user credential report.</p>
         * <p>The report is Base64-encoded. After you decode the report, the credential report is in the CSV format.</p>
         * 
         * <strong>example:</strong>
         * <p>OVZWK4RMOVZW****</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The time when the user credential report was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-19T15:06:52Z</p>
         */
        public Builder generatedTime(String generatedTime) {
            this.generatedTime = generatedTime;
            return this;
        }

        /**
         * <p>Indicates whether the response is truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(String isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The parameter that is used to obtain the truncated part. This parameter takes effect only when <code>IsTruncated</code> is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A01826E-7601-44B0-B4DF-2B0C509836DE</p>
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
