// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryAddressResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAddressResponseBody</p>
 */
public class QueryAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DivisionAddress")
    private DivisionAddress divisionAddress;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAddressResponseBody(Builder builder) {
        this.code = builder.code;
        this.divisionAddress = builder.divisionAddress;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return divisionAddress
     */
    public DivisionAddress getDivisionAddress() {
        return this.divisionAddress;
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
        private DivisionAddress divisionAddress; 
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
         * DivisionAddress.
         */
        public Builder divisionAddress(DivisionAddress divisionAddress) {
            this.divisionAddress = divisionAddress;
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

        public QueryAddressResponseBody build() {
            return new QueryAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAddressResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAddressResponseBody</p>
     */
    public static class DivisionAddressDivisionAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DivisionCode")
        private Long divisionCode;

        @com.aliyun.core.annotation.NameInMap("DivisionLevel")
        private Integer divisionLevel;

        @com.aliyun.core.annotation.NameInMap("DivisionName")
        private String divisionName;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        private DivisionAddressDivisionAddress(Builder builder) {
            this.divisionCode = builder.divisionCode;
            this.divisionLevel = builder.divisionLevel;
            this.divisionName = builder.divisionName;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DivisionAddressDivisionAddress create() {
            return builder().build();
        }

        /**
         * @return divisionCode
         */
        public Long getDivisionCode() {
            return this.divisionCode;
        }

        /**
         * @return divisionLevel
         */
        public Integer getDivisionLevel() {
            return this.divisionLevel;
        }

        /**
         * @return divisionName
         */
        public String getDivisionName() {
            return this.divisionName;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Long divisionCode; 
            private Integer divisionLevel; 
            private String divisionName; 
            private Long parentId; 

            /**
             * DivisionCode.
             */
            public Builder divisionCode(Long divisionCode) {
                this.divisionCode = divisionCode;
                return this;
            }

            /**
             * DivisionLevel.
             */
            public Builder divisionLevel(Integer divisionLevel) {
                this.divisionLevel = divisionLevel;
                return this;
            }

            /**
             * DivisionName.
             */
            public Builder divisionName(String divisionName) {
                this.divisionName = divisionName;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public DivisionAddressDivisionAddress build() {
                return new DivisionAddressDivisionAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAddressResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAddressResponseBody</p>
     */
    public static class DivisionAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DivisionAddress")
        private java.util.List<DivisionAddressDivisionAddress> divisionAddress;

        private DivisionAddress(Builder builder) {
            this.divisionAddress = builder.divisionAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DivisionAddress create() {
            return builder().build();
        }

        /**
         * @return divisionAddress
         */
        public java.util.List<DivisionAddressDivisionAddress> getDivisionAddress() {
            return this.divisionAddress;
        }

        public static final class Builder {
            private java.util.List<DivisionAddressDivisionAddress> divisionAddress; 

            /**
             * DivisionAddress.
             */
            public Builder divisionAddress(java.util.List<DivisionAddressDivisionAddress> divisionAddress) {
                this.divisionAddress = divisionAddress;
                return this;
            }

            public DivisionAddress build() {
                return new DivisionAddress(this);
            } 

        } 

    }
}
