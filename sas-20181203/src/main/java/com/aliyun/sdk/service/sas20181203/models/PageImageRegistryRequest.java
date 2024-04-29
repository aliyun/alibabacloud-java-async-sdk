// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageImageRegistryRequest} extends {@link RequestModel}
 *
 * <p>PageImageRegistryRequest</p>
 */
public class PageImageRegistryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryNameLike")
    private String registryNameLike;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryTypeInList")
    private java.util.List < String > registryTypeInList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegistryTypeNotInList")
    private java.util.List < String > registryTypeNotInList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
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

        private Builder(PageImageRegistryRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.registryNameLike = request.registryNameLike;
            this.registryTypeInList = request.registryTypeInList;
            this.registryTypeNotInList = request.registryTypeNotInList;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the image repository. Fuzzy match is supported.
         */
        public Builder registryNameLike(String registryNameLike) {
            this.putBodyParameter("RegistryNameLike", registryNameLike);
            this.registryNameLike = registryNameLike;
            return this;
        }

        /**
         * The types of image repositories.
         */
        public Builder registryTypeInList(java.util.List < String > registryTypeInList) {
            this.putBodyParameter("RegistryTypeInList", registryTypeInList);
            this.registryTypeInList = registryTypeInList;
            return this;
        }

        /**
         * The types of excluded image repositories.
         */
        public Builder registryTypeNotInList(java.util.List < String > registryTypeNotInList) {
            this.putBodyParameter("RegistryTypeNotInList", registryTypeNotInList);
            this.registryTypeNotInList = registryTypeNotInList;
            return this;
        }

        /**
         * The source IP address of the request.
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
