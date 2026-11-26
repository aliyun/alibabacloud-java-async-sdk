// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListSkillsRequest} extends {@link RequestModel}
 *
 * <p>ListSkillsRequest</p>
 */
public class ListSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bindStatus")
    private String bindStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filterType")
    private String filterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListSkillsRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.bindStatus = builder.bindStatus;
        this.filterType = builder.filterType;
        this.keyword = builder.keyword;
        this.operatingObjectName = builder.operatingObjectName;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.tags = builder.tags;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return bindStatus
     */
    public String getBindStatus() {
        return this.bindStatus;
    }

    /**
     * @return filterType
     */
    public String getFilterType() {
        return this.filterType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListSkillsRequest, Builder> {
        private String appToken; 
        private String bindStatus; 
        private String filterType; 
        private String keyword; 
        private String operatingObjectName; 
        private String opsUserCode; 
        private String opsUserId; 
        private Integer page; 
        private Integer pageSize; 
        private java.util.List<String> tags; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillsRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.bindStatus = request.bindStatus;
            this.filterType = request.filterType;
            this.keyword = request.keyword;
            this.operatingObjectName = request.operatingObjectName;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.tags = request.tags;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The platform application token issued by the console. If specified, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The binding status. Valid values: BOUND (bound) and UNBOUND (unbound global skills). Must be specified together with operatingObjectName.</p>
         * 
         * <strong>example:</strong>
         * <p>BOUND</p>
         */
        public Builder bindStatus(String bindStatus) {
            this.putBodyParameter("bindStatus", bindStatus);
            this.bindStatus = bindStatus;
            return this;
        }

        /**
         * <p>The filter expression type. Valid values:</p>
         * <ul>
         * <li>SQL: SQL filtering.</li>
         * <li>TAG: Tag filtering.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder filterType(String filterType) {
            this.putBodyParameter("filterType", filterType);
            this.filterType = filterType;
            return this;
        }

        /**
         * <p>The search keyword. Supports fuzzy search by API name or exact search by API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample keyword</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The name of the digital employee. Used to calculate the CodeAgent allowedSkills whitelist based on binding relationships.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>The proxy user code, which is unique within the tenant. Used only when the application credential is configured as source_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The proxy user ID, which is the WINNEXO platform user ID. Used only when the application credential is configured as winnexo_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The tag filtering parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;[{\&quot;value\&quot;:\&quot;dataworks#0#1#34167#432313#T3_23030136354#86969667366\&quot;,\&quot;key\&quot;:\&quot;dataworksTag\&quot;}]&quot;]</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putBodyParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListSkillsRequest build() {
            return new ListSkillsRequest(this);
        } 

    } 

}
