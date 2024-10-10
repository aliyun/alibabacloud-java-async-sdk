// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWafRulesetRequest} extends {@link RequestModel}
 *
 * <p>UpdateWafRulesetRequest</p>
 */
public class UpdateWafRulesetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateWafRulesetRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWafRulesetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateWafRulesetRequest, Builder> {
        private Long id; 
        private Long siteId; 
        private Integer siteVersion; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWafRulesetRequest request) {
            super(request);
            this.id = request.id;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteVersion.
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateWafRulesetRequest build() {
            return new UpdateWafRulesetRequest(this);
        } 

    } 

}
