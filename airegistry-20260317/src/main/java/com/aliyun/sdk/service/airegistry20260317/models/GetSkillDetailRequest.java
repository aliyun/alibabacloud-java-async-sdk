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
 * {@link GetSkillDetailRequest} extends {@link RequestModel}
 *
 * <p>GetSkillDetailRequest</p>
 */
public class GetSkillDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    private GetSkillDetailRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetSkillDetailRequest, Builder> {
        private String namespaceId; 
        private String skillName; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillDetailRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.skillName = request.skillName;
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
        public GetSkillDetailRequest build() {
            return new GetSkillDetailRequest(this);
        } 

    } 

}
