// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEnvironmentProductVersionsRequest} extends {@link RequestModel}
 *
 * <p>AddEnvironmentProductVersionsRequest</p>
 */
public class AddEnvironmentProductVersionsRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("productVersionInfoList")
    private java.util.List < ProductVersionInfoList> productVersionInfoList;

    @Body
    @NameInMap("productVersionUIDList")
    @Validation(required = true)
    private java.util.List < String > productVersionUIDList;

    private AddEnvironmentProductVersionsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.productVersionInfoList = builder.productVersionInfoList;
        this.productVersionUIDList = builder.productVersionUIDList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEnvironmentProductVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return productVersionInfoList
     */
    public java.util.List < ProductVersionInfoList> getProductVersionInfoList() {
        return this.productVersionInfoList;
    }

    /**
     * @return productVersionUIDList
     */
    public java.util.List < String > getProductVersionUIDList() {
        return this.productVersionUIDList;
    }

    public static final class Builder extends Request.Builder<AddEnvironmentProductVersionsRequest, Builder> {
        private String uid; 
        private java.util.List < ProductVersionInfoList> productVersionInfoList; 
        private java.util.List < String > productVersionUIDList; 

        private Builder() {
            super();
        } 

        private Builder(AddEnvironmentProductVersionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.productVersionInfoList = request.productVersionInfoList;
            this.productVersionUIDList = request.productVersionUIDList;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * productVersionInfoList.
         */
        public Builder productVersionInfoList(java.util.List < ProductVersionInfoList> productVersionInfoList) {
            this.putBodyParameter("productVersionInfoList", productVersionInfoList);
            this.productVersionInfoList = productVersionInfoList;
            return this;
        }

        /**
         * productVersionUIDList.
         */
        public Builder productVersionUIDList(java.util.List < String > productVersionUIDList) {
            this.putBodyParameter("productVersionUIDList", productVersionUIDList);
            this.productVersionUIDList = productVersionUIDList;
            return this;
        }

        @Override
        public AddEnvironmentProductVersionsRequest build() {
            return new AddEnvironmentProductVersionsRequest(this);
        } 

    } 

    public static class ProductVersionInfoList extends TeaModel {
        @NameInMap("namespace")
        private String namespace;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        @NameInMap("specUID")
        private String specUID;

        private ProductVersionInfoList(Builder builder) {
            this.namespace = builder.namespace;
            this.productVersionUID = builder.productVersionUID;
            this.specUID = builder.specUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductVersionInfoList create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        /**
         * @return specUID
         */
        public String getSpecUID() {
            return this.specUID;
        }

        public static final class Builder {
            private String namespace; 
            private String productVersionUID; 
            private String specUID; 

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            /**
             * specUID.
             */
            public Builder specUID(String specUID) {
                this.specUID = specUID;
                return this;
            }

            public ProductVersionInfoList build() {
                return new ProductVersionInfoList(this);
            } 

        } 

    }
}
