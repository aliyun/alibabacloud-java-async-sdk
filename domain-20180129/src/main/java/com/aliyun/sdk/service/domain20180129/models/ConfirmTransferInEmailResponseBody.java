// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmTransferInEmailResponseBody} extends {@link TeaModel}
 *
 * <p>ConfirmTransferInEmailResponseBody</p>
 */
public class ConfirmTransferInEmailResponseBody extends TeaModel {
    @NameInMap("FailList")
    private FailList failList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessList")
    private SuccessList successList;

    private ConfirmTransferInEmailResponseBody(Builder builder) {
        this.failList = builder.failList;
        this.requestId = builder.requestId;
        this.successList = builder.successList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmTransferInEmailResponseBody create() {
        return builder().build();
    }

    /**
     * @return failList
     */
    public FailList getFailList() {
        return this.failList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successList
     */
    public SuccessList getSuccessList() {
        return this.successList;
    }

    public static final class Builder {
        private FailList failList; 
        private String requestId; 
        private SuccessList successList; 

        /**
         * FailList.
         */
        public Builder failList(FailList failList) {
            this.failList = failList;
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
         * SuccessList.
         */
        public Builder successList(SuccessList successList) {
            this.successList = successList;
            return this;
        }

        public ConfirmTransferInEmailResponseBody build() {
            return new ConfirmTransferInEmailResponseBody(this);
        } 

    } 

    public static class FailList extends TeaModel {
        @NameInMap("FailDomain")
        private java.util.List < String > failDomain;

        private FailList(Builder builder) {
            this.failDomain = builder.failDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailList create() {
            return builder().build();
        }

        /**
         * @return failDomain
         */
        public java.util.List < String > getFailDomain() {
            return this.failDomain;
        }

        public static final class Builder {
            private java.util.List < String > failDomain; 

            /**
             * FailDomain.
             */
            public Builder failDomain(java.util.List < String > failDomain) {
                this.failDomain = failDomain;
                return this;
            }

            public FailList build() {
                return new FailList(this);
            } 

        } 

    }
    public static class SuccessList extends TeaModel {
        @NameInMap("SuccessDomain")
        private java.util.List < String > successDomain;

        private SuccessList(Builder builder) {
            this.successDomain = builder.successDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessList create() {
            return builder().build();
        }

        /**
         * @return successDomain
         */
        public java.util.List < String > getSuccessDomain() {
            return this.successDomain;
        }

        public static final class Builder {
            private java.util.List < String > successDomain; 

            /**
             * SuccessDomain.
             */
            public Builder successDomain(java.util.List < String > successDomain) {
                this.successDomain = successDomain;
                return this;
            }

            public SuccessList build() {
                return new SuccessList(this);
            } 

        } 

    }
}
