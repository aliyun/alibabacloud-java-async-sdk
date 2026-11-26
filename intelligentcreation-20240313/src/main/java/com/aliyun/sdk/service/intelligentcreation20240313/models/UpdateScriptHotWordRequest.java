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
 * {@link UpdateScriptHotWordRequest} extends {@link RequestModel}
 *
 * <p>UpdateScriptHotWordRequest</p>
 */
public class UpdateScriptHotWordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotWord")
    private String hotWord;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hotWordId")
    private String hotWordId;

    private UpdateScriptHotWordRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.hotWord = builder.hotWord;
        this.hotWordId = builder.hotWordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScriptHotWordRequest create() {
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
     * @return hotWordId
     */
    public String getHotWordId() {
        return this.hotWordId;
    }

    public static final class Builder extends Request.Builder<UpdateScriptHotWordRequest, Builder> {
        private String description; 
        private String hotWord; 
        private String hotWordId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScriptHotWordRequest request) {
            super(request);
            this.description = request.description;
            this.hotWord = request.hotWord;
            this.hotWordId = request.hotWordId;
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
         * hotWordId.
         */
        public Builder hotWordId(String hotWordId) {
            this.putBodyParameter("hotWordId", hotWordId);
            this.hotWordId = hotWordId;
            return this;
        }

        @Override
        public UpdateScriptHotWordRequest build() {
            return new UpdateScriptHotWordRequest(this);
        } 

    } 

}
