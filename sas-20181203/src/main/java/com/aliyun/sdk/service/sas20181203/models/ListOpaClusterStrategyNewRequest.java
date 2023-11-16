// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpaClusterStrategyNewRequest} extends {@link RequestModel}
 *
 * <p>ListOpaClusterStrategyNewRequest</p>
 */
public class ListOpaClusterStrategyNewRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ImageName")
    private java.util.List < String > imageName;

    @Query
    @NameInMap("Label")
    private java.util.List < String > label;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StrategyName")
    private java.util.List < String > strategyName;

    private ListOpaClusterStrategyNewRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.imageName = builder.imageName;
        this.label = builder.label;
        this.pageSize = builder.pageSize;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpaClusterStrategyNewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return imageName
     */
    public java.util.List < String > getImageName() {
        return this.imageName;
    }

    /**
     * @return label
     */
    public java.util.List < String > getLabel() {
        return this.label;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return strategyName
     */
    public java.util.List < String > getStrategyName() {
        return this.strategyName;
    }

    public static final class Builder extends Request.Builder<ListOpaClusterStrategyNewRequest, Builder> {
        private Integer currentPage; 
        private java.util.List < String > imageName; 
        private java.util.List < String > label; 
        private Integer pageSize; 
        private java.util.List < String > strategyName; 

        private Builder() {
            super();
        } 

        private Builder(ListOpaClusterStrategyNewRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.imageName = request.imageName;
            this.label = request.label;
            this.pageSize = request.pageSize;
            this.strategyName = request.strategyName;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(java.util.List < String > imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(java.util.List < String > label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StrategyName.
         */
        public Builder strategyName(java.util.List < String > strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        @Override
        public ListOpaClusterStrategyNewRequest build() {
            return new ListOpaClusterStrategyNewRequest(this);
        } 

    } 

}
