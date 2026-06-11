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
 * {@link UpdateSkillLabelsRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillLabelsRequest</p>
 */
public class UpdateSkillLabelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    private UpdateSkillLabelsRequest(Builder builder) {
        super(builder);
        this.labels = builder.labels;
        this.namespaceId = builder.namespaceId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillLabelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
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

    public static final class Builder extends Request.Builder<UpdateSkillLabelsRequest, Builder> {
        private String labels; 
        private String namespaceId; 
        private String skillName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillLabelsRequest request) {
            super(request);
            this.labels = request.labels;
            this.namespaceId = request.namespaceId;
            this.skillName = request.skillName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;latest&quot;:&quot;0.0.2&quot;,&quot;stable&quot;:&quot;0.0.1&quot;}</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
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
        public UpdateSkillLabelsRequest build() {
            return new UpdateSkillLabelsRequest(this);
        } 

    } 

}
