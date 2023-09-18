// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResultValue} extends {@link TeaModel}
 *
 * <p>ResultValue</p>
 */
public class ResultValue extends TeaModel {
    @NameInMap("SupplierName")
    private String supplierName;

    @NameInMap("SupplierWebSite")
    private String supplierWebSite;

    @NameInMap("SupplierDescription")
    private String supplierDescription;

    private ResultValue(Builder builder) {
        this.supplierName = builder.supplierName;
        this.supplierWebSite = builder.supplierWebSite;
        this.supplierDescription = builder.supplierDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResultValue create() {
        return builder().build();
    }

    /**
     * @return supplierName
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    /**
     * @return supplierWebSite
     */
    public String getSupplierWebSite() {
        return this.supplierWebSite;
    }

    /**
     * @return supplierDescription
     */
    public String getSupplierDescription() {
        return this.supplierDescription;
    }

    public static final class Builder {
        private String supplierName; 
        private String supplierWebSite; 
        private String supplierDescription; 

        /**
         * SupplierName.
         */
        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        /**
         * SupplierWebSite.
         */
        public Builder supplierWebSite(String supplierWebSite) {
            this.supplierWebSite = supplierWebSite;
            return this;
        }

        /**
         * SupplierDescription.
         */
        public Builder supplierDescription(String supplierDescription) {
            this.supplierDescription = supplierDescription;
            return this;
        }

        public ResultValue build() {
            return new ResultValue(this);
        } 

    } 

}
