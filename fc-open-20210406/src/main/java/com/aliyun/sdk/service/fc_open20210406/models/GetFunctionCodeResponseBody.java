// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionCodeResponseBody</p>
 */
public class GetFunctionCodeResponseBody extends TeaModel {
    @NameInMap("checksum")
    private String checksum;

    @NameInMap("url")
    private String url;

    private GetFunctionCodeResponseBody(Builder builder) {
        this.checksum = builder.checksum;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return checksum
     */
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String checksum; 
        private String url; 

        /**
         * function code包的CRC64值
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * 获取function代码的URL
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetFunctionCodeResponseBody build() {
            return new GetFunctionCodeResponseBody(this);
        } 

    } 

}
