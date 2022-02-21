// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChartReleaseContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetChartReleaseContentResponseBody</p>
 */
public class GetChartReleaseContentResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Content")
    private String content;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    private GetChartReleaseContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChartReleaseContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String content; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChartReleaseContentResponseBody build() {
            return new GetChartReleaseContentResponseBody(this);
        } 

    } 

}
