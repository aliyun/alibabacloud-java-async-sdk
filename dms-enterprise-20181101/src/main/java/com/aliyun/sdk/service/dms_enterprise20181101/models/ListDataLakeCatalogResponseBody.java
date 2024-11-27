// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataLakeCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataLakeCatalogResponseBody</p>
 */
public class ListDataLakeCatalogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CataLogList")
    private CataLogList cataLogList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataLakeCatalogResponseBody(Builder builder) {
        this.cataLogList = builder.cataLogList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataLakeCatalogResponseBody create() {
        return builder().build();
    }

    /**
     * @return cataLogList
     */
    public CataLogList getCataLogList() {
        return this.cataLogList;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private CataLogList cataLogList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * CataLogList.
         */
        public Builder cataLogList(CataLogList cataLogList) {
            this.cataLogList = cataLogList;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataLakeCatalogResponseBody build() {
            return new ListDataLakeCatalogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataLakeCatalogResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataLakeCatalogResponseBody</p>
     */
    public static class CataLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Catalog")
        private java.util.List < DLCatalog > catalog;

        private CataLogList(Builder builder) {
            this.catalog = builder.catalog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CataLogList create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public java.util.List < DLCatalog > getCatalog() {
            return this.catalog;
        }

        public static final class Builder {
            private java.util.List < DLCatalog > catalog; 

            /**
             * Catalog.
             */
            public Builder catalog(java.util.List < DLCatalog > catalog) {
                this.catalog = catalog;
                return this;
            }

            public CataLogList build() {
                return new CataLogList(this);
            } 

        } 

    }
}
