// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpApiMockContract} extends {@link TeaModel}
 *
 * <p>HttpApiMockContract</p>
 */
public class HttpApiMockContract extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("responseCode")
    private Integer responseCode;

    @com.aliyun.core.annotation.NameInMap("responseContent")
    private String responseContent;

    private HttpApiMockContract(Builder builder) {
        this.enable = builder.enable;
        this.responseCode = builder.responseCode;
        this.responseContent = builder.responseContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiMockContract create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return responseCode
     */
    public Integer getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return responseContent
     */
    public String getResponseContent() {
        return this.responseContent;
    }

    public static final class Builder {
        private Boolean enable; 
        private Integer responseCode; 
        private String responseContent; 

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * responseCode.
         */
        public Builder responseCode(Integer responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * responseContent.
         */
        public Builder responseContent(String responseContent) {
            this.responseContent = responseContent;
            return this;
        }

        public HttpApiMockContract build() {
            return new HttpApiMockContract(this);
        } 

    } 

}
