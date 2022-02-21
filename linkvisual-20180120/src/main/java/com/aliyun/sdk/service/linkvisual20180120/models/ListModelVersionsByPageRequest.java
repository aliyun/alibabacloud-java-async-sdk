// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelVersionsByPageRequest} extends {@link RequestModel}
 *
 * <p>ListModelVersionsByPageRequest</p>
 */
public class ListModelVersionsByPageRequest extends Request {
    @Query
    @NameInMap("AlgorithmName")
    @Validation(required = true)
    private String algorithmName;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("Hardware")
    private String hardware;

    @Query
    @NameInMap("ModelPackageStandard")
    private String modelPackageStandard;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SizeType")
    private String sizeType;

    private ListModelVersionsByPageRequest(Builder builder) {
        super(builder);
        this.algorithmName = builder.algorithmName;
        this.currentPage = builder.currentPage;
        this.hardware = builder.hardware;
        this.modelPackageStandard = builder.modelPackageStandard;
        this.pageSize = builder.pageSize;
        this.sizeType = builder.sizeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelVersionsByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmName
     */
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hardware
     */
    public String getHardware() {
        return this.hardware;
    }

    /**
     * @return modelPackageStandard
     */
    public String getModelPackageStandard() {
        return this.modelPackageStandard;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sizeType
     */
    public String getSizeType() {
        return this.sizeType;
    }

    public static final class Builder extends Request.Builder<ListModelVersionsByPageRequest, Builder> {
        private String algorithmName; 
        private Integer currentPage; 
        private String hardware; 
        private String modelPackageStandard; 
        private Integer pageSize; 
        private String sizeType; 

        private Builder() {
            super();
        } 

        private Builder(ListModelVersionsByPageRequest response) {
            super(response);
            this.algorithmName = response.algorithmName;
            this.currentPage = response.currentPage;
            this.hardware = response.hardware;
            this.modelPackageStandard = response.modelPackageStandard;
            this.pageSize = response.pageSize;
            this.sizeType = response.sizeType;
        } 

        /**
         * AlgorithmName.
         */
        public Builder algorithmName(String algorithmName) {
            this.putQueryParameter("AlgorithmName", algorithmName);
            this.algorithmName = algorithmName;
            return this;
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
         * Hardware.
         */
        public Builder hardware(String hardware) {
            this.putQueryParameter("Hardware", hardware);
            this.hardware = hardware;
            return this;
        }

        /**
         * ModelPackageStandard.
         */
        public Builder modelPackageStandard(String modelPackageStandard) {
            this.putQueryParameter("ModelPackageStandard", modelPackageStandard);
            this.modelPackageStandard = modelPackageStandard;
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
         * SizeType.
         */
        public Builder sizeType(String sizeType) {
            this.putQueryParameter("SizeType", sizeType);
            this.sizeType = sizeType;
            return this;
        }

        @Override
        public ListModelVersionsByPageRequest build() {
            return new ListModelVersionsByPageRequest(this);
        } 

    } 

}
