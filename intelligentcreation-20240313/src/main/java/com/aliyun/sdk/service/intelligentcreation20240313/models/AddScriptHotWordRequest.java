// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link AddScriptHotWordRequest} extends {@link RequestModel}
 *
 * <p>AddScriptHotWordRequest</p>
 */
public class AddScriptHotWordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotWord")
    private String hotWord;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptRecordId")
    private String scriptRecordId;

    private AddScriptHotWordRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.hotWord = builder.hotWord;
        this.scriptRecordId = builder.scriptRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddScriptHotWordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hotWord
     */
    public String getHotWord() {
        return this.hotWord;
    }

    /**
     * @return scriptRecordId
     */
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public static final class Builder extends Request.Builder<AddScriptHotWordRequest, Builder> {
        private String description; 
        private String hotWord; 
        private String scriptRecordId; 

        private Builder() {
            super();
        } 

        private Builder(AddScriptHotWordRequest request) {
            super(request);
            this.description = request.description;
            this.hotWord = request.hotWord;
            this.scriptRecordId = request.scriptRecordId;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * hotWord.
         */
        public Builder hotWord(String hotWord) {
            this.putBodyParameter("hotWord", hotWord);
            this.hotWord = hotWord;
            return this;
        }

        /**
         * scriptRecordId.
         */
        public Builder scriptRecordId(String scriptRecordId) {
            this.putBodyParameter("scriptRecordId", scriptRecordId);
            this.scriptRecordId = scriptRecordId;
            return this;
        }

        @Override
        public AddScriptHotWordRequest build() {
            return new AddScriptHotWordRequest(this);
        } 

    } 

}
