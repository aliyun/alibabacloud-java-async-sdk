// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnTypesResponseBody</p>
 */
public class DescribeCdnTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CdnTypes")
    private CdnTypes cdnTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnTypesResponseBody(Builder builder) {
        this.cdnTypes = builder.cdnTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return cdnTypes
     */
    public CdnTypes getCdnTypes() {
        return this.cdnTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CdnTypes cdnTypes; 
        private String requestId; 

        /**
         * CdnTypes.
         */
        public Builder cdnTypes(CdnTypes cdnTypes) {
            this.cdnTypes = cdnTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnTypesResponseBody build() {
            return new DescribeCdnTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnTypesResponseBody</p>
     */
    public static class CdnType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CdnType(Builder builder) {
            this.desc = builder.desc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdnType create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String desc; 
            private String type; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CdnType build() {
                return new CdnType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnTypesResponseBody</p>
     */
    public static class CdnTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdnType")
        private java.util.List < CdnType> cdnType;

        private CdnTypes(Builder builder) {
            this.cdnType = builder.cdnType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdnTypes create() {
            return builder().build();
        }

        /**
         * @return cdnType
         */
        public java.util.List < CdnType> getCdnType() {
            return this.cdnType;
        }

        public static final class Builder {
            private java.util.List < CdnType> cdnType; 

            /**
             * CdnType.
             */
            public Builder cdnType(java.util.List < CdnType> cdnType) {
                this.cdnType = cdnType;
                return this;
            }

            public CdnTypes build() {
                return new CdnTypes(this);
            } 

        } 

    }
}
