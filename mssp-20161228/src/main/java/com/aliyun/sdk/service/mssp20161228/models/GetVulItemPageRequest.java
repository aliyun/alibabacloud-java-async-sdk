// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVulItemPageRequest} extends {@link RequestModel}
 *
 * <p>GetVulItemPageRequest</p>
 */
public class GetVulItemPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanType")
    private String scanType;

    private GetVulItemPageRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.level = builder.level;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.scanType = builder.scanType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulItemPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scanType
     */
    public String getScanType() {
        return this.scanType;
    }

    public static final class Builder extends Request.Builder<GetVulItemPageRequest, Builder> {
        private String aliasName; 
        private Integer currentPage; 
        private String dealed; 
        private String level; 
        private String name; 
        private Integer pageSize; 
        private String scanType; 

        private Builder() {
            super();
        } 

        private Builder(GetVulItemPageRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.level = request.level;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.scanType = request.scanType;
        } 

        /**
         * <p>Vulnerability alias.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2018:3665-Important: NetworkManager security update</p>
         */
        public Builder aliasName(String aliasName) {
            this.putBodyParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Processing status. y: processed; n: unprocessed; h: processing.</p>
         * 
         * <strong>example:</strong>
         * <p>n</p>
         */
        public Builder dealed(String dealed) {
            this.putBodyParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>Risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>later</p>
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>Vulnerability name.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20183665</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Number of items to display per page in the returned data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Vulnerability type.</p>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder scanType(String scanType) {
            this.putBodyParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        @Override
        public GetVulItemPageRequest build() {
            return new GetVulItemPageRequest(this);
        } 

    } 

}
