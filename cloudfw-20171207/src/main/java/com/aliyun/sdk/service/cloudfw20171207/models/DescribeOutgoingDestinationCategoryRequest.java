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
         * <p>The destination category ID. In addition to All, RiskDomain, AliYun, and NotAliYun, the NotAliYun category also includes subcategories such as TrustedDomain, AliPay, DingDing, WeChat, Google, Alibaba, CDN, NAT, and TrustIP. More than 25 category values are supported. Use the categories returned by the API as the reference.</p>
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
         * <p>The destination type. This parameter is required. If this parameter is not specified, ErrorDstType is returned. The value is case-sensitive. Valid values:</p>
         * <ul>
         * <li>Domain: domain name.</li>
         * <li>DstIP: destination IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Domain</p>
         */
        public Builder dstType(String dstType) {
            this.putQueryParameter("DstType", dstType);
            this.dstType = dstType;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The language type of the response message.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>59.82.45.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The fixed category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
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
