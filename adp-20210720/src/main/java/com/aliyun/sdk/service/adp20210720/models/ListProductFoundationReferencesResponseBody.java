// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductFoundationReferencesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductFoundationReferencesResponseBody</p>
 */
public class ListProductFoundationReferencesResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    private ListProductFoundationReferencesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductFoundationReferencesResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public ListProductFoundationReferencesResponseBody build() {
            return new ListProductFoundationReferencesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("foundationReferenceUID")
        private String foundationReferenceUID;

        @NameInMap("foundationVersion")
        private String foundationVersion;

        @NameInMap("foundationVersionName")
        private String foundationVersionName;

        @NameInMap("foundationVersionType")
        private String foundationVersionType;

        @NameInMap("foundationVersionUID")
        private String foundationVersionUID;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        private Data(Builder builder) {
            this.foundationReferenceUID = builder.foundationReferenceUID;
            this.foundationVersion = builder.foundationVersion;
            this.foundationVersionName = builder.foundationVersionName;
            this.foundationVersionType = builder.foundationVersionType;
            this.foundationVersionUID = builder.foundationVersionUID;
            this.productVersionUID = builder.productVersionUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return foundationReferenceUID
         */
        public String getFoundationReferenceUID() {
            return this.foundationReferenceUID;
        }

        /**
         * @return foundationVersion
         */
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        /**
         * @return foundationVersionName
         */
        public String getFoundationVersionName() {
            return this.foundationVersionName;
        }

        /**
         * @return foundationVersionType
         */
        public String getFoundationVersionType() {
            return this.foundationVersionType;
        }

        /**
         * @return foundationVersionUID
         */
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public static final class Builder {
            private String foundationReferenceUID; 
            private String foundationVersion; 
            private String foundationVersionName; 
            private String foundationVersionType; 
            private String foundationVersionUID; 
            private String productVersionUID; 

            /**
             * foundationReferenceUID.
             */
            public Builder foundationReferenceUID(String foundationReferenceUID) {
                this.foundationReferenceUID = foundationReferenceUID;
                return this;
            }

            /**
             * foundationVersion.
             */
            public Builder foundationVersion(String foundationVersion) {
                this.foundationVersion = foundationVersion;
                return this;
            }

            /**
             * foundationVersionName.
             */
            public Builder foundationVersionName(String foundationVersionName) {
                this.foundationVersionName = foundationVersionName;
                return this;
            }

            /**
             * foundationVersionType.
             */
            public Builder foundationVersionType(String foundationVersionType) {
                this.foundationVersionType = foundationVersionType;
                return this;
            }

            /**
             * foundationVersionUID.
             */
            public Builder foundationVersionUID(String foundationVersionUID) {
                this.foundationVersionUID = foundationVersionUID;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
