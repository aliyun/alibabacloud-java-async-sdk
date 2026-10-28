// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link CouponApprovalStatusListRequest} extends {@link RequestModel}
 *
 * <p>CouponApprovalStatusListRequest</p>
 */
public class CouponApprovalStatusListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateStatus")
    private String templateStatus;

    private CouponApprovalStatusListRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.templateStatus = builder.templateStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CouponApprovalStatusListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateStatus
     */
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public static final class Builder extends Request.Builder<CouponApprovalStatusListRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String templateId; 
        private String templateName; 
        private String templateStatus; 

        private Builder() {
            super();
        } 

        private Builder(CouponApprovalStatusListRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
            this.templateStatus = request.templateStatus;
        } 

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the coupon template.</p>
         * 
         * <strong>example:</strong>
         * <p>5093156</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Test coupon template</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The status of the coupon template. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: application revoked</li>
         * <li><strong>2</strong>: under review</li>
         * <li><strong>3</strong>: review rejected</li>
         * <li><strong>4</strong>: review approved</li>
         * <li><strong>5</strong>: review approved but issuance failed</li>
         * <li><strong>6</strong>: automatically approved</li>
         * <li><strong>7</strong>: automatically approved but issuance failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder templateStatus(String templateStatus) {
            this.putQueryParameter("TemplateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        @Override
        public CouponApprovalStatusListRequest build() {
            return new CouponApprovalStatusListRequest(this);
        } 

    } 

}
