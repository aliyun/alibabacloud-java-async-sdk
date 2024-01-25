// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogSampleColumnResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogSampleColumnResponseBody</p>
 */
public class GetLogSampleColumnResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.Map < String, ? > data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("PageTotal")
    private Long pageTotal;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetLogSampleColumnResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.pageTotal = builder.pageTotal;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogSampleColumnResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.Map < String, ? > getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return pageTotal
     */
    public Long getPageTotal() {
        return this.pageTotal;
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
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.Map < String, ? > data; 
        private String msg; 
        private Long pageTotal; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.Map < String, ? > data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * PageTotal.
         */
        public Builder pageTotal(Long pageTotal) {
            this.pageTotal = pageTotal;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetLogSampleColumnResponseBody build() {
            return new GetLogSampleColumnResponseBody(this);
        } 

    } 

}
