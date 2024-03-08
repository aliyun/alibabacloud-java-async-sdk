// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopHpoExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>StopHpoExperimentResponseBody</p>
 */
public class StopHpoExperimentResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @NameInMap("ExpId")
    private String expId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private StopHpoExperimentResponseBody(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.expId = builder.expId;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopHpoExperimentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return detail
     */
    public java.util.Map < String, String > getDetail() {
        return this.detail;
    }

    /**
     * @return expId
     */
    public String getExpId() {
        return this.expId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map < String, String > detail; 
        private String expId; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * ExpId.
         */
        public Builder expId(String expId) {
            this.expId = expId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StopHpoExperimentResponseBody build() {
            return new StopHpoExperimentResponseBody(this);
        } 

    } 

}
