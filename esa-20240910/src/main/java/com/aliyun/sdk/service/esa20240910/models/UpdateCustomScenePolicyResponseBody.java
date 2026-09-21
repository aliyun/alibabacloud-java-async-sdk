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
 * {@link UpdateCustomScenePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCustomScenePolicyResponseBody</p>
 */
public class UpdateCustomScenePolicyResponseBody extends TeaModel {
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

    private UpdateCustomScenePolicyResponseBody(Builder builder) {
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

    public static UpdateCustomScenePolicyResponseBody create() {
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

        private Builder(UpdateCustomScenePolicyResponseBody model) {
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
         * <p>The end time of the policy.</p>
         * <p>The time is in UTC and in the ISO 8601 format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-03T19:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>A list of associated site IDs.</p>
         * <blockquote>
         * <p>This parameter is deprecated. We recommend that you use the <code>SiteIds</code> parameter instead.</p>
         * </blockquote>
         */
        public Builder objects(java.util.List<String> objects) {
            this.objects = objects;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
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
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The associated site IDs. Multiple IDs are separated by a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>123456****,123457****</p>
         */
        public Builder siteIds(String siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        /**
         * <p>The start time of the policy.</p>
         * <p>The time is in UTC and in the ISO 8601 format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-03T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the template. Valid value:</p>
         * <ul>
         * <li><strong>promotion</strong>: major promotion</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        public UpdateCustomScenePolicyResponseBody build() {
            return new UpdateCustomScenePolicyResponseBody(this);
        } 

    } 

}
