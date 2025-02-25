// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDocsGroupByYearRequest} extends {@link RequestModel}
 *
 * <p>ListDocsGroupByYearRequest</p>
 */
public class ListDocsGroupByYearRequest extends Request {
    @Body
    @NameInMap("applyCodes")
    private java.util.List < String > applyCodes;

    @Body
    @NameInMap("fileNameKeyword")
    private String fileNameKeyword;

    @Body
    @NameInMap("orderIds")
    private java.util.List < Long > orderIds;

    @Body
    @NameInMap("productCode")
    private String productCode;

    @Body
    @NameInMap("scene")
    private String scene;

    private ListDocsGroupByYearRequest(Builder builder) {
        super(builder);
        this.applyCodes = builder.applyCodes;
        this.fileNameKeyword = builder.fileNameKeyword;
        this.orderIds = builder.orderIds;
        this.productCode = builder.productCode;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocsGroupByYearRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyCodes
     */
    public java.util.List < String > getApplyCodes() {
        return this.applyCodes;
    }

    /**
     * @return fileNameKeyword
     */
    public String getFileNameKeyword() {
        return this.fileNameKeyword;
    }

    /**
     * @return orderIds
     */
    public java.util.List < Long > getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<ListDocsGroupByYearRequest, Builder> {
        private java.util.List < String > applyCodes; 
        private String fileNameKeyword; 
        private java.util.List < Long > orderIds; 
        private String productCode; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(ListDocsGroupByYearRequest request) {
            super(request);
            this.applyCodes = request.applyCodes;
            this.fileNameKeyword = request.fileNameKeyword;
            this.orderIds = request.orderIds;
            this.productCode = request.productCode;
            this.scene = request.scene;
        } 

        /**
         * applyCodes.
         */
        public Builder applyCodes(java.util.List < String > applyCodes) {
            this.putBodyParameter("applyCodes", applyCodes);
            this.applyCodes = applyCodes;
            return this;
        }

        /**
         * fileNameKeyword.
         */
        public Builder fileNameKeyword(String fileNameKeyword) {
            this.putBodyParameter("fileNameKeyword", fileNameKeyword);
            this.fileNameKeyword = fileNameKeyword;
            return this;
        }

        /**
         * orderIds.
         */
        public Builder orderIds(java.util.List < Long > orderIds) {
            this.putBodyParameter("orderIds", orderIds);
            this.orderIds = orderIds;
            return this;
        }

        /**
         * productCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public ListDocsGroupByYearRequest build() {
            return new ListDocsGroupByYearRequest(this);
        } 

    } 

}
