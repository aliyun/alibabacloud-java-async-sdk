// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSecurityStrategiesRequest} extends {@link RequestModel}
 *
 * <p>ListSecurityStrategiesRequest</p>
 */
public class ListSecurityStrategiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlModule")
    private String controlModule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlSubModule")
    private String controlSubModule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private ListSecurityStrategiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.controlModule = builder.controlModule;
        this.controlSubModule = builder.controlSubModule;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityStrategiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return controlModule
     */
    public String getControlModule() {
        return this.controlModule;
    }

    /**
     * @return controlSubModule
     */
    public String getControlSubModule() {
        return this.controlSubModule;
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

    public static final class Builder extends Request.Builder<ListSecurityStrategiesRequest, Builder> {
        private String regionId; 
        private String controlModule; 
        private String controlSubModule; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListSecurityStrategiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.controlModule = request.controlModule;
            this.controlSubModule = request.controlSubModule;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ControlModule.
         */
        public Builder controlModule(String controlModule) {
            this.putBodyParameter("ControlModule", controlModule);
            this.controlModule = controlModule;
            return this;
        }

        /**
         * ControlSubModule.
         */
        public Builder controlSubModule(String controlSubModule) {
            this.putBodyParameter("ControlSubModule", controlSubModule);
            this.controlSubModule = controlSubModule;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        @Override
        public ListSecurityStrategiesRequest build() {
            return new ListSecurityStrategiesRequest(this);
        } 

    } 

}
