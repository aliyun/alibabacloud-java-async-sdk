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
 * {@link DescribeVerifySearchPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifySearchPageListRequest</p>
 */
public class DescribeVerifySearchPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertNo")
    private String certNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    private String certifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasDeviceRisk")
    private Boolean hasDeviceRisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterOrderNo")
    private String outerOrderNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Passed")
    private String passed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Root")
    private Integer root;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Simulator")
    private Integer simulator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubCodes")
    private String subCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualVideo")
    private Integer virtualVideo;

    private DescribeVerifySearchPageListRequest(Builder builder) {
        super(builder);
        this.certNo = builder.certNo;
        this.certifyId = builder.certifyId;
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.hasDeviceRisk = builder.hasDeviceRisk;
        this.model = builder.model;
        this.outerOrderNo = builder.outerOrderNo;
        this.pageSize = builder.pageSize;
        this.passed = builder.passed;
        this.productCode = builder.productCode;
        this.root = builder.root;
        this.sceneId = builder.sceneId;
        this.simulator = builder.simulator;
        this.startDate = builder.startDate;
        this.subCode = builder.subCode;
        this.subCodes = builder.subCodes;
        this.virtualVideo = builder.virtualVideo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifySearchPageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return hasDeviceRisk
     */
    public Boolean getHasDeviceRisk() {
        return this.hasDeviceRisk;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return passed
     */
    public String getPassed() {
        return this.passed;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return root
     */
    public Integer getRoot() {
        return this.root;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return simulator
     */
    public Integer getSimulator() {
        return this.simulator;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subCodes
     */
    public String getSubCodes() {
        return this.subCodes;
    }

    /**
     * @return virtualVideo
     */
    public Integer getVirtualVideo() {
        return this.virtualVideo;
    }

    public static final class Builder extends Request.Builder<DescribeVerifySearchPageListRequest, Builder> {
        private String certNo; 
        private String certifyId; 
        private String currentPage; 
        private String endDate; 
        private Boolean hasDeviceRisk; 
        private String model; 
        private String outerOrderNo; 
        private String pageSize; 
        private String passed; 
        private String productCode; 
        private Integer root; 
        private String sceneId; 
        private Integer simulator; 
        private String startDate; 
        private String subCode; 
        private String subCodes; 
        private Integer virtualVideo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifySearchPageListRequest request) {
            super(request);
            this.certNo = request.certNo;
            this.certifyId = request.certifyId;
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.hasDeviceRisk = request.hasDeviceRisk;
            this.model = request.model;
            this.outerOrderNo = request.outerOrderNo;
            this.pageSize = request.pageSize;
            this.passed = request.passed;
            this.productCode = request.productCode;
            this.root = request.root;
            this.sceneId = request.sceneId;
            this.simulator = request.simulator;
            this.startDate = request.startDate;
            this.subCode = request.subCode;
            this.subCodes = request.subCodes;
            this.virtualVideo = request.virtualVideo;
        } 

        /**
         * <p>ID number.</p>
         * 
         * <strong>example:</strong>
         * <p>3203212000XXXX701X</p>
         */
        public Builder certNo(String certNo) {
            this.putQueryParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * <p>Authentication ID.</p>
         * 
         * <strong>example:</strong>
         * <p>shadbdd3dbacd001cfa892a5e2b98dxx</p>
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>End date of the query. The format is a Unix timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16 23:59:59 +0800</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Whether there is device risk (pass true if root = 1 or simulator = 1 or virtual_video = 1).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasDeviceRisk(Boolean hasDeviceRisk) {
            this.putQueryParameter("HasDeviceRisk", hasDeviceRisk);
            this.hasDeviceRisk = hasDeviceRisk;
            return this;
        }

        /**
         * <p>Liveness detection model.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVENESS</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>Unique identifier for the customer request.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putQueryParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Whether the authentication passed:</p>
         * <ul>
         * <li><strong>T</strong>: Passed</li>
         * <li><strong>F</strong>: Not passed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>F</p>
         */
        public Builder passed(String passed) {
            this.putQueryParameter("Passed", passed);
            this.passed = passed;
            return this;
        }

        /**
         * <p>Product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Whether it is rooted (pass 1 if selected, otherwise do not pass; corresponds to identity label risk type).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder root(Integer root) {
            this.putQueryParameter("Root", root);
            this.root = root;
            return this;
        }

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000072xx</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Whether it is a simulator (pass 1 if selected, otherwise do not pass; corresponds to device label risk type).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder simulator(Integer simulator) {
            this.putQueryParameter("Simulator", simulator);
            this.simulator = simulator;
            return this;
        }

        /**
         * <p>Start date of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-10 00:00:00 +0800</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Result Code. For detailed values, please refer to: <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/error-code-person-verify?spm=a2c4g.11186623.0.0.6015566ebArcFw#d88910e172fgg">SubCode Explanation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>201</p>
         */
        public Builder subCode(String subCode) {
            this.putQueryParameter("SubCode", subCode);
            this.subCode = subCode;
            return this;
        }

        /**
         * <p>Comma-separated Result Codes. For detailed values, please refer to: <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/error-code-person-verify?spm=a2c4g.11186623.0.0.6015566ebArcFw#d88910e172fgg">SubCode Explanation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>201,202</p>
         */
        public Builder subCodes(String subCodes) {
            this.putQueryParameter("SubCodes", subCodes);
            this.subCodes = subCodes;
            return this;
        }

        /**
         * <p>Whether it is a virtual adaptation (pass 1 if selected, otherwise do not pass; corresponds to behavior label risk type).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder virtualVideo(Integer virtualVideo) {
            this.putQueryParameter("VirtualVideo", virtualVideo);
            this.virtualVideo = virtualVideo;
            return this;
        }

        @Override
        public DescribeVerifySearchPageListRequest build() {
            return new DescribeVerifySearchPageListRequest(this);
        } 

    } 

}
