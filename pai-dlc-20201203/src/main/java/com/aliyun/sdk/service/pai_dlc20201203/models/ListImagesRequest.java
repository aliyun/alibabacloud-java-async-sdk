// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImagesRequest} extends {@link RequestModel}
 *
 * <p>ListImagesRequest</p>
 */
public class ListImagesRequest extends Request {
    @Query
    @NameInMap("AcceleratorType")
    @Validation(maxLength = 128)
    private String acceleratorType;

    @Query
    @NameInMap("Framework")
    @Validation(maxLength = 128)
    private String framework;

    @Query
    @NameInMap("ImageProviderType")
    @Validation(maxLength = 128)
    private String imageProviderType;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ListImagesRequest(Builder builder) {
        super(builder);
        this.acceleratorType = builder.acceleratorType;
        this.framework = builder.framework;
        this.imageProviderType = builder.imageProviderType;
        this.order = builder.order;
        this.sortBy = builder.sortBy;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorType
     */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * @return framework
     */
    public String getFramework() {
        return this.framework;
    }

    /**
     * @return imageProviderType
     */
    public String getImageProviderType() {
        return this.imageProviderType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListImagesRequest, Builder> {
        private String acceleratorType; 
        private String framework; 
        private String imageProviderType; 
        private String order; 
        private String sortBy; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListImagesRequest request) {
            super(request);
            this.acceleratorType = request.acceleratorType;
            this.framework = request.framework;
            this.imageProviderType = request.imageProviderType;
            this.order = request.order;
            this.sortBy = request.sortBy;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * 加速器类型
         */
        public Builder acceleratorType(String acceleratorType) {
            this.putQueryParameter("AcceleratorType", acceleratorType);
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * 镜像包含的框架类型
         */
        public Builder framework(String framework) {
            this.putQueryParameter("Framework", framework);
            this.framework = framework;
            return this;
        }

        /**
         * 镜像类型
         */
        public Builder imageProviderType(String imageProviderType) {
            this.putQueryParameter("ImageProviderType", imageProviderType);
            this.imageProviderType = imageProviderType;
            return this;
        }

        /**
         * 排序顺序
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * 按返回字段排序
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * 工作空间ID
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListImagesRequest build() {
            return new ListImagesRequest(this);
        } 

    } 

}
