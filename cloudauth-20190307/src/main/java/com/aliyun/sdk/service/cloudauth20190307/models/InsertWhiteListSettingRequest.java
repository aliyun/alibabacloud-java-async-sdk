// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link InsertWhiteListSettingRequest} extends {@link RequestModel}
 *
 * <p>InsertWhiteListSettingRequest</p>
 */
public class InsertWhiteListSettingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertNo")
    private String certNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    private String certifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidDay")
    private Integer validDay;

    private InsertWhiteListSettingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.certNo = builder.certNo;
        this.certifyId = builder.certifyId;
        this.remark = builder.remark;
        this.sceneId = builder.sceneId;
        this.serviceCode = builder.serviceCode;
        this.validDay = builder.validDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertWhiteListSettingRequest create() {
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
     * @return certNo
     */
    public String getCertNo() {
        return this.certNo;
    }

    /**
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return validDay
     */
    public Integer getValidDay() {
        return this.validDay;
    }

    public static final class Builder extends Request.Builder<InsertWhiteListSettingRequest, Builder> {
        private String regionId; 
        private String certNo; 
        private String certifyId; 
        private String remark; 
        private Long sceneId; 
        private String serviceCode; 
        private Integer validDay; 

        private Builder() {
            super();
        } 

        private Builder(InsertWhiteListSettingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.certNo = request.certNo;
            this.certifyId = request.certifyId;
            this.remark = request.remark;
            this.sceneId = request.sceneId;
            this.serviceCode = request.serviceCode;
            this.validDay = request.validDay;
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
         * CertNo.
         */
        public Builder certNo(String certNo) {
            this.putQueryParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * CertifyId.
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * ValidDay.
         */
        public Builder validDay(Integer validDay) {
            this.putQueryParameter("ValidDay", validDay);
            this.validDay = validDay;
            return this;
        }

        @Override
        public InsertWhiteListSettingRequest build() {
            return new InsertWhiteListSettingRequest(this);
        } 

    } 

}
