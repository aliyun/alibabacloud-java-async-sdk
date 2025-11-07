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
 * {@link DescribeListFaceVerifyInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListFaceVerifyInfosResponseBody</p>
 */
public class DescribeListFaceVerifyInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FaceVerifyInfos")
    private java.util.List<FaceVerifyInfos> faceVerifyInfos;

    @com.aliyun.core.annotation.NameInMap("ItemsPerPage")
    private Integer itemsPerPage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeListFaceVerifyInfosResponseBody(Builder builder) {
        this.faceVerifyInfos = builder.faceVerifyInfos;
        this.itemsPerPage = builder.itemsPerPage;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListFaceVerifyInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return faceVerifyInfos
     */
    public java.util.List<FaceVerifyInfos> getFaceVerifyInfos() {
        return this.faceVerifyInfos;
    }

    /**
     * @return itemsPerPage
     */
    public Integer getItemsPerPage() {
        return this.itemsPerPage;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List<FaceVerifyInfos> faceVerifyInfos; 
        private Integer itemsPerPage; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(DescribeListFaceVerifyInfosResponseBody model) {
            this.faceVerifyInfos = model.faceVerifyInfos;
            this.itemsPerPage = model.itemsPerPage;
            this.pageNumber = model.pageNumber;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>List of face verification records.</p>
         */
        public Builder faceVerifyInfos(java.util.List<FaceVerifyInfos> faceVerifyInfos) {
            this.faceVerifyInfos = faceVerifyInfos;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder itemsPerPage(Integer itemsPerPage) {
            this.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * <p>Pagination parameter: current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>ID of the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CC27D8E-24BF-5056-B14E-9F26719C9A8D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of verifications.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeListFaceVerifyInfosResponseBody build() {
            return new DescribeListFaceVerifyInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeListFaceVerifyInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeListFaceVerifyInfosResponseBody</p>
     */
    public static class FaceVerifyInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertNo")
        private String certNo;

        @com.aliyun.core.annotation.NameInMap("CertifyId")
        private String certifyId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private FaceVerifyInfos(Builder builder) {
            this.bizCode = builder.bizCode;
            this.certName = builder.certName;
            this.certNo = builder.certNo;
            this.certifyId = builder.certifyId;
            this.createTime = builder.createTime;
            this.sceneId = builder.sceneId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceVerifyInfos create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizCode; 
            private String certName; 
            private String certNo; 
            private String certifyId; 
            private String createTime; 
            private Long sceneId; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(FaceVerifyInfos model) {
                this.bizCode = model.bizCode;
                this.certName = model.certName;
                this.certNo = model.certNo;
                this.certifyId = model.certifyId;
                this.createTime = model.createTime;
                this.sceneId = model.sceneId;
                this.status = model.status;
            } 

            /**
             * <p>Business code.</p>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_FACE</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>Name.</p>
             * 
             * <strong>example:</strong>
             * <p>赵四</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>ID number.</p>
             * 
             * <strong>example:</strong>
             * <p>500382199805086199</p>
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * <p>ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>sha8ff58e964152c4c4d21005fb98ecb</p>
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            /**
             * <p>Creation time of the face recognition record.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-02T11:16:06Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000010145</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>Verification status:</p>
             * <ul>
             * <li><strong>1</strong>: Verification passed.</li>
             * <li><strong>2</strong>: Verification failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public FaceVerifyInfos build() {
                return new FaceVerifyInfos(this);
            } 

        } 

    }
}
