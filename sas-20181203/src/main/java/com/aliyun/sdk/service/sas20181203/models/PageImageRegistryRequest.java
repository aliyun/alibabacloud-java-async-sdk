// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageImageRegistryRequest} extends {@link RequestModel}
 *
 * <p>PageImageRegistryRequest</p>
 */
public class PageImageRegistryRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RegistryNameLike")
    private String registryNameLike;

    @Body
    @NameInMap("RegistryTypeInList")
    private java.util.List < String > registryTypeInList;

    @Body
    @NameInMap("RegistryTypeNotInList")
    private java.util.List < String > registryTypeNotInList;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private PageImageRegistryRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.registryNameLike = builder.registryNameLike;
        this.registryTypeInList = builder.registryTypeInList;
        this.registryTypeNotInList = builder.registryTypeNotInList;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageImageRegistryRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return registryNameLike
     */
    public String getRegistryNameLike() {
        return this.registryNameLike;
    }

    /**
     * @return registryTypeInList
     */
    public java.util.List < String > getRegistryTypeInList() {
        return this.registryTypeInList;
    }

    /**
     * @return registryTypeNotInList
     */
    public java.util.List < String > getRegistryTypeNotInList() {
        return this.registryTypeNotInList;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<PageImageRegistryRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String registryNameLike; 
        private java.util.List < String > registryTypeInList; 
        private java.util.List < String > registryTypeNotInList; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(PageImageRegistryRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.pageSize = response.pageSize;
            this.registryNameLike = response.registryNameLike;
            this.registryTypeInList = response.registryTypeInList;
            this.registryTypeNotInList = response.registryTypeNotInList;
            this.sourceIp = response.sourceIp;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 镜像仓名称
         */
        public Builder registryNameLike(String registryNameLike) {
            this.putBodyParameter("RegistryNameLike", registryNameLike);
            this.registryNameLike = registryNameLike;
            return this;
        }

        /**
         * 镜像仓类型in
         */
        public Builder registryTypeInList(java.util.List < String > registryTypeInList) {
            this.putBodyParameter("RegistryTypeInList", registryTypeInList);
            this.registryTypeInList = registryTypeInList;
            return this;
        }

        /**
         * 镜像仓类型not in
         */
        public Builder registryTypeNotInList(java.util.List < String > registryTypeNotInList) {
            this.putBodyParameter("RegistryTypeNotInList", registryTypeNotInList);
            this.registryTypeNotInList = registryTypeNotInList;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public PageImageRegistryRequest build() {
            return new PageImageRegistryRequest(this);
        } 

    } 

}
