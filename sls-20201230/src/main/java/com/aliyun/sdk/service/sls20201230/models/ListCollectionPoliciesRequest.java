// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListCollectionPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListCollectionPoliciesRequest</p>
 */
public class ListCollectionPoliciesRequest extends Request {
    @Query
    @NameInMap("attribute")
    private Attribute attribute;

    @Query
    @NameInMap("dataCode")
    private String dataCode;

    @Query
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("pageNum")
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("policyName")
    private String policyName;

    @Query
    @NameInMap("productCode")
    private String productCode;

    private ListCollectionPoliciesRequest(Builder builder) {
        super(builder);
        this.attribute = builder.attribute;
        this.dataCode = builder.dataCode;
        this.instanceId = builder.instanceId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.policyName = builder.policyName;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectionPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attribute
     */
    public Attribute getAttribute() {
        return this.attribute;
    }

    /**
     * @return dataCode
     */
    public String getDataCode() {
        return this.dataCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<ListCollectionPoliciesRequest, Builder> {
        private Attribute attribute; 
        private String dataCode; 
        private String instanceId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String policyName; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(ListCollectionPoliciesRequest request) {
            super(request);
            this.attribute = request.attribute;
            this.dataCode = request.dataCode;
            this.instanceId = request.instanceId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.policyName = request.policyName;
            this.productCode = request.productCode;
        } 

        /**
         * attribute.
         */
        public Builder attribute(Attribute attribute) {
            String attributeShrink = shrink(attribute, "attribute", "json");
            this.putQueryParameter("attribute", attributeShrink);
            this.attribute = attribute;
            return this;
        }

        /**
         * dataCode.
         */
        public Builder dataCode(String dataCode) {
            this.putQueryParameter("dataCode", dataCode);
            this.dataCode = dataCode;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * policyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * productCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public ListCollectionPoliciesRequest build() {
            return new ListCollectionPoliciesRequest(this);
        } 

    } 

    public static class Attribute extends TeaModel {
        @NameInMap("app")
        private String app;

        @NameInMap("policyGroup")
        private String policyGroup;

        private Attribute(Builder builder) {
            this.app = builder.app;
            this.policyGroup = builder.policyGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return policyGroup
         */
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public static final class Builder {
            private String app; 
            private String policyGroup; 

            /**
             * app.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * policyGroup.
             */
            public Builder policyGroup(String policyGroup) {
                this.policyGroup = policyGroup;
                return this;
            }

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
}
