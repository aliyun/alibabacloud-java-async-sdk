// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppsRequest} extends {@link RequestModel}
 *
 * <p>ListAppsRequest</p>
 */
public class ListAppsRequest extends Request {
    @Body
    @NameInMap("IntegrationMode")
    private String integrationMode;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Status")
    private String status;

    private ListAppsRequest(Builder builder) {
        super(builder);
        this.integrationMode = builder.integrationMode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return integrationMode
     */
    public String getIntegrationMode() {
        return this.integrationMode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAppsRequest, Builder> {
        private String integrationMode; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAppsRequest response) {
            super(response);
            this.integrationMode = response.integrationMode;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.status = response.status;
        } 

        /**
         * 集成方式：- 一体化SDK：paasSDK - 样板间：standardRoom
         */
        public Builder integrationMode(String integrationMode) {
            this.putBodyParameter("IntegrationMode", integrationMode);
            this.integrationMode = integrationMode;
            return this;
        }

        /**
         * 查询页码，参数为空默认查询第1页。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页显示个数，参数为空默认显示个数为10。
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 应用状态
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAppsRequest build() {
            return new ListAppsRequest(this);
        } 

    } 

}
