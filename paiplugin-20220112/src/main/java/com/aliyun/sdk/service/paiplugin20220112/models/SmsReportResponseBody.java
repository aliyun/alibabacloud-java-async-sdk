// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmsReportResponseBody} extends {@link TeaModel}
 *
 * <p>SmsReportResponseBody</p>
 */
public class SmsReportResponseBody extends TeaModel {
    @NameInMap("code")
    private Integer code;

    @NameInMap("msg")
    private String msg;

    private SmsReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmsReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private Integer code; 
        private String msg; 

        /**
         * 应答编码。
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * 描述信息。
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public SmsReportResponseBody build() {
            return new SmsReportResponseBody(this);
        } 

    } 

}
