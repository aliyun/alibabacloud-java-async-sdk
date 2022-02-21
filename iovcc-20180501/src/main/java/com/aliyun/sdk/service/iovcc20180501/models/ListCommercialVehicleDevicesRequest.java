// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommercialVehicleDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListCommercialVehicleDevicesRequest</p>
 */
public class ListCommercialVehicleDevicesRequest extends Request {
    @Query
    @NameInMap("ClientId")
    private String clientId;

    @Query
    @NameInMap("HardwareId")
    private String hardwareId;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true)
    private Long pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private ListCommercialVehicleDevicesRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.hardwareId = builder.hardwareId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommercialVehicleDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return hardwareId
     */
    public String getHardwareId() {
        return this.hardwareId;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListCommercialVehicleDevicesRequest, Builder> {
        private String clientId; 
        private String hardwareId; 
        private Long pageIndex; 
        private Long pageSize; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListCommercialVehicleDevicesRequest response) {
            super(response);
            this.clientId = response.clientId;
            this.hardwareId = response.hardwareId;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * HardwareId.
         */
        public Builder hardwareId(String hardwareId) {
            this.putQueryParameter("HardwareId", hardwareId);
            this.hardwareId = hardwareId;
            return this;
        }

        /**
         * 查询开始页
         */
        public Builder pageIndex(Long pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * 每页记录数
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 项目ID
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListCommercialVehicleDevicesRequest build() {
            return new ListCommercialVehicleDevicesRequest(this);
        } 

    } 

}
