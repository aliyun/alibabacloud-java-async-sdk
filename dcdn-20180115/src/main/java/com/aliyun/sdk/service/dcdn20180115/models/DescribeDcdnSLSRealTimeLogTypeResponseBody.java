// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSLSRealTimeLogTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSLSRealTimeLogTypeResponseBody</p>
 */
public class DescribeDcdnSLSRealTimeLogTypeResponseBody extends TeaModel {
    @NameInMap("Content")
    private Content content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnSLSRealTimeLogTypeResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSLSRealTimeLogTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnSLSRealTimeLogTypeResponseBody build() {
            return new DescribeDcdnSLSRealTimeLogTypeResponseBody(this);
        } 

    } 

    public static class Business extends TeaModel {
        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("Desc")
        private String desc;

        private Business(Builder builder) {
            this.businessType = builder.businessType;
            this.desc = builder.desc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Business create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        public static final class Builder {
            private String businessType; 
            private String desc; 

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            public Business build() {
                return new Business(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("Business")
        private java.util.List < Business> business;

        private Content(Builder builder) {
            this.business = builder.business;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return business
         */
        public java.util.List < Business> getBusiness() {
            return this.business;
        }

        public static final class Builder {
            private java.util.List < Business> business; 

            /**
             * Business.
             */
            public Builder business(java.util.List < Business> business) {
                this.business = business;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
