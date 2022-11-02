// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMajorProtectionBlackIpsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMajorProtectionBlackIpsRequest</p>
 */
public class DescribeMajorProtectionBlackIpsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IpLike")
    private String ipLike;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RuleId")
    private Long ruleId;

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    private DescribeMajorProtectionBlackIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipLike = builder.ipLike;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.ruleId = builder.ruleId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMajorProtectionBlackIpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipLike
     */
    public String getIpLike() {
        return this.ipLike;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeMajorProtectionBlackIpsRequest, Builder> {
        private String instanceId; 
        private String ipLike; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long ruleId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMajorProtectionBlackIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipLike = request.ipLike;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.ruleId = request.ruleId;
            this.templateId = request.templateId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IpLike.
         */
        public Builder ipLike(String ipLike) {
            this.putQueryParameter("IpLike", ipLike);
            this.ipLike = ipLike;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeMajorProtectionBlackIpsRequest build() {
            return new DescribeMajorProtectionBlackIpsRequest(this);
        } 

    } 

}
