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
 * {@link PageQueryWhiteListSettingRequest} extends {@link RequestModel}
 *
 * <p>PageQueryWhiteListSettingRequest</p>
 */
public class PageQueryWhiteListSettingRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidEndDate")
    private String validEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidStartDate")
    private String validStartDate;

    private PageQueryWhiteListSettingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.certNo = builder.certNo;
        this.certifyId = builder.certifyId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.sceneId = builder.sceneId;
        this.serviceCode = builder.serviceCode;
        this.status = builder.status;
        this.validEndDate = builder.validEndDate;
        this.validStartDate = builder.validStartDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageQueryWhiteListSettingRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return validEndDate
     */
    public String getValidEndDate() {
        return this.validEndDate;
    }

    /**
     * @return validStartDate
     */
    public String getValidStartDate() {
        return this.validStartDate;
    }

    public static final class Builder extends Request.Builder<PageQueryWhiteListSettingRequest, Builder> {
        private String regionId; 
        private String certNo; 
        private String certifyId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private Long sceneId; 
        private String serviceCode; 
        private String status; 
        private String validEndDate; 
        private String validStartDate; 

        private Builder() {
            super();
        } 

        private Builder(PageQueryWhiteListSettingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.certNo = request.certNo;
            this.certifyId = request.certifyId;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.sceneId = request.sceneId;
            this.serviceCode = request.serviceCode;
            this.status = request.status;
            this.validEndDate = request.validEndDate;
            this.validStartDate = request.validStartDate;
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
         * <p>The certificate number.</p>
         * 
         * <strong>example:</strong>
         * <p>330103xxxxxxxxxxxx</p>
         */
        public Builder certNo(String certNo) {
            this.putQueryParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * <p>The unique identifier of the ID Verification.</p>
         * 
         * <strong>example:</strong>
         * <p>sha75b4e19a1ddda059b920757b0e12b</p>
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The verification scenario ID. This ID is automatically generated after you create a verification scenario in the console. For information about how to create a verification scenario, see Add a verification scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000xxx</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The ServiceCode of the ID Verification cloud service. Value: <strong>antcloudauth</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>DELETE: Deleted.</li>
         * <li>VALID: Not deleted and within the validity period (valid).</li>
         * <li>INVALID: Not deleted but not within the validity period (invalid).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The end date of the validity period (timestamp in milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1725379200000</p>
         */
        public Builder validEndDate(String validEndDate) {
            this.putQueryParameter("ValidEndDate", validEndDate);
            this.validEndDate = validEndDate;
            return this;
        }

        /**
         * <p>The start date of the validity period (timestamp in milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1725120000000</p>
         */
        public Builder validStartDate(String validStartDate) {
            this.putQueryParameter("ValidStartDate", validStartDate);
            this.validStartDate = validStartDate;
            return this;
        }

        @Override
        public PageQueryWhiteListSettingRequest build() {
            return new PageQueryWhiteListSettingRequest(this);
        } 

    } 

}
