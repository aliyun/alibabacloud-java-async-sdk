// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link UpdateSkillBizTagsRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillBizTagsRequest</p>
 */
public class UpdateSkillBizTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizTags")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    private UpdateSkillBizTagsRequest(Builder builder) {
        super(builder);
        this.bizTags = builder.bizTags;
        this.namespaceId = builder.namespaceId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillBizTagsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTags
     */
    public String getBizTags() {
        return this.bizTags;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    public static final class Builder extends Request.Builder<UpdateSkillBizTagsRequest, Builder> {
        private String bizTags; 
        private String namespaceId; 
        private String skillName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillBizTagsRequest request) {
            super(request);
            this.bizTags = request.bizTags;
            this.namespaceId = request.namespaceId;
            this.skillName = request.skillName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;cs,qa,support&quot;</p>
         */
        public Builder bizTags(String bizTags) {
            this.putQueryParameter("BizTags", bizTags);
            this.bizTags = bizTags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-skill</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        @Override
        public UpdateSkillBizTagsRequest build() {
            return new UpdateSkillBizTagsRequest(this);
        } 

    } 

}
