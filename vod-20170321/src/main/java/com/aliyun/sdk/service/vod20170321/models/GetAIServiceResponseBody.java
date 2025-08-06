// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetAIServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIServiceResponseBody</p>
 */
public class GetAIServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIList")
    private java.util.List<AIList> AIList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAIServiceResponseBody(Builder builder) {
        this.AIList = builder.AIList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIList
     */
    public java.util.List<AIList> getAIList() {
        return this.AIList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AIList> AIList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAIServiceResponseBody model) {
            this.AIList = model.AIList;
            this.requestId = model.requestId;
        } 

        /**
         * AIList.
         */
        public Builder AIList(java.util.List<AIList> AIList) {
            this.AIList = AIList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAIServiceResponseBody build() {
            return new GetAIServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAIServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetAIServiceResponseBody</p>
     */
    public static class AIList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AIList(Builder builder) {
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(AIList model) {
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AIList build() {
                return new AIList(this);
            } 

        } 

    }
}
