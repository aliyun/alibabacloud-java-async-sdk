// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetAiRtcAuthCodeListRequest} extends {@link RequestModel}
 *
 * <p>GetAiRtcAuthCodeListRequest</p>
 */
public class GetAiRtcAuthCodeListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseItemId")
    private String licenseItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private GetAiRtcAuthCodeListRequest(Builder builder) {
        super(builder);
        this.licenseItemId = builder.licenseItemId;
        this.needTotalCount = builder.needTotalCount;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiRtcAuthCodeListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return licenseItemId
     */
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
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

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetAiRtcAuthCodeListRequest, Builder> {
        private String licenseItemId; 
        private Boolean needTotalCount; 
        private Long pageNo; 
        private Long pageSize; 
        private Integer status; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(GetAiRtcAuthCodeListRequest request) {
            super(request);
            this.licenseItemId = request.licenseItemId;
            this.needTotalCount = request.needTotalCount;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>17712***</p>
         */
        public Builder licenseItemId(String licenseItemId) {
            this.putQueryParameter("LicenseItemId", licenseItemId);
            this.licenseItemId = licenseItemId;
            return this;
        }

        /**
         * <p>Specifies whether to include the total count of records in the response. Defaults to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putQueryParameter("NeedTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the authorization code. Valid values:</p>
         * <ul>
         * <li><code>1</code>: Activated</li>
         * <li><code>2</code>: Inactive</li>
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

        /**
         * <p>The type of license. Valid values:</p>
         * <ul>
         * <li><code>1</code>: Audio call</li>
         * <li><code>2</code>: Vision call</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetAiRtcAuthCodeListRequest build() {
            return new GetAiRtcAuthCodeListRequest(this);
        } 

    } 

}
