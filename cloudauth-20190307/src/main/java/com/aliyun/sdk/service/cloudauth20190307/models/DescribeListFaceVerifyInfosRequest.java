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
 * {@link DescribeListFaceVerifyInfosRequest} extends {@link RequestModel}
 *
 * <p>DescribeListFaceVerifyInfosRequest</p>
 */
public class DescribeListFaceVerifyInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    private String certifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtEnd")
    private Long gmtEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtStart")
    private Long gmtStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeListFaceVerifyInfosRequest(Builder builder) {
        super(builder);
        this.certifyId = builder.certifyId;
        this.gmtEnd = builder.gmtEnd;
        this.gmtStart = builder.gmtStart;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sceneId = builder.sceneId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListFaceVerifyInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    /**
     * @return gmtEnd
     */
    public Long getGmtEnd() {
        return this.gmtEnd;
    }

    /**
     * @return gmtStart
     */
    public Long getGmtStart() {
        return this.gmtStart;
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

    public static final class Builder extends Request.Builder<DescribeListFaceVerifyInfosRequest, Builder> {
        private String certifyId; 
        private Long gmtEnd; 
        private Long gmtStart; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long sceneId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeListFaceVerifyInfosRequest request) {
            super(request);
            this.certifyId = request.certifyId;
            this.gmtEnd = request.gmtEnd;
            this.gmtStart = request.gmtStart;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sceneId = request.sceneId;
            this.status = request.status;
        } 

        /**
         * <p>Verification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>shs414a8b392a3a338abe0504c75c056</p>
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * <p>Query the end time of the verification.</p>
         * 
         * <strong>example:</strong>
         * <p>1760716800000</p>
         */
        public Builder gmtEnd(Long gmtEnd) {
            this.putQueryParameter("GmtEnd", gmtEnd);
            this.gmtEnd = gmtEnd;
            return this;
        }

        /**
         * <p>Query the start time of the verification.</p>
         * 
         * <strong>example:</strong>
         * <p>1760112000000</p>
         */
        public Builder gmtStart(Long gmtStart) {
            this.putQueryParameter("GmtStart", gmtStart);
            this.gmtStart = gmtStart;
            return this;
        }

        /**
         * <p>Pagination parameter: current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of items per page for paginated queries. Maximum value: 100, default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000009699</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
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
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeListFaceVerifyInfosRequest build() {
            return new DescribeListFaceVerifyInfosRequest(this);
        } 

    } 

}
