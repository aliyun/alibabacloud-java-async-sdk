// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShowQuickAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>ShowQuickAnalysisResponseBody</p>
 */
public class ShowQuickAnalysisResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ShowQuickAnalysisResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShowQuickAnalysisResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The index fields.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ShowQuickAnalysisResponseBody build() {
            return new ShowQuickAnalysisResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("IndexList")
        private java.util.List < String > indexList;

        private Data(Builder builder) {
            this.indexList = builder.indexList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return indexList
         */
        public java.util.List < String > getIndexList() {
            return this.indexList;
        }

        public static final class Builder {
            private java.util.List < String > indexList; 

            /**
             * The index fields of the logs.
             */
            public Builder indexList(java.util.List < String > indexList) {
                this.indexList = indexList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
