// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelsByPageRequest} extends {@link RequestModel}
 *
 * <p>ListModelsByPageRequest</p>
 */
public class ListModelsByPageRequest extends Request {
    @Query
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    private Long algorithmId;

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
    @NameInMap("NamePattern")
    private String namePattern;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SizeType")
    private String sizeType;

    private ListModelsByPageRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.currentPage = builder.currentPage;
        this.hardware = builder.hardware;
        this.modelPackageStandard = builder.modelPackageStandard;
        this.namePattern = builder.namePattern;
        this.pageSize = builder.pageSize;
        this.sizeType = builder.sizeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public Long getAlgorithmId() {
        return this.algorithmId;
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
     * @return namePattern
     */
    public String getNamePattern() {
        return this.namePattern;
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

    public static final class Builder extends Request.Builder<ListModelsByPageRequest, Builder> {
        private Long algorithmId; 
        private Integer currentPage; 
        private String hardware; 
        private String modelPackageStandard; 
        private String namePattern; 
        private Integer pageSize; 
        private String sizeType; 

        private Builder() {
            super();
        } 

        private Builder(ListModelsByPageRequest response) {
            super(response);
            this.algorithmId = response.algorithmId;
            this.currentPage = response.currentPage;
            this.hardware = response.hardware;
            this.modelPackageStandard = response.modelPackageStandard;
            this.namePattern = response.namePattern;
            this.pageSize = response.pageSize;
            this.sizeType = response.sizeType;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(Long algorithmId) {
            this.putQueryParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
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
         * NamePattern.
         */
        public Builder namePattern(String namePattern) {
            this.putQueryParameter("NamePattern", namePattern);
            this.namePattern = namePattern;
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
        public ListModelsByPageRequest build() {
            return new ListModelsByPageRequest(this);
        } 

    } 

}
