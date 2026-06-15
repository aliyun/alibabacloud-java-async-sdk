// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetTuneProposalByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetTuneProposalByIdResponseBody</p>
 */
public class GetTuneProposalByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTuneProposalByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTuneProposalByIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTuneProposalByIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTuneProposalByIdResponseBody build() {
            return new GetTuneProposalByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTuneProposalByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetTuneProposalByIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JsonContent")
        private String jsonContent;

        private Data(Builder builder) {
            this.jsonContent = builder.jsonContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jsonContent
         */
        public String getJsonContent() {
            return this.jsonContent;
        }

        public static final class Builder {
            private String jsonContent; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jsonContent = model.jsonContent;
            } 

            /**
             * JsonContent.
             */
            public Builder jsonContent(String jsonContent) {
                this.jsonContent = jsonContent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
