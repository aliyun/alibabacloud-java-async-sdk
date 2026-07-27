// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DsgQueryRowDetailRequest} extends {@link RequestModel}
 *
 * <p>DsgQueryRowDetailRequest</p>
 */
public class DsgQueryRowDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EngineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    private DsgQueryRowDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.engineName = builder.engineName;
        this.instId = builder.instId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgQueryRowDetailRequest create() {
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
     * @return engineName
     */
    public String getEngineName() {
        return this.engineName;
    }

    /**
     * @return instId
     */
    public String getInstId() {
        return this.instId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DsgQueryRowDetailRequest, Builder> {
        private String regionId; 
        private String engineName; 
        private String instId; 
        private Long pageNo; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DsgQueryRowDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.engineName = request.engineName;
            this.instId = request.instId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR</p>
         */
        public Builder engineName(String engineName) {
            this.putBodyParameter("EngineName", engineName);
            this.engineName = engineName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20260706102936ec393b1a03ae0d4atarget</p>
         */
        public Builder instId(String instId) {
            this.putBodyParameter("InstId", instId);
            this.instId = instId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DsgQueryRowDetailRequest build() {
            return new DsgQueryRowDetailRequest(this);
        } 

    } 

}
