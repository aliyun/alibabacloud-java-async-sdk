// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationResponseBody</p>
 */
public class ListOperationResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListOperationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationResponseBody create() {
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
         * The response parameters.
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

        public ListOperationResponseBody build() {
            return new ListOperationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AdminOrNot")
        private Boolean adminOrNot;

        @NameInMap("OperationList")
        private java.util.List < String > operationList;

        private Data(Builder builder) {
            this.adminOrNot = builder.adminOrNot;
            this.operationList = builder.operationList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adminOrNot
         */
        public Boolean getAdminOrNot() {
            return this.adminOrNot;
        }

        /**
         * @return operationList
         */
        public java.util.List < String > getOperationList() {
            return this.operationList;
        }

        public static final class Builder {
            private Boolean adminOrNot; 
            private java.util.List < String > operationList; 

            /**
             * Indicates whether the user is an administrator. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder adminOrNot(Boolean adminOrNot) {
                this.adminOrNot = adminOrNot;
                return this;
            }

            /**
             * The resources on which the permissions are granted.
             */
            public Builder operationList(java.util.List < String > operationList) {
                this.operationList = operationList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
