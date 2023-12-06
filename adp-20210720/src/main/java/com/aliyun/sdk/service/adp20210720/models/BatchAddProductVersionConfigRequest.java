// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddProductVersionConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchAddProductVersionConfigRequest</p>
 */
public class BatchAddProductVersionConfigRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Body
    @NameInMap("productVersionConfigList")
    private java.util.List < ProductVersionConfigList> productVersionConfigList;

    private BatchAddProductVersionConfigRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.productVersionConfigList = builder.productVersionConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddProductVersionConfigRequest create() {
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
     * @return productVersionConfigList
     */
    public java.util.List < ProductVersionConfigList> getProductVersionConfigList() {
        return this.productVersionConfigList;
    }

    public static final class Builder extends Request.Builder<BatchAddProductVersionConfigRequest, Builder> {
        private String uid; 
        private java.util.List < ProductVersionConfigList> productVersionConfigList; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddProductVersionConfigRequest request) {
            super(request);
            this.uid = request.uid;
            this.productVersionConfigList = request.productVersionConfigList;
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
         * productVersionConfigList.
         */
        public Builder productVersionConfigList(java.util.List < ProductVersionConfigList> productVersionConfigList) {
            this.putBodyParameter("productVersionConfigList", productVersionConfigList);
            this.productVersionConfigList = productVersionConfigList;
            return this;
        }

        @Override
        public BatchAddProductVersionConfigRequest build() {
            return new BatchAddProductVersionConfigRequest(this);
        } 

    } 

    public static class ProductVersionConfigList extends TeaModel {
        @NameInMap("componentReleaseName")
        private String componentReleaseName;

        @NameInMap("componentVersionUID")
        private String componentVersionUID;

        @NameInMap("description")
        private String description;

        @NameInMap("name")
        private String name;

        @NameInMap("parentComponentReleaseName")
        private String parentComponentReleaseName;

        @NameInMap("parentComponentVersionUID")
        private String parentComponentVersionUID;

        @NameInMap("scope")
        private String scope;

        @NameInMap("value")
        private String value;

        @NameInMap("valueType")
        private String valueType;

        private ProductVersionConfigList(Builder builder) {
            this.componentReleaseName = builder.componentReleaseName;
            this.componentVersionUID = builder.componentVersionUID;
            this.description = builder.description;
            this.name = builder.name;
            this.parentComponentReleaseName = builder.parentComponentReleaseName;
            this.parentComponentVersionUID = builder.parentComponentVersionUID;
            this.scope = builder.scope;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductVersionConfigList create() {
            return builder().build();
        }

        /**
         * @return componentReleaseName
         */
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        /**
         * @return componentVersionUID
         */
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentComponentReleaseName
         */
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

        /**
         * @return parentComponentVersionUID
         */
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String componentReleaseName; 
            private String componentVersionUID; 
            private String description; 
            private String name; 
            private String parentComponentReleaseName; 
            private String parentComponentVersionUID; 
            private String scope; 
            private String value; 
            private String valueType; 

            /**
             * componentReleaseName.
             */
            public Builder componentReleaseName(String componentReleaseName) {
                this.componentReleaseName = componentReleaseName;
                return this;
            }

            /**
             * componentVersionUID.
             */
            public Builder componentVersionUID(String componentVersionUID) {
                this.componentVersionUID = componentVersionUID;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parentComponentReleaseName.
             */
            public Builder parentComponentReleaseName(String parentComponentReleaseName) {
                this.parentComponentReleaseName = parentComponentReleaseName;
                return this;
            }

            /**
             * parentComponentVersionUID.
             */
            public Builder parentComponentVersionUID(String parentComponentVersionUID) {
                this.parentComponentVersionUID = parentComponentVersionUID;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * valueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public ProductVersionConfigList build() {
                return new ProductVersionConfigList(this);
            } 

        } 

    }
}
