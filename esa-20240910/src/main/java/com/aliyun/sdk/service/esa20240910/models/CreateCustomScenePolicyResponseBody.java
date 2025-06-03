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
 * {@link CreateCustomScenePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomScenePolicyResponseBody</p>
 */
public class CreateCustomScenePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Objects")
    private java.util.List<String> objects;

    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private Long policyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteIds")
    private String siteIds;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Template")
    private String template;

    private CreateCustomScenePolicyResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.objects = builder.objects;
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
        this.siteIds = builder.siteIds;
        this.startTime = builder.startTime;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomScenePolicyResponseBody create() {
        return builder().build();
    }

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
    public java.util.List<String> getObjects() {
        return this.objects;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String endTime; 
        private String name; 
        private java.util.List<String> objects; 
        private Long policyId; 
        private String requestId; 
        private String siteIds; 
        private String startTime; 
        private String template; 

        private Builder() {
        } 

        private Builder(CreateCustomScenePolicyResponseBody model) {
            this.endTime = model.endTime;
            this.name = model.name;
            this.objects = model.objects;
            this.policyId = model.policyId;
            this.requestId = model.requestId;
            this.siteIds = model.siteIds;
            this.startTime = model.startTime;
            this.template = model.template;
        } 

        /**
         * <p>The time when the policy expires.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-07T18:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The IDs of websites associated.</p>
         */
        public Builder objects(java.util.List<String> objects) {
            this.objects = objects;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder policyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteIds.
         */
        public Builder siteIds(String siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        /**
         * <p>The time when the policy takes effect.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-07T17:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the policy template.</p>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        public CreateCustomScenePolicyResponseBody build() {
            return new CreateCustomScenePolicyResponseBody(this);
        } 

    } 

}
