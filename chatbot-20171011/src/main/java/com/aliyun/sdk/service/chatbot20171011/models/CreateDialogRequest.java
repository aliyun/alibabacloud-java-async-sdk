// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDialogRequest} extends {@link RequestModel}
 *
 * <p>CreateDialogRequest</p>
 */
public class CreateDialogRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DialogName")
    @Validation(required = true)
    private String dialogName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private CreateDialogRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.dialogName = builder.dialogName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDialogRequest create() {
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
     * @return dialogName
     */
    public String getDialogName() {
        return this.dialogName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateDialogRequest, Builder> {
        private String description; 
        private String dialogName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDialogRequest response) {
            super(response);
            this.description = response.description;
            this.dialogName = response.dialogName;
            this.instanceId = response.instanceId;
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
         * DialogName.
         */
        public Builder dialogName(String dialogName) {
            this.putQueryParameter("DialogName", dialogName);
            this.dialogName = dialogName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateDialogRequest build() {
            return new CreateDialogRequest(this);
        } 

    } 

}
