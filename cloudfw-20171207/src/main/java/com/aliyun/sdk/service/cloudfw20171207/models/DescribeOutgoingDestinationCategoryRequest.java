// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeOutgoingDestinationCategoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingDestinationCategoryRequest</p>
 */
public class DescribeOutgoingDestinationCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstType")
    private String dstType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeId")
    private String typeId;

    private DescribeOutgoingDestinationCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.dstType = builder.dstType;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
        this.typeId = builder.typeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDestinationCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return dstType
     */
    public String getDstType() {
        return this.dstType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return typeId
     */
    public String getTypeId() {
        return this.typeId;
    }

    public static final class Builder extends Request.Builder<DescribeOutgoingDestinationCategoryRequest, Builder> {
        private String categoryId; 
        private String dstType; 
        private String endTime; 
        private String lang; 
        private String sourceIp; 
        private String startTime; 
        private String typeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOutgoingDestinationCategoryRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.dstType = request.dstType;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
            this.typeId = request.typeId;
        } 

        /**
         * <p>目的分类 ID。有效取值为产品预定义的目的分类枚举（共 25+ 个），如 TrustedDomain（信誉网站）、AliPay（支付宝产品）、CDN（CDN 服务）等；完整枚举值及语义请参考产品文档。</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>目的类型。本参数实际为必填项，缺失时返回 ErrorDstType(-340149)。可选值：DST_TYPE_DOMAIN（域名）、DST_TYPE_IP（IP）。</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        public Builder dstType(String dstType) {
            this.putQueryParameter("DstType", dstType);
            this.dstType = dstType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1750818370</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1749657600</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TypeId.
         */
        public Builder typeId(String typeId) {
            this.putQueryParameter("TypeId", typeId);
            this.typeId = typeId;
            return this;
        }

        @Override
        public DescribeOutgoingDestinationCategoryRequest build() {
            return new DescribeOutgoingDestinationCategoryRequest(this);
        } 

    } 

}
