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
        private String description; 
        private Long dialogId; 
        private String dialogName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDialogRequest response) {
            super(response);
            this.description = response.description;
            this.dialogId = response.dialogId;
            this.dialogName = response.dialogName;
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
