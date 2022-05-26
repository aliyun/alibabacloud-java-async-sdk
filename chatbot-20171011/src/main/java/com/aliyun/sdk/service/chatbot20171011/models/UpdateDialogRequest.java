// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDialogRequest} extends {@link RequestModel}
 *
 * <p>UpdateDialogRequest</p>
 */
public class UpdateDialogRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    @Query
    @NameInMap("DialogName")
    @Validation(required = true)
    private String dialogName;

    private UpdateDialogRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.description = builder.description;
        this.dialogId = builder.dialogId;
        this.dialogName = builder.dialogName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDialogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    /**
     * @return dialogName
     */
    public String getDialogName() {
        return this.dialogName;
    }

    public static final class Builder extends Request.Builder<UpdateDialogRequest, Builder> {
        private String agentKey; 
        private String description; 
        private Long dialogId; 
        private String dialogName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDialogRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.description = request.description;
            this.dialogId = request.dialogId;
            this.dialogName = request.dialogName;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        /**
         * DialogName.
         */
        public Builder dialogName(String dialogName) {
            this.putQueryParameter("DialogName", dialogName);
            this.dialogName = dialogName;
            return this;
        }

        @Override
        public UpdateDialogRequest build() {
            return new UpdateDialogRequest(this);
        } 

    } 

}
