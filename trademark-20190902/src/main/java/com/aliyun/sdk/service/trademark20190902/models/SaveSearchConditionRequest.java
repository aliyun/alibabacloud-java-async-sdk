// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSearchConditionRequest} extends {@link RequestModel}
 *
 * <p>SaveSearchConditionRequest</p>
 */
public class SaveSearchConditionRequest extends Request {
    @Body
    @NameInMap("ConditionContent")
    @Validation(required = true, maxLength = 160000)
    private String conditionContent;

    @Body
    @NameInMap("SessionId")
    private String sessionId;

    @Body
    @NameInMap("TagName")
    @Validation(maxLength = 20)
    private String tagName;

    @Body
    @NameInMap("Type")
    @Validation(required = true, maximum = 2147483647)
    private Integer type;

    @Body
    @NameInMap("Umid")
    private String umid;

    private SaveSearchConditionRequest(Builder builder) {
        super(builder);
        this.conditionContent = builder.conditionContent;
        this.sessionId = builder.sessionId;
        this.tagName = builder.tagName;
        this.type = builder.type;
        this.umid = builder.umid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSearchConditionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditionContent
     */
    public String getConditionContent() {
        return this.conditionContent;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return umid
     */
    public String getUmid() {
        return this.umid;
    }

    public static final class Builder extends Request.Builder<SaveSearchConditionRequest, Builder> {
        private String conditionContent; 
        private String sessionId; 
        private String tagName; 
        private Integer type; 
        private String umid; 

        private Builder() {
            super();
        } 

        private Builder(SaveSearchConditionRequest request) {
            super(request);
            this.conditionContent = request.conditionContent;
            this.sessionId = request.sessionId;
            this.tagName = request.tagName;
            this.type = request.type;
            this.umid = request.umid;
        } 

        /**
         * ConditionContent.
         */
        public Builder conditionContent(String conditionContent) {
            this.putBodyParameter("ConditionContent", conditionContent);
            this.conditionContent = conditionContent;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putBodyParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Umid.
         */
        public Builder umid(String umid) {
            this.putBodyParameter("Umid", umid);
            this.umid = umid;
            return this;
        }

        @Override
        public SaveSearchConditionRequest build() {
            return new SaveSearchConditionRequest(this);
        } 

    } 

}
