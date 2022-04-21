// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunDBCommandResponseBody} extends {@link TeaModel}
 *
 * <p>RunDBCommandResponseBody</p>
 */
public class RunDBCommandResponseBody extends TeaModel {
    @NameInMap("AffectedDocs")
    private Integer affectedDocs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    private RunDBCommandResponseBody(Builder builder) {
        this.affectedDocs = builder.affectedDocs;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDBCommandResponseBody create() {
        return builder().build();
    }

    /**
     * @return affectedDocs
     */
    public Integer getAffectedDocs() {
        return this.affectedDocs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer affectedDocs; 
        private String requestId; 
        private String result; 

        /**
         * AffectedDocs.
         */
        public Builder affectedDocs(Integer affectedDocs) {
            this.affectedDocs = affectedDocs;
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
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public RunDBCommandResponseBody build() {
            return new RunDBCommandResponseBody(this);
        } 

    } 

}
