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
 * {@link PageQueryWhiteListSettingResponseBody} extends {@link TeaModel}
 *
 * <p>PageQueryWhiteListSettingResponseBody</p>
 */
public class PageQueryWhiteListSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private PageQueryWhiteListSettingResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageQueryWhiteListSettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 
        private Boolean success; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(PageQueryWhiteListSettingResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.message = model.message;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Return code, <strong>200</strong> indicates a successful API response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Request result</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Whether the response was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public PageQueryWhiteListSettingResponseBody build() {
            return new PageQueryWhiteListSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageQueryWhiteListSettingResponseBody} extends {@link TeaModel}
     *
     * <p>PageQueryWhiteListSettingResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertNo")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("CertifyId")
        private String certifyId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ValidEndDate")
        private String validEndDate;

        @com.aliyun.core.annotation.NameInMap("ValidStartDate")
        private String validStartDate;

        private ResultObject(Builder builder) {
            this.certNo = builder.certNo;
            this.certifyId = builder.certifyId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remark = builder.remark;
            this.sceneId = builder.sceneId;
            this.serviceCode = builder.serviceCode;
            this.status = builder.status;
            this.validEndDate = builder.validEndDate;
            this.validStartDate = builder.validStartDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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

        public static final class Builder {
            private String certNo; 
            private String certifyId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remark; 
            private Long sceneId; 
            private String serviceCode; 
            private String status; 
            private String validEndDate; 
            private String validStartDate; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.certNo = model.certNo;
                this.certifyId = model.certifyId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remark = model.remark;
                this.sceneId = model.sceneId;
                this.serviceCode = model.serviceCode;
                this.status = model.status;
                this.validEndDate = model.validEndDate;
                this.validStartDate = model.validStartDate;
            } 

            /**
             * <p>ID number.</p>
             * 
             * <strong>example:</strong>
             * <p>330103xxxxxxxxxxxx</p>
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * <p>Unique identifier for real person authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>sha43d9cabd52d370d9f4cca9468f71e</p>
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-30 14:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-30 14:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Whitelist ID.</p>
             * 
             * <strong>example:</strong>
             * <p>234822</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Remark information.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Authentication scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000332</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>ServiceCode of the real person cloud product</p>
             * 
             * <strong>example:</strong>
             * <p>antcloudauth</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>Status:</p>
             * <ul>
             * <li>DELETE: Deleted</li>
             * <li>VALID: Not deleted and within the validity period, valid</li>
             * <li>INVALID: Not deleted but outside the validity period, invalid</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>End date of validity</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-02 13:57:51</p>
             */
            public Builder validEndDate(String validEndDate) {
                this.validEndDate = validEndDate;
                return this;
            }

            /**
             * <p>Start date of validity</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-30 13:57:51</p>
             */
            public Builder validStartDate(String validStartDate) {
                this.validStartDate = validStartDate;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
