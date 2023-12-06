// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFoundationReferenceComponentsRequest} extends {@link RequestModel}
 *
 * <p>ListFoundationReferenceComponentsRequest</p>
 */
public class ListFoundationReferenceComponentsRequest extends Request {
    @Query
    @NameInMap("foundationReferenceUID")
    private String foundationReferenceUID;

    @Query
    @NameInMap("foundationVersionUID")
    private String foundationVersionUID;

    @Query
    @NameInMap("onlyEnabled")
    private Boolean onlyEnabled;

    @Query
    @NameInMap("parentComponentReferenceUID")
    private String parentComponentReferenceUID;

    @Query
    @NameInMap("productVersionUID")
    private String productVersionUID;

    private ListFoundationReferenceComponentsRequest(Builder builder) {
        super(builder);
        this.foundationReferenceUID = builder.foundationReferenceUID;
        this.foundationVersionUID = builder.foundationVersionUID;
        this.onlyEnabled = builder.onlyEnabled;
        this.parentComponentReferenceUID = builder.parentComponentReferenceUID;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFoundationReferenceComponentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return foundationReferenceUID
     */
    public String getFoundationReferenceUID() {
        return this.foundationReferenceUID;
    }

    /**
     * @return foundationVersionUID
     */
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

    /**
     * @return onlyEnabled
     */
    public Boolean getOnlyEnabled() {
        return this.onlyEnabled;
    }

    /**
     * @return parentComponentReferenceUID
     */
    public String getParentComponentReferenceUID() {
        return this.parentComponentReferenceUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<ListFoundationReferenceComponentsRequest, Builder> {
        private String foundationReferenceUID; 
        private String foundationVersionUID; 
        private Boolean onlyEnabled; 
        private String parentComponentReferenceUID; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(ListFoundationReferenceComponentsRequest request) {
            super(request);
            this.foundationReferenceUID = request.foundationReferenceUID;
            this.foundationVersionUID = request.foundationVersionUID;
            this.onlyEnabled = request.onlyEnabled;
            this.parentComponentReferenceUID = request.parentComponentReferenceUID;
            this.productVersionUID = request.productVersionUID;
        } 

        /**
         * foundationReferenceUID.
         */
        public Builder foundationReferenceUID(String foundationReferenceUID) {
            this.putQueryParameter("foundationReferenceUID", foundationReferenceUID);
            this.foundationReferenceUID = foundationReferenceUID;
            return this;
        }

        /**
         * foundationVersionUID.
         */
        public Builder foundationVersionUID(String foundationVersionUID) {
            this.putQueryParameter("foundationVersionUID", foundationVersionUID);
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }

        /**
         * onlyEnabled.
         */
        public Builder onlyEnabled(Boolean onlyEnabled) {
            this.putQueryParameter("onlyEnabled", onlyEnabled);
            this.onlyEnabled = onlyEnabled;
            return this;
        }

        /**
         * parentComponentReferenceUID.
         */
        public Builder parentComponentReferenceUID(String parentComponentReferenceUID) {
            this.putQueryParameter("parentComponentReferenceUID", parentComponentReferenceUID);
            this.parentComponentReferenceUID = parentComponentReferenceUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public ListFoundationReferenceComponentsRequest build() {
            return new ListFoundationReferenceComponentsRequest(this);
        } 

    } 

}
