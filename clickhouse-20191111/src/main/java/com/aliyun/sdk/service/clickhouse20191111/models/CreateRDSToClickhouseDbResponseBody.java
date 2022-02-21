// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRDSToClickhouseDbResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRDSToClickhouseDbResponseBody</p>
 */
public class CreateRDSToClickhouseDbResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RepeatedDbs")
    private java.util.List < String > repeatedDbs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Long status;

    private CreateRDSToClickhouseDbResponseBody(Builder builder) {
        this.errorMsg = builder.errorMsg;
        this.repeatedDbs = builder.repeatedDbs;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRDSToClickhouseDbResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return repeatedDbs
     */
    public java.util.List < String > getRepeatedDbs() {
        return this.repeatedDbs;
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
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String errorMsg; 
        private java.util.List < String > repeatedDbs; 
        private String requestId; 
        private Long status; 

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * RepeatedDbs.
         */
        public Builder repeatedDbs(java.util.List < String > repeatedDbs) {
            this.repeatedDbs = repeatedDbs;
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
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        public CreateRDSToClickhouseDbResponseBody build() {
            return new CreateRDSToClickhouseDbResponseBody(this);
        } 

    } 

}
