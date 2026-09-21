// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateCustomScenePolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomScenePolicyRequest</p>
 */
public class UpdateCustomScenePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Objects")
    private String objects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteIds")
    private String siteIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    private UpdateCustomScenePolicyRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.objects = builder.objects;
        this.policyId = builder.policyId;
        this.siteIds = builder.siteIds;
        this.startTime = builder.startTime;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomScenePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objects
     */
    public String getObjects() {
        return this.objects;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return siteIds
     */
    public String getSiteIds() {
        return this.siteIds;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<UpdateCustomScenePolicyRequest, Builder> {
        private String endTime; 
        private String name; 
        private String objects; 
        private Long policyId; 
        private String siteIds; 
        private String startTime; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomScenePolicyRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.name = request.name;
            this.objects = request.objects;
            this.policyId = request.policyId;
            this.siteIds = request.siteIds;
            this.startTime = request.startTime;
            this.template = request.template;
        } 

        /**
         * <p>The end time of the policy.</p>
         * <p>The time must be in UTC and in the ISO 8601 format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-03T19:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The site IDs to associate with the policy. Use a comma (,) to separate multiple IDs.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend using the <code>SiteIds</code> parameter instead. If the <code>SiteIds</code> parameter is specified, the <code>Objects</code> parameter is ignored. You must specify a value for either the <code>Objects</code> or <code>SiteIds</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456****,123457****</p>
         */
        public Builder objects(String objects) {
            this.putQueryParameter("Objects", objects);
            this.objects = objects;
            return this;
        }

        /**
         * <p>To obtain the policy ID, call the <a href="https://help.aliyun.com/document_detail/2850508.html">DescribeCustomScenePolicies</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The site IDs to associate with the policy. Use a comma (,) to separate multiple IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****,123457****</p>
         */
        public Builder siteIds(String siteIds) {
            this.putQueryParameter("SiteIds", siteIds);
            this.siteIds = siteIds;
            return this;
        }

        /**
         * <p>The start time of the policy.</p>
         * <p>The time must be in UTC and in the ISO 8601 format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-03T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the template. Valid value:</p>
         * <ul>
         * <li><strong>promotion</strong>: major promotion</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public UpdateCustomScenePolicyRequest build() {
            return new UpdateCustomScenePolicyRequest(this);
        } 

    } 

}
