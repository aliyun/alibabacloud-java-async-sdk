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
 * {@link DescribeWhitelistSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhitelistSettingResponseBody</p>
 */
public class DescribeWhitelistSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWhitelistSettingResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhitelistSettingResponseBody create() {
        return builder().build();
    }

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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeWhitelistSettingResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Pagination parameter: current page number, default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>List of certification details.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Number of items per page for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B8ACFD2-C5F0-5F9F-8DD4-E44F93E360E8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWhitelistSettingResponseBody build() {
            return new DescribeWhitelistSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWhitelistSettingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhitelistSettingResponseBody</p>
     */
    public static class Items extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ValidEndDate")
        private String validEndDate;

        @com.aliyun.core.annotation.NameInMap("ValidStartDate")
        private String validStartDate;

        private Items(Builder builder) {
            this.certNo = builder.certNo;
            this.certifyId = builder.certifyId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remark = builder.remark;
            this.sceneId = builder.sceneId;
            this.status = builder.status;
            this.validEndDate = builder.validEndDate;
            this.validStartDate = builder.validStartDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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
            private String status; 
            private String validEndDate; 
            private String validStartDate; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.certNo = model.certNo;
                this.certifyId = model.certifyId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remark = model.remark;
                this.sceneId = model.sceneId;
                this.status = model.status;
                this.validEndDate = model.validEndDate;
                this.validStartDate = model.validStartDate;
            } 

            /**
             * <p>Certificate number.</p>
             * 
             * <strong>example:</strong>
             * <p>320321XXXXXXXX701X</p>
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * <p>Certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>shad861465f2aaeeb805b519e1a93ab2</p>
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16 17:28:03</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16 17:28:03</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Whitelist ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6372003</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Remark.</p>
             * 
             * <strong>example:</strong>
             * <p>测试白名单</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000332</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>Whitelist status:</p>
             * <ul>
             * <li><strong>VALID</strong>: Valid.</li>
             * <li><strong>INVALID</strong>: Invalid.</li>
             * <li><strong>DELETED</strong>: Deleted.</li>
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
             * <p>Effective end date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16 17:28:03</p>
             */
            public Builder validEndDate(String validEndDate) {
                this.validEndDate = validEndDate;
                return this;
            }

            /**
             * <p>Effective start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16 17:28:03</p>
             */
            public Builder validStartDate(String validStartDate) {
                this.validStartDate = validStartDate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
