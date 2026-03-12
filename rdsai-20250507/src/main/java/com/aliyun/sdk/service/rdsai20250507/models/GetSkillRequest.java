// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetSkillRequest} extends {@link RequestModel}
 *
 * <p>GetSkillRequest</p>
 */
public class GetSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillId;

    private GetSkillRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.skillId = builder.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    public static final class Builder extends Request.Builder<GetSkillRequest, Builder> {
        private String language; 
        private String skillId; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillRequest request) {
            super(request);
            this.language = request.language;
            this.skillId = request.skillId;
        } 

        /**
         * <p>The languages supported by the skill. Valid values:</p>
         * <ul>
         * <li>zh-CN: Simplified Chinese</li>
         * <li>zh-TW: Traditional Chinese</li>
         * <li>en-US: English</li>
         * <li>ja-JP: Japanese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The unique identifier of the skill.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-44665544****</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        @Override
        public GetSkillRequest build() {
            return new GetSkillRequest(this);
        } 

    } 

}
