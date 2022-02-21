// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProfileCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProfileCatalogResponseBody</p>
 */
public class UpdateProfileCatalogResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateProfileCatalogResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProfileCatalogResponseBody create() {
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
    public Data getData() {
        return this.data;
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
        private Data data; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public UpdateProfileCatalogResponseBody build() {
            return new UpdateProfileCatalogResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CatalogId")
        private Long catalogId;

        @NameInMap("CatalogName")
        private String catalogName;

        @NameInMap("IsvSubId")
        private String isvSubId;

        @NameInMap("ParentCatalogId")
        private String parentCatalogId;

        @NameInMap("ProfileCount")
        private Long profileCount;

        private Data(Builder builder) {
            this.catalogId = builder.catalogId;
            this.catalogName = builder.catalogName;
            this.isvSubId = builder.isvSubId;
            this.parentCatalogId = builder.parentCatalogId;
            this.profileCount = builder.profileCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return catalogId
         */
        public Long getCatalogId() {
            return this.catalogId;
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return isvSubId
         */
        public String getIsvSubId() {
            return this.isvSubId;
        }

        /**
         * @return parentCatalogId
         */
        public String getParentCatalogId() {
            return this.parentCatalogId;
        }

        /**
         * @return profileCount
         */
        public Long getProfileCount() {
            return this.profileCount;
        }

        public static final class Builder {
            private Long catalogId; 
            private String catalogName; 
            private String isvSubId; 
            private String parentCatalogId; 
            private Long profileCount; 

            /**
             * CatalogId.
             */
            public Builder catalogId(Long catalogId) {
                this.catalogId = catalogId;
                return this;
            }

            /**
             * CatalogName.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * IsvSubId.
             */
            public Builder isvSubId(String isvSubId) {
                this.isvSubId = isvSubId;
                return this;
            }

            /**
             * ParentCatalogId.
             */
            public Builder parentCatalogId(String parentCatalogId) {
                this.parentCatalogId = parentCatalogId;
                return this;
            }

            /**
             * ProfileCount.
             */
            public Builder profileCount(Long profileCount) {
                this.profileCount = profileCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
