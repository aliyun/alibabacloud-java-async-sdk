// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSaasPermissionGroupInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListSaasPermissionGroupInfosResponseBody</p>
 */
public class ListSaasPermissionGroupInfosResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListSaasPermissionGroupInfosResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSaasPermissionGroupInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSaasPermissionGroupInfosResponseBody build() {
            return new ListSaasPermissionGroupInfosResponseBody(this);
        } 

    } 

    public static class PgInfos extends TeaModel {
        @NameInMap("PgCode")
        private String pgCode;

        @NameInMap("PgEnName")
        private String pgEnName;

        @NameInMap("PgName")
        private String pgName;

        private PgInfos(Builder builder) {
            this.pgCode = builder.pgCode;
            this.pgEnName = builder.pgEnName;
            this.pgName = builder.pgName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PgInfos create() {
            return builder().build();
        }

        /**
         * @return pgCode
         */
        public String getPgCode() {
            return this.pgCode;
        }

        /**
         * @return pgEnName
         */
        public String getPgEnName() {
            return this.pgEnName;
        }

        /**
         * @return pgName
         */
        public String getPgName() {
            return this.pgName;
        }

        public static final class Builder {
            private String pgCode; 
            private String pgEnName; 
            private String pgName; 

            /**
             * PgCode.
             */
            public Builder pgCode(String pgCode) {
                this.pgCode = pgCode;
                return this;
            }

            /**
             * PgEnName.
             */
            public Builder pgEnName(String pgEnName) {
                this.pgEnName = pgEnName;
                return this;
            }

            /**
             * PgName.
             */
            public Builder pgName(String pgName) {
                this.pgName = pgName;
                return this;
            }

            public PgInfos build() {
                return new PgInfos(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("EnName")
        private String enName;

        @NameInMap("Name")
        private String name;

        @NameInMap("PgInfos")
        private java.util.List < PgInfos> pgInfos;

        @NameInMap("SaasCode")
        private String saasCode;

        private Data(Builder builder) {
            this.enName = builder.enName;
            this.name = builder.name;
            this.pgInfos = builder.pgInfos;
            this.saasCode = builder.saasCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pgInfos
         */
        public java.util.List < PgInfos> getPgInfos() {
            return this.pgInfos;
        }

        /**
         * @return saasCode
         */
        public String getSaasCode() {
            return this.saasCode;
        }

        public static final class Builder {
            private String enName; 
            private String name; 
            private java.util.List < PgInfos> pgInfos; 
            private String saasCode; 

            /**
             * EnName.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PgInfos.
             */
            public Builder pgInfos(java.util.List < PgInfos> pgInfos) {
                this.pgInfos = pgInfos;
                return this;
            }

            /**
             * SaasCode.
             */
            public Builder saasCode(String saasCode) {
                this.saasCode = saasCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
